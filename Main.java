package weatherApp;

public class Main 
{

	public static void main(String[] args) 
	{
		Kirkland kWeather = new Kirkland();
		Seattle sWeather = new Seattle();
		Bellevue bWeather = new Bellevue();
		Spokane spWeather = new Spokane();
		kWeather.weather();
		System.out.println("");
		sWeather.weather();
		System.out.println("");
		bWeather.weather();
		System.out.println("");
		spWeather.weather();
	}

}
