package ass3_2;
import java.util.Scanner;

public class clc {
	Scanner sc= new Scanner(System.in);
	int accNum;
	int begBal;
	int charges;
	int credits;
	int credLimit;
	clc(){
		
	}
	
	
	public clc(Scanner sc, int accNum, int begBal, int charges, int credits, int credLimit) {
		super();
		this.sc = sc;
		this.accNum = accNum;
		this.begBal = begBal;
		this.charges = charges;
		this.credits = credits;
		this.credLimit = credLimit;
	}


	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public int getBegBal() {
		return begBal;
	}
	public void setBegBal(int begBal) {
		this.begBal = begBal;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getCredLimit() {
		return credLimit;
	}
	public void setCredLimit(int credLimit) {
		this.credLimit = credLimit;
	}
	public void newBal() {
		if((this.begBal+this.charges-this.credits)>this.credLimit)
		{
			System.out.println("Credit limit exceeded");
		}
		
		//new balance (= beginning balance+ charges – credits)
	}
	void acceptRec() {
		System.out.println("enter account number :");
		setAccNum(sc.nextInt());
		System.out.println("enter begining balance :");
		setBegBal(sc.nextInt());
		System.out.println("enter charges :");
        setCharges(sc.nextInt());
        System.out.println("enter enter credits :");
        setCredits(sc.nextInt());
        System.out.println("enter credit limits :");
        setCredLimit(sc.nextInt());
		
		
	}
	public static void main(String[] args) {
		clc c=new clc();
		c.acceptRec();
		c.newBal();
		
		
	}
	
	
	
	
	


}
