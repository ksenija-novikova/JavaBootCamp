package sef.module6.activity;

public class AbstractionActivity {
	
public static void main (String arg[]){
	
Shape r = new Rectangle (5,6);
r.setColor("green");

System.out.println ("Color of Rectangle is ..." + r.getColor());
System.out.println ("Area of Rectangle is ..." + r.calculateArea());
System.out.println ("Perimeter of Rectangle is ..." + r.calculatePerimeter());
}

}

