
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
    ArrayList<Student> studentList = new ArrayList<>();
        StudentManagement manager = new StudentManagement();
        Display display = new Display();
    //Step 1: Display GUI And Input Data
        //Input data for Student
        manager.createStudent(studentList);
        HashMap<Character, Double> percentTypeMap = manager.getPercentTypeStudent(studentList);
    //Step 2: Perform function
        // Display notify result of students 
        display.displayStudent(studentList);
        //Display students classification statistic result
        display.displayClassification(percentTypeMap);
    }
    
}
