

import java.util.ArrayList;
import java.util.List;

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
        int choice = 0;
        Display display = new Display();
        GetData getData = new GetData();
        EmployeeManagement employeeManagement = new EmployeeManagement();
        List<Employee>employeeList = new ArrayList<>();
        while (true) {            
            //Step 1: Display a menu
            display.displayMenu();
            //Step 2: Ask users to select an option 
            choice = getData.getSelect("Enter your choice: ",
                    "Invalid,please input positive integer number in range [1;6]",
                    1,6);
            //Step 3: Perform function based on the selected option
            switch(choice) {
                //Add employees
                case 1:
                    employeeManagement.addEmployee();
                    break;
                //Update employees
                case 2:
                    employeeManagement.updateEmployee();
                    break; 
                //Remove employees
                case 3:
                    employeeManagement.removeEmployee();
                    break;
                //Search employees 
                case 4:
                    employeeManagement.searchEmployee();
                    break;
                //Sort employees by salary 
                case 5:
                    employeeManagement.sortBySalary();
                    break;
                //Exit the program    
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }



}
