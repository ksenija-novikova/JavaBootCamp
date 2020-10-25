package sef.finalactivity;

public class InheritanceActivity {

	public static void main(String[] args) {
		
		Person_X p = new Person_X ("Alice",32);
	    p.greet();
		
	
		Employee_E e = new Employee_E ("John",35);
		e.setJobtitle("Accountant");
		e.setCompany("Intrum");
		e.setSalary(2000);
		
	
		e.greet();		
		

}
}