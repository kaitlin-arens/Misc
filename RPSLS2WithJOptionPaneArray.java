import javax.swing.*;
import java.util.Random;

public class RPSLS2WithJOptionPaneArray
{
  public static void main (String[]args)
  {
    final String[][] gameMatrix = {
                                    {"Tie","User wins","Computer wins","Computer wins","User wins"},
                                    {"Computer wins","Tie","User wins","User wins","Computer wins"},
                                    {"User wins","Computer wins","Tie","Computer wins","User wins"},
                                    {"User wins","Computer wins","User wins","Tie","Computer wins"},
                                    {"Computer wins","User wins","Computer wins","User wins","Tie"},
                                  };
    final String[] userInputs = {"rock", "paper", "scissors", "lizard", "spock"};                        
                            
    int usersChoice = -1;
    int computersChoice = 0;
    Random rangen = new Random();
    String uis;//user input string
    
    computersChoice = rangen.nextInt(5);
    System.out.println("Computer's Choice: " + computersChoice);
    
    uis = JOptionPane.showInputDialog("Enter Rock, Paper, Scissors, etc.");
    
    //search array for users choice
    boolean found = false;
    
    for(int i = 0; i < userInputs.length && !found; i++)
    {
      if(uis.equals(userInputs[i]))
      {
        usersChoice = i;
        found = true;
      }
    }
    
    if(found)
    {
      System.out.println(gameMatrix[computersChoice][usersChoice]);
    }
    
    else
    {
      System.out.println("Error");
    }
  }
}