package com.libraryct.stepDefinitions;

import com.libraryct.pages.HomePage;
import com.libraryct.pages.LoginPage;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOutStepDeffs {

    @Given("the user login as a {string}")
    public void the_user_login_as_a(String username) {
       if(username.equalsIgnoreCase("student")){
           LoginPage loginPage = new LoginPage();
           loginPage.loginAsStudent();
       }else if(username.equalsIgnoreCase("librarian")){
           LoginPage loginPage = new LoginPage();
           loginPage.loginAsLibrarian();
       }

    }
    @When("User is on the home page")
    public void user_is_on_the_home_page() {

        if(new HomePage().LogOutDropdown.getText().contains("Librarian")) {
            String expectedUrl = "http://library2.cybertekschool.com/#dashboard";
            Assert.assertEquals(expectedUrl, Driver.get().getCurrentUrl());
        }else if( new HomePage().LogOutDropdown.getText().contains("Student")){
            String expectedUrl = "http://library2.cybertekschool.com/#books";
            Assert.assertEquals(expectedUrl,Driver.get().getCurrentUrl());
        }

    }

    @When("the user clicks on the username dropdown")
    public void the_user_clicks_on_the_username_dropdown() {
        HomePage homePage = new HomePage();
        homePage.LogOutDropdown.click();
        BrowserUtils.waitFor(3);


    }
    @When("the user clicks on log out option")
    public void the_user_clicks_on_log_out_option() {
        HomePage homePage = new HomePage();
        homePage.DritaLogOut.click();
        BrowserUtils.waitFor(3);

    }
    @Then("user is on the login page")
    public void user_is_on_the_login_page() {

        String expectedUrl = "http://library2.cybertekschool.com/login.html";
        System.out.println(Driver.get().getCurrentUrl());
        Assert.assertEquals(expectedUrl,Driver.get().getCurrentUrl());

    }

}
