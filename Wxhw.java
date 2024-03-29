import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.net.URL;

import com.google.gson.*;

public class Wxhw
{
	public String getWx(String stationId)
	{
		JsonElement jse = null;
      String wxReport = null;
      String error = null;
     
		try
		{
			// Construct WxStation API URL
			URL wxURL = new URL("http://api.wunderground.com/api/151366ea85c82704/conditions/q/" + stationId + ".json");

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
         try
         {
           error = jse.getAsJsonObject().get("response").getAsJsonObject().get("error").getAsJsonObject().get("description").getAsString();
         }
         
         catch(java.lang.NullPointerException e)
         {            
            String location1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("display_location").getAsJsonObject().get("full").getAsString();
            wxReport = "Location: " + location1 + "\n";
             
            String time1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("observation_time").getAsString();
            wxReport = wxReport + "Time: " + time1 + "\n";
            
            
            String weather1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("weather").getAsString();
            wxReport = wxReport + "Weather: " + weather1 + "\n";
            
            String temp1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("temperature_string").getAsString();
            wxReport = wxReport + "Temperature: " + temp1 + "\n";
            
            String wind1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("wind_string").getAsString();
            wxReport = wxReport + "Wind: " + wind1 + "\n";
            
            String pressure1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("pressure_in").getAsString();
            wxReport = wxReport + "Pressure in HG: " + pressure1 + "\n";
            
            String iconURL = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("icon_url").getAsString();
            wxReport = wxReport + iconURL + "\n";
            
            return wxReport;
   		}

         
      }
      wxReport = error + "\n"; //"Error: No cities match your search query";
      return wxReport;//System.out.println("Error: No cities match your search query");
	}

	public static void main(String[] args)
	{   
		WxModel b = new WxModel();
      
    if ( args.length == 0 )
      System.out.println("Please enter a zip code");
    else
    {
		  String wx = b.getWx(args[0]);
        
      if ( wx != null )
		    System.out.println(wx);
    }
	}
}