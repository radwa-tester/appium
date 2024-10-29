
package steps;
import tests.TestBase;
import pages.AllTaskpage;
import pages.createtaskpage;
import java.net.MalformedURLException;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewTaskwithdata  extends TestBase {
	createtaskpage createtaskpage;
	AllTaskpage tasklistpage;
	
	@Given("click add new tasks")
	public void clickaddnewtask() throws MalformedURLException, InterruptedException{
		android_setup();
		tasklistpage=new AllTaskpage(driver);
		createtaskpage=new createtaskpage(driver);
		
		tasklistpage.clickaddtaskbtn();
		
		
	}
    @Given("Enter{string}")
public void entertaskname(String taskName)  {
	createtaskpage=new createtaskpage(driver);
	createtaskpage.entertaskname(taskName);
}
@When("click save")
public void clicksave()
{
	createtaskpage.savebtn();
}
@Then("Task added successfully")
public void taskAddedsuccessfully()
{
	tearDown();
}
}
