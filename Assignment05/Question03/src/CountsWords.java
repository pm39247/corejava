import java.util.Scanner;

public class CountsWords {

	public static void main(String[] args) {
		System.out.println("Enter you Sentence - ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		str.trim();
		
        String words[]=str.split(" ");
	   
		System.out.println("Number of word: "+words.length);

	}

}
