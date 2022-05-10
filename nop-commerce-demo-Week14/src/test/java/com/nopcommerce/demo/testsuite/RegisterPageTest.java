package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageTest extends TestBase {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        registerPage = new RegisterPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(registerPage.verifyRegText(),"Register","Not navigate to page");
    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        SoftAssert softAssert = new SoftAssert();
        registerPage.clickOnRegister();
        softAssert.assertEquals(registerPage.verifyFirstnameError(),"First name is required.","");
        softAssert.assertEquals(registerPage.verifyLastnameError(),"Last name is required.","");
        softAssert.assertEquals(registerPage.verifyEmailError(),"Email is required.","");
        softAssert.assertEquals(registerPage.verifyPassworsError(),"Password is required.","");
        softAssert.assertEquals(registerPage.verifyConfirmError(),"Password is required.","");
        softAssert.assertAll();

    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegisterLink();
        registerPage.clickOnGenderF();
       registerPage.enterFirstname("Tinaa");
        registerPage.enterLastname("Jacob");
       registerPage.selectDateofBirth("15");
        registerPage.selectMonth("5");
       registerPage.selectYear("2001");
       registerPage.enterEmail("tin1322@gmail.com");
       registerPage.enterPassword("abc321");
       registerPage.enterConfirmPassword("abc321");
       registerPage.clickOnRegister();
        SoftAssert softAssert = new SoftAssert();
       softAssert.assertEquals(registerPage.verifyRegistrationcomplete(),"Your registration completed","");
       softAssert.assertAll();


    }

}
