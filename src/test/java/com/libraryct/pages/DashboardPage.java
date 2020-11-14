package com.libraryct.pages;

import com.libraryct.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {

    public DashboardPage(){ PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement UsersTab;


}
