package hospital;

public class Surgeon extends Doctor {
	//Declare Variables
	public String Department;
	//Constructor
	public Surgeon(String name, String address, String phone, int employee_number, int permit_number,
			String permit_expiry_date, int Working_Hours, String Department) {
		super(name, address, phone, employee_number, permit_number, permit_expiry_date, Working_Hours);
		this.Department=Department;
		
	}
	
	public void service() {
    	System.out.println("Hi, I'm surgeon and I'm involving with surguries");
    }
	//print method for display the attributes
	public void print() {
		
		System.out.println("Surgeon class is derived from Doctor Class. Doctor class is derived from PatientCare class. PatientCare class is derived from Employee class.");
		System.out.println("**Attribtes of Employee Class**");
	    System.out.println("Name: "+name);
	    System.out.println("Address: "+address);
	    System.out.println("Phone Number: "+phone);
	    System.out.println("Employee Number: " + employee_number);
	    System.out.println("**Attribtes of PatientCare Class**");
	    System.out.println("Permit Number: "+ permit_number);
	    System.out.println("Permit Expiry Date: "+permit_expiry_date);
	    System.out.println("**Attribtes of Doctor Class**");
     	System.out.println("Working Hours: " + Working_Hours);
	    System.out.println("**Attribtes of Surgeon Class**");
	    System.out.println("Department: " + Department);
	}
	
}
