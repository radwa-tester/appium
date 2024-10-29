package tests;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBase extends AbstractTestNGCucumberTests {
public static AppiumDriver driver;
@BeforeTest
public static void android_setup() throws MalformedURLException
{
	DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("platformName", "Android");
    caps.setCapability("automationName", "UiAutomator2");
    caps.setCapability("platformVersion", "12.0");
    caps.setCapability("deviceName", "emulator-5554");
    caps.setCapability("appPackage","com.splendapps.splendo");
    caps.setCapability("appActivity","com.splendapps.splendo.MainActivity");
    caps.setCapability("noReset", true);
    driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
}
@AfterTest
public void tearDown() {
    if (null != driver) {
        driver.quit();
    }
}

}
