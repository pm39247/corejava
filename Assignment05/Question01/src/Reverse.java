import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		
		String str="Proffessor";
		String str2="";
		for(int i=str.length()-1;i>=0;i--) {
			str2 += str.charAt(i);
		}
		System.out.println("Original String: "+str);
		System.out.println("Reverse String: "+str2);
		
		//using StringBuilder-----
		
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder newString=new StringBuilder(s);
		int i=0;
		int j=newString.length()-1;
		while(i<j) {
			char temp=newString.charAt(i);
			newString.setCharAt(i,newString.charAt(j));
			newString.setCharAt(j,temp);
			i++;
			j--;
		}
		System.out.println(newString);
	}

}
