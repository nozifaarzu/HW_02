package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObject.signup_page;

public class SignupSteps extends Config {
    //create an object of signup_page class to use the locators from there
    signup_page su = new signup_page(driver);

    @And("user enters First and Last Name")
    public void userEntersFirstAndLastName() {
        su.enterFirstName();
        su.enterLastName();
    }

    @And("user enter their valid email address")
    public void userEnterTheirValidEmailAddress() {
        su.enterEmail();
    }

    @And("user enter Password and confirm password")
    public void userEnterPasswordAndConfirmPassword() {
        su.enterPasswordAndConfirmPassword();
    }


    //hardcoded way
//    @And("user enter month under Birth Date")
//    public void userEnterMonthUnderDOB() {
//        su.dropDownMonth("Nov");
//    }
    @And("user enter {string} under Birth month")
    public void userEnterUnderBirthMonth(String month) {
        su.dropDownMonth(month);
    }

    @And("user enter {string} under Birth date")
    public void userEnterDateUnderBirthDate(String day) {
        su.dropDownDay(day);
    }

    @And("user enter {string} under Birth year")
    public void userEnterYearUnderBirthYear(String year) {
        su.dropDownYear(year);
    }

    @And("user enter their gender as {string}")
    public void userEnterTheirGenderAs(String gender) {
        su.chooseGender(gender);
    }

    @And("user agrees on terms and condition checkbox")
    public void userAgreesOnTermsAndConditionCheckbox() {
        su.agreeCheckBox();
    }

    @When("user clicks on Create my account button")
    public void userClicksOnCreateMyAccountButton() {
        su.submitButton();
    }

    @Then("user should be able to get their studentId")
    public void userShouldBeAbleToGetTheirStudentId() {
        su.verifyStudentID();
    }

//    @And("user click on {string} button")
//    public void userClickOnButton(String arg0) {
//    }
//
//    @And("user enter {string} and {string} Name")
//    public void userEnterAndName(String firstName, String lastName) {
//        su.enterFirstName_DD(firstName);
//        su.enterLastName_DD(lastName);
//    }
}
