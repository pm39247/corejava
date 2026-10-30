package ass1_2;

import java.util.Scanner;

public class ass1_2 {
	public static void main(String[] ags) {
		double d1;
		double d2;
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter first number:");
	
	if(!sc.hasNextInt() && sc.hasNextDouble())
	{
		 d1=sc.nextDouble();
		//System.out.print(d1);
	}
	else {
		System.out.println("not a double number");
		return;
	
	}
	System.out.print("Enter second number:");
	if(!sc.hasNextInt() && sc.hasNextDouble())
	{
		 d2= sc.nextDouble();
		
	}
	else {
		System.out.println("not a double number");
		return;
	}
	
	System.out.print("AVG of numbers : "+(d1+d2)/2);
	
	
	
  
}
	}
