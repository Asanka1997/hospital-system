package hospital;

public class Employee {
	//Declare Variables
	public String name, address, phone;
	public int employee_number;

	   //Constructor
	   public Employee (String name, String address, String phone,
	      int employee_number) 
	   {	//Assigning values with constructor parameters
	      this.name = name;
	      this.address = address;
	      this.phone = phone;
	      this.employee_number = employee_number;
	   }

	   //print method for display the attributes
	   public void print () {
	      System.out.println("Employee Class is the Super Class");
	      System.out.println("**Attribtes of Employee Class**");
	      System.out.println("Name: "+name);
	      System.out.println("Address: "+address);
	      System.out.println("Phone Number: "+phone);
	      System.out.println("Employee Number: "+employee_number);
	   }

}
