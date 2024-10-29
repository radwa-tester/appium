package tests;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AllTaskpage;
import pages.createtaskpage;
import utilities.jsonreader;

public class testaddtask_data extends TestBase {
	createtaskpage Createtskpage;
	AllTaskpage Tasklistpage;
	@DataProvider(name ="task data")
	public Object[][] passData() throws FileNotFoundException, IOException, ParseException
	{
	return jsonreader.getJsonData(System.getProperty("user.dir")+"/Data/TaskData.json","Tasks Data", 1)	;
	}
	@Test(dataProvider = "task data")
	public void test_add_task(String Taskname) throws MalformedURLException
	{
		android_setup();
		Tasklistpage=new AllTaskpage(driver);
		Createtskpage=new createtaskpage(driver);
		
		Tasklistpage.clickaddtaskbtn();
		Createtskpage.entertaskname(Taskname);
		Createtskpage.savebtn();
		tearDown();
	}

}

