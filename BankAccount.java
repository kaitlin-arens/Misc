// import java.text.DecimalFormat;

public class BankAccount
{
  private String owner;
  private int accountNumber;
  private double balance;
  
  public BankAccount(String o, int an)
  {
    owner = o;
    accountNumber = an;
    balance = 0;
    
    //System.out.println("This is the bank account."+ owner + accountNumber);
    //System.out.println(toString());
  }
  
  public double getCurrency()
  {
    return balance;
  }
  
  public String toString()
  {
    //DecimalFormat df2 = new DecimalFormat( "$###,###.###" );
    //double dd2dec = new Double(df2.format(balance)).doubleValue();
    
    return owner + " owns the account " + accountNumber + " with the balance of " + String.format("$%,.2f", balance);
    
  }
  
  public void adjust(double add)
  {
    balance = add + balance;
  }
  
  public double getBalance()
  {
    return balance;
  }
  
  public static void main(String[] args)
  {
    BankAccount acct1 = new BankAccount("Sally Ride", 123456);
    System.out.println(acct1);
    acct1.adjust(1000.00);
    System.out.println(acct1);
    acct1.adjust(-500.00);
    System.out.println(acct1);
  }
  
}