package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement title;

    @FindBy(id="customer_firstname")
    WebElement firstname;

    @FindBy(id="customer_lastname")
    WebElement lastname;

    @FindBy(id="email")
    WebElement email;

    @FindBy(id="passwd")
    WebElement password;

    @FindBy(id="days")
    WebElement days;

    @FindBy(id="months")
    WebElement months;

    @FindBy(id="years")
    WebElement year;

    @FindBy(id="newsletter")
    WebElement checkbox;

    @FindBy(id="submitAccount")
    WebElement registerlink;


    @FindBy(xpath = "//input[@id='address1']")
    WebElement add;

    @FindBy(id="city")
    WebElement city;

    @FindBy(id="postcode")
    WebElement postcode;

    @FindBy(id="id_country")
    WebElement contry;

    @FindBy(id="phone_mobile")
    WebElement monum;

    @FindBy(xpath = "//span[contains(text(),'Shilpa Patel')]")
    WebElement myacc;

    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signout;

    public void clickontitle(){
        clickOnElement(title);
    }
    public void enterfristname(String name){
        sendTextToElement(firstname,name);
    }
    public void enterlastname(String lastname1){
        sendTextToElement(lastname,lastname1);
    }
    public void enteremailid(String id){
        sendTextToElement(email,id);
    }
    public void enterpassowrd(String password1){
        sendTextToElement(password,password1);
    }
    public  void selectdropdowndays(int day){
        selectByIndexFromDropDown(days,day);
    }
    public void selectdropdownmenumonth(String month){
        sendTextToElement(months,month);
    }
    public void selectdropdownmenuonyear(String year1){
        selectByValueFromDropDown(year,year1);
    }
    public void ciclkoncheckbox(){
        clickOnElement(checkbox);
    }
    public void clickonregisterlink(){
        clickOnElement(registerlink);
    }
    public void enteradd(String add1){
        sendTextToElement(add,add1);
    }
    public void entercityname(String city1){
        sendTextToElement(city,city1);
    }
    public  void enterpostcode(String postcode1){
        sendTextToElement(postcode,postcode1);
    }
    public void entercountryname(String country1){
        sendTextToElement(contry,country1);
    }
    public void entermobilenumber(String mobnum){
        sendTextToElement(monum,mobnum);
    }

public String verifymyaccount(){
        return getTextFromElement(myacc);
}
public String verifysignoutbutton(){
        return getTextFromElement(signout);
}
public void clickonsignoutlink(){
        clickOnElement(signout);
}




}
