package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @FindBy(xpath ="//input[@id='gender-female']")
    WebElement genderButtonFemale;
    @FindBy(xpath ="//input[@id='gender-male']")
    WebElement genderButtonMale;
    @FindBy(xpath ="//input[@id='FirstName']")
    WebElement firstName;
    @FindBy(xpath ="//input[@id='LastName']")
    WebElement lastName;
    @FindBy(xpath ="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement day;
    @FindBy(xpath ="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement month;
    @FindBy(xpath ="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement year;
    @FindBy(xpath ="//input[@id='Email']")
    WebElement email;
    @FindBy(xpath ="//input[@id='Password']")
    WebElement password;
    @FindBy(xpath ="//input[@id='ConfirmPassword']")
    WebElement confirmPw;
    @FindBy(xpath ="//button[@id='register-button']")
    WebElement registerBtn;
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameErrorText;

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement lastNameErrorText;

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement emailErrorText;
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordErrorText;
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordErrorText;
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompleted;
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueBtn;


   public void clickOnGenderF(){
       Reporter.log("Clicking on Gender emaleF"+ genderButtonFemale.toString()+ "<br>");
       clickOnElement(genderButtonFemale);
   }
    public void enterFirstname(String fname){
        Reporter.log("Enter Firstname"+fname+ " to email field "+firstName.toString() + "<br>");
       sendTextToElement(firstName,fname);
    }
    public void enterLastname(String lname){
        Reporter.log("Enter Lastname"+lname+ " to email field "+lastName.toString() + "<br>");
       sendTextToElement(lastName,lname);
    }
    public void selectDateofBirth(String date){
        Reporter.log("Selecting DateofBirth"+date+" from dropdown "+day.toString() + "<br>");
       selectByValueFromDropDown(day,date);
    }
    public void selectMonth(String mon){
        Reporter.log("Selecting Month"+mon+" from dropdown "+month.toString() + "<br>");
       selectByValueFromDropDown(month,mon);

    } public void selectYear(String yr){
        Reporter.log("Selecting Year"+yr+" from dropdown "+year.toString() + "<br>");
       selectByValueFromDropDown(year,yr);
    }
    public void enterEmail(String mail) {
        Reporter.log("Enter email"+mail+ " to email field "+email.toString() + "<br>");
       sendTextToElement(email, mail);
    }
    public void enterPassword(String pw) {
        Reporter.log("Enter Password"+pw+ " to email field "+password.toString() + "<br>");
       sendTextToElement(password,pw);
    }
    public void enterConfirmPassword(String Pw) {
        Reporter.log("Enter ConfirmPassword"+Pw+ " to email field "+confirmPw.toString() + "<br>");
        sendTextToElement(confirmPw,Pw);
    }
    public void clickOnRegister() {
        Reporter.log("Clicking on Register"+ registerBtn.toString()+ "<br>");
       clickOnElement(registerBtn);
    }
    public String verifyRegText(){
        Reporter.log("getting RegText text from "+registerText.toString()+"<br>");
       return getTextFromElement(registerText);
    }
    public String verifyFirstnameError(){
        Reporter.log("getting FirstnameError text from "+firstNameErrorText.toString()+"<br>");
       return getTextFromElement(firstNameErrorText);
    }
    public String verifyLastnameError(){
        Reporter.log("getting LastnameError text from "+lastNameErrorText.toString()+"<br>");
        return getTextFromElement(lastNameErrorText);
    }public String verifyEmailError(){
        Reporter.log("getting EmailError text from "+emailErrorText.toString()+"<br>");
       return getTextFromElement(emailErrorText);
    }
    public String verifyPassworsError(){
        Reporter.log("getting PassworsError text from "+passwordErrorText.toString()+"<br>");
        return getTextFromElement(passwordErrorText);
    }public String verifyConfirmError(){
        Reporter.log("getting ConfirmError text from "+confirmPasswordErrorText.toString()+"<br>");
        return getTextFromElement(confirmPasswordErrorText);
    }public String verifyRegistrationcomplete(){
        Reporter.log("getting Registrationcomplete text from "+registrationCompleted.toString()+"<br>");
       return getTextFromElement(registrationCompleted);
    }
    public void clickOncontiueButton() {
        Reporter.log("Clicking on contiueButton"+ continueBtn.toString()+ "<br>");
       clickOnElement(continueBtn);
    }


}
