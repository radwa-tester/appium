package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class createtaskpage extends PAGEBase {
	

public createtaskpage(AppiumDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}
@FindBy(id="com.splendapps.splendo:id/edtTaskName")
WebElement tasknametxt;
@FindBy(id="com.splendapps.splendo:id/edtDueD")
WebElement Duedate;
@FindBy(id="com.splendapps.splendo:id/spinnerLists")
WebElement lists;
@FindBy(id="com.splendapps.splendo:id/fabSaveTask")
WebElement savebtn;
public void entertaskname(String taskname)
{
	waitforvisibility(tasknametxt);
	clear(tasknametxt);
	sendtext(tasknametxt, taskname);
}
public void savebtn()
{
	click(savebtn);
}
}
