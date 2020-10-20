/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class NumToWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
				
		int i = 5;
		String numText = "";

		switch(i) {
		
		case 1:
			numText = "ONE";break;
		case 2:
			numText = "TWO";break;
		case 3:
			numText = "THREE";break;
		case 4:
			numText = "FOUR";break;
			// complete the code. As the Result in the PDF presentation should be: Number 5. Thats why I used this way.
		default:
			numText = "Number" + i;
		}
		
		System.out.println(numText);
		
	
	}
	

}
