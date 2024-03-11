package stepDefinitions.base;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.Timestamp;

import static driver.DriverFactory.cleanDriver;
import static driver.DriverFactory.getDriver;

public class Hooks {

    @Before("@login")
    public void setUp() {

        getDriver();
    }

    @After("@login")
    public void tearDown() {
        cleanDriver();
    }


    @AfterStep
    public void captureExceptionImage(Scenario scenario) {
        if (scenario.isFailed()) {
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMillSeconds = Long.toString(timestamp.getTime());

            byte[] screenshot = ((TakesScreenshot) getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",timeMillSeconds);

        }
    }
}