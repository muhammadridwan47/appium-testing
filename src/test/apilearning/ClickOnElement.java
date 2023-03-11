package test.apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverEx;

import java.time.Duration;

public class ClickOnElement {

    public static void main(String[] args) {
        AppiumDriver appiumDriverEx = AppiumDriverEx.getAppiumDriver();
        appiumDriverEx.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
        WebElement loginLabel= appiumDriverEx.findElement(AppiumBy.accessibilityId("Login"));
        loginLabel.click();
    }

}
