package co.com.cliente.proyecto.test.pages;

import co.com.cliente.proyecto.test.business.InternalAction;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageMyAccount {

    @FindBy(how = How.CLASS_NAME, using = "page-heading")
    private WebElement lblMyAccount;

    public void verifyElementMyAccount(InternalAction internalAction) {
        try {
            Assert.assertTrue(internalAction.isElementPresent(lblMyAccount));
        } catch (Exception e) {

            System.out.println("El objeto si existe pero no debería de existir");
        }

    }
}
