import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        while(true){
            System.out.println("\n-- BANKING SYSTEM --");
            System.out.println("1. Create Account");
            System.out.println("2. Deposite");
            System.out.println("3. withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit...");
            System.out.print("Enter your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch(choice){
                case 1:
                if(account == null){
                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter your Account Number: ");
                    int accNumber = sc.nextInt();
                    System.out.print("Enter opening Balance: ");
                    double balance = sc.nextDouble();
                    account = new BankAccount(name, accNumber, balance);
                    System.out.println("Account Created Successfully.");
                } else{
                    System.out.println("Account Already Exists!");
                }
                break;

                case 2:
                if(account != null){
                    System.out.print("Enter amount Deposit: ");
                    double amt= sc.nextDouble();
                    account.deposit(amt);
                } else{
                    System.out.println("Please Create an Account First.");
                }
                break;

                case 3:
                if(account != null){
                    System.out.print("Enter Withdrawl Amount: ");
                    double wlAmt = sc.nextDouble();
                    account.withdraw(wlAmt);
                } else{
                    System.out.println("Please Create an Account First.");
                }
                break;

                case 4:
                if(account != null){
                    account.displayAccount();
                }else{
                    System.out.println("Please Create an Account First.");
                }
                break;

                case 5:
                System.out.println("Thank you for using Banking System");
                System.exit(0);

                default:
                System.out.println("Invalid Choice ");
            }
        }

    }
}
