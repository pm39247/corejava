package ass7_2;

public class ExceptionNegDiam extends Exception {
	
	ExceptionNegDiam(){
		
	}
	@Override
	public String getMessage() {
		return "User has entered negative diameter.";
	}
}
