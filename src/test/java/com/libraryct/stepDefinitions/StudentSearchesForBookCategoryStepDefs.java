package com.libraryct.stepDefinitions;

import com.libraryct.pages.HomePage;
import com.libraryct.pages.LoginPage;
import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StudentSearchesForBookCategoryStepDefs {

    @Given("a student loged in")
    public void a_student_loged_in() {
        new LoginPage().loginAsStudent();
    }

    @When("the user clicks an {string} from Book Categories Dropdown")
    public void the_user_clicks_an_from_Book_Categories_Dropdown(String option) {
        HomePage homePage = new HomePage();

        BrowserUtils.waitForVisibility(homePage.bookCategoryDropDown,10);
        Select s = new Select(homePage.bookCategoryDropDown);
        List<WebElement> options = s.getOptions();

        System.out.println("options = " + BrowserUtils.getElementsText(options).toString());
        s.selectByVisibleText(option);

    }

    @Then("the only selected Category of books should appear under results table")
    public void the_only_selected_Category_of_books_should_appear_under_results_table() {
        HomePage homePage = new HomePage();


        Select sel = new Select(homePage.bookCategoryDropDown);
        BrowserUtils.waitFor(3);
        String selected = sel.getFirstSelectedOption().getText();
        List<String> actualCat = BrowserUtils.getElementsText(homePage.categoryColumn);
        for (String el:actualCat) {
            Assert.assertEquals(selected,el);
        }
    }


}
