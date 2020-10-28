import jdk.jfr.Experimental;

public class Instructor {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int experienceYear;
	
	
	public Instructor(String firstName, String lastName, String phoneNumber, int experienceYear) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNumber);
		setExpYear(experienceYear);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	public String getphoneNum() {
		return phoneNumber;
	}
	
	public int expYear() {		
		return experienceYear;
	}
	
	
	public void setFirstName(String firstName) {
		if(!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}
	
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	
	public void setPhoneNum(String phoneNumber) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNumber;
		} else {
			this.lastName = "Unknown";
		}
	}
	
	public void setExpYear(int experienceYear) {
		if(experienceYear >= 1) {
			this.experienceYear = experienceYear;
		} else {
			this.experienceYear = 1;
		}
	}

//	public String getStatus() {
//		String status = "";
//		if(experienceYear < 2) {
//			return status = "Junnior Instructor";
//		} else if(experienceYear > 2 && experienceYear < 4) {
//			return status = "Intermediate Instructor";
//		} else if(experienceYear >= 4) {
//			return status = "Senior Instructor";
//		}
//		return status;
//	}
	
	public String getStatus() {
		String status = "";
		switch(this.experienceYear) {
			case 1:
			    return status = "Junnior Instructor";			    
		    case 2:
			case 3:
			    return status = "Intermediate Instructor";			  
			
			default:
				return status = "Senior Instructor";
				
		}
		
	}
 	
}
