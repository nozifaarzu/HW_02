package pageObject;

import base.Config;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class signup_page extends Config {

    //create a constructor of this class
    public signup_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver=driver;
    }

    //java faker class object
    Faker faker = new Faker();

    //locators
    @FindBy(how= How.NAME, using = "firstName")
    public WebElement fnLocator;
    @FindBy(how= How.NAME, using = "lastName")
    public WebElement lnLocator;
    @FindBy(how= How.NAME, using = "email")
    public WebElement emailLocator;
    @FindBy(how= How.NAME, using = "password")
    public WebElement passwordLocator;
    @FindBy(how= How.NAME, using = "confirmPassword")
    public WebElement confirmPasswordLocator;
    @FindBy(how= How.NAME, using = "month")
    public WebElement monthDropDownLoc;
    @FindBy(how= How.NAME, using = "day")
    public WebElement dayDropDownLoc;
    @FindBy(how= How.NAME, using = "year")
    public WebElement yearDropDownLoc;
    @FindBy(how= How.ID, using = "male")
    public WebElement maleLocator;
    @FindBy(how= How.ID, using = "female")
    public WebElement femaleLocator;
    @FindBy(how= How.NAME, using = "agree")
    public WebElement checkLocator;
    @FindBy(how= How.XPATH, using = "//*[@id='signup-form']/button")
    public WebElement submitButtonLocator;
    @FindBy(how= How.XPATH, using = "//*[@id='success_message']/div")
    public WebElement successMsgLocator;


    // functions
    public void enterFirstName(){
        String fnName = faker.name().firstName();
        fnLocator.sendKeys(fnName);
    }
    //DD=Data Driven
    public void enterFirstName_DD(String fnName){
        fnLocator.sendKeys(fnName);
    }
    public void enterLastName_DD(String lnName){
        lnLocator.sendKeys(lnName);
    }
    public void enterLastName(){
        lnLocator.sendKeys(faker.name().lastName());
    }
    public void enterEmail(){
        //emailLocator.sendKeys(faker.internet().emailAddress());
        String tt_domain = "@taltektc.com";
        String firstName = faker.name().firstName().toLowerCase();
        String lastName = faker.name().lastName().toLowerCase();
        String randomNum = faker.number().digits(6);
        String fullEmail = firstName+lastName+randomNum+tt_domain;
        System.out.println(fullEmail);
        emailLocator.sendKeys(fullEmail);
    }

    public void enterPasswordAndConfirmPassword(){
        String pass = faker.internet().password(5,12);
        passwordLocator.sendKeys(pass);
        confirmPasswordLocator.sendKeys(pass);
    }


    public void dropDownMonth (String month){
        Select mm = new Select(monthDropDownLoc);
        mm.selectByVisibleText(month);
    }
    public void dropDownDay (String day){
        Select dd = new Select(dayDropDownLoc);
        dd.selectByVisibleText(day);
    }
    public void dropDownYear (String year){
        Select yy = new Select(yearDropDownLoc);
        yy.selectByVisibleText(year);
    }

    public void chooseGender (String gender){
        if(gender.equalsIgnoreCase("female")){
            femaleLocator.click();
        }
        if (gender.equalsIgnoreCase("male")) {
            maleLocator.click();
        }

    }

    public void agreeCheckBox(){
        checkLocator.click();
    }

    public void submitButton(){
        submitButtonLocator.click();
    }

    public void verifyStudentID(){
        String successMSg = successMsgLocator.getText();
        studentID = successMSg.substring(38);
        System.out.println("Student ID: "+studentID);
    }


}