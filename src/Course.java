
public class Course {
	private String name; 
	private int duration;
	private Instructor instructor;
//	ArrayList<Student> students;
	
	public Course(String name, int duration, Instructor instructor) {
		setName(name);
		setDuration(duration);
		setInstructor(instructor);
	}
	
	public String getname() {
		return name;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	public void setName(String name) {
		if (!name.isEmpty() && !name.equalsIgnoreCase(null)) {
			this.name = name;
		} else {
			this.name = "unknown";
		}
	}
	
	public void setDuration(int duration) {
		if(duration >= 4) {
			this.duration = duration;
		} else {
			this.duration = 4;
		}
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	

	
	
	





}
