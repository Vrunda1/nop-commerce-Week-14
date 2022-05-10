package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    RegisterPage registerPage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
        registerPage = new RegisterPage();
        loginPage = new LoginPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessFully(){
        homePage.clickOnLoginLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.verifyWelcomeTextMessage(),"Welcome, Please Sign In!");

    } @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials(){
        homePage.clickOnLoginLink();
        SoftAssert softAssert = new SoftAssert();
        loginPage.setEmail("tin1@gmail.com");
        loginPage.enterPassword("abc3321");
        loginPage.clickOnLogin();
        softAssert.assertEquals(loginPage.verifyErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.","");

    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        SoftAssert softAssert = new SoftAssert();
        loginPage.setEmail("tin1@gmail.com");
        loginPage.enterPassword("abc321");
        loginPage.clickOnLogin();
        softAssert.assertEquals(homePage.verifyLogout(),"LogOut ","");

    }
    @Test(groups = "regression")
    public void  VerifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnLoginLink();
        SoftAssert softAssert = new SoftAssert();
        loginPage.setEmail("tin1@gmail.com");
        loginPage.enterPassword("abc321");
        homePage.clickOnLogoutLink();
        softAssert.assertEquals(homePage.verifyLogin(),"Log in","");
        softAssert.assertAll();
    }





}