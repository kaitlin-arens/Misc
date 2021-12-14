import java.util.Scanner;
import java.util.Random;

public class RPSLS2
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
    int usersChoice;
    int computersChoice;
    Random rangen = new Random();
    Scanner kb = new Scanner(System.in);
    
    computersChoice = rangen.nextInt(5);
    System.out.println("Computer's Choice: " + computersChoice);
    
    System.out.print("Enter your choice: ");
    usersChoice = kb.nextInt();
    
    System.out.println(gameMatrix[computersChoice][usersChoice]);
  }
}