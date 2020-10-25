package sef.finalactivity;

public class Calculator {

	public int getSum(int a, int b) {
			
			return a + b;
		}
		
		public int getDifference(int a, int b){
			return a - b;
		}
		
		public double getProduct(double a, double b){
			return a * b;
		}
		
		public double getQuotient(int a, int b){
			double result; 
			try {
			result = a/b;
			
			} catch (ArithmeticException e)
	
			{
			System.out.println(e.getMessage());
			result = 0;
			}
				
			
			return result;
		}
	
	}



