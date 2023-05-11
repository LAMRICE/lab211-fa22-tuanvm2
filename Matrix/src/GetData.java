
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
class GetData {

    static Scanner sc = new Scanner(System.in);

    int getSelect(String msg, int min, int max) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine().trim();
            if(input.isEmpty()) {
                System.out.println("Can't input empty, please input positive number"
                        + "in range [" + min + "," + max +"]");
            }else {
                try {
                    int select = Integer.parseInt(input);
                    if(select < min || select > max) {
                        throw new NumberFormatException();
                    }return select;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid, please input positive number"
                        + "in range [" + min + "," + max +"]");
                }
            }
        }
    }

    int getRow(String msg) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine().trim();
            if(input.isEmpty()) {
                System.out.println("Can't input empty, please input digit ");
            }else {
                try {
                    int row = Integer.parseInt(input);
                    if(row <= 0) {
                        throw new NumberFormatException();
                    }return row;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid, please input digit ");
                }
            }
        }
    }

    int getColumn(String msg) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine().trim();
            if(input.isEmpty()) {
                System.out.println("Can't input empty, please input digit ");
            }else {
                try {
                    int column = Integer.parseInt(input);
                    if(column <= 0) {
                        throw new NumberFormatException();
                    }return column;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid, please input digit ");
                }
            }
        }
    }
    
    int getInteger(String msg) {
        while (true) {
            System.out.println(msg);
            String input = sc.nextLine().trim();
            if(input.isEmpty()) {
                System.out.println("Can't input empty, please input digit ");
            }else {
                try {
                    int number = Integer.parseInt(input);
                    return number;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid, please input digit");
                }
            }
        }
    }

}
