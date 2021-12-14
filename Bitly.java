import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.net.URL;

import com.google.gson.*;


public class Bitly extends Application
{
  static TextField urlfield;
  Button urlbutton;
  TextField shorturl;
  String newurl;
  static String url = "";
  static String str = "";
  static String error = "";
  
  
  
  @Override
  public void start(Stage primaryStage) 
  {
    // Make the controls
    urlfield = new TextField("Enter URL");
    urlbutton = new Button("Shorten URL");
    shorturl = new TextField();
    
    // Center text in label
    urlfield.setAlignment(Pos.CENTER);
    urlbutton.setAlignment(Pos.CENTER);
    shorturl.setAlignment(Pos.CENTER);
    // Apply ccs-like style to label
    shorturl.setStyle("-fx-border-color: #000; -fx-padding: 5px;");
    
    // Make container for app
    VBox root = new VBox();
    // Put container in middle of scene
    root.setAlignment(Pos.CENTER);
    // Spacing between items
    root.setSpacing(15);
    // Add to HBox
    root.getChildren().add(urlfield);
    root.getChildren().add(urlbutton);
    root.getChildren().add(shorturl);
    
    // Set widths
    setWidths();
    //attach buttons to code in separate method
    attachCode();
    // Set the scene
    Scene scene = new Scene(root, 400, 200);
    primaryStage.setTitle("Kaitlin Arens");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public void setWidths()
  {
    // Set widths of all controls
    urlfield.setMaxWidth(250);
    urlbutton.setPrefWidth(200);
    shorturl.setMaxWidth(250);
  }

  public void attachCode()
  {
    // Attach actions to buttons
    urlbutton.setOnAction(e -> btnShorten(e));
    //btnclr.setOnAction(e -> btnClrcode(e));
  }

  static private String getBitly()
  {
    JsonElement jse = null;
    String shorturl = null;

		try
		{
        String str = urlfield.getText();
			// Construct WxStation API URL
			URL bitlyURL = new URL("https://api-ssl.bitly.com/v3/shorten?access_token=54624da8797fd3cebaf074706dc1b4a3045bfcf8&longUrl="
					+ str);

			// Open the URL
			InputStream is = bitlyURL.openStream(); // throws an IOException
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			// Read the result into a JSON Element
			jse = new JsonParser().parse(br);
      
			// Close the connection
			is.close();
			br.close();
		}
		catch (java.io.UnsupportedEncodingException uee)
		{
         System.out.println("Catch 1");
			uee.printStackTrace();
         
		}
		catch (java.net.MalformedURLException mue)
		{
         System.out.println("Catch 2");
			mue.printStackTrace();
		}
		catch (java.io.IOException ioe)
		{
         System.out.println("Catch 3");
			ioe.printStackTrace();
		}

		if (jse != null)
		{
         error = jse.getAsJsonObject().get("status_code").getAsString();
         //System.out.println(error);
         if(error.equals("200"))
         {
         
           url = jse.getAsJsonObject().get("data").getAsJsonObject().get("url").getAsString();
         }
         else
         {
           url = "Error: Invaid URL";
         }
		}
     return url;
  }

  public void btnShorten(ActionEvent e)
  {
    if ( urlfield.getText().equals("Enter URL") )
    {
      shorturl.setText("Enter a URL");
    }
    
    else
    {
      newurl = Bitly.getBitly();
      shorturl.setText(newurl);
    }
  }

  public static void main(String[] args) 
  {
    launch(args);
  }

}