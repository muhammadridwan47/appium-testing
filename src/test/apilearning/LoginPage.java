package test.apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import utils.AppiumDriverEx;
import java.time.Duration;

public class SetValues {

    public static void main(String[] args) {

        // 1. Launch the target app
            AppiumDriver appiumDriver = AppiumDriverEx.getAppiumDriver();

        // 2. Click on Nav bottom login
            appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
            WebElement loginBtnNav = appiumDriver.findElement(AppiumBy.accessibilityId("Login"));
            loginBtnNav.click();

        // 3. Input username
            WebElement usernameText = appiumDriver.findElement(AppiumBy.accessibilityId("input-email"));
            usernameText.sendKeys("ridwan@gmail.com");

        // 4. Input password
            WebElement passwordText = appiumDriver.findElement(AppiumBy.accessibilityId("input-password"));
            passwordText.sendKeys("ridwan1234");

        // 5. Click on Login button
            WebElement loginBtn = appiumDriver.findElement(AppiumBy.accessibilityId("button-LOGIN"));
            loginBtn.click();
    }
}
