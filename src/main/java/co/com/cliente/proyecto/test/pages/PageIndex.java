package co.com.cliente.proyecto.test.pages;

import co.com.cliente.proyecto.test.business.InternalAction;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageIndex {

    @FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    private WebElement lnkSingIn;


    public void clickLinkSingIn(InternalAction internalAction) {
        internalAction.click(lnkSingIn);

    }
}
