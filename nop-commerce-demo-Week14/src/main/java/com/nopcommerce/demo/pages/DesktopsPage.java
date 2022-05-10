package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    public DesktopsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;

    @FindBy(id = "products-orderby")
    WebElement sortBy;

    @FindBy(id = "products-pagesize")
    WebElement display;

    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement productList;

    public void selectProductFromList(String text){
        Reporter.log("Selecting Product From List"+text+" from dropdown "+productList.toString() + "<br>");
        selectByValueFromDropDown(productList,text);
    }

    public String verifyDesktopText(){
        Reporter.log("getting Desktop text from "+desktopText.toString()+"<br>");
        return getTextFromElement(desktopText);
    }
    public void clickOnSortBy(){
        Reporter.log("Clicking on newsletterbox"+ sortBy.toString()+ "<br>");
        clickOnElement(sortBy);
    }
    public void clickOnDisplay(){
        Reporter.log("Clicking on SortBy"+ display.toString()+ "<br>");
        clickOnElement(display);
    }
    public void selectProductList(){
        Reporter.log("Clicking on ProductList"+ productList.toString()+ "<br>");
        clickOnElement(productList);
    }
}
