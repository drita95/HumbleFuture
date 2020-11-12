package com.libraryct.pages;

import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.ConfigurationReader;
import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="inputEmail")
    public WebElement email;

    @FindBy(id="inputPassword")
    public WebElement password;

    @FindBy(css ="[type='submit']")
    public WebElement signinBtn;

    @FindBy(linkText = "Books")
    public WebElement books;

    @FindBy(linkText = "Borrowing Books")
    public WebElement borrowingBooks;




    public void loginAsStudent() {
        email.sendKeys(ConfigurationReader.get("student_email"));
        password.sendKeys(ConfigurationReader.get("student_password"));
        signinBtn.click();
    }

    public void loginAsLibrarian() {
        email.sendKeys(ConfigurationReader.get("librarian_email"));
        password.sendKeys(ConfigurationReader.get("librarian_password"));
        signinBtn.click();
        BrowserUtils.waitFor(2);
    }



}
