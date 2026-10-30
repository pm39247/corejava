import java.util.Scanner;
public class string {
	Scanner sc=new Scanner(System.in);
	private String string;
	private String excMess;
	//System.out.@println("Enter the string :");
 public	String getString() {
		return this.string;
	}
 public void setString(String string) throws ExceptionLineTooLong {
	 if(string.length()>80)
		 throw new ExceptionLineTooLong();
	     this.string=string;
 }
 public string() {
//	super();
//	this.string = string;
//	 this.string="the string is too long"
 }
 @Override
	public String toString() {
		return this.getString();
	}
 }

