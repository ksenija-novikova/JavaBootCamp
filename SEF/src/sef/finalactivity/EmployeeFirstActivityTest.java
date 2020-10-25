package sef.finalactivity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFirstActivityTest {

	public static void main(String[] args) {
	ArrayList <Employee_E> list = new ArrayList ();
	
	Employee_E emp1 = new Employee_E ("John", 23); 
	emp1.setSalary(1700);
	emp1.setJobtitle("Tester");
	emp1.setCompany("Accenture");
	
	Employee_E emp2 = new Employee_E ("Katrina", 25);	
	emp2.setSalary(1200);
	emp2.setJobtitle("Tester");
	emp2.setCompany("Accenture");
	
	Employee_E emp3 = new Employee_E ("Michael", 37);
	emp3.setSalary(2000);
	emp3.setJobtitle("Tester");
	emp3.setCompany("Accenture");
	
	Employee_E emp4 = new Employee_E ("Andrew", 45);
	emp4.setSalary(2300);
	emp4.setJobtitle("Tester");
	emp4.setCompany("Accenture");
	
    list.add(emp1);
    list.add(emp2);
    list.add(emp3);
    list.add(emp4);
    
    List<Employee_E> listSorted; 
    listSorted = list.stream().sorted(Comparator.comparing(Employee_E::getSalary).reversed()).collect(Collectors.toList());
    listSorted.forEach(emp -> emp.greet());
	

	}
} 
