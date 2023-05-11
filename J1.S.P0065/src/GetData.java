
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

    String getName() {
        String name;
        while (true) {
            System.out.print("Name:");
            name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Can't input empty");
                continue;
            }
            if (name.matches("^[0-9a-zA-Z ]+$")) {
                return name;
            }
            System.out.println("Invalid, please input lowercase or uppercase character");
        }
    }

    String getClasses() {
        String classes;
        while (true) {
            System.out.print("Classes:");
            classes = sc.nextLine().trim();
            if (classes.isEmpty()) {
                System.out.println("Can't input empty");
                continue;
            }
            if (classes.matches("^[0-9a-zA-Z ]+$")) {
                return classes;
            }
            System.out.println("Invalid, please input lowercase or uppercase character");
        }
    }

    double getMark(String msg) {
        String input;
        while (true) {
            System.out.print(msg + ":");
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println(msg+ "is digit");
            } else {
                try {
                    double mark = Double.parseDouble(input);
                    if (mark < 0 ) {
                        System.out.println(msg + "is greater than equal zero");
                        continue;
                    } else if( mark > 10) {
                        System.out.println(msg + "is less than equal ten");
                        continue;
                    }
                    return mark;
                } catch (NumberFormatException e) {
                    System.out.println(msg+ "is digit");
                }
            }
        }
    }

    boolean getYN() {
        String input;
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N):");
            input = sc.nextLine().trim();
            if(input.length() == 1) {
                if(input.equalsIgnoreCase("Y")) {
                    return true;
                }else if(input.equalsIgnoreCase("N")){
                    return false;
                }
            }else {
                System.out.println("Invalid, input (Y/N)");
            }
        }
    }

}
