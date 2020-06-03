package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
   private int x=2;
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 *  public int getX(){
 *  return x;	
 *  }
 *  public void setX(int X) throws Exception{
 * if(x<0){
 * throw new Exception;
 * }
 *  this.x=X;
 *  }																																																																																																																																																																																																						
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	int itemsReceived; // must not be negative. All negative arguments get set to 0.
	float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	public static void main(String[] args) {

	}

	void setR(int r) {
		if (r < 0) {
			r = 0;
		} else {
			this.itemsReceived = r;
		}
	}

	void setDegrees(float D) {
		if (D > 0.0 && D <= 360.0) {
			this.degreesTurned = D;
		}
	}

	void setString(String S) {
if (!S.equals(" ")) {
	this.nomenclature=S;}
}
	
	void setMem(Object z ) {
		if (z instanceof String) {
			this.memberObj=z;
		}
	}}
