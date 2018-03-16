
package bankingapp;

import java.util.Scanner;


public class CheckingAccount extends BankAccount{
    
    public static int counter; 
    public static double cash;
    static Scanner scanner = new Scanner(System.in);
  
    public void checking(){
        
       System.out.println("FNB PERSONAL CHECKINGS ACCOUNT");
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                System.out.println("Select operation");
        
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Balance");
        System.out.println("4. To go back");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        counter = scanner.nextInt();
        
        switch (counter) {
            case 1:
                
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                System.out.println("Enter amount you want to deposit into checking account: ");
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                cash = scanner.nextDouble();
                
                
                        if(counter == 1){
                            checkingBalance += cash;
                            System.out.println("");
                            System.out.println("Your checking account's balance is " + checkingBalance);
                            System.out.println("------------------------");
                        }else{
                    System.out.println("Your checking account's balance is " + checkingBalance);
                }
                break;
            case 2:
                System.out.println("");
                System.out.println("Enter amount to withdrawal: ");
                System.out.println("*");
                cash = scanner.nextDouble();
                System.out.println("");
                System.out.println("Would you like to continue this transaction?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                counter = scanner.nextInt();
                if(counter == 1){
                    if (checkingBalance < cash){
                        System.out.println("No Funds!");
                        System.out.println("Your checking account's balance is " + checkingBalance);
                    }else{
                        checkingBalance -= cash;
                        System.out.println("Your checking account's balance is " + checkingBalance);
                    }
                }
                else{
                    System.out.println("Your checking account's balance is " + checkingBalance);
                }
                break;
            case 3:
                System.out.println("Your checking balance is " + checkingBalance);
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                break;
            default:
                break;
        }
    }

    
}
