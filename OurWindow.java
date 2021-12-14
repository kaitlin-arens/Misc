import java.awt.*;
import javax.swing.*;

public class OurWindow extends JFrame
{
  public OurWindow()
  {
    setSize(400,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main (String[]args)
  {
    OurWindow ow = new OurWindow();
  }
}