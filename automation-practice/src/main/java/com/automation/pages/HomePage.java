package com.automation.pages;
import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement WOMEN;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement DRESSES;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement TSHIRTS;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement yourlogo;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement singin;
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]/i[1]")
    WebElement siginbutton;

    public void clickOnWomenLink() {
        clickOnElement(WOMEN);

    }
    public void clickOnderesseslink(){
        clickOnElement(DRESSES);
    }
    public void clickOnTshirtlink(){
        clickOnElement(TSHIRTS);
    }
    public void clickOnLogoLink(){
        clickOnElement(yourlogo);
    }
    public void clikeOnsignlink(){
        clickOnElement(singin);
    }
    public String verifylogintext(){
        return getTextFromElement(singin);
    }public void signbutton(){
        clickOnElement(siginbutton);
    }

}