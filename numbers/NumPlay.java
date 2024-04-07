package mycodes;
import java.util.Scanner;
public class NumPlay {

	public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter the number : ");
           int val = scan.nextInt();
            if(val >9 || val>100) {
            	if(val>50) {
            		int a=(val/10 - val%10);
            		System.out.println("value is "+a);
            	}
            	else {
            		int b = (val%10 - val/10);
            		System.out.println("value is "+b);
            	}
            		
            }
            else {
            	System.out.println("Invalid number!,please enter the two digit value");
            }
	}

}




OUTPUT:
sample no 1:
Enter the number : 
67
value is -1


sample no 2:
Enter the number : 
28
value is 6


sample no 3:
Enter the number : 
8
Invalid number!,please enter the two digit value
