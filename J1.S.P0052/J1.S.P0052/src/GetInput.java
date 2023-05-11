
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
public class GetInput {

    final Scanner sc = new Scanner(System.in);

    int getInteger(String msg, String err, int MIN, int MAX) {
        int number;
        do {
            try {
                System.out.println(msg);
                number = Integer.parseInt(sc.nextLine().trim());
                if (number < MIN && number > MAX) {
                    throw new NumberFormatException();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        } while (true);

    }

    String getString(String msg, String err, String regex) {
        String result;
        while (true) {
            System.out.println(msg);
            result = sc.nextLine().trim();
            //if user input string empty
            if (result.trim().equals("")) {
                System.out.println("Can not be empty!");
                continue;
            }
            //if user input string match regex
            if (result.matches(regex)) {
                return result;
            }
            System.out.println(err);
        }
    }

    float getFloat(String msg, String err) {
        float number;
        do {
            try {
                System.out.println(msg);
                number = Float.parseFloat(sc.nextLine().trim());
                if (number <= 0) {
                    throw new Exception();                   
                }
                return number;
            } catch (Exception e) {
                System.out.println(err);
            }
        } while (true);
    }
}
