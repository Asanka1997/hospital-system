package hospital;
import java.util.Scanner;

//Declare class
public class hospitalTest {

	//Default Constructor
	public hospitalTest() {}

	//Main method
	public static void main(String[] args) {
		//Declare String Arrays for the Data assigning
		String[] details_emp= {"Dr.Jonny","Califonia","+81254762","1253"};
		String[] details_recept= {"Mrs.Juliean", "Texsas","+82456445","21456","Heart Diseases"};
		
		//Create objects and assigning Data to constructors
		Employee employee = new Employee(details_emp[0], details_emp[1], details_emp[2], Integer.parseInt(details_emp[3]));
		PatientCare patientcare = new PatientCare(details_emp[0], details_emp[1], details_emp[2], Integer.parseInt(details_emp[3]), 25486, "2020/12/25");
		Administrator administrator=new Administrator(details_recept[0], details_recept[1], details_recept[2], Integer.parseInt(details_recept[3]),details_recept[4]);
		Doctor doctor=new Doctor(details_emp[0], details_emp[1], details_emp[2], Integer.parseInt(details_emp[3]), 25486, "2020/12/25", 12);
		Surgeon surgeon= new Surgeon(details_emp[0], details_emp[1], details_emp[2], Integer.parseInt(details_emp[3]), 25486, "2020/12/25", 12, "Heart");
		ER_Doctor erdoctor=new ER_Doctor("Dr.Nisham","NewYork Junction, NewYork","+11874552",25412,125,"2020/12/25",8,"Children");
		Nurse nurse=new Nurse("Ms.Kanthi","Vegas","+974581236", 12457, 25256, "2025/11/12","Womem",16);
		Receptionist receptionist = new Receptionist(details_recept[0], details_recept[1], details_recept[2], Integer.parseInt(details_recept[3]), details_recept[4],12);
		
		//Getting User Inputs	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Classes of Hospital\n\tER Doctor : 1\n\tSurgeon :2\n\tNurse :3\n\tReceptionist :4\n\tDoctor :5\n\tPatient Care: 6\n\tAdministrator :7\n\tEmployee :8\nChoose an Employee :");
	    int user_input = input.nextInt();
	    
	    //Use IF conditions for the choosing classes
	    if(user_input == 1) {
	    	
	    	erdoctor.print(1);
	    	erdoctor.service();
	    	erdoctor.print();	
	    }
	    
	    if(user_input == 2 ) {
	    	
	    	surgeon.print(1);
	    	surgeon.service();
	    	surgeon.print();
	    	
	    	
	    }
	    if(user_input == 3) {
	    	nurse.service();
	    	nurse.print();
	    	
	    	
	    }
	    if(user_input == 4) {
	    	receptionist.service();
	    	receptionist.print();
	    	
	    }
	    if(user_input==5) {
	    	
	    	doctor.print();
	    }
	    if(user_input==6) {
	    	
	    	patientcare.print();
	    	
	    }
	    if(user_input==7) {
	    	administrator.print();
	    }
	    
	    if(user_input==8) {
	    	employee.print();
	    }
	  
	    System.out.println("\n*****************************************"); 
	
	
	
	
	}

}
