package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    public ProductPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "checkbox")
    WebElement size;

    @FindBy(className = "color-option")
    WebElement colour;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]")
    WebElement product;

    @FindBy(xpath = "id=\"quantity_wanted\"")
    WebElement changequtity;


  @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
  WebElement addtocart;

  @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
  WebElement verifytext;

  @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
  WebElement crossbutton;


    public void sizedropdownmenu(String num){
        selectByValueFromDropDown(size, num);

    }
    public void changethequtity(String qut){
        sendTextToElement(changequtity,qut);
    }
    public void clickonproduct(String pro){
        sendTextToElement(product,pro);
    }
    public void selectcolourbydropmenu(String num){
        sendTextToElement(colour,num);
    }
    public void addtocart(){
        clickOnElement(addtocart);
    }
    public String verifythetext(){
        return getTextFromElement(verifytext);
    }
    public void closethewindow(){
        clickOnElement(crossbutton);
    }
}
