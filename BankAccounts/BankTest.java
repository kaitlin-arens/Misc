public class BankTest
{ 
  /*
   * test - set up a bank and add accounts
   */
  public static void main(String[] args)
  {
    // Code to test Bank and BankAccount classes
    int errors = 0;
    double fee = -2.95;

    Assignment assignment = new Assignment();
    assignment.homework("Homework 2a");

    System.out.println("\nCreate bank1");
    Bank bank1 = new Bank();
    System.out.println("\nOne account");
    BankAccount b1 = new BankAccount("Joe Mac", 1234);
    b1.adjust(1000.0);
    bank1.addAccount(b1);
    bank1.printAccounts();
    System.out.println("\nTwo accounts");
    BankAccount b2 = new BankAccount("Sally Ride", 2345);
    b2.adjust(2000.0);
    bank1.addAccount(b2);
    bank1.printAccounts();
    System.out.println("\nThree accounts");
    BankAccount b3 = new BankAccount("Pat Armstrong", 3456);
    b3.adjust(3000.0);
    bank1.addAccount(b3);
    bank1.printAccounts();
    System.out.println("\nMonthly Fee");
    bank1.monthlyFee(fee);
    bank1.printAccounts();
    System.out.println("\nErrors:");

    if (bank1.getAccount(0).getBalance() != 997.05)
    {
      errors += 1;
      System.out.println("Balance for account at index 0 does not match $997.05");
    }
    if (bank1.getAccount(1).getBalance() != 1997.05)
    {
      errors += 1;
      System.out.println("Balance for account at index 1 does not match $1997.05");
    }
    if (bank1.getAccount(2).getBalance() != 2997.05)
    {
      errors += 1;
      System.out.println("Balance for account at index 2 does not match $2997.05");
    }
    if (errors == 0)
      System.out.println("No errors found!!!");
  }
}