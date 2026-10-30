import java.util.Scanner;

public class ExceptionLineTooLong extends Exception {
//Scanner sc=new Scanner(System.in);
//String excMess;
//public String getexcMess() {
//	return excMess;
//}
//public void setexcMess() {
//	this.excMess="This string is too long.";
//}
ExceptionLineTooLong(){
	
}
@Override	
public String getMessage() {
	return "This string is too long.";
}



}
