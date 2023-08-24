package hospital;

public class Nurse extends PatientCare{

	//Declare variables
	public String Department;
	public int Working_Hours;
	//Constructor
	public Nurse(String name, String address, String phone, int employee_number, int permit_number,
			String permit_expiry_date,String Department, int Working_Hours) {
		super(name, address, phone, employee_number, permit_number, permit_expiry_date);
		this.Working_Hours = Working_Hours;
		this.Department=Department;
		
	}
	
	public void service() {
    	System.out.println("Hi, I'm Nurse and I will help you");
    }
	
	//print method for display the attributes
	 public void print () 
	    {
		 	System.out.println("Nurse class is derived from PatientCare class. PatientCare class is derived from Employee class.");
		    System.out.println("**Attribtes of Employee Class**");
		    System.out.println("Name: "+name);
		    System.out.println("Address: "+address);
		    System.out.println("Phone Number: "+phone);
		    System.out.println("Employee Number: " + employee_number);
		    System.out.println("**Attribtes of PatientCare Class**");
		    System.out.println("Permit Number: "+ permit_number);
	        System.out.println("Permit Expiry Date: "+permit_expiry_date);
	        System.out.println("**Attribtes of Nurse Class**");
	        System.out.println("Department: " + Department);
		    System.out.println("Working Hours: " + Working_Hours);
	    }

}
