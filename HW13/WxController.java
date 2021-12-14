import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javax.swing.*;

public class WxController implements Initializable {

  @FXML
  private TextField txtzip;

  @FXML
  private Button btnweather;

  @FXML
  private Label lblcity;

  @FXML
  private Label lbltime;  

  @FXML
  private Label lblweather;

  @FXML
  private Label lbltemp;

  @FXML
  private Label lblwind;

  @FXML
  private Label lblpressure;
  
  @FXML
  private Label lblvisibility;
  
  @FXML
  private ImageView icon;

  @FXML
  private void handleButtonAction(ActionEvent e) 
  {
  
    WxModel weather = new WxModel();
  
    // Has the clear button been pressed?
    if (e.getSource() == btnweather)
    {
      //Image img = null;
      String zipcode = txtzip.getText();
      
      if(weather.getWx(zipcode))
      {
        lblcity.setText(weather.getLocation());
        lbltime.setText(weather.getTime());
        lblweather.setText(weather.getWeather());
        lbltemp.setText(weather.getTemp());
        lblwind.setText(weather.getWind());
        lblpressure.setText(weather.getPressure());
        lblvisibility.setText(weather.getVisibility());
   
        //img = weather.getImage();
        //img = SwingFXUtils.toFXImage(weather.getImage(), null);
        icon.setImage(weather.getImage());
      }
      
      else
      {
        lblcity.setText("Invalid Zipcode");
      }
    }
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }    

}