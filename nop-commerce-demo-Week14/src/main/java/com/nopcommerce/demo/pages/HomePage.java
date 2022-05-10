package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

/**
 * Created by Jay Vaghani
 */
public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }
    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement myAccountLink;
    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogo;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;
    By computerLink = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");

    By electronics = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    By apparel = By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1] ");

    By digitaldown = By.linkText("Digital downloads");

    By books = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");

    By jewelry = (By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));

    By giftCards = By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");

    public void clickOnComputerLink(){
        Reporter.log("Clicking on ComputerLink"+ computerLink.toString()+ "<br>");
        clickOnElement(computerLink);
    }
    public void clickOnElecronicsLink(){
        Reporter.log("Clicking on ElecronicsLink"+ electronics.toString()+ "<br>");
        clickOnElement(electronics);
    }
    public void clickOnApparelLink(){
        Reporter.log("Clicking on OnApparelLink"+ apparel.toString()+ "<br>");
        clickOnElement(apparel);
    }
    public void clickOnDigDown(){
        Reporter.log("Clicking on DigitalDownload"+ digitaldown.toString()+ "<br>");
        clickOnElement(digitaldown);
    }

    public void clickOnJewelry() {
        Reporter.log("Clicking on Jewelry"+ jewelry.toString()+ "<br>");

        clickOnElement(jewelry);
    }
    public void clickOnBooks() {
        Reporter.log("Clicking on Books"+ books.toString()+ "<br>");

        clickOnElement(books);
    }
    public void clickOnGiftCard() {
        Reporter.log("Clicking on GiftCard"+ giftCards.toString()+ "<br>");

        clickOnElement(giftCards);
    }
    public void clickOnLogoutLink() {
        Reporter.log("Clicking on LogoutLink"+ logoutLink.toString()+ "<br>");

        clickOnElement(logoutLink);
    }
    public String verifyLogout(){
        Reporter.log("getting Logout text from "+logoutLink.toString()+"<br>");
        return getTextFromElement(logoutLink);
    }
    public String verifyLogin(){
        Reporter.log("getting Login text from "+loginLink.toString()+"<br>");
        return getTextFromElement(loginLink);
    }

}