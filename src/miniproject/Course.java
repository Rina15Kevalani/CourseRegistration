package miniproject;
class Course {
	
	String name;
	int capacity;
	int enrolledStudents;
	double price;
	
	public Course(String nm, int capct, double price) {
		this.name = nm;
		this.capacity = capct;
		this.enrolledStudents = 0;
		this.price = price;
	}
	
	//get setter method
	public String getname() {
		return name;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public int getEnrolledStudents() {
		return enrolledStudents;
	}
	
	public boolean enrollStudent() {
		if(enrolledStudents<capacity) {
			enrolledStudents++;
			return true;
		}else {
			return false;
		}
	}
	
	public double getPrice() {
		return price;
	}
	public char[] getCourseId() {
		
		return null;
	}
	
}
