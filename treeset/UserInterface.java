import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		NumAvg numAvg =new NumAvg();
		// code here
		
		int choice=0;
		while(choice!=3){
		    System.out.println("1.Add number");
		    System.out.println("2.Find average");
		    System.out.println("3.Exit");
		    System.out.println("Enter your choice");
		    
		    choice=sc.nextInt();
		    
		    switch(choice){
		        case 1:
		            System.out.println("Enter the number");
		            int num=sc.nextInt();
		            numAvg.addNum(num);
		            break;
		            
		       case 2:
		            double average=numAvg.calAvg();
		            if(numAvg.getNumSet().isEmpty()){
		                System.out.println("The set is empty");
		            }else{
		                System.out.println(average);
		            }
		            break;
		      case 3:
		          System.out.println("Thank you for using the application");
		          break;
		          default:
		          System.out.println("Invalid choice");
		          break;
		    }
		    
		}
	}
}