package fun1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        Pattern password = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@$*#])(?=\\S+$).{6,12}");
        System.out.println("Enter your password : ");
        String pass = scan.nextLine();
        Matcher math = password.matcher(pass);
        if(math.matches()) {
        	System.out.println("Password is valid "+pass);
        }
        else {
        	System.out.println("Password is invalid "+pass);
        }
		scan.close();
	}

}

SAMPLE OUTPUT 1 :
  Enter your password : 
  Rajesh5674@
  Password is valid Rajesh5674@

SAMPLE OUTPUT 2:
Enter your password : 
Rajesh5674%
Password is invalid Rajesh5674%

SAMPLE OUTPUT 3 :
Enter your password : 
RAc23
Password is invalid RAc23

  
  
