package com.libraryct.pages;

        import com.libraryct.utilities.BrowserUtils;
        import com.libraryct.utilities.Driver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.Select;
        import java.util.Map;

public class AddUserPage {

    public AddUserPage(){ PageFactory.initElements(Driver.get(), this);}

    @FindBy(name = "full_name")
    public WebElement FullNameInputBox;

    @FindBy(name = "password")
    public WebElement PasswordInputBox;

    @FindBy(name = "email")
    public WebElement EmailInputBox;

    @FindBy(id = "user_group_id")
    public WebElement UserGroupDropdown;

    @FindBy(id = "status")
    public WebElement StatusDropdown;

    @FindBy(name = "start_date")
    public WebElement StartDateInpuBox;

    @FindBy(name = "end_date")
    public WebElement EndDateInputBox;

    @FindBy(id = "address")
    public WebElement AddressInputBox;

    @FindBy(xpath = "//button[@class='btn default']")
    public WebElement CloseButton;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement SaveChangesButton;

    @FindBy(css = "h5.modal-title")
    public WebElement AddUserHeader;

    public void addUser(Map<String,String> user){
        FullNameInputBox.sendKeys(user.get("fullName"));
        PasswordInputBox.sendKeys(user.get("password"));
        EmailInputBox.sendKeys(user.get("email"));
        Select select1 = new Select(UserGroupDropdown);
        select1.selectByVisibleText(user.get("userGroup"));
        Select select2 = new Select(StatusDropdown);
        select2.selectByVisibleText(user.get("status"));
        StartDateInpuBox.sendKeys(user.get("startDate"));
        EndDateInputBox.sendKeys(user.get("endDate"));
        AddressInputBox.sendKeys(user.get("address"));
    }
}
