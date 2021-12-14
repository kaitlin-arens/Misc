import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javafx.scene.image.Image;

public class WxModel
{
  private JsonElement jse;
  //private Image img;
  
	public boolean getWx(String zip)
	{
      
		//JsonElement jse = null;
      //String wxReport = null;
  
		try
		{
			// Construct WxStation API URL
			URL wxURL = new URL("http://api.wunderground.com/api/151366ea85c82704/conditions/q/" + zip + ".json");

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
            
      return isValid();
   }
      
      
   public boolean isValid()
   {
     try
     {
       String error = jse.getAsJsonObject().get("response").getAsJsonObject().get("error").getAsJsonObject().get("description").getAsString();
       return false;
     }
     
     catch(java.lang.NullPointerException npe)
     {
       return true;
     }
   }  
   
   public String getLocation()
   {
     String location1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("display_location").getAsJsonObject().get("full").getAsString();
     return "Location: " + location1 + "\n"; 
   } 
   
   public String getTime()
   {
     String time1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("observation_time").getAsString();
     return "Time: " + time1 + "\n";
   }
   
   public String getWeather()
   {
     String weather1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("weather").getAsString();
     return "Weather: " + weather1 + "\n";
   }
   
   public String getTemp()
   {
     String temp1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("temperature_string").getAsString();
     return "Temperature: " + temp1 + "\n";
   }
   
   public String getWind()
   {
     String wind1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("wind_string").getAsString();
     return "Wind: " + wind1 + "\n";
   }
   
   public String getPressure()
   {
     String pressure1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("pressure_in").getAsString();
     return "Pressure in HG: " + pressure1 + "\n";
   }
   
   public String getVisibility()
   {
     String visibility1 = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("visibility_mi").getAsString();
     return "Visibility: " + visibility1 + "\n";
   }
   
   public Image getImage()
   {
     String iconURL = jse.getAsJsonObject().get("current_observation").getAsJsonObject().get("icon_url").getAsString();
     System.out.println("iconURL: " + iconURL);
     return new Image(iconURL);
   }
}