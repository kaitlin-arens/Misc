import java.util.*;
import javax.swing.JOptionPane;

public class RPSLS
{
  private String Rock;
  private String Paper;
  private String Scissors;
  private String Lizard;
  private String Spock;
  private String UsersChoice;
  //private String uc;
  //private String cc = "Rock";
  private String ComputersChoice;
  
  public RPSLS ()
  {
    Rock = "Ro";
    Paper = "Pa";
    Scissors = "Sc";
    Lizard = "Li";
    Spock = "Sp";
    UsersChoice = "uc";
    ComputersChoice = "cc";
  } 
  
  public static void main (String[]args)
  {
    String uc;
    String cc = "";
    
  
   
  
    uc = JOptionPane.showInputDialog("Enter choice");
    uc = uc.substring(0,2);
    uc = uc.toUpperCase();
    
    Random rand = new Random();
    int n = rand.nextInt(5)+1;
    
    System.out.println("Computers chose case" + n);
    
    switch(n)
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
    
    
   
   if(cc.equals("RO"))
     {
    switch(uc)
      {
      case "RO":
      System.out.println("Tie!");
      break;
      case"PA":
      System.out.println("User Wins!");
      break;
      case "SC":
      System.out.println("User Loses!");
      break;
      case "LI":
      System.out.println("User Loses!");
      break;
      case"SP":
      System.out.println("User Wins!");
      break;
      }
     }
      
     else if(cc=="PA")
     {
      switch(uc)
      {
      case "RO":
      System.out.println("User Loses!");
      break;
      case"PA":
      System.out.println("Tie!");
      break;
      case "SC":
      System.out.println("User Wins!");
      break;
      case "LI":
      System.out.println("User Loses!");
      break;
      case"SP":
      System.out.println("User Wins!");
      break;
      }    
     }
     
     else if(cc=="SC")
    {
     switch(uc)
     {
      case "RO":
      System.out.println("User Wins!");
      break;
      case"PA":
      System.out.println("User Loses!");
      break;
      case "SC":
      System.out.println("Tie!");
      break;
      case "LI":
      System.out.println("User Loses!");
      break;
      case"SP":
      System.out.println("User Wins!");
      break;
     }    
    }
    
    else if(cc=="LI")
    {
     switch(uc)
     {
      case "RO":
      System.out.println("User Loses!");
      break;
      case"PA":
      System.out.println("User Wins!");
      break;
      case "SC":
      System.out.println("Tie!");
      break;
      case "LI":
      System.out.println("User Loses!");
      break;
      case"SP":
      System.out.println("User Wins!");
      break;
     }    
    }
    
    else if(cc=="SP")
    {
     switch(uc)
     {
      case "RO":
      System.out.println("User Loses!");
      break;
      case"PA":
      System.out.println("User Wins!");
      break;
      case "SC":
      System.out.println("User Loses!");
      break;
      case "LI":
      System.out.println("User Wins!");
      break;
      case"SP":
      System.out.println("Tie!");
      break;
     }    
    }
    
    else
    {
    System.out.println("An error has occurred.");
    }
  }
  
}