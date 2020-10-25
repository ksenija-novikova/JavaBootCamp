package sef.finalactivity;

public class Employee_E extends Person_X  {
		
		
	
		public Employee_E(String name, int age) {
		super (name, age);	
			// TODO Auto-generated constructor stub
		}
		private String jobtitle;
		private String company;
		private int salary;
		
		
		public int getSalary() {
			return salary;
		}


		public void setSalary(int salary) {
			this.salary = salary;
		}


		public String getJobtitle() {
			return jobtitle;
		}
		
		
		public void setJobtitle(String jobtitle) {
			this.jobtitle = jobtitle;
		}
		
		
		public String getCompany () {
			return company;
		}
		
		
		public void setCompany (String Company) {
			this.company = Company;

			
		}
	   public void greet () {
	   System.out.println("My name is" +" "+ name +" " + "and I am" + " " + age +" " + "years old");
	   System.out.println("I am work as"+ " "+ jobtitle + " " + "in" + " " + company);
	   System.out.println("my salary is:" +" "+ salary);
	   } 
	   

	}


