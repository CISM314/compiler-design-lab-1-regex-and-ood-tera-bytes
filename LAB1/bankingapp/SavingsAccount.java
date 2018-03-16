/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.util.Scanner;



public class SavingsAccount extends BankAccount{
    
    public static int counter; 
    public static double cash;
    static Scanner scanner = new Scanner(System.in);

   
   
    
    public void saving(){
        
                System.out.println("FNB PERSONAL SAVINGS ACCOUNT");
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_**_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                System.out.println("Select operation");
                
                

                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check current balance");
                    System.out.println("4. Previous screen");
                    System.out.println("");
                    counter = scanner.nextInt();

            switch (counter) {
            case 1:
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                System.out.println("Enter amount to deposit in savings account: ");
                System.out.println("-----------------------------------");
                cash = scanner.nextDouble();
                if(counter == 1){
                   
                    savingsBalance += cash;
                    System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                    System.out.println("Your saving account's balance is " + savingsBalance);
                    System.out.println("");
                }else{
                    System.out.println("Your saving account's balance is " + savingsBalance);
                }
                break;
            case 2:
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                System.out.println("Enter amount to withdrawal: ");
                System.out.println("");
                cash = scanner.nextDouble();
                System.out.println("");
                System.out.println("Would you like to continue this transaction?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                counter = scanner.nextInt();
                if(counter == 1){
                    if (savingsBalance < cash){
                        System.out.println("Insufficient Funds!!!");
                        System.out.println("Your savings account's balance is " + savingsBalance);
                    }else{
                        savingsBalance -= cash;
                        System.out.println("Your savings account's balance is " + savingsBalance);
                    }
                }
                else{
                    System.out.println("Your savings account's balance is " + savingsBalance);
                }
                break;
            case 3:
                System.out.println("Your Savings balance is " + savingsBalance);
                System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
                break;
            default:
                break;
        }
            }


        }