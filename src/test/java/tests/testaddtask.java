package tests;


import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AllTaskpage;
import pages.createtaskpage;
import pages.finishedtaskspage;

public class testaddtask extends TestBase {
	createtaskpage Createtskpage;
	AllTaskpage Tasklistpage;
	finishedtaskspage finishedtasks;
	@Test
	public void test_add_task() throws MalformedURLException
	{
		android_setup();
		Tasklistpage=new AllTaskpage(driver);
		Createtskpage=new createtaskpage(driver);
		finishedtasks=new pages.finishedtaskspage(driver);
		
		Tasklistpage.clickaddtaskbtn();
		Createtskpage.entertaskname("Study appium coursev");
		Createtskpage.savebtn();
		//Dimension j=driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, \"task_name\")]")).getSize();
	//System.out.println(j);
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, \"task_name\")]")).getText(),"Study appium coursev");
		
		Tasklistpage.checkdone();
		finishedtasks.showfinishedtasks();
		String textValue = "Study appium coursev"; // Define the text value here
		String dynamicXPath = "//android.widget.TextView[@resource-id='com.splendapps.splendo:id/task_name' and @text='" + textValue + "']";
		List<WebElement>elements = driver.findElements(By.xpath(dynamicXPath));
		 for (WebElement element : elements) {
	            String elementText = element.getText();
	            Assert.assertEquals("Study appium coursev", textValue, elementText);
	        }
		//Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, \"task_name\")]")).getText(),"Study appium coursev");
		tearDown();
	}

}
