package tests;


import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
		Createtskpage.entertaskname("Study appium course1");
		Createtskpage.savebtn();
		//Dimension j=driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, \"task_name\")]")).getSize();
	//System.out.println(j);
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, \"task_name\")]")).getText(),"Study appium course1");
		//Dimension i=driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, \"task_name\")]")).getSize();
		//driver.findElement(By.xpath("(//android.widget.CheckBox[contains(@resource-id, \"checkDone\")])[i]")).click();
		//Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, \"task_name\")]")).getText(),"Study appium course@@@");
		Tasklistpage.checkdone();
		finishedtasks.showfinishedtasks();
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[contains(@resource-id, \"task_name\")]")).getText(),"Study appium course1");
		tearDown();
	}

}
