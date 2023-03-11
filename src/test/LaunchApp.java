package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class LaunchApp {
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

       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
