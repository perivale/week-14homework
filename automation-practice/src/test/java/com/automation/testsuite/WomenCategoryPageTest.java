package com.automation.testsuite;

import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestDate;

public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        womenCategoryPage =new WomenCategoryPage();
        productPage=new ProductPage();
     //   signInPage = new SignInPage();
     //   accountPage=new AccountPage();
    }
    @Test(groups = "sanity")
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully(){
        homePage.clickOnWomenLink();
        String expectedtext="Women";
        String actualtext=womenCategoryPage.verifywomentext();
        Assert.assertEquals(expectedtext,actualtext,"verift the women text");
    }
    @Test(dataProvider="product",dataProviderClass = TestDate.class,groups = {"sanity","smoke"})

    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String
            size, String colour){
        SoftAssert softAssert=new SoftAssert();
        homePage.clickOnWomenLink();
        productPage.clickonproduct(product);
        productPage.changethequtity(qty);
        productPage.sizedropdownmenu(size);
        productPage.selectcolourbydropmenu(colour);
        productPage.addtocart();
        String expectedmessage="Product successfully added to your shopping cart";
        String actualmessage=productPage.verifythetext();
        softAssert.assertEquals(expectedmessage,actualmessage);
        productPage.closethewindow();
        softAssert.assertAll();








    }

}
