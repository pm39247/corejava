package ass1_3;
import java.util.Scanner;

public class ass1_3 {
	public static void main(String[] ags)
	{
		Scanner sc=new Scanner(System.in);		
		int choice;
		int total=0;
	 System.out.println("1.dosa");
	 System.out.println("2.samosa");
	 System.out.println("3.idli");
	 System.out.println("4.masala-dosa");
	 System.out.println("5.maysore-masala dosa");
	 System.out.println("6.ghee-samosa");
	 System.out.println("7.samosa with chhole");
	 System.out.println("8.idli with chutney");
	 System.out.println("9.idli with sambhar");
	 System.out.println("10.generate bill");
	 do {
	 
		System.out.println("Enter your choice :");
		choice=sc.nextInt();
		
		switch (choice){
		case 1: {
			System.out.println("Enter the quantity: ");
			int qty=sc.nextInt();
			total=total+qty*30;
			break;
		}
		case 2:{
			System.out.println("Enter the quantity: ");
			int qty=sc.nextInt();
			total=total+qty*10;
			break;
		}
		case 3:{
			System.out.println("Enter the quantity : ");
			int qty=sc.nextInt();
			total=total+qty*10;
			break;
			
		}
		case 4:{
			System.out.println("Enter the quantity");
			 int qty=sc.nextInt();
			 total=total+qty*40;
			 break;
			 
		}
		case 5:{
			System.out.println("Enter the quantity");
			 int qty=sc.nextInt();
			 total=total+qty*55;
			 break;
			 
		}
		case 6:{
			System.out.println("Enter the quantity");
			 int qty=sc.nextInt();
			 total=total+qty*20;
			 break;
			 
		}
		case 7:{
			System.out.println("Enter the quantity");
			 int qty=sc.nextInt();
			 total=total+qty*15;
			 break;
			 
		}
		case 8:{
			System.out.println("Enter the quantity");
			 int qty=sc.nextInt();
			 total=total+qty*18;
			 break;
			 
		}
		case 9:{
			System.out.println("Enter the quantity");
			 int qty=sc.nextInt();
			 total=total+qty*23;
			 break;
			 
		}
		case 10:{
			System.out.println("your total bill is : "+total+" rupees");
			 return;
			 
		}
		
		
		}
	 }while(choice!=10);
		
		
	}

}
