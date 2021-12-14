import javax.swing.JOptionPane;
import java.util.Random;

public class RPSLSTest
{
  public static void main(String[]args)
  {
    String uc;
    String cc;
    
  
    uc = JOptionPane.showInputDialog("Enter choice");
    uc = uc.substring(0,2);
    uc = uc.toUpperCase();
    
    Random random = new Random();

		// generates a random int
		for (int i = 0; i < 5; i++) 
      {
			iRandom(random);
		}
    
    switch(i)
    {
    case 1:
    cc="RO";
    break;
    
    case 2:
    cc="PA";
    break;
    
    case 3:
    cc="SC";
    break;
    
    case 4:
    cc="LI";
    break;
    
    case 5:
    cc="SP";
    break;
    }
  }


}