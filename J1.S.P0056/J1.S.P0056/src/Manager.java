
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
public class Manager {

    GetData getData = new GetData();

    boolean checkExistCode(List<Worker> workerList, String code) {
        boolean checkExist = false;
        if (workerList.isEmpty()) {
            return checkExist;
        }
        for (Worker w : workerList) {
            if (w.getId().equals(code)) {
                checkExist = true;
                break;
            }
        }
        return checkExist;
    }

    void addWorker(List<Worker> workerList) {
        System.out.println("--------- Add Worker ---------");
        String code;
        while (true) {
            code = getData.getString("Enter Code: ", "Invalid ", "^[A-Z0-9 ]+$");
            if (checkExistCode(workerList, code) == true) {
                System.out.println("ID duplicate!!");
            } else {
                break;
            }
        }
        String name = getData.getString("Enter Name", "Invalid", "^[A-Za-z]+$");
        int age = getData.getInteger("Enter Age: ", "Invalid", 18, 50);
        double salary = getData.getDouble("Enter Salary: ", "Invalid",
                0.00001, Double.MAX_VALUE);
        String workLocation = getData.getString("Enter WorkLocantion: ", "Invalid", "^[A-Za-z0-9 ]+$");
        Worker newWorker = new Worker(code, name, age, salary, workLocation);
        workerList.add(newWorker);
        System.out.println("Add Successfully worker!!");
    }

    void changeSalary(List<Worker> workerList, List<HistorySalary> historyList, String status) {
        System.out.println("------- Up/Down Salary --------");
        if (workerList.isEmpty() == true) {
            System.out.println("Not exit worker");
        } else {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Calendar calendar = Calendar.getInstance();
            String date = dateFormat.format(Calendar.getInstance().getTime());
            while (true) {
                String code = getData.getString("Enter Code: ", "Invalid",
                        "^[A-Z0-9 ]+$");
                boolean isExist = checkExistCode(workerList, code);
                if (isExist == false) {
                    System.out.println("Code doesn't exist!!");
                } else {
                    for (Worker w : workerList) {
                        if (w.getId().equals(code)) {
                            double salaryCurrent = w.getSalary();
                            double salaryUpdate = 0;
//                            while (true) {
                                double salary = getData.getDouble("Enter Salary: ",
                                        "Invalid ", 0.00001, Double.MAX_VALUE);
                                if (status.equals("UP")) {
                                    salaryUpdate = salaryCurrent + salary;

                                } else if (status.equals("DOWN")) {
                                    if (salary > salaryCurrent) {
                                        System.out.println("You should input smaller than current salary(" + salaryCurrent + ")");

                                    } else {
                                        salaryUpdate = salaryCurrent - salary;

                                    }
                                }
                                w.setSalary(salaryUpdate);
                                historyList.add(new HistorySalary(w.getId(), w.getName(),
                                        w.getAge(), w.getSalary(), w.getWorkLocation(),
                                        status, date));
                                return;
//                            }
                        }
                    }
                }
            }
        }
    }

    void displayInfomationSalary(List<HistorySalary> historyList) {
        if (historyList.isEmpty()) {
            System.out.println("No exist history change salary");
            return;
        }
        System.out.println(
                "--------------------Display Information Salary--------------------- ");

        System.out.format("%-8s%-15s%-8s%-15s%-10s%-15s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
        for (HistorySalary h : historyList) {
            System.out.format("%-8s%-15s%-8d%-15f%-10s%-15s\n", h.getId(),
                    h.getName(), h.getAge(), h.getSalary(), h.getStatus(), h.getDate());
        }
    }

    void display(List<Worker> workerList) {
        for (Worker w : workerList) {
            System.out.println(w.toString());
        }
    }
}
