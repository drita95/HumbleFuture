package com.libraryct.stepDefinitions;

import com.libraryct.pages.BookManagement;
import com.libraryct.pages.HomePage;
import com.libraryct.pages.LoginPage;
import com.libraryct.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class RecordsStepDefs {

    @Given("user login as a librarian")
    public void user_login_as_a_librarian() {
       new LoginPage().loginAsLibrarian();
        BrowserUtils.waitFor(3);
    }
    @Then("click Books")
    public void click_Books() {
      new LoginPage().books.click();
      BrowserUtils.waitFor(2);
    }
    @Then("default {string} records")
    public void default_records(String record) {
        BrowserUtils.waitFor(2);
     Assert.assertEquals(record,new BookManagement().recordsDropdown.getAttribute("value"));

    }
    @Given("records show following options")
    public void records_show_following_options(List<String> recordsOptions) {

        Select stateDropdown=new Select (new BookManagement().recordsDropdown);
        List<String> options=BrowserUtils.getElementsText(stateDropdown.getOptions());

        for(String s :recordsOptions){
            Assert.assertTrue(options.contains(s));
        }

    }

}
