package com.free.step_definitions;

import com.free.pages.LoginPage;
import com.free.utilities.ConfigurationReader;
import com.free.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page of web table app")
    public void userIsOnTheLoginPageOfWebTableApp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.user.sendKeys(ConfigurationReader.getProperty("seamlessly.un"));
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("seamlessly.pw"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertTrue(loginPage.userPage.isDisplayed());
    }
}
