package fun1;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");

		int n = scan.nextInt();
		String result = "";
		String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};	
		//for(int i=0;i<=9;i++)
		if(n == 0) {
			System.out.println("INVALID NUMBER!,enter without starting in zero");
		};
	     while(n>0) {
			int digit = n % 10;
		    result = num[digit]+" "+result;
			n=n / 10;
			
		}
      System.out.println(result);
	}

} 



OUTPUT:
sample no 1:
Enter the number : 
53688
five three six eight eight 

sample no 2:
Enter the number : 
0
INVALID NUMBER!,enter without starting in zero


sample no 3 :
Enter the number : 
34
three four 



