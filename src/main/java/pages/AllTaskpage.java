package pages;






import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AllTaskpage extends PAGEBase {

public AllTaskpage(AppiumDriver driver) {
		super(driver);
		
	}

@FindBy(id="com.splendapps.splendo:id/fabAddTask")

WebElement addTaskBtn;

public void clickaddtaskbtn(){
	waitforvisibility(addTaskBtn);
	click(addTaskBtn);
	
}
}
