public class Bank2 {

    BankAccount[] bAcct;

    public Bank() {
        //Constructor - will create an array that can hold up to 10 BankAccount objects.
        bAcct = new BankAccount[10];
    }

    public void addAccount(BankAccount a) {
        //This method will take a BankAccount object as a param and place it in the next avail entry in array.
        for(int i = 0; i < bAcct.length; i++) {
            if (bAcct[i] == null){
                bAcct[i] = a;
                break;
            }
        }
    }

    public BankAccount getAccount(int index) {
        //will return a BankAccount object given an integer index value as a param
        return bAcct[index];
    }

    public void printAccounts() {
        //will display all of the BankAccount objects
        for (int i = 0; i < bAcct.length; i++) {
        if(bAcct[i] != null) {
            System.out.println(bAcct[i]);
            }
        }
    }
     public double monthlyFee(double f) {
        //will take a double value as a param and apply that value to every BankAccount object
        for (int i = 0; i < bAcct.length; i++){
            if(bAcct[i] !=null) {


            }
        }

    }
}