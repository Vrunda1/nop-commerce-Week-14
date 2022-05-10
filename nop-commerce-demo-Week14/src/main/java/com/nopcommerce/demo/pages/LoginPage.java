package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy (xpath = "//input[@id='Email']")
    WebElement email;
    public void setEmail(String text){
        sendTextToElement(email,text);
    }
    @FindBy (xpath = "//input[@id='Password']")
    WebElement password;
    public void enterPassword(String text) {
        sendTextToElement(password,text);
    }
    // login
    @FindBy (xpath = "//button[contains(text(),'Log in')]")
    WebElement login;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement errorMessage;
    public void clickOnLogin() {
        Reporter.log("Clicking on Login"+ login.toString()+ "<br>");
        clickOnElement(login);
    }
    @FindBy (xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcome;
    public String verifyWelcomeTextMessage() {
        Reporter.log("getting Welcome text from "+verifyWelcome.toString()+"<br>");
        return getTextFromElement(verifyWelcome);
    }
    public String verifyErrorMessage(){
        Reporter.log("getting ErrorMessage text from "+errorMessage.toString()+"<br>");
        return getTextFromElement(errorMessage);
    }

}
