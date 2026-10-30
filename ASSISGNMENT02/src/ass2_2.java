import java.util.Scanner;
public class ass2_2 {
	Scanner sc=new Scanner(System.in);
	String fName;
	String lName;
	Double sal;
	public ass2_2() {}
	
	public ass2_2(String fName, String lName, Double sal) {
		
		this.fName = fName;
		this.lName = lName;
		if(sal>0)
		  this.sal = sal;
	}
	

	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		
		
		
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public Double getSal() {
		return sal;
	}


	public void setSal(Double sal) {
		this.sal = sal;
	}
	public void acceptRec() {
		System.out.println("enter first name : ");
		setfName(sc.next());
		System.out.println("enter last name : ");
		setlName(sc.next());
		System.out.println("enter slary : ");
		setSal(sc.nextDouble());
	}
	public void displayRec() {
		System.out.println("yearly salary without increment is :"+getSal()*12);
	}
	public void displayRec1() {
		System.out.println("yearly salary with increment is :"+(getSal()*12+getSal()*12*0.1));
		}
	


	public static void main(String[] args) {
		ass2_2 a=new ass2_2();
		a.acceptRec();
		a.displayRec();
		ass2_2 b=new ass2_2();
		System.out.println("Now enter the deatils of second employee:");
		b.acceptRec();
		b.displayRec();
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("INCREMENTED SALARY");
		a.displayRec1();
		b.displayRec1();
		
		
		
	}

}
