package com.free.step_definitions;

import com.free.pages.LoginPage;
import com.free.utilities.ConfigurationReader;
import com.free.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page of Seamlessly web app")
    public void userIsOnTheLoginPageOfSeamlesslyWebApp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }
    @When("user enters valid username")
    public void user_enters_librarian_username() {
        loginPage.user.sendKeys(ConfigurationReader.getProperty("seamlessly.un"));
    }
    @When("user enters valid password")
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
    @When("user enters invalid username")
    public void userEntersInvalidUsername() {
         loginPage.user.sendKeys("Username41");
    }

    @Then("user should see Wrong username or password message")
    public void userShouldSeeWrongUsernameOrPasswordMessage() {
       Assert.assertTrue(loginPage.wrongUsernameOrPasswordMessage.isDisplayed());
    }

    @And("user press the enter key")
    public void userTapTheEnterButton() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("seamlessly.pw") + Keys.ENTER);
    }

    @And("user enters invalid password")
    public void userEntersInvalidPassword() {
        loginPage.password.sendKeys("employee123");
    }
}
