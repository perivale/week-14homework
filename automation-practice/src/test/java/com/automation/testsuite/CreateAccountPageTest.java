package com.automation.testsuite;

import com.automation.pages.AccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        accountPage = new AccountPage();


    }

    @Test(groups = {"sanity"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clikeOnsignlink();
        signInPage.createaccountinemail("shilpa2_2010@gmail.com");
        signInPage.getcreateinaccounttext();
        signInPage.clickoncreateinaccuontbutton();
        accountPage.clickontitle();
        accountPage.enterfristname("shilpa");
        accountPage.enterlastname("patel");
        accountPage.enteremailid("shilpa2_@gmail.com");
        accountPage.enterpassowrd("asdf123");
        accountPage.selectdropdowndays(3);
        accountPage.selectdropdownmenumonth("april");
        accountPage.selectdropdownmenuonyear("1998");
        accountPage.ciclkoncheckbox();
        accountPage.enterfristname("shilpa");
        accountPage.enteradd("11 eden close");
        accountPage.entercityname("surat");
        accountPage.enterpostcode("HA0 1DB");
        accountPage.entercountryname("united steats");
        accountPage.entermobilenumber("07878787878");
        accountPage.clickonregisterlink();
        String expectedtext="Shilpa Patel";
      String actualtext= accountPage.verifymyaccount();
        Assert.assertEquals(expectedtext,actualtext,"verify my account text");


    }

}
