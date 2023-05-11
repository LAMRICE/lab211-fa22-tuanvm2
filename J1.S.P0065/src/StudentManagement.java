
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
public class StudentManagement {

    GetData getData = new GetData();

    void createStudent(ArrayList<Student> studentList) {
        System.out.println("====== Management Student Program ======");
        while (true) {
            String name = getData.getName();
            String classes = getData.getClasses();
            double math = getData.getMark("Maths ");
            double chemistry = getData.getMark("Chemistry ");
            double physical = getData.getMark("Physics ");

            Student newStudent = new Student(name, classes, math, physical, chemistry);
            studentList.add(newStudent);
            if (getData.getYN() == false) {
                return;
            }
        }

    }

    public HashMap<Character, Double> getPercentTypeStudent(ArrayList<Student> studentList) {
        HashMap<Character, Double> percentTypeMap = new HashMap<>();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int total = studentList.size();
        for (Student student : studentList) {
            switch (student.getType(student.getAverage())) {
                case 'A':
                    countA++;
                    break;
                case 'B':
                    countB++;
                    break;
                case 'C':
                    countC++;
                    break;
                default:
                    countD++;
                    break;
            }
        }
        percentTypeMap.put('A',100.0 * countA/total);
        percentTypeMap.put('B',100.0 * countB/total);
        percentTypeMap.put('C',100.0 * countC/total);
        percentTypeMap.put('D',100.0 * countD/total);
        return percentTypeMap;
    }
}
