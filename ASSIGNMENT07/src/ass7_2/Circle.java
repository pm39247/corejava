package ass7_2;

public class Circle {

	double myX,myY,myDiameter;
	Circle(){
		this.myX=0;
		this.myY=0;
		this.myDiameter=100;
				
	}
//	public double getMyX() {
//		return this.myX;
//		
//		
//	}
//	public double getMyY() {
//		return this.myY;
//		
//		
//	}
//	public double getMyDiameter() {
//		return this.myDiameter;
//		
//		
//		
//	}
	public double getMyX() {
		return myX;
	}
	public void setMyX(double myX) {
		this.myX = myX;
	}
	public double getMyY() {
		return myY;
	}
	public void setMyY(double myY) {
		this.myY = myY;
	}
	public double getMyDiameter() {
		return myDiameter;
	}
	public void setMyDiameter(double myDiameter) throws ExceptionNegDiam {
		
			if(myDiameter<0)
				throw new ExceptionNegDiam();
			  this.myDiameter = myDiameter;
		
		
	}
	
	
//	Center point - Build instance variables for the circle’s center point 
//	(myX and myY represented as double values). 
//	 Diameter - Build an instance variable for the circle’s diameter (myDiameter also 
//	represented as a double value)
}
