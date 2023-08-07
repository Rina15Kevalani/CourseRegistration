package miniproject;

public class Student {
	
		private int studentId;
	    private String name;
	    private String coursenm;
	    
	   
	    public Student(int studentId, String studentName, String cnm) {
	        this.studentId = studentId;
	        this.name = studentName;
	        this.coursenm = cnm;
	    }

	   
	    	//getter setter method
		public String getStuName() {
	        return name;
	    }

	    public int getStudentId() {
	        return studentId;
	    }
	   
	    public String  getCoursenm() {
	    	return coursenm;
	    }
	   
	}


