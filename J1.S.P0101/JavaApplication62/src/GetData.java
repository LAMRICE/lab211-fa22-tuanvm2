
import java.text.SimpleDateFormat;
import java.util.Date;
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

    final static Scanner sc = new Scanner(System.in);

    int getSelect(String msg, String err, int min, int max) {
        int select;
        while (true) {
            try {
                System.out.println(msg);
                select = Integer.parseInt(sc.nextLine().trim());
                //Check if select only in rage [min; max]
                if (select < min || select > max) {
                    throw new NumberFormatException();
                }
                return select;

            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }

    String getString(String msg, String err, String regex) {
        String result;
        while (true) {
            System.out.println(msg);
            result = sc.nextLine().trim();
            if (result.trim().equals("")) {
                System.out.println("Can't empty this info");
                continue;
            }
            if (result.matches(regex)) {
                return result;
            }
            System.out.println(err);
        }
    }

    double getDouble(String msg, String err) {
        double number;
        while (true) {
            try {
                System.out.println(msg);
                number = Double.parseDouble(sc.nextLine().trim());
                if (number < 0 || number > Double.MAX_VALUE) {
                    throw new NumberFormatException();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }
    
    Date getDate(String msg, String err,String regex) {
        Date date = null;
        while (true) {            
            try {
                date = Date.
                SimpleDateFormat sdf = new SimpleDateFormat();
                sdf.parse(date);
            } catch (Exception e) {
            }
        }
        
    }
}
