package weatherApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Kirkland {

	public void weather() 
	{
		try
		{
		String openWeatherURL = "https://api.openweathermap.org/data/2.5/weather?lat=47.69&lon=-122.19&appid=400f8a7048f7f84a377135e88dd09dbc";
		URL url = new URL(openWeatherURL);
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		JSONParser jsonParser = new JSONParser();
		JSONObject myObject = (JSONObject)jsonParser.parse(br);
		
		
		JSONArray dataArray = (JSONArray)myObject.get("weather");
		JSONObject clouds = (JSONObject)dataArray.get(0);
		String description = (String)((JSONObject)clouds).get("description");
		JSONObject main = (JSONObject)myObject.get("main");
		double temp = (double)((JSONObject)main).get("temp");
		long humidity = (long)((JSONObject)main).get("humidity");
		JSONObject wind = (JSONObject)myObject.get("wind");
		double speed = (double)((JSONObject)wind).get("speed");
		
		System.out.println("--Kirkland Weather--");
		System.out.println("Temperature: " + temp);
		System.out.println("Humidity: " + humidity);
		System.out.println("Cloud Coverage: " + description);
		System.out.println("Wind Speed: " + speed);
		
		}catch (MalformedURLException e)//catches exceptions and allows program to run
		{
			e.printStackTrace();
		}catch (IOException e) 
		{
			e.printStackTrace();
		}catch (ParseException e) 
		{
			e.printStackTrace();
		}
	}
}
