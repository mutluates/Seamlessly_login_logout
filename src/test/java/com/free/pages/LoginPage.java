package com.free.pages;

import com.free.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "user")
    public WebElement user;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(id = "body-user")
    public WebElement userPage;

    @FindBy (xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongUsernameOrPasswordMessage;

    @FindBy(xpath = "//a[@class='toggle-password']")
    public WebElement eyeButton;

    @FindBy(xpath = "//a[@id='lost-password']")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = "//input[@id='reset-password-submit']")
    public WebElement resetPasswordButton;

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement userProfileMenu;

    @FindBy(xpath= "//img[@src='/core/img/actions/logout.svg?v=6e136334']")
    public WebElement logoutButton;

    @FindBy(xpath = "//nav[@id='expanddiv']")
    public WebElement dropdownMenu;



}
