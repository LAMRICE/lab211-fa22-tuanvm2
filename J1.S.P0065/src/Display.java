
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Display {

    StudentManagement manager = new StudentManagement();

    void displayStudent(ArrayList<Student> studentList) {
        int count = 0;
        for (Student student : studentList) {
            System.out.println("------ Student" + ++count + " Info ------");
            System.out.println("Name:" + student.getStudentName());
            System.out.println("Classes:" + student.getClassName());
            System.out.printf("AVG:%.1f\n", student.getAverage());
            System.out.println("Type:" + student.getType(student.getAverage()));
        }
    }

    public void displayClassification(HashMap<Character, Double> percentTypeMap) {
        System.out.println("--------Classification Info -----");
        for (Map.Entry<Character, Double> classifies : percentTypeMap.entrySet()) {
            System.out.print(classifies.getKey() + ":");
            System.out.printf(" %.1f", classifies.getValue());
            System.out.println("%");
        }
    }
}
