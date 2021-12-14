import javax.swing.*;
import java.util.Random;

public class RPSLS2WithJOptionPane
{
  public static void main (String[]args)
  {
    String[][] gameMatrix = {
                              {"Tie","User wins","Computer wins","Computer wins","User wins"},
                              {"Computer wins","Tie","User wins","User wins","Computer wins"},
                              {"User wins","Computer wins","Tie","Computer wins","User wins"},
                              {"User wins","Computer wins","User wins","Tie","Computer wins"},
                              {"Computer wins","User wins","Computer wins","User wins","Tie"},
                            };
    int usersChoice = 0;
    int computersChoice = 0;
    Random rangen = new Random();
    String uis;//user input string
    
    computersChoice = rangen.nextInt(5);
    System.out.println("Computer's Choice: " + computersChoice);
    
    uis = JOptionPane.showInputDialog("Enter Rock, Paper, Scissors, etc.");
    
    switch(uis)
    {
      case "rock":
      usersChoice = 0;
      break;
      
      case "paper":
      usersChoice = 1;
      break;
      
      case "scissors":
      usersChoice = 2;
      break;
      
      case "lizard":
      usersChoice = 3;
      break;
      
      case "spock":
      usersChoice = 4;
      break;
    }
    
    System.out.println(gameMatrix[computersChoice][usersChoice]);
  }
}