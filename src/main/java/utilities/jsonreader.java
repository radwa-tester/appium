package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonreader {
public static Object[][] getJsonData(String json_path,String json_Data,int Json_attributes) throws FileNotFoundException, IOException, ParseException
{
	Object obj=new JSONParser().parse(new FileReader(json_path));
	JSONObject jo=(JSONObject) obj;
	JSONArray js=(JSONArray) jo.get(json_Data);
	Object[][] arr=new String[js.size()][Json_attributes];
	for(int i=0;i<js.size();i++)
	{
		JSONObject obj1=(JSONObject)js.get(i);
		arr[i][0]=String.valueOf(obj1.get("Taskname"));
	}
	return arr;
}

}
