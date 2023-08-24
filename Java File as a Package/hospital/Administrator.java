package hospital;

public class Administrator extends Employee {
		//Declare Variables
		public String Department;
		//Constructor
		public Administrator(String name, String address, String phone, 
			int employee_number, String Department)
	    {
	        super(name, address, phone, employee_number);
	        this.Department=Department;
	    }
		
		//print method for display the attributes
	    public void print() 
		  {
		    System.out.println("Administrator class is derived from Employee class.");
		    System.out.println("**Attribtes of Employee Class**");
		    System.out.println("Name: "+name);
		    System.out.println("Address: "+address);
		    System.out.println("Phone Number: "+phone);
		    System.out.println("Employee Number: " + employee_number);
		    System.out.println("**Attribtes of Administrator Class**");
		    System.out.println("Department: " + Department);
		  }
	   
}
