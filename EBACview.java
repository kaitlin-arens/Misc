import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EBACview extends JFrame implements ActionListener
{ 
  private JTextField tfDrinks; //number of drinks
  private JTextField tfPeriod; //drinking period in hours
  private JRadioButton rbMale, rbFemale;
  private ButtonGroup rbGroup;
  private JTextField tfWeight;
  private JButton bCalc;
  private JLabel lblBAC;
  private JLabel lblDrinks;
  
  
  
  public EBACview()
  {
    super("Blood Alcohol Content");
    setLayout(new GridLayout(5,2));
    
    add(new JLabel("Number of Drinks"));
    
    tfDrinks = new JTextField("0");
    tfDrinks.setHorizontalAlignment(JTextField.RIGHT);
    add(tfDrinks);
    
    add(new JLabel("Drinking Period in Hours"));
    
    tfPeriod = new JTextField("0");
    tfPeriod.setHorizontalAlignment(JTextField.RIGHT);
    add(tfPeriod);
    
    rbMale = new JRadioButton("Male");
    add(rbMale);
    rbFemale = new JRadioButton("Female");
    add(rbFemale);
    
    rbGroup = new ButtonGroup();
    rbGroup.add(rbMale);
    rbGroup.add(rbFemale);
    
    add(new JLabel("Weight in Kilograms"));
    
    tfWeight = new JTextField("0");
    tfWeight.setHorizontalAlignment(JTextField.RIGHT);
    add(tfWeight); 
    
    bCalc = new JButton("Calculate BAC");
    bCalc.addActionListener(this);
    bCalc.setHorizontalAlignment(JButton.RIGHT);
    add(bCalc);
    
    lblBAC = new JLabel("0");
    lblBAC.setHorizontalAlignment(JLabel.RIGHT);
    lblBAC.setBorder(BorderFactory.createLineBorder(Color.black));
    add(lblBAC);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400,400);
    setVisible(true);
  }//end of constructor
  
  public void actionPerformed(ActionEvent e)
  {
    double nod = Double.parseDouble(tfDrinks.getText());
    double wt = Double.parseDouble(tfWeight.getText());
    double per = Double.parseDouble(tfPeriod.getText());
    char gen = 'u' ;
    
    if (rbFemale.isSelected())
    {
      gen = 'f';
    }
    
    else
    {
      gen = 'm';
    }
    
    EBAC ebac = new EBAC (nod, wt, per, gen);
    lblBAC.setText(Double.toString(ebac.estimatedBAC() ) );
  }
  
  public static void main (String[]args)
  {
    EBACview ebacv = new EBACview();
    
  }
}
