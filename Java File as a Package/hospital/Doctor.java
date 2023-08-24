package hospital;

public class Doctor extends PatientCare{
	
	//Declare Variables
	public int Working_Hours;
	//Constructor
    public Doctor(String name, String address, String phone, 
        int employee_number, int permit_number, String permit_expiry_date, int Working_Hours)
    {
        super(name, address, phone, employee_number, permit_number, 
            permit_expiry_date);
        this.Working_Hours=Working_Hours;
    }
    //Overloading function
    public void print(int x) {
    	System.out.println("I'm a Doctor");
    }

    //print method to display the attributes
    public void print () 
    {
    	System.out.println("Doctor class is derived from PatientCare class. PatientCare class is derived from Employee class.");
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
    }

}
