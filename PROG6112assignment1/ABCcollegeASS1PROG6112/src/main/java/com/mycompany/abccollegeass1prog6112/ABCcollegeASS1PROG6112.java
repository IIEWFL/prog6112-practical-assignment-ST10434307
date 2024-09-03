/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abccollegeass1prog6112;

/**
 *
 * @author Huawei i5 CCM
 */

//Imports 
import java.util.Scanner;
import java.util.ArrayList;

public class ABCcollegeASS1PROG6112 
{
    public static void main(String[] args)
    { 
        //ArrayList to store list of objects 
        ArrayList<Student> students = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        //restricted data type for precision
        int selectionChoice;
        
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("*****************************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit:");
        String originChoice = scan.nextLine();
        
        if(!originChoice.equals("1"))
        {
            System.out.println("Closing application...");
            System.exit(0);
        }
        
        
        /*Code attribution
       This code was adapted from stackoverflow
       https://stackoverflow.com/questions/19731912/basic-java-menu-with-switch-case
       By Andre Evt 1 November 2013, accessed 2 September 2024
        */
        
        do
        {
            Student.showMenu();
            selectionChoice = Integer.parseInt(scan.nextLine());
            
            switch(selectionChoice)
            {
                case 1: Student.captureSaveStudent(students, scan);
                        break;
                        
                case 2: Student.SearchStudent(students, scan);
                        break;
                
                case 3: Student.DeleteStudent(students, scan);
                        break;
                
                case 4: Student.StudentReport(students);
                        break;
                        
                case 5: Student.ExitStudentApplication();//(students, scan);
                        break;
                        
                default: System.out.println("Incorrect option. Try again. ");
            }
        }
        
        while(selectionChoice != 5);
    
    }
    
}

    

