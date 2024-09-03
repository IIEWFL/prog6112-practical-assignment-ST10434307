/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abccollegeass1prog6112;




/**
 *
 * @author Huawei i5 CCM
 */

//imports
import java.util.Scanner;
import java.util.ArrayList;

public class Student
{
    //global variables
    private int age;
    private String name;
    private String studentID;
    private String studentEmail;
    private String studentCourse;
    
    
     /*Code attribution
       This code was adapted from javatpoint
       https://www.javatpoint.com/java-constructor
    */
    
    //Constructor used to create the instance of the class.
    public Student(String studentID, String name, int age, String studentEmail, String studentCourse)
    {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }
    
    
    //getters used to indirectly for accessing the private variables
    public String getStudentID()
    {
        return studentID;
    }
    
    
    public String getName()
    {
        return name;
    }
    
    
    public int getAge()
    {
        return age;
    }
    
    
    public String getstudentEmail()
    {
        return studentEmail;
    }
    
    
    public String getstudentCourse()
    {
        return studentCourse;
    }
    
    
    /*Code attribution
       This code was adapted from stackoverflow
      https://stackoverflow.com/questions/44428951/beginner-java-how-to-get-it-to-display-menu-again-after-invalid-selection
      By urag  8 June 2017, accessed 3 September 2024
    */
        
    //Methods that the project uses
    public static void showMenu()
    {
        //the following will be displayed on the console to prompt the user
        System.out.println("Please select one of the following menu items: ");
        System.out.print("(1) Capture a new student.\n");
        System.out.print("(2) Search for a student.\n");
        System.out.print("(3) Delete a student.\n");
        System.out.print("(4) Print student report.\n");
        System.out.print("(5) Exit Application.\n");
    }
    
    
    //method to capture the students details
    public static void captureSaveStudent(ArrayList<Student> students, Scanner scan)
    {
        System.out.println("CAPTURE A NEW STUDENT" );
        System.out.println("*****************************************");
        //user prompted to enter ID
        System.out.println("Enter the student ID :");
        String newStudentID = scan.nextLine();
        
        //user prompted to enter ID
        System.out.println("Enter the student name :");
        String studentName = scan.nextLine();
        
        
        int stdAge = 0; 
        boolean validityOfAge = false;
        
        while(!validityOfAge)
        {
            System.out.println("Enter the student age:");
            
            try
            {
                stdAge = Integer.parseInt(scan.nextLine());
                
                if (stdAge >= 16)
                {
                    validityOfAge = true;
                }
                else
                {
                    System.out.println("You have entered a incorrect student age!!!\n Please re-enter the student age.");
                }
            }
            catch (NumberFormatException a)
            {
                System.out.println("invalid input. Please input a valid number for student age.");
            }
        }
        
        //student email
        System.out.println("Enter the student email: ");
        String studentEmail = scan.nextLine();
        
        //student's course
        System.out.println("Enter the student course: ");
        String studentCourse = scan.nextLine();
        System.out.println("\n");
        
        Student.saveStudent(students, newStudentID, studentName, stdAge, studentEmail, studentCourse);
    }
    
    
    
    
     /*Code attribution
       This code was adapted from w3Schools
      https://www.w3schools.com/java/java_constructors.asp
    */
    public static void saveStudent(ArrayList<Student> students, String studentID, String name, int age, String studentEmail, String studentCourse)
    {
        students.add(new Student(studentID, name, age, studentEmail, studentCourse));
        System.out.println("Student details have succesfully been captured. ");
    }
    
    
    
    
    
     /*Code attribution
       This code was adapted from codeRanch
     https://coderanch.com/t/670835/java/Finding-student-ID
    */
    public static void SearchStudent (ArrayList<Student> students, Scanner scan)
    {
        System.out.println("Enter the student ID to search: ");
        System.out.println("************************************************");
        String newStudentID = scan.nextLine();
        
        Student student = Student.searchStudent(students, newStudentID);
        
        //boolean to display the details of a student found 
        if (student != null)
        {
            System.out.println("Student Found");
            System.out.println("Student ID:" + student.getStudentID() + "\n" + "Student Name:" + student.getName() +"\n" + "Student Age: " + student.getAge() + "\n" + "Student Email: "+ student.getstudentEmail() + "\n" + "Student Course: " + student.getstudentCourse());
            System.out.println("***************************************************");
        }
        //boolean to catch and dispaly meeage of users not found1 
        else
        {
            System.out.println("Student with Student ID: " +" "+ student /*newStudentID*/ + " was not found!" );
            System.out.println("***********************************************");
        }
    }
    
    
    public static Student searchStudent(ArrayList<Student> students, String studentID)
    {
        for (Student student : students)
        {
            if(student.getStudentID().equals(studentID))
            {
                return student;
            }
        }
        //users that are not found will be assigned default(null)
        return null;
    }
    
    
     /*Code attribution
       This code was adapted from codeRanch
   https://coderanch.com/t/738068/java/Removing-element-List-Student
    */
    public static void DeleteStudent (ArrayList<Student> students, Scanner scan)
    {
        System.out.println("Enter the student ID to delete: ");
        String newStudentID = scan.nextLine();
        
        System.out.println("Are you sure to want to delete" + students + "from the system? Yes (y) to delete.");
        System.out.println("********************************************************");
        String confirmYN = scan.nextLine();
        
        if(confirmYN.equalsIgnoreCase("y"))
        {
            Student.DeleteStudent(students, newStudentID);
            System.out.println("Student with StudentID" + " " + newStudentID + " " + "was deleted");
            System.out.println("*****************************************************");
           
        }
        else
        {
            System.out.println("cancelled deletion of student");
        }
    }
    
    
    //deleting students 
    public static boolean DeleteStudent(ArrayList<Student> students, String studentID)
    {
        Student deleteStudent = searchStudent(students, studentID);
        
        if(deleteStudent != null)
        {
            students.remove(deleteStudent);
            System.out.println("Student has been deleted");
            //System.out.println("Student with StudentID" + studentID "was deleted");
            return true;
        }
        else
        {
            System.out.println("Student not found");
            return false;
        }
    }
    
    
    //generating a student report 
    public static void StudentReport(ArrayList<Student> students)
    {
        System.out.println("Student Report: ");
        
        for(Student student : students)
        {
            System.out.println("Student ID: " + student.getStudentID() + "\n" + "Student Name: " + student.getName()+ "\n" + "Student Age: " + student.getAge() + "\n" + "Student Email: "+ student.getstudentEmail() + "\n" + "Student Course: " + student.getstudentCourse());
            System.out.println("**********************************************************");
        }
    }
    
    
    public static void ExitStudentApplication()
    {
        System.out.println("Exiting the application...");
        System.exit(0);
    }
}
