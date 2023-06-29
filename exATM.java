/**
 * exATM
 */
import java.util.Scanner;
public class exATM {

    public static void main(String[] args) {
        int balance= 100000, withdraw, deposite;
        //Scanner:
        Scanner Scanner= new Scanner(System.in);
        while (true) {
            System.out.println("*Automatde Teller Masin(ATM)*");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposite");
            System.out.println("Choose 3 for check the Balance");
            System.out.println("choose 4 for Exit" );
            System.out.println("Choose operation you want perform:");
            int choice=Scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdrawn: ");
                    //get the withdrawn money from user:
                    withdraw=Scanner.nextInt();
                    if(balance>=withdraw){
                        balance= balance-withdraw;
                        System.out.println("Please collect your money");
                    }else{
                        System.out.println("Insufficient Balance!");
                        System.out.println("");
                    }
                    break;
                    case 2:
                    System.out.println("Enter money to be deposited:");
                    deposite=Scanner.nextInt();
                    balance=balance+deposite;
                    System.out.println("Your money has been successfully deposited!");
                    System.out.println("");
                    break;
                    case 3:
                    System.out.println("Balance: "+balance);
                    break;
                    case 4: 
                    System.out.println("Thank you!");

                    break;
            }
        }
    }
}