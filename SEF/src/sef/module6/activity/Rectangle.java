package sef.module6.activity; 
	
public class Rectangle extends Shape {
	private final double length, breadth; // sides
	


public Rectangle (double length, double breadth) {
	this.length = length;
	this.breadth = breadth; 
	
	}

@Override
public double calculateArea() {
	// TODO Auto-generated method stub
	return length * breadth;
}
@Override
public double calculatePerimeter() {
	// TODO Auto-generated method stub
	return 2 * (length + breadth);
}

}










	
	
	

	


