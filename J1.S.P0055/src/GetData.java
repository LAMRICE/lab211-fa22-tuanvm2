
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class GetData {

    Scanner sc = new Scanner(System.in);

    int getSelect(String msg, int min, int max) {
        String input;
        //Loop to until user input correct 
        while (true) {            
            System.out.print(msg);
            input = sc.nextLine().trim();
            //Check input is empty
            if(input.isEmpty()) {
                System.out.println("Can't input empty");
            }else {
                try {
                    int select = Integer.parseInt(input);
                    if(select < min || select > max ) {
                        throw new NumberFormatException();
                    }return select;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid, please input positive number in"
                            + "range ["+min+";"+ max+"]");
                }
            }
        }
    }

    String getString(String msg) {
        String input;
        //loop to until user input string correct
        while (true) {
            System.out.print(msg);
            input = sc.nextLine().trim();
            //Check if string result is empty
            if (input.isEmpty()) {
                System.out.println("Information is blank");
                return input;
            }
            //^: character begin regex pattern
            //[A-Z]: match string with all uppercase from A - Z
            //[a-z]: match string with all uppercase from a - z
            //+ : can input many than one character
            //$: character end regex parttern 
            //Check if string input match regex pattern 
            if (input.matches("^[a-zA-Z]+$")) {
                return input;
            }
            System.out.println("Invalid, please input lower or uppercase character");
        }
    }

    String getCode(String msg) {
        String code;
        //loop to until user input ID correct
        while (true) {
            System.out.print(msg);
            code = sc.nextLine().trim();
            //Check  if ID is empty 
            if (code.isEmpty()) {
                System.out.println("ID can't empty");
                continue;
            }
            //^: character begin regex pattern
            //[A-Z]: match string with all uppercase from A - Z
            //[0-9]: match all number digit from 0- 9
            //[ ]: space character
            //+ : can input many than one character
            //$: character end regex parttern 
            //Check if ID match regex pattern 
            if (code.matches("^[0-9A-Z ]+$")) {
                return code;
            }
            System.out.println("Invalid, please input uppercase character or digit");
        }
    }

    int checkAvailability() {
        String input;
        //Loop to until user input correct 
        while (true) {            
            System.out.print("Enter Availability: ");
            input = sc.nextLine().trim();
            //Check input is empty
            if(input.isEmpty()) {
                System.out.println("Can't input empty");
            }else {
                try {
                    int number = Integer.parseInt(input);
                    if(number < 0) {
                        throw new NumberFormatException();
                    }return number;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid, please input positive number "
                            + "is greater than or equal zero");
                }
            }
        }
    }
    
    String getText () {
        String text;
        //loop to until user input text correct
        while (true) {
            System.out.print("Enter text: ");
            text = sc.nextLine().trim();
            //Check if text is empty
            if (text.trim().equals("")) {
                System.out.println("Can't input text empty");
                continue;
            }
            //Check if text match regex pattern
            if (text.matches("^[a-zA-Z]+$")) {
                return text;
            }
            System.out.println("Invalid, please input lower or uppercase character");
        }
    }
}
