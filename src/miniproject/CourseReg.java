package miniproject;

import java.util.List;
import java.util.Scanner;

public class CourseReg {
    public static void main(String[] args) {
    	//Add course
        Registration registr = new Registration();
        
       
        
        registr.addCourse("Java Programming", 20,5000);
        registr.addCourse("Python Proramming", 15,1000);
        registr.addCourse("Artificial Intelligence", 10,2000);
        registr.addCourse("Html", 25,1500);
        registr.addCourse("CSS", 30, 2500);
        registr.addCourse("Angular", 25, 3000);
        registr.addStudent(001, "Rina", "java programming");
        registr.addStudent(002, "Charmi", "Python programming");
        registr.addStudent(003, "Riya", "Html");
        registr.addStudent(004, "Om", "Angular");
       
        Scanner sc = new Scanner(System.in);
        int choice;
        
        
        do {
            System.out.printf("%80s\n", "Course Registration");
            System.out.println("___________________________________________________________________________________________________________________________________________________\n");
            System.out.printf("%15s  %-27s\n", " ","1. Register student for a course");
            System.out.printf("%15s  %-27s\n", " ","2. Display course information");
            System.out.printf("%15s  %-27s\n", " ","3. Find course information by course name");
            System.out.printf("%15s  %-27s\n", " ","4. Display Student information");
            System.out.printf("%15s  %-27s\n", " ","5. Exit");
            System.out.printf("%15s  %-27s\n", " ","Enter your choice: ");
            System.out.println("___________________________________________________________________________________________________________________________________________________\n");
           
            choice = sc.nextInt();
           
            switch (choice) {
                case 1:
                    System.out.print("Enter the course ID: ");
                    int courseId = sc.nextInt();
                    System.out.print("Enter the student ID: ");
                    int studentId = sc.nextInt();
                    registr.registerStudentCourse(courseId, studentId);
                    
                    break;
                case 2:
                	registr.displayCourseInformation();
                    break;
                case 3:
                	 System.out.print("Enter the course name: ");
                	    String coursename = sc.next();
                	    Course foundCourse = registr.findCourseByName(coursename);
                	    if (foundCourse != null) {
                	        System.out.println("Course found: " + foundCourse.getname());
                	      
                	    } else {
                	        System.out.println("Course not found.");
                	    }
                	    break;
                case 4:
                	registr.displayStudentInformation();
                	break;
                	    
                case 5:
                    System.out.println("Exiting the program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;   
            	}	
        	} while (choice!=5);
        sc.close();
    }
}


