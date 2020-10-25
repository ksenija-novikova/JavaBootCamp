package sef.finalactivity;

public class WrongNameSurnameException extends Exception{
	
	
		
	public String getMessage() {
		
		String msg = "Your name or surname contains incorrect symbols";
			return msg;
	}		
	
}

