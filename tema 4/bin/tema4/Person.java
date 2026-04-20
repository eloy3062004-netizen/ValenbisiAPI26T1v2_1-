package tema4;

public abstract class Person {
		private String name; 
		private String gender; 
		public Person(String nm, String gen){
		 this.name=nm;
		 this.gender=gen; } 
		public abstract void work(); 
		public String toString(){ 
			return "Name="+this.name+
			"Gender=" +this.gender; } 
		public void changeName(String newName) { 
			this.name = newName;
			class Employee extends Person {
			 	private int empId; 
			public Employee(String nm, String gen, int id) { 		
				super(nm, gen); this.empId=id; } 

			public void work() { 
				if(empId == 0){ 
					System.out.println("Not working"); 	
					}				
				else{ 
					System.out.println("Working!!"); 
			} 
			public static void main(String args[]){
			     Person student = new Employee("Dove","Female",0); 
			     Person employee = new Employee("Pankaj","Male",123);
			     student.work(); employee.work();
			     employee.changeName("Pankaj Kumar");
			     System.out.println(employee.toString()); 
			}   // example of journaldev
		 } 
}
		}
}

