public class BankAccount{
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited Rs. "+amount+" Successfully.");
        } else{
            System.out.println("Invalid deposit Amount");
        }
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance.");
        } else if(amount>0){
            balance -= amount;
            System.out.println("Withdrawl Rs. "+amount+" Successfully.");
        }else{
            System.out.println("Invalid Withdrawl Amount.");
        }
    }
    public void displayAccount(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}