
import java.util.Scanner;
public class ass1_1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number : ");
		int num=sc.nextInt();
		//20System.out.println("num");
		System.out.println("given number : "+num);
		
		int b=Integer.parseInt(Integer.toBinaryString(num));
		System.out.print("binary equivalent : ");
		System.out.println(b);
		int o=Integer.parseInt(Integer.toOctalString(b));
		System.out.println("octal equivalent : "+ o);
		int h=Integer.parseInt(Integer.toHexString(b));
		System.out.print("hexadecimal equivalent : "+h);
		
		
		
		
	}

}
