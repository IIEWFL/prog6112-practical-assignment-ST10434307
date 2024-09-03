/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.abccollegeass1prog6112;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author Huawei i5 CCM
 */
public class StudentIT {
    
    public StudentIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = null;
        String expResult = "";
        String result = instance.getStudentID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Student instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getstudentEmail method, of class Student.
     */
    @Test
    public void testGetstudentEmail() {
        System.out.println("getstudentEmail");
        Student instance = null;
        String expResult = "";
        String result = instance.getstudentEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getstudentCourse method, of class Student.
     */
    @Test
    public void testGetstudentCourse() {
        System.out.println("getstudentCourse");
        Student instance = null;
        String expResult = "";
        String result = instance.getstudentCourse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMenu method, of class Student.
     */
    @Test
    public void testShowMenu() {
        System.out.println("showMenu");
        Student.showMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of captureSaveStudent method, of class Student.
     */
    @Test
    public void testCaptureSaveStudent() {
        System.out.println("captureSaveStudent");
        ArrayList<Student> students = null;
        Scanner scan = null;
        Student.captureSaveStudent(students, scan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveStudent method, of class Student.
     */
    @Test
    
    public void testSaveStudent() 
    {
        //an empty array to pose for the stroage
        ArrayList<Student> students = new ArrayList<>();
        
        //Student test data  
        //calling the saveStudent method with the test data
        Student.saveStudent(students, "10111", "J.Bloggs", 20,  "jbloggs@ymail.com", "disd");
        
        assertEquals(1, students.size());
        assertEquals("10111", students.get(0).getStudentID());
        assertEquals("J.Bloggs", students.get(0).getName());
        assertEquals(20,students.get(0).getAge());
        assertEquals("jbloggs@ymail.com", students.get(0).getstudentEmail());
        assertEquals("disd", students.get(0).getstudentCourse());
    }

    /**
     * Test of SearchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent_ArrayList_Scanner() 
    {
        //array declaration
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("10112", "JDoe", 21, "jdoe@ymail.com", "disd"));

        Student student = Student.searchStudent(students, "10112");
        assertNotNull(student);
        assertEquals("10112", student.getStudentID());
        assertEquals("JDoe", student.getName());
        assertEquals(21, student.getAge());
    }

    /**
     * Test of searchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent_ArrayList_String() 
    {
        System.out.println("Nyiko");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("1234", "Nyiko masinge", 21, "nm@xmail.com", "prog"));

        //String studentID = "1234";
        
        Student student = Student.searchStudent(students, "7777");
        assertNull(student);
        
    }

    /**
     * Test of DeleteStudent method, of class Student.
     */
    @Test
    public void testDeleteStudent_ArrayList_Scanner() {
        System.out.println("DeleteStudent");
        ArrayList<Student> students = new ArrayList<>();
        boolean rslt = Student.DeleteStudent(students, "10112");
        Student.DeleteStudent(students, "10112");
        assertTrue(rslt);
        assertEquals(0,students.size());
        
    }

    /**
     * Test of DeleteStudent method, of class Student.
     */
    @Test
    public void TestDeleteStudent_StudentNotFound()
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("0987", "Elohim Jireh",30,"EJ@gmailll.com", "Religious studies"));
       
        boolean result = Student.DeleteStudent(students, "999");
        assertFalse(result);
        assertEquals(1, students.size());
    }
    
    @Test
    public void TestStudentAgeStudentAgeValid()
    {
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("10111", "J.Bloggs", 20, "jbloggs@ymail.com", "disd");
        assertTrue(student.getAge() >=16);
    }
    
    @Test 
    public void TestStudentAge_StudentAgeInvalidCharacter() 
    {
        ArrayList<Student> students = new ArrayList<>();
        boolean thrown = false;
        try 
        {
            Student student = new Student("008", "Sue Blue", Integer.parseInt("abc"), "sue@example.com", "Geography");
        } 
        catch (NumberFormatException a) 
        {
            thrown = true;
        }
        assertTrue(thrown);
    }

   
    
}
