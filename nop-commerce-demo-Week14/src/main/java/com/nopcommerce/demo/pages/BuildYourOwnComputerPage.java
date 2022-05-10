package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import javax.smartcardio.Card;

public class BuildYourOwnComputerPage extends Utility {
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerText;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildYourOwnComputerLink;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropdown;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropdown;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hdd320;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hdd400;
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement getHdd320;
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement operatingSystemVista;
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement operatingSystemPremium;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareMSOffice;
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareTotalCommander;
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement AcrobatReader1;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedToCartMessage;
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeButton;

    public String verifyBuildYourComputerText() {
        Reporter.log("getting BuildYourComputer text from "+buildYourOwnComputerText.toString()+"<br>");
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void clickOnBuildComputer() {
        Reporter.log("Clicking on BuildComputer"+ buildYourOwnComputerLink.toString()+ "<br>");
        clickOnElement(buildYourOwnComputerLink);
    }
    public String verifyProductAddedMsg(){
        Reporter.log("getting Product Added text from "+productAddedToCartMessage.toString()+"<br>");
        return getTextFromElement(productAddedToCartMessage);
    }

    public void selectProcessorFromDropdown(String processor) {
        Reporter.log("Selecting Processor From Dropdown"+processor+" from dropdown "+processorDropdown.toString() + "<br>");
        selectByVisibleTextFromDropDown(processorDropdown, processor);
    }

    public void selectRamFromDropdown(String ram) {
        Reporter.log("Selecting RamFromDropdown"+ram+" from dropdown "+ramDropdown.toString() + "<br>");
        selectByVisibleTextFromDropDown(ramDropdown, ram);
    }

    public void selectHdd320() {
        Reporter.log("Clicking on Hdd320"+ hdd320.toString()+ "<br>");
        clickOnElement(hdd320);
    }

    public void selectHdd400() {
        Reporter.log("Clicking on Hdd400"+ hdd400.toString()+ "<br>");
        clickOnElement(hdd400);
    }

    public void selectOperatingSystemvista() {
        Reporter.log("Clicking on OperatingSystemvista"+ operatingSystemVista.toString()+ "<br>");
        clickOnElement(operatingSystemVista);
    }

    public void selectOperatingSystemPremium() {
        Reporter.log("Clicking on OperatingSystem Premium"+ operatingSystemPremium.toString()+ "<br>");
        clickOnElement(operatingSystemPremium);
    }

    public void selectSoftwareMSOffice() {
        Reporter.log("Clicking on SoftwareMSOffice"+ softwareMSOffice.toString()+ "<br>");
        clickOnElement(softwareMSOffice);
    }

    public void selectSoftwareTotalComm() {
        Reporter.log("Clicking on SoftwareTotalComm"+ softwareTotalCommander.toString()+ "<br>");
        clickOnElement(softwareTotalCommander);
    }

    public void clickOnAddToCart() {
        Reporter.log("Clicking on AddToCart"+ addToCartButton.toString()+ "<br>");
        clickOnElement(addToCartButton);
    }

    public String verifyProductAddedMessage() {
        Reporter.log("getting ProductAdded Message from "+productAddedToCartMessage.toString()+"<br>");
        return getTextFromElement(productAddedToCartMessage);
    }

    public void clickOnClose() {
        Reporter.log("Clicking on Close"+ closeButton.toString()+ "<br>");
        clickOnElement(closeButton);
    }

    public void getHdd(String Hddtext) {
        if (Hddtext == "320GB") {
            Reporter.log("Clicking on Hdd"+ hdd320.toString()+ "<br>");
            clickOnElement(hdd320);
        } else {
            Reporter.log("Clicking on Hdd"+ hdd400.toString()+ "<br>");
            clickOnElement(hdd400);
        }
    }

    public void getOsRadio(String radio) {
        if (radio == "VistaHome") {
            Reporter.log("Clicking on getOsRadio"+ operatingSystemVista.toString()+ "<br>");
            clickOnElement(operatingSystemVista);
        } else {
            Reporter.log("Clicking on getOsRadio"+ operatingSystemPremium.toString()+ "<br>");
            clickOnElement(operatingSystemPremium);

        }
    }

    public void clickOnSoftwareCheckBox(String software) {
        if (software == "MicrosoftOffice") {
            Reporter.log("Clicking on SoftwareCheckBox"+ softwareMSOffice.toString()+ "<br>");

            clickOnElement(softwareMSOffice);
        }
        if (software == "TotalCommander") {
            Reporter.log("Clicking on SoftwareCheckBox"+ softwareTotalCommander.toString()+ "<br>");

            clickOnElement(softwareTotalCommander);
        }
        if (software == "AcrobatReader") {
            Reporter.log("Clicking on SoftwareCheckBox"+ AcrobatReader1.toString()+ "<br>");

            clickOnElement(AcrobatReader1);
        }


    }
}
