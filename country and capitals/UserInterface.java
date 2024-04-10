import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch;
		String cname;
		String capname;
		Country obj=new Country();
		do
		{
		System.out.println("1.Add");
		System.out.println("2.Search");
		System.out.println("3.Exit");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
			{
				case 1: System.out.println("enter thecountry name");
						sc.nextLine();
						cname=sc.nextLine();
						System.out.println("Enter the capital name");
						capname=sc.nextLine();
						obj.add(cname,capname);
						break;
				case 2: if(obj.getCountryMap().isEmpty())
						{
							System.out.println("The map is empty");
						}
						else
						{
							System.out.println("Enter the country name");
							sc.nextLine();
							cname=sc.nextLine();
							String ans=obj.search(cname);
							if(ans==null)
							System.out.println("Data not found");
							else
							System.out.println(ans);
						}	 	  	      		      	   	     	     	 	
						break;
				case 3: System.out.println("Thank you for using the application");
						break;
			}
		}while(ch>0 && ch<3);
	}
}

