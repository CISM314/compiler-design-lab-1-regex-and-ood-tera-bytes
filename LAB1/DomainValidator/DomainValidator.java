package domainvalidator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DomainValidator {
 
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
    "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
     
    public boolean validateEmailAddress(String userName){
         
        Matcher match = EMAIL_PATTERN.matcher(userName);
        return match.matches();
    }
     
    public static void main(String[] args){
        
        DomainValidator validator = new DomainValidator();
        
        Scanner input = new Scanner(System.in);
        String email;
        
        System.out.println("Enter your Email address: ");
        email = input.nextLine();
        System.out.println(validator.validateEmailAddress(email));
    }
}
    