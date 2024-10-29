package pages;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.bytebuddy.asm.Advice.This;

public class PAGEBase {
 AppiumDriver driver;
public static final long WAIT=40;

public PAGEBase(AppiumDriver driver) {
	this.driver = driver;
	 PageFactory.initElements((driver), this);
	
	
}

public void waitforvisibility(WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver, WAIT);
	wait.until(ExpectedConditions.visibilityOf(element));
}
public void clear(WebElement element) {
	waitforvisibility(element);
	element.clear();
}
public void click(WebElement element)
{
	waitforvisibility(element);
	element.click();
}
public void sendtext(WebElement element,String text)
{
	waitforvisibility(element);
	element.sendKeys(text);
}
public String getattribute(WebElement element,String attribute)
{
	waitforvisibility(element);
	return element.getAttribute(attribute);
}
}
