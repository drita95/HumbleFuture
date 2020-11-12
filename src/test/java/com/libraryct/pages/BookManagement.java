package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookManagement {
    public BookManagement() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(css = "select[name='tbl_books_length']")
    public WebElement recordsDropdown;

}
