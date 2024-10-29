package tests;


import java.net.MalformedURLException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AllTaskpage;
import pages.createtaskpage;
import utilities.jsonreader;

public class testaddtask extends TestBase {
	createtaskpage Createtskpage;
	AllTaskpage Tasklistpage;
	
	@Test
	public void test_add_task() throws MalformedURLException
	{
		android_setup();
		Tasklistpage=new AllTaskpage(driver);
		Createtskpage=new createtaskpage(driver);
		
		Tasklistpage.clickaddtaskbtn();
		Createtskpage.entertaskname("Study appium course");
		Createtskpage.savebtn();
		tearDown();
	}

}
