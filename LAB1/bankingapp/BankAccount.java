

package bankingapp;
import bankingapp.SavingsAccount;
import java.util.Scanner;

public class BankAccount {

    
    
   
        static double  checkingBalance;
        static double savingsBalance;
        static double  investmentBalance;

            public static int counter; 
            public static double cash;
    
    
        static Scanner scanner = new Scanner(System.in);
    
        
        
    
    public static void main(String[] args) {
      
        
                InvestmentAccount investment = new InvestmentAccount();
                SavingsAccount saving = new SavingsAccount();
                CheckingAccount checking = new CheckingAccount();
        
                
                
                do{

                            System.out.println("WELCOME TO FNB ONLINE BANKING SERVICE");
                            System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                                           System.out.println("");
                                           System.out.println("");
                            System.out.println("Choose from the following : ");
                            System.out.println("Which of your bank accounts do you want to access");


                            System.out.println("1-Savings");
                            System.out.println("2-Investment");
                            System.out.println("3-Checking");
                            System.out.println("4-Sign out");
                            System.out.println("");

                            counter = scanner.nextInt();
                            
                            
                            
                    switch (counter) {
                        case 0:
                            System.out.println("Your Savings account balance is " + saving.savingsBalance );
                            System.out.println("Your checking account balance is " + checking.checkingBalance );
                            System.out.println("Your investment account balance is " + investment.investmentBalance );
                            break;
                        case 1:
                            saving.saving();
                            break;
                        case 2:
                            checking.checking();
                            break;
                        case 3:
                            investment.investment();
                            break;
                        case 4:
                            System.out.println("Bye");
                            break;
                        default:
                            System.out.println("Enter valid number");
                            break;
                    }
        }while(counter != 4);
    }
}