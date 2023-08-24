package hospital;

public class ER_Doctor extends Doctor {
	//Declare variables
	public String Department;
	//Constructor
	public ER_Doctor(String name, String address, String phone, int employee_number, int permit_number,
			String permit_expiry_date, int Working_Hours, String Department) {
		super(name, address, phone, employee_number, permit_number, permit_expiry_date, Working_Hours);
		this.Department=Department;
		
	}
	
	public void service() {
    	System.out.println("Hi, I'm ER Doctor and I will treat you");
    }
	
	//print method for display the attributes
	public void print() {
		
		System.out.println("ER_Doctor class is derived from Doctor Class. Doctor class is derived from PatientCare class. PatientCare class is derived from Employee class.");
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
	    System.out.println("**Attribtes of ER_Doctor Class**");
	    System.out.println("Department: " + Department);
	}
}
