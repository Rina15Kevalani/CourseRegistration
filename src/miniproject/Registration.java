package miniproject;

import java.util.ArrayList;
import java.util.List;

import encapsulation.Laptop;

import java.util.ArrayList;
import java.util.List;

public class Registration {
    List<Course> courses;
    List<Student> students;

    public Registration() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    
    
    	//add courses
    public void addCourse(String name, int capcity, int price) {
    	Course course = new Course(name,capcity, price);
    	courses.add(course);
    }
    	//add students
    public void addStudent(int stid, String name, String coursenm) {
    	Student student = new Student(stid, name, coursenm);
    	students.add(student);
    }
     // search courses
    public Course findCourseByName(String name) {
        for (Course course : courses) {
            if (course.getname().equalsIgnoreCase(name)) {
                return course;
            }
        }
        return null;
    }
    
    //find student
    public Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStuName().equalsIgnoreCase(studentId)) {
                return student;
            }
        }
        return null;
    }

    	//register student & course for logic
    public void registerStudentCourse(int courseId, int studentId) {
        if (courseId >= 0 && courseId < courses.size()){
            Course course = courses.get(courseId);
            if (course.enrollStudent()) {
                if (studentId >= 0 && studentId < students.size()) {
                    Student student = students.get(studentId);
                    System.out.println("Student " + student.getStuName() + " registered for course: " + course.getname());
                } else {
                    System.out.println("Invalid student ID.");
                }
            } else {
                System.out.println("Course is already full. Student could not be registered.");
            }
        } else {
            System.out.println("Invalid course ID.");
        }
    }
    
    //display courses
    public void displayCourseInformation() {
    	System.out.println("_____________________________________________________________________________________________________________________________________________________________________________\n");
    	 System.out.printf("%80s\n\n","Course Details");
    	 System.out.println("..........................................................................................................................................\n");
        
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            
           
            System.out.printf("%-40s \n","Course ID: " + i);
            System.out.printf("%-40s \n","Course Name: " + course.getname());
            System.out.printf("%-40s \n","Enrolled Students: " + course.getEnrolledStudents() + "/" + course.getCapacity());
            System.out.printf("%-40s \n","Price: " + course.getPrice());
            System.out.println("..............................................................................\n");
            
        }
    }
    	//display students
    public void displayStudentInformation() {
    	  System.out.println("____________________________________________________________________________________________________________________________________\n");
    	  System.out.printf("%80s\n\n","Student Details");
    	  System.out.println("....................................................................................................................................\n");
        
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            Course course = courses.get(i);
            
            System.out.printf("%-40s \n","Student ID: " + i);
            System.out.printf("%-40s \n","Student Name: " + student.getStuName());
            System.out.printf("%-40s \n","Course Name: " + course.getname());
            System.out.println("...................................................................................................................................\n");
            
        }
    }
   
}


