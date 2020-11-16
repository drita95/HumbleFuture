package com.libraryct.pages;

import com.libraryct.utilities.BrowserUtils;
import com.libraryct.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[1]/a")
    public WebElement booksinStudent;


    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[3]/a/span[1]")
    public WebElement books;

    @FindBy(linkText = "Borrowing Books")
    public WebElement borrowingBooks;

    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[2]/a/span[1]")
    public WebElement Users;

    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[1]/a/span[1]")
    public WebElement Dashboard;

    @FindBy(xpath = "//*[@id=\"books\"]/div[1]/div[1]/h3")
    public WebElement BookManagement;

    @FindBy(xpath = "//*[@id=\"users\"]/div[1]/div[1]/h3")
    public WebElement UserManagement;

    @FindBy(xpath = "//*[@id=\"dashboard\"]/div/div/div[1]/div/div/div[2]/h6")
    public WebElement usersindashboard;
  
    @FindBy(id="book_categories")
    public WebElement bookCategoryDropDown;

    @FindBy(css="table tbody tr td:nth-child(5)")
    public List<WebElement> categoryColumn;

    public void accessmodule(String module) {

        if (module.equalsIgnoreCase("books")) {
            books.click();
            BrowserUtils.waitFor(2);
            Assert.assertTrue(BookManagement.isDisplayed());
        } else if (module.equalsIgnoreCase("Users")) {
            Users.click();
            BrowserUtils.waitFor(4);
            Assert.assertTrue(UserManagement.isDisplayed());
        } else if (module.equalsIgnoreCase("Dashboard")) {
            Dashboard.click();
            BrowserUtils.waitFor(2);
            Assert.assertTrue(usersindashboard.isDisplayed());
        }
    }

    @FindBy(id="navbarDropdown")
    public WebElement LogOutDropdown;

    @FindBy(linkText ="Log Out")
    public WebElement DritaLogOut;



}
