package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement Emailaddress;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]/i[1]")
    WebElement signinbutton;

    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createinaccount;

    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authentication;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement creatinaccountbutton;

    @FindBy(id = "email_create")
    WebElement emailadd;

    @FindBy(id = "email_create")
    WebElement createemailacc;

    @FindBy(xpath = "//li[contains(text(),'Password is required.')]")
    WebElement verifymessage;

    public void enterEmailId(String email) {
        sendTextToElement(Emailaddress, email);
    }

    public void enterpassword(String password1) {
        sendTextToElement(password, password1);
    }

    public void clickOnsinginbutton() {
        clickOnElement(signinbutton);
    }

    public String getcreateinaccounttext() {
        return getTextFromElement(createinaccount);
    }

    public String gettextFromAuthontication() {
        return getTextFromElement(authentication);
    }

    public void clickoncreateinaccuontbutton() {
        clickOnElement(creatinaccountbutton);
    }

    public void enteremailid(String emailadd1) {
        sendTextToElement(emailadd, emailadd1);
    }

    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterpassword(password);
        clickOnsinginbutton();
    }

    public void createaccountinemail(String em) {
        sendTextToElement(createemailacc, em);
    }


public String verifyerrormessage(){
    return getTextFromElement(verifymessage);
}

}