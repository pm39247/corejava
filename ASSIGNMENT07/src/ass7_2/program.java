package ass7_2;

import java.util.Scanner;


public class program {
	
	public static void main(String[] args) {
		Circle c=new Circle();
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter centre coordinates and diamaeter length");
	c.setMyX(sc.nextDouble());
	c.setMyY(sc.nextDouble());
	try {
	c.setMyDiameter(sc.nextDouble());
	System.out.println("myX:"+c.getMyX()+" "+"myY:"+c.getMyY()+" "+"myDaimeter:"+c.getMyDiameter());
	

	}
	catch(ExceptionNegDiam e) {
		System.out.println(e.getMessage());
	}
		
	
	
	
	}
}
