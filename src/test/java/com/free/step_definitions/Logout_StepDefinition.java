package com.free.step_definitions;

import com.free.pages.LoginPage;
import com.free.pages.LogoutPage;
import com.free.utilities.BrowserUtils;
import com.free.utilities.ConfigurationReader;
import com.free.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Logout_StepDefinition {

    LoginPage loginPage  = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("user is on the homepage of Seamlessly web app")
    public void userIsOnTheHomepageOfSeamlesslyWebApp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
        loginPage.user.sendKeys(ConfigurationReader.getProperty("seamlessly.un"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("seamlessly.pw") + Keys.ENTER);
    }

    @When("click on the user profile")
    public void click_on_the_user_profile() {
        loginPage.userProfileMenu.click();
    }
    @When("see the dropdown menu")
    public void see_the_dropdown_menu() {
        BrowserUtils.sleep(3);
        Assert.assertTrue(loginPage.dropdownMenu.isDisplayed());
    }
    @When("click on Log out button")
    public void click_on_log_out_button() {
        loginPage.logoutButton.click();
    }
    @Then("user should see logging out from homepage")
    public void user_should_see_logging_out_from_home_page() {
        String expectedTitle = "Seamlessly -QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Given("user is on the homepage and logout")
    public void userIsOnTheHomepageAndLogout() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
        loginPage.user.sendKeys(ConfigurationReader.getProperty("seamlessly.un"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("seamlessly.pw") + Keys.ENTER);
        loginPage.userProfileMenu.click();
        loginPage.logoutButton.click();
    }

    @When("click on the step back button")
    public void click_on_the_step_back_button() {
        Driver.getDriver().navigate().back();
    }

    @Then("user should see not going to homepage again")
    public void user_should_see_not_going_to_home_page_again() {
        String expectedTitle = "Seamlessly -QA";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
