package fun1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the date of birth[YYYY-MM-DD] :");
	String val = scan.nextLine();
	LocalDate birth = LocalDate.parse(val);
	LocalDate current = LocalDate.now();

	Period age = Period.between(birth, current);
	int year = age.getYears();
	int month = age.getMonths();
	int day = age.getDays();
	System.out.println("your age is "+year);
	System.out.println("your completed "+year+"years "+month+"months "+day+"days" );

     scan.close();
	}

}



SAMPLE OUTPUT 1:
Enter the date of birth[YYYY-MM-DD] :
2003-09-17
your age is 20
your completed 20years 7months 6days

SAMPLE OUTPUT 2 :
Enter the date of birth[YYYY-MM-DD] :
1998-05-25
your age is 25
your completed 25years 10months 29days

