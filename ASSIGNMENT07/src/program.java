import java.util.Scanner;

public class program {
	static Scanner sc=new Scanner(System.in);//(doubt)
	public static void main(String[] args) {
		string s1=new string();
		System.out.println("Enter your string");
		try {
		s1.setString(sc.next());
		String s2=s1.toString();
		System.out.println(s2);
		
	}
		catch(ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}
		
		//if(s2!=null)
		
}
}
