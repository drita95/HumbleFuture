package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(id="book_categories")
    public WebElement bookCategoryDropDown;

    @FindBy(css="table tbody tr td:nth-child(5)")
    public List<WebElement> categoryColumn;



}
