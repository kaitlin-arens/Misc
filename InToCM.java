import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InToCM  extends JFrame implements ActionListener
{
  private JTextField tfInches;
  private JLabel lblCM;
  private JButton bCalc;
  
  public InToCM()
  {
    super("Inches to Centimeters");
    setLayout(new GridLayout(2,2));//2 rows, 2 columns
    
    add(new JLabel("Inches", JLabel.RIGHT));
    
    tfInches = new JTextField("0");//JTextField only holds strings
    tfInches.setHorizontalAlignment(JTextField.RIGHT);
    add (tfInches);
    
    bCalc = new JButton("Calculate");
    bCalc.addActionListener(this);
    add (bCalc);
    
    lblCM = new JLabel("0", JLabel.RIGHT);
    lblCM.setBorder(BorderFactory.createLineBorder(Color.black));
    add (lblCM);
    
    setSize(300,100);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }//end constructor
  
  public void actionPerformed(ActionEvent e)
  {
    double inches = Double.parseDouble(tfInches.getText());
    double cm = inches * 2.54;
    
    lblCM.setText( Double.toString(cm) + " cm");//translates double to a String
  }
  
  public static void main (String[]args)
  {
    InToCM itc = new InToCM();
  }
}