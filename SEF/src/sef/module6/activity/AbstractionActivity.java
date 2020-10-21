package sef.module6.activity;

public class AbstractionActivity {
	
public static void main (String arg[]){
	
Rectangle r = new Rectangle (5,6);
r.setColor("green");

System.out.println (r.getColor());
System.out.println (r.calculateArea());
System.out.println (r.calculatePerimeter());
}

}

