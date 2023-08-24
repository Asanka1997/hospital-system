package hospital;

public class Receptionist extends Administrator {
	//Declare Variables
	public int Working_Hours;
	//Constructor
	public Receptionist(String name, String address, String phone, int employee_number, String Department, int Working_Hours) {
		super(name, address, phone, employee_number, Department);
		this.Working_Hours=Working_Hours;
		
	}
	
    public void service() {
    	System.out.println("Hi, I'm Receptionist and I will guide you");
    }
    //print method for display the attributes
    public void print() 
	  {
	    System.out.println("Receptionist class is derived from Administrator class. Administrator class is derived from Employee class.");
	    System.out.println("**Attribtes of Employee Class**");
	    System.out.println("Name: "+name);
	    System.out.println("Address: "+address);
	    System.out.println("Phone Number: "+phone);
	    System.out.println("Employee Number: " + employee_number);
	    System.out.println("**Attribtes of Administrator Class**");
	    System.out.println("Department: " + Department);
	    System.out.println("**Attribtes of Receptionist Class**");
	    System.out.println("Working Hours: " + Working_Hours);
	  }
}
