/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.util.Scanner;

public class InvestmentAccount extends BankAccount {   
    
    public static int counter; 
    public static double cash;
    
    static Scanner scanner = new Scanner(System.in);
   
    
        public void investment(){
            
            
        System.out.println("FNB PERSONAL CHECKINGS ACCOUNT");
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                System.out.println("Select operation");
        
        System.out.println("1. Deposit");
        System.out.println("2. Balance");
     
        System.out.println("4. To go back");
        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
        counter = scanner.nextInt();
        
        switch (counter) {
            
            
            case 1:
                System.out.println("");
                System.out.println("Enter amount to deposit in investment account: ");
                System.out.println("");
                cash = scanner.nextDouble();
                if(counter == 1){
                    investmentBalance += counter;
                    System.out.println("");
                    System.out.println("Your investment account's balance is " + investmentBalance);
                    System.out.println("");
                }else{
                    System.out.println("Your investment account's balance is " + investmentBalance);
                }
                break;
            case 2:
                System.out.println("Your investment balance is " + investmentBalance );
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                break;
            default:
                break;
        }
    }

    
}