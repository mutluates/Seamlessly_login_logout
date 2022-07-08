package com.free.step_definitions;

import com.free.utilities.BrowserUtils;
import com.free.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class hooks {

    @After
    public void teardownScenario(Scenario scenario) {

        // scenario.isFailed() --> if scenario fails this method will return TRUE boolean value

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

          BrowserUtils.sleep(3);
          Driver.closeDriver();

     }

}
