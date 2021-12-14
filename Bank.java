public class Bank
{
  int i = 0;
  BankAccount BankAct[]= new BankAccount[10];
  
  public void addAccount(BankAccount acct)
  {
    for(int i = 0; i < BankAct.length; i++)
    {
      if(BankAct[i] == null)
      {
        BankAct[i] = acct;
        
        break;
      }
    }
  }
  
  public BankAccount getAccount(int i)
  {
    return BankAct[i];
  }
  
  public void printAccounts()
  {
    for (int i = 0; i < BankAct.length; i++) 
        {
          //System.out.println("printAccounts for loop" + i);
          if(BankAct[i] != null) 
            {
              //System.out.println("printAccounts if statement");
              //System.out.println("owner" + BankAct[i].owner);
              System.out.println(BankAct[i].toString());
            }
        }
          
  }
  
  public void monthlyFee(double fee)
  {
    for (int i = 0; i < BankAct.length; i++)
    {
        if(BankAct[i] != null ) 
        {
          BankAct[i].adjust(fee);
          
        }
       
    }
     
  }
}