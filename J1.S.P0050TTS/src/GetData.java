
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
    
    Scanner sc = new Scanner(System.in);

    int getSelect() {
        String input;
        while (true) {            
            System.out.print("Please choice one option: ");
            input = sc.nextLine().trim();
            if(input.isEmpty()) {
                System.out.println("Can't input empty");
            }else {
                try {
                    int select = Integer.parseInt(input);
                    if(select < 1 || select > 3) {
                        throw new NumberFormatException();
                    }return select;
                } catch (NumberFormatException e) {
                    System.out.println("Please input integer number in range "
                            + "[1;3]");
                }
            }
        }
    }

    float getCoefficient(String msg) {
        String input;
        while (true) {            
            System.out.print(msg);
            input = sc.nextLine().trim();
            if(input.isEmpty()) {
                System.out.println("Can't input empty");
            }else {
                try {
                    float coefficient = Float.parseFloat(input);
                    return coefficient;
                } catch (NumberFormatException e) {
                    System.out.println("Please input number");
                }
            }
        }
    }
    
    boolean getOddNumber( float number) {
        if(number % 2 != 0) {
            return true;
        }else {
            return false;
        }
    }
    
    boolean getEvenNumber( float number) {
        if(number % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
    
    boolean getPerfectSquareNumber( float number) {
        if(number == 0) {
            return false;
        }
        if(Math.sqrt(number) == (int)Math.sqrt(number)) {
            return true;
        }else {
            return false;
        }
    }
    
}
