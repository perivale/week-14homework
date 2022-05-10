package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCategoryPage extends Utility {

    public WomenCategoryPage() {

        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement women;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")
    WebElement verifytext;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]")
    WebElement sorybyttop;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/span[1]")
    WebElement sortbydreees;

    public void clickOnWomenLink() {
        clickOnElement(women);
    }
    public String verifywomentext(){
       return getTextFromElement(verifytext);
    }
    public void sortbydropmenu(){
        clickOnElement(sorybyttop);
    }
    public void sortbydreeses(){
        clickOnElement(sortbydreees);
    }
}
