import java.util.Scanner;

class Bank{
    static int BankBalance = 0;
    public static void withdraw(int amount){
        if (amount>BankBalance){
            System.out.println("Insufficient Balance 👎\n");
        }
        else{
            BankBalance = BankBalance - amount;
            System.out.println("Withdrawal Successful 💷\n");
        }
    }
    public static void deposit(int amount){
        BankBalance = BankBalance + amount;
        System.out.println("Deposit Successful 👍\n");
    }
    public static void checkBalance(){
        System.out.println("The Bank Account Balance : "+BankBalance +"\n");
    }
}

public class BankInterface extends Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("👉 ATM Interface Project 👈");
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to Check Balance");
            System.out.println("Press 2 to Amount Withdraw");
            System.out.println("Press 3 to Amount Deposit");
            System.out.print("Enter Your Choice : ");

            int input;
            int amount;
            input = sc.nextInt();
            switch (input){
                case 0:
                    break;
                case 1: checkBalance();
                break;
                case 2:
                    System.out.print("Enter Amount to Withdraw :");
                    amount = sc.nextInt();
                    withdraw(amount);
                    break;
                case 3:
                    System.out.print("Enter Amount to Deposit :");
                    amount = sc.nextInt();
                    deposit(amount);
                    break;
                default:
                    System.out.println("wrong Input\n");
                    break;
            }
            if (input==0){
                System.out.println("you are exited 🔴");
                break;
            }
        }
    }
}
