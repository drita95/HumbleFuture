package com.libraryct.stepDefinitions;

import com.libraryct.pages.LoginPage;
import com.libraryct.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class modulesStepDef {

    @When("user login as a student")
    public void user_login_as_a_student() {

        LoginPage loginPage=new LoginPage();
        loginPage.loginAsStudent();
        BrowserUtils.waitFor(2);
    }


    @Then("user see Books")
    public void user_see_Books() {
        Assert.assertTrue(new LoginPage().books.isDisplayed());
        BrowserUtils.waitFor(2);
    }

    @Then("user see Borrowing Books")
    public void user_see_Borrowing_Books() {
       Assert.assertTrue(new LoginPage().borrowingBooks.isDisplayed());
        BrowserUtils.waitFor(2);
    }
    @When("user login as a librarian")
    public void user_login_as_a_librarian() {
        new LoginPage().loginAsLibrarian();
        BrowserUtils.waitFor(7);
    }

    @Then("user access following  {string} module")
    public void user_access_following_module(String options) {


        new LoginPage().accessmodule(options);
        BrowserUtils.waitFor(2);
    }



}
