import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CalcAdd extends Application {

  TextField txt1, txt2;
  Button addbtn, eqlbtn;
  Label lblanswer;

  @Override
  public void start(Stage primaryStage) {
    // Make the controls
    txt1=new TextField("Num");
    txt2=new TextField("Num");
    addbtn=new Button("+");
    eqlbtn=new Button("=");
    lblanswer=new Label();
    // Center text in label
    txt1.setAlignment(Pos.CENTER);
    txt2.setAlignment(Pos.CENTER);
    lblanswer.setAlignment(Pos.CENTER);
    // Apply ccs-like style to label
    lblanswer.setStyle("-fx-border-color: #000; -fx-padding: 5px;");

    // Make container for app
    HBox root = new HBox();
    // Put container in middle of scene
    root.setAlignment(Pos.CENTER);
    // Spacing between items
    root.setSpacing(15);
    // Add to HBox
    root.getChildren().add(txt1);
    root.getChildren().add(addbtn);
    root.getChildren().add(txt2);
    root.getChildren().add(eqlbtn);
    root.getChildren().add(lblanswer);
    
    // Set widths
    setWidths();
    //attach buttons to code in separate method
    attachCode();
    // Set the scene
    Scene scene = new Scene(root, 630, 100);
    primaryStage.setTitle("Kaitlin Arens");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public void setWidths(){
    // Set widths of all controls
    txt1.setMaxWidth(75);
    addbtn.setPrefWidth(60);
    txt2.setMaxWidth(75);
    eqlbtn.setPrefWidth(60);
    lblanswer.setPrefWidth(250); 
  }

  public void attachCode()
  {
    // Attach actions to buttons
    addbtn.setOnAction(e -> btnAddcode(e));
    eqlbtn.setOnAction(e -> btnEqlcode(e));
  }

  public void btnAddcode(ActionEvent e)
  {
    if ( txt1.getText().equals("Num") )
    {
      lblanswer.setText("Answer");
      txt2.setText("Num");
    }  
    
    else if( txt2.getText().equals("Num") ) 
    {
      lblanswer.setText("Answer");
      txt1.setText("Num");
    } 
    
    else
    {
      lblanswer.setText("Answer");
      txt1.setText("Num");
      txt2.setText("Num");
    }
  }

  public void btnEqlcode(ActionEvent e)
  {
    //int value = 0;
    //value = Integer.parseInt(txt1);
    
    double d1 = Double.parseDouble(txt1.getText());
    int i1 = (int)d1;
    
    double d2 = Double.parseDouble(txt2.getText());
    int i2 = (int)d2;
    
    int value = i1 + i2;
   
    
    lblanswer.setText(Integer.toString(value));
    //Integer value1 = Integer.getInteger(txt1.getText(), null);
    //Integer value2 = Integer.getInteger(txt2.getText(), null);
    
    //Integer value3 = value1 + value2; 
  }

  public static void main(String[] args) {
    launch(args);
  }
}