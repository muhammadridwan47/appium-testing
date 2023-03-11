package test.apilearning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class ClickOnElement {

    public static void main(String[] args) {
        try {
            // Driver instance
            AppiumDriver appiumDriver;

            // Set DesireCapabilities to send to appium server
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            desiredCapabilities.setCapability("appPackage", "com.wdiodemoapp");
            desiredCapabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

            //setup the appium server URL to connect APP
            URL appiumServer = new URL("http://localhost:8989/wd/hub");

            appiumDriver = new AppiumDriver(appiumServer, desiredCapabilities);
            appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
            WebElement loginLabel= appiumDriver.findElement(AppiumBy.accessibilityId("Login"));
            loginLabel.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
