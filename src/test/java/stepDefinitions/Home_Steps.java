package stepDefinitions;

import org.openqa.selenium.WebDriver;
import pageObjects.Home_PO;

import static driver.DriverFactory.getDriver;

public class Home_Steps {
    Home_PO home_po = new Home_PO();

    public Home_Steps(Home_PO home_po) {
        this.home_po = home_po;
    }



}
