package fun1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E_mail{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		Pattern num = Pattern.compile("[6-9][0-9]{9}");
		Pattern mail = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
		System.out.println("Enter the mobile number :");
		String number = scan.nextLine();
		System.out.println("Enter the Email_ID :");
		String Email = scan.nextLine();
		Matcher match = num.matcher(number);
		Matcher mat = mail.matcher(Email);
		scan.close();
		System.out.println(match.matches());
		System.out.println(mat.matches());
		if(match.matches() && mat.matches()) {
			System.out.println("Valid Email_ID and mobile number ");	
		}
		else if(match.matches()){
			System.out.println("Valid mobile number only ");
			}
		else if( mat.matches()) {
			System.out.print("Valid Email_ID only");
			}
		else {
			System.out.print("Invalid Email and number !");
			}
	}

}



SAMPLE OUTPUT 1:
  Enter the mobile number :
9585753851
Enter the Email_ID :
bmrajesh2003@gmail.com
true
true
Valid Email_ID and mobile number 


SAMPLE OUTPUT 2:
Enter the mobile number :
56748398987
Enter the Email_ID :
mamce2000@mamce.org
false
true
Valid Email_ID only

SAMPLE OUTPUT 3:
Enter the mobile number :
6379404575
Enter the Email_ID :
bmrajesh2003
true
false
Valid mobile number only 


  




