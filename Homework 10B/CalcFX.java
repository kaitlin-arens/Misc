import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class CalcFX extends Application {

  TextField infixtxt;
  Label lblanswer, lblpostfix;
  Button btncalculate, btnclr;
  String value = "";
  int newValue = 0;
  String postfix = "";
  String newString = "";
  
  Calculator calc1 = new Calculator();
  
  

  @Override
  public void start(Stage primaryStage) {
    // Make the controls
    infixtxt=new TextField("Enter Infix Notation");
    lblpostfix=new Label();
    lblanswer=new Label();
    btncalculate=new Button("Calculate");
    btnclr=new Button("Clear");
    
    // Center text in label
    infixtxt.setAlignment(Pos.CENTER);
    lblpostfix.setAlignment(Pos.CENTER);
    lblanswer.setAlignment(Pos.CENTER);
    // Apply ccs-like style to label
    lblpostfix.setStyle("-fx-border-color: #000; -fx-padding: 5px;");
    lblanswer.setStyle("-fx-border-color: #000; -fx-padding: 5px;");

    // Make container for app
    VBox root = new VBox();
    // Put container in middle of scene
    root.setAlignment(Pos.CENTER);
    // Spacing between items
    root.setSpacing(15);
    // Add to HBox
    root.getChildren().add(infixtxt);
    root.getChildren().add(lblpostfix);
    root.getChildren().add(lblanswer);
    root.getChildren().add(btncalculate);
    root.getChildren().add(btnclr);
    // Set widths
    setWidths();
    //attach buttons to code in separate method
    attachCode();
    // Set the scene
    Scene scene = new Scene(root, 400, 250);
    primaryStage.setTitle("Kaitlin Arens");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public void setWidths(){
    // Set widths of all controls
    infixtxt.setMaxWidth(200);
    lblpostfix.setPrefWidth(200);
    lblanswer.setPrefWidth(120);
    btncalculate.setPrefWidth(80);
    btnclr.setPrefWidth(80);
  }

  public void attachCode()
  {
    // Attach actions to buttons
    btncalculate.setOnAction(e -> btnCalculatecode(e));
    btnclr.setOnAction(e -> btnClrcode(e));
  }

  public void btnCalculatecode(ActionEvent e)
  {
     
     
    if ( infixtxt.getText().equals("Enter Infix Notation") )
    {
      lblpostfix.setText("Postfix Notation");
      lblanswer.setText("Answer");
    }
    
    else
    {
      value = infixtxt.getText();
      //lblpostfix = value;
      postfix = calc1.infixToPostfix(value);
      lblpostfix.setText(postfix);
      //System.out.println("Value: " + value);
      //System.out.println("Postfix: " + postfix);
      //postfix = Calculator.infixToPostfix(value);
      //lblpostfix.setText();
      //System.out.println(value);
      newValue = calc1.evaluatePostfix(postfix);
      newString = Integer.toString(newValue);
      lblanswer.setText(newString);
    }
  }

  public void btnClrcode(ActionEvent e)
  {
    infixtxt.setText("Enter Infix Notation");
    infixtxt.requestFocus();
    lblanswer.setText("Answer");
    lblpostfix.setText("Postfix");
  }

  public static void main(String[] args) {
    //System.out.println("Kaitlin 1");
    //calc = new Calculator();
    launch(args);
    //System.out.println("Kaitlin 2");
    
  }
}