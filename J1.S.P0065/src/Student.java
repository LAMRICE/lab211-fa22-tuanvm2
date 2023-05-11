/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Student {
    private String studentName;
    private String className;
    private double mathMarks,physicalMarks,chemistryMarks;

    public Student() {
    }

    public Student(String studentName, String className, double mathMarks, double physicalMarks, double chemistryMarks) {
        this.studentName = studentName;
        this.className = className;
        this.mathMarks = mathMarks;
        this.physicalMarks = physicalMarks;
        this.chemistryMarks = chemistryMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(double mathMarks) {
        this.mathMarks = mathMarks;
    }

    public double getPhysicalMarks() {
        return physicalMarks;
    }

    public void setPhysicalMarks(double physicalMarks) {
        this.physicalMarks = physicalMarks;
    }

    public double getChemistryMarks() {
        return chemistryMarks;
    }

    public void setChemistryMarks(double chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }
    
    public double getAverage() {
        return  (mathMarks+physicalMarks+chemistryMarks)/3;
    }
    
    public char getType(double average) {
        if(average > 7.5) {
            return 'A';
        }else if(average>= 6 && average <= 7.5) {
            return 'B';
        }else if(average>= 4 && average <6 ) {
            return 'C';
        }else {
            return 'D';
        }
    }
    
}
