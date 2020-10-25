package sef.finalactivity;

public class Person_X {

		//Attributes
		protected String name;
		protected int age;
		
     
		
		
		public Person_X (String name, int age) {
			this.name = name;
			this.age = age;
		
		}	
		
		
		public String getName() {
			return name;
		}
		
	
		public void setName(String name) {
			this.name = name;
		}

		
		public int getAge() {
			return age;
		}

		
		public void setAge(int age) {
			this.age = age;
	
		}	
		public void greet () {
			   System.out.println("My name is" +" "+ name +" " + "and I am" + " " + age +" " + "years old");
		
		}
	
}


