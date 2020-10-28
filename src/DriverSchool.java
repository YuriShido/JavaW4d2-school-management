import java.util.ArrayList;
import java.util.Scanner;

public class DriverSchool {
	
//		Print (ArrayList<> courses) —————> Course name is ….. which takes. …… weeks. The Instructor of this course is  ………… who is (Junior Senior or something ) with ……..year of experience. The Phone number of Instructor is …….. （編集済み）
	public static void printCouse (ArrayList<Course> courses) {
		for(Course i : courses) {
			System.out.println("Couse name is :" + i.getname() +
					"\nwhich takes " + i.getDuration() + " weeks." + 
					"\nThe instructor of this course is " + i.getInstructor().getFirstName() + 
					"\nWho is " + i.getInstructor().getStatus() + " with " +
					i.getInstructor().expYear() + " year of experience." +
					"\nThe phone number of instructor is " + i.getInstructor().getphoneNum() + "\n");
		
		}
	}
	
	public static String findCours(ArrayList<Course> courses, String AskInst) {
		for(Course i : courses) {
			if(i.getInstructor().getFirstName().equalsIgnoreCase(AskInst)) {
				return "This instructor teaches " + i.getname();
			} 		
		}
//		If we don`t have any courses Just Print” This Instructor does not teach any courses” （
		 return "This Instructor does not teach any courses";
	}
		

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		Create ArrayList of Course called courses
		ArrayList<Course> courses  = new ArrayList<Course>();
//		Create three Instructor Object 
		Instructor instructor1 = new Instructor("Aidan", "Smith", "7788888888", 1);
		Instructor instructor2 = new Instructor("Dereck", "Harrison", "7788883458", 3);
		Instructor instructor3 = new Instructor("Sean", "Paul", "7788438868", 6);
//		Create four Course Object 
		Course course1 = new Course("Web Developement", 90, instructor1);
		Course course2 = new Course("Mobile", 48, instructor2);
		Course course3 = new Course("Marketing", 120, instructor3);
		Course course4 = new Course("Business", 60, instructor1);
		
//		Add these four course object to the courses arrayList
		courses.add(course1);
		courses.add(course2);
		courses.add(course3);
		courses.add(course4);
		
		printCouse(courses);
				
//		After Printing all Courses, Ask User to give the name of Instructor and then 
		System.out.println("Please enter the first name of Instructor");
		String AskInst = input.next();
//		you should return the name of course which this Instructor teaches. 
		System.out.println(findCours(courses, AskInst));
	}

}
