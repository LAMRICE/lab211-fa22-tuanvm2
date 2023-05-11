
import java.io.IOException;
import java.util.ArrayList;

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
        Display display = new Display();
        GetInput getinput = new GetInput();
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        ArrayList<EastAsiaCountries> countryList = new ArrayList<>();
        manager.readToFile(countryList);        
        int choice;
        while (true) {
            //Display a menu
            display.displayMenu();
            //Ask users to select an option
            choice = getinput.getInteger("Enter your choice: ",
                    "Invalid!please enter your choice interger number in range "
                            + "[1;5]", 1, 5);
            //Perform function based on the selected option
            switch (choice) {                 
                case 1://Input the information of 11 countries in East Asia
                    manager.addCountryInformation(countryList);
                    break;
                
                case 2://Display information of countries you have just input
                    manager.getRecentlyEnteredInformation(countryList);
                    break;
                    
                case 3://Search information of countries by user-entered name
                    manager.searchInformationByName(countryList);
                    break;
                
                case 4:/*Option 4: Display the information of countries sorted  
                name in ascending order*/
                    manager.sortInformationByAscendingOrder(countryList);
                    break;
                                    
                case 5://Exit program
                    System.exit(0);
                    break;
            }
        }
    }
}
