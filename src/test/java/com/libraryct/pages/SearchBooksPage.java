package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class SearchBooksPage {
    public SearchBooksPage(){ PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css="#book_categories")
    WebElement categoryDropDown;

    public List<String> getCategoryOptions() {

        // explicit wait
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.visibilityOf(categoryDropDown));

        List<String> categoryOptions = new ArrayList<>();
        Select select = new Select(categoryDropDown);
        for (WebElement option : select.getOptions()) {
            categoryOptions.add(option.getText());


        }

        return categoryOptions;

    }


}
