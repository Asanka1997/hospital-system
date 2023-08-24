package hospital;

public class PatientCare extends Employee{
	 //Decalre variables
	 public int permit_number;
	 public String permit_expiry_date;

	  //Constructor
	  public PatientCare(String name, String address, String phone, 
	    int employee_number, int permit_number, String permit_expiry_date)
	  {
	    super(name, address, phone, employee_number);
	    this.permit_number = permit_number;
	    this.permit_expiry_date = permit_expiry_date;
	  }
	 
	//print method for display the attributes  
	public void print() 
	  {
		System.out.println("PatientCare class is derived from Employee class.");
	    System.out.println("**Attribtes of Employee Class**");
	    System.out.println("Name: "+name);
	    System.out.println("Address: "+address);
	    System.out.println("Phone Number: "+phone);
	    System.out.println("Employee Number: " + employee_number);
	    System.out.println("**Attribtes of PatientCare Class**");
	    System.out.println("Permit Number: "+ permit_number);
        System.out.println("Permit Expiry Date: "+permit_expiry_date);
	  }
}
