
import java.io.IOException;
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

    public static void main(String[] args) throws IOException {
        GetData getData = new GetData();
        Display display = new Display();
        DoctorManager manager = new DoctorManager();
        HashMap<String, Doctor> doctorMap = new HashMap<>();
        int select ;
        //Loop to until to user want to exit program
        while (true) {
            //Step 1: Display GUI
            display.displayGUI();                            
            //Step 2: Input data
            select = getData.getSelect("Enter your select option: ", 1, 5);
            //Step 3: Perform function based on the selected option
            switch (select) {
                //Option 1:Add doctor       
                case 1:
                    manager.addDoctor(doctorMap);
                    break;
                    
                //Option 2:Update doctor    
                case 2:
                    manager.updateDoctor(doctorMap);
                    break;
                    
                //Option 3:Delete doctor  
                case 3 :
                    manager.deleteDoctor(doctorMap);
                    break;
                    
                //Option 4:Search Doctor     
                case 4:  
                    manager.searchDoctor(doctorMap);     
                    break; 
                    
                //Option 5:Exit the program    
                case 5:   
                    System.exit(0);
                    break;                    
            }
        }
    }
}
