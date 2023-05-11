
import com.sun.org.apache.bcel.internal.generic.AALOAD;
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
        int choice = 0 ;
        Display display = new Display();
        GetData getDate = new GetData();
        List<Worker> workerList = new ArrayList<>();
        List<HistorySalary> historyList = new ArrayList<>();
        Manager manager = new Manager();
        while (true) {
            //Step 1: Display a menu
            display.displayMenu();
            //Step 2: Ask users to select an option
            choice = getDate.getInteger("Enter your choice: ",
                    "Invalid,please input positive number in range [1,5]",
                    1, 5);
            switch(choice) {
                case 1:
                    manager.addWorker(workerList);
                    break;
                case 2:
                    manager.changeSalary(workerList,historyList,"UP");
                    break;
                case 3:
                    manager.changeSalary(workerList,historyList,"DOWN");
                    break;
                case 4:
                    manager.displayInfomationSalary(historyList);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
      
}
