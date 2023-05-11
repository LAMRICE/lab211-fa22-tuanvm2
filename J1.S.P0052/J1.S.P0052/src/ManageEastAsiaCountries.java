
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class ManageEastAsiaCountries {

    GetInput getinput = new GetInput();

    boolean checkDuplicate(ArrayList<EastAsiaCountries> countryList, String code) {
        boolean checkExist = false;
        //if country list is empty 
        if (countryList.isEmpty()) {
            return checkExist;
        } else {
            for (Country country : countryList) {
                if (code.equals(country.getCountryCode())) {
                    checkExist = true;
                    break;
                }
            }
        }
        return checkExist;
    }

    void addCountryInformation(ArrayList<EastAsiaCountries> countryList)  {
        //user input max information of 11 country
        if (countryList.size() == 11) {
            System.out.println("Asia has only 11 countries");
            return;
        } 
        
            String code = "";
            //loop to until user input correct ID , not duplicate
            while (true) {
                code = getinput.getString("Enter code of country: ",
                        "Invalid,please input character A -Z uppercase",
                        "^[A-Z]+$");
                boolean checkExist = checkDuplicate(countryList, code);
                //if exist ID in list
                if (checkExist) {
                    System.out.println("Duplicate ID!!!");                    
                }
                else {
                    break;
                }
            }

            String name = getinput.getString("Enter name of country: ",
                    "Invalid",
                    "^[a-zA-Z ]+$");
            float area = getinput.getFloat("Enter toral Area: ", "Invalid!!");
            String terrain = getinput.getString("Enter terrain of country: ",
                    "",
                    "^[a-zA-Z ]+$");
            EastAsiaCountries newCountry = new EastAsiaCountries(code, name,
                    area, terrain);
            countryList.add(newCountry);
            System.out.println("Add Successfully!!");
        
    }

    void getRecentlyEnteredInformation(ArrayList<EastAsiaCountries> countryList) {
        //if list country is emty
        if (countryList.isEmpty()) {
            System.out.println("Data not exist");
            //display all info of countries    
        } else {
            System.out.format("%-15s%-15s%-15s%-15s\n", "ID", "Name", "Total Area",
                    "Terrain");
            //loop to access each element of list from begining to the end
            for (int i = 0; i < countryList.size(); i++) {
                System.out.println(countryList.get(i).display());

            }
        }
    }

    void searchInformationByName(ArrayList<EastAsiaCountries> countryList) {
        //if list country is emty
        if (countryList.isEmpty()) {
            System.out.println("Data not exist");
        }
        boolean flag = false;
        String searchName = getinput.getString("Enter the name you want to "
                + "search for: ",
                "Invalid,please input character a-z lowercase or A-Z uppercase",
                "^[a-zA-Z ]+$");
        //loop to access each element of list from begining to the end
        for (EastAsiaCountries country : countryList) {
            if (country.getCountryName().toLowerCase().contains(searchName.toLowerCase())) {
                if (flag == false) {
                    System.out.format("%-15s%-15s%-15s%-15s\n",
                            "ID", "Name", "Total Area", "Terrain");
                }
                System.out.println(country.display());
                flag = true;
            }
        }
        //if search not thing info country
        if (flag == false) {
            System.out.println("Not found country!");
        }

    }

    void sortInformationByAscendingOrder(ArrayList<EastAsiaCountries> countryList
    ) {
        System.out.format("%-15s%-15s%-15s%-15s\n", "ID", "Name", "Total Area",
                "Terrain");
        Collections.sort(countryList, new Comparator<EastAsiaCountries>() {
            @Override
            public int compare(EastAsiaCountries o1, EastAsiaCountries o2) {
                return o1.getCountryName().compareToIgnoreCase(o2.countryName);
            }
        });
        //loop to access each element of list from begining to the end
        for (EastAsiaCountries country : countryList) {
            System.out.println(country.display());

        }
    }

    void readToFile(ArrayList<EastAsiaCountries> countryList) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader("src\\data.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = "";
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }
            String txt[] = line.split("; ");
            String code = txt[0].trim();
            String name = txt[1].trim();
            float area = Float.parseFloat(txt[2].trim());
            String terrain = txt[3].trim();
            countryList.add(new EastAsiaCountries(code, name, area, terrain));
        }
    }
}
