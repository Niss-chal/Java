public class BankAccount {
    private int account_number;
    private String account_name;
    private double account_balance;

    public BankAccount(int account_number, String account_name, double account_balance){
        this.account_balance=0;
        this.account_name=account_name;
        this.account_number=account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }
      
    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public int getAccount_number() {
        return account_number;
    }

      public String getAccount_name() {
        return account_name;
    }

    public double getAccount_balance() {
        return account_balance;
    }

    public void withdraw(double amount){
        if(amount>0 && amount<account_balance){
            account_balance=account_balance-amount;
            System.out.println("Withdrawn Successfully");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount){
        if(amount>0){
            account_balance=account_balance+amount;
            System.out.println("Deposited successfully");
        }
        else{
            System.out.println("Amount should be in positive");
        }
    }

        public void printAccountDetails() {
        System.out.println("Account Number: " + account_number);
        System.out.println("Account Holder: " + account_name);
        System.out.println("Account Balance: " + account_balance);
    }

    public static void main(String[] args) {
        BankAccount account=new BankAccount(523000001, "Hari Bahadur", 0);
        account.deposit(500);
        account.printAccountDetails();
        account.withdraw(400);
        System.out.println("After withdrawn: "+account.account_balance);
        
    }    
}
