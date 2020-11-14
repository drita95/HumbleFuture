package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage {
    public UserManagementPage(){ PageFactory.initElements(Driver.get(), this);}

    @FindBy(css = "a.btn.btn-lg.btn-outline.btn-primary.btn-sm")
    public WebElement AddUserButton;

    @FindBy(xpath = "(//table/tbody/tr/td/a)[1]")
    public WebElement EditUserButton;

    @FindBy(xpath = "//div[@id='toast-container']//div//div")
    public WebElement message;

    @FindBy(xpath = "//h3")
    public WebElement UserManagementHeader;



}
