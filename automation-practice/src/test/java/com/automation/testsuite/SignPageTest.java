package com.automation.testsuite;

import com.automation.pages.AccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestDate;

public class SignPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        accountPage=new AccountPage();
    }

    @Test(groups = "sanity")
    public void userShouldNavigateToSignInPageSuccessFully() {
        homePage.clikeOnsignlink();
        String expected = "AUTHENTICATION";
        String actul = signInPage.gettextFromAuthontication();
        Assert.assertEquals(expected, actul, "verify the text");

    }

    @Test(dataProvider="credentials",dataProviderClass = TestDate.class,groups = {"sanity","smoke"})

    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,
                                                            String message) {
        homePage.clikeOnsignlink();
        signInPage.loginToApplication(username, password);
        String expectedmessage=message;
        String actualMessage = signInPage.gettextFromAuthontication();
        Assert.assertEquals(expectedmessage, actualMessage, "verify the message");


    }

    @Test(groups ={"smoke","sanity","regression"} )
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.clikeOnsignlink();
        signInPage.enterEmailId("shilpa@gmail.com");
        signInPage.enterpassword("asdf123");
        signInPage.clickOnsinginbutton();
        String expectedmessage="sign out";
       String actualmessage= accountPage.verifysignoutbutton();
       Assert.assertEquals(expectedmessage,actualmessage,"verify the sign out trxt");


    }

    @Test(groups ={"smoke","sanity","regression"} )
    public void verifyThatUserShouldLogOutSuccessFully() {
        homePage.clikeOnsignlink();
        signInPage.enterEmailId("shilpa@gmail.com");
        signInPage.enterpassword("asdf123");
        signInPage.clickOnsinginbutton();
        accountPage.clickonsignoutlink();
        String expectedtext="Sign in";
        String  actualtext=homePage.verifylogintext();
        Assert.assertEquals(expectedtext,actualtext,"verify login text");


    }
}
