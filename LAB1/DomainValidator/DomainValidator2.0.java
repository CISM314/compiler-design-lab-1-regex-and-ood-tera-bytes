package domainvalidator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomainValidator {
 
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
    "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
    
    private static boolean validatePhoneNumber(String phoneNo) {
		
//validate phone numbers of format "1234567890"
		if (phoneNo.matches("\\d{10}")) 
                    
                    return true;
                
		//validating phone number with -, . or spaces
		else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) 
                    
                    return true;
                
                //validating phone number where area code is in braces ()
		else if(phoneNo.matches("\\d{4}\\d{2}\\d{3}\\d{4}")) 
                    
                    return true;
		//return false if nothing matches the input
		else return false;
                
        
    
    }
     
    public boolean validateEmailAddress(String userName){
         
        Matcher match = EMAIL_PATTERN.matcher(userName);
        return match.matches();
    }
     
    public static void main(String[] args){
        
        DomainValidator validator = new DomainValidator();
        
        Scanner input = new Scanner(System.in);
        String email;
        String phoneNumber;
        
        System.out.println("Enter phone number: ");
        phoneNumber = input.nextLine();
        
       System.out.println(validatePhoneNumber(phoneNumber));
		
       
      
        
        
        System.out.println("Enter your Email address: ");
        email = input.nextLine();
        System.out.println(validator.validateEmailAddress(email));
    }
}
    