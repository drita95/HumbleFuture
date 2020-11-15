package com.libraryct.stepDefinitions;

import com.libraryct.pages.SearchBooksPage;
import com.libraryct.pages.LoginPage;
import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;
import org.junit.Assert;

import java.util.List;

public class SearchBooks_StepDef {
    List<String> actualCategoiesNames;

    @Given("the student is logged into the app")
    public void the_student_is_logged_into_the_app() {
        Driver.get().get(ConfigurationReader.get("url"));
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStudent();
    }

    @When("the student clicks on the All drop down button")
    public void the_student_clicks_on_the_All_drop_down_button() {
        SearchBooksPage searchBooksPage = new SearchBooksPage();
         actualCategoiesNames = searchBooksPage.getCategoryOptions();


    }

    @Then("the student should be able to select all different categories")
    public void the_student_should_be_able_to_select_all_different_categories(DataTable categoriesOptions) {


        List<String> expectedCategoriesNames = categoriesOptions.asList();
        Assert.assertEquals("The actualCategoriesNames is not equal with expectedCategoriestNames", actualCategoiesNames, expectedCategoriesNames);


    }





}
