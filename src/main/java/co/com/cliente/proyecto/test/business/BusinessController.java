package co.com.cliente.proyecto.test.business;

import co.com.cliente.proyecto.test.pages.PageAuthencation;
import co.com.cliente.proyecto.test.pages.PageIndex;
import co.com.cliente.proyecto.test.pages.PageMyAccount;
import co.com.sofka.test.gui.ManagementBrowser;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BusinessController {

    public InternalAction internalAction;
    WebDriver driver;

    public void iniciarAplicacion(int navegador, String url, String carpeta, String funcionalidad) {

        ManagementBrowser browser = new ManagementBrowser();
        try {
            driver = browser.getDriverBrowser(navegador);
        } catch (Exception e) {

            internalAction.printFailure("No fué posible obtener del driver del navegador para pruebas" + e);
            internalAction.closeAndQuitTest();
            Assert.fail("No fué posible obtener del driver del navegador para pruebas");
        }
        internalAction = new InternalAction(carpeta);
        internalAction.setFuncionalidad(funcionalidad);
        internalAction.setDriver(driver);
        internalAction.printMessage("*****************************************************************************");
        internalAction.printMessage("INICIO TRANSACCIÓN: " + funcionalidad + "");
        internalAction.printMessage("*****************************************************************************");
        try {
            internalAction.openUrl(url);
            internalAction.printMessage("Se abrió la url " + url + " exitosamente");
        } catch (Exception e) {
            internalAction.printFailure("No se abrió la URL de la aplicación parametrizada:" + " " + e);

        }
    }

    public void autenticacion(String email, String password) {

        PageIndex pageIndex = PageFactory.initElements(internalAction.getDriver(), PageIndex.class);
        PageAuthencation pageAuthencation = PageFactory.initElements(internalAction.getDriver(), PageAuthencation.class);
        pageIndex.clickLinkSingIn(internalAction);
        pageAuthencation.singIn(internalAction, email, password);
    }

    public void verifySigIn() {
        PageMyAccount pageMyAccount = PageFactory.initElements(internalAction.getDriver(), PageMyAccount.class);
        pageMyAccount.verifyElementMyAccount(internalAction);
        internalAction.closeAndQuitTest();

    }
}
