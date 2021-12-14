import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.net.URL;

import com.google.gson.*;

public class WxStation
{
	public String getWx(String stationId)
	{
		JsonElement jse = null;
      String wxReport = null;

		try
		{
			// Construct WxStation API URL
			URL wxURL = new URL("http://api.openweathermap.org/data/2.5/weather?id="
					+ stationId
					+ "&units=imperial&appid=xxxxxxxxxxxxxxxxxxxxxxxx");

			// Open the URL
			InputStream is = wxURL.openStream(); // throws an IOException
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			// Read the result into a JSON Element
			jse = new JsonParser().parse(br);
      
			// Close the connection
			is.close();
			br.close();
		}
		catch (java.io.UnsupportedEncodingException uee)
		{
			uee.printStackTrace();
		}
		catch (java.net.MalformedURLException mue)
		{
			mue.printStackTrace();
		}
		catch (java.io.IOException ioe)
		{
			ioe.printStackTrace();
		}

		if (jse != null)
		{
      // Build a weather report
      String id = jse.getAsJsonObject().get("id").getAsString();
      wxReport = "StationID: " + id + "\n";

      String name = jse.getAsJsonObject().get("name").getAsString();
      wxReport = wxReport + "Location: " + name + "\n";

      String temp = jse.getAsJsonObject().get("main")
                       .getAsJsonObject().get("temp").getAsString();
      wxReport = wxReport + "Temperature: " + temp + "\n";

      String pressure = jse.getAsJsonObject().get("main")
                       .getAsJsonObject().get("pressure").getAsString();
      wxReport = wxReport + "Pressure: " + pressure + "\n";

      JsonArray obs = jse.getAsJsonObject().get("weather").getAsJsonArray();
      String conditions = obs.get(0)
                       .getAsJsonObject().get("main").getAsString();
      wxReport = wxReport + "Conditions: " + conditions;
		}
    return wxReport;
	}

	public static void main(String[] args)
	{
		WxStation b = new WxStation();
    if ( args.length == 0 )
      System.out.println("Please enter a Weather Station ID as the first argument.");
    else
    {
		  String wx = b.getWx(args[0]);
      if ( wx != null )
		    System.out.println(wx);
    }
	}
}
