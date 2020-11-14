package com.libraryct.stepDefinitions;

import com.libraryct.pages.LoginPage;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user  enters {string} and {string} as a {string}")
    public void the_user_enters_and_as_a(String userType, String email, String password) {
        BrowserUtils.waitForPageToLoad(5);
        loginPage.email.sendKeys(email);
        loginPage.password.sendKeys(password);

    }
    @When("the user clicks signin button")
    public void the_user_clicks_signin_button() {
       loginPage.signinBtn.click();
    }
    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expectedTitle) {
    BrowserUtils.waitForPageToLoad(5);
        Assert.assertEquals(expectedTitle,Driver.get().getTitle());

    }

}
