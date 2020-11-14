package com.libraryct.stepDefinitions;

import com.libraryct.pages.AddUserPage;
import com.libraryct.pages.DashboardPage;
import com.libraryct.pages.LoginPage;
import com.libraryct.pages.UserManagementPage;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class AddUserStepDefs {

    @Given("User is logged in as Librarian")
    public void user_is_logged_in_as_Librarian() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(3);
        new LoginPage().loginAsLibrarian();
        BrowserUtils.waitFor(3);
    }

    @When("User clicks User Management Tab")
    public void user_clicks_User_Management_Tab() {
        BrowserUtils.waitFor(3);
        new DashboardPage().UsersTab.click();
    }

    @When("User clicks to Add User button")
    public void user_clicks_to_Add_User_button() {
        BrowserUtils.waitFor(3);
        new UserManagementPage().AddUserButton.click();

    }

    @When("Enter the following information")
    public void enter_the_following_information(Map<String,String> userInfo) {
        BrowserUtils.waitFor(3);
        new AddUserPage().addUser(userInfo);
    }

     @When("User clicks Save Changes button")
    public void user_clicks_Save_Changes_button() {
        new AddUserPage().SaveChangesButton.click();
    }

    @Then("The user has been created message should be displayed")
    public void the_user_has_been_created_message_should_be_displayed() {

        BrowserUtils.waitForPageToLoad(20);
        String actualMessage = new UserManagementPage().message.getText();
        String expectedMessage = "The user has been created.";
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @When("User clicks to Close button")
    public void user_clicks_to_Close_button() {
        new AddUserPage().CloseButton.click();
    }

    @Then("User Management page should be displayed")
    public void user_Management_page_should_be_displayed() {
        Assert.assertTrue(new UserManagementPage().UserManagementHeader.isDisplayed());
    }

    @When("User click Edit User button")
    public void user_click_Edit_User_button() {
        new UserManagementPage().EditUserButton.click();
    }

    @Then("Edit User Information page should be opened")
    public void edit_User_Information_page_should_be_opened() {
        Assert.assertTrue(new AddUserPage().AddUserHeader.isDisplayed());
    }

    @Then("The user updated message should be displayed")
    public void the_user_updated_message_should_be_displayed() {
        BrowserUtils.waitForPageToLoad(20);
        String actualMessage = new UserManagementPage().message.getText();
        String expectedMessage = "The user updated.";
        Assert.assertEquals(expectedMessage,actualMessage);
    }


}
