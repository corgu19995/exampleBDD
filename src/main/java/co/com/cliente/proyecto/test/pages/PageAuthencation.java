package co.com.cliente.proyecto.test.pages;

import co.com.cliente.proyecto.test.business.InternalAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageAuthencation {

    @FindBy(how= How.ID_OR_NAME, using = "email")
    private WebElement inputEmail;

    @FindBy(how= How.ID_OR_NAME, using = "passwd")
    private WebElement inputPassword;

    @FindBy(how= How.ID_OR_NAME, using = "SubmitLogin")
    private WebElement btnSignIn;

    public void singIn (InternalAction internalAction, String email, String password ){
        internalAction.sendText(inputEmail,email);
        internalAction.sendText(inputPassword,password);
        internalAction.click(btnSignIn);
    }
}
