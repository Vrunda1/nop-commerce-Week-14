package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
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
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
       homePage.clickOnComputerLink();
       SoftAssert softAssert = new SoftAssert();
       softAssert.assertEquals(computerPage.verifyComputertext(),"Computer","");
    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.clickOnComputerLink();
        computerPage.clickOnDesktopLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(desktopsPage.verifyDesktopText(),"Desktops","");

    }
    @Test(dataProvider = "credentials",dataProviderClass = TestData.class,groups = {"regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){
    homePage.clickOnComputerLink();
    computerPage.clickOnDesktopLink();
    buildYourOwnComputerPage.clickOnBuildComputer();
    buildYourOwnComputerPage.selectProcessorFromDropdown(processor);
    buildYourOwnComputerPage.selectRamFromDropdown(ram);
    buildYourOwnComputerPage.getHdd(hdd);
    buildYourOwnComputerPage.getOsRadio(os);
    buildYourOwnComputerPage.clickOnSoftwareCheckBox(software);
    buildYourOwnComputerPage.clickOnAddToCart();
    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(buildYourOwnComputerPage.verifyProductAddedMessage(),"The product has been added to your shopping cart","");
    softAssert.assertAll();

    }
}                       ;