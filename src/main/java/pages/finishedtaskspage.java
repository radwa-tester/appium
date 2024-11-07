package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class finishedtaskspage extends PAGEBase {

	public finishedtaskspage(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(id = "com.splendapps.splendo:id/spinnerToolbar")
WebElement Dropdowntasks;
@FindBy(xpath = "//android.widget.TextView[@text=\"Finished\"]")
WebElement finishedtasks;
public void showfinishedtasks()
{
	click(Dropdowntasks);
	click(finishedtasks);
	
	
}
}
