
package steps;
import tests.TestBase;
import pages.AllTaskpage;
import pages.createtaskpage;
import pages.PAGEBase;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.Duration;


public class CreateNewTask  extends TestBase {
	createtaskpage createtaskpage;
	AllTaskpage Tasklistpage;
	@Given("click add new task")
	public void clickaddnewtask() throws MalformedURLException{
		android_setup();
		Tasklistpage=new AllTaskpage(driver);
		createtaskpage=new createtaskpage(driver);
		Tasklistpage.clickaddtaskbtn();
		
	}
	//@Given(": click add new task")
	//public void clickaddnewtask(){
		//android_setup();
		//Tasklistpage=new AllTaskpage(driver);
		//createtaskpage=new createtaskpage(driver);
		//Tasklistpage.clickaddtaskbtn();
		
	//}
	@Given(": Enter TaskName")
	public void entertaskname()  {
	createtaskpage=new createtaskpage(driver);
	createtaskpage.entertaskname("study appium course");
}
	@When(": click save")
public void clicksave()
{
		createtaskpage=new createtaskpage(driver);
	createtaskpage.savebtn();
}
@Then(": Task added successfully")
public void taskAddedsuccessfully()
{
	tearDown();
}
}
