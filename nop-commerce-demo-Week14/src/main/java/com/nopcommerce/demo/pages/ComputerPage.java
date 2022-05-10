package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    public ComputerPage(){
    PageFactory.initElements(driver,this);
}
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersText;
    @FindBy(xpath = "//img[@title='Show products in category Notebooks']")
    WebElement notebooksLink;
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktopLink;
    @FindBy(xpath = "//img[@title='Show products in category Software']")
    WebElement softwareLink;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildYourComputer;

    public void clickOnDesktopLink() {
        Reporter.log("Clicking on DesktopLink"+ desktopLink.toString()+ "<br>");
        clickOnElement(desktopLink);
    }
    public void clickOnNotebookLink() {
        Reporter.log("Clicking on NotebookLink"+ notebooksLink.toString()+ "<br>");
        clickOnElement(notebooksLink);
    }
    public void clickOnSoftwareLink() {

        Reporter.log("Clicking on SoftwareLink"+ softwareLink.toString()+ "<br>");
        clickOnElement(softwareLink);
    }
    public String verifyComputertext(){
        Reporter.log("getting Computer text from "+computersText.toString()+"<br>");

        return getTextFromElement(computersText);
    }

}
