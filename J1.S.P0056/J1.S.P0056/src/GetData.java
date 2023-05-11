
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class GetData {

    private Scanner sc = new Scanner(System.in);

    int getInteger(String msg, String err, int min, int max) {
        String input;
        while (true) {
            System.out.println(msg);
            input = sc.nextLine().trim();
            try {
                int number = Integer.parseInt(input);
                if (number < min || number > max) {
                    throw new NumberFormatException();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }

    double getDouble(String msg, String err, double min, double max) {
        String input;
        while (true) {
            System.out.println(msg);
            input = sc.nextLine().trim();
            try {
                double number = Double.parseDouble(input);
                if (number < min || number > max) {
                    throw new NumberFormatException();
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }

    String getString(String msg, String err, String regex) {
        String input;
        while (true) {
            System.out.println(msg);
            input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("")) {
                System.out.println("Can't input empty");
                continue;
            } else if (input.matches(regex)) {
                return input;
            }
            System.out.println(err);
        }
    }

//    Date getDate(String msg) {
//        String input;
//        Date date;
//        while (true) {
//            System.out.println(msg);
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//            dateFormat.setLenient(false);
//            input = sc.nextLine().trim();
//            if (input.isEmpty()) {
//                System.out.println("Can't input empty!!");
//                continue;
//                // \d{1,2}: the number have 1 or 2 digit number
//                //[/]: contain character /
//                //\d{4}: the number must have 4 digit
//            } else if (!input.matches("^\\d{1,2}[/]\\d{1,2}[/]\\d{4}$")) {
//                System.out.println("Wrong format input(dd/MM/yyyy)");
//                continue;
//            }
//            try {
//                date = dateFormat.parse(input);
//                break;
//            } catch (ParseException e) {
//                System.out.println("Date doesn't exitsted");
//            }
//        }
//        return date;
//    }
    
    
    public String inputDate(String mess) {
        System.out.print(mess);
        //set format of date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        //force user input exectly a date
        while(true) {
            String input = sc.nextLine();
            try {
                Date date = dateFormat.parse(input);
                //get current date
                Date curDate = Calendar.getInstance().getTime();
                //check range of date
                if (curDate.compareTo(date) < 0) {
                    System.out.print("Please input date that before current date: ");
                    continue;
                }
                dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
                return dateFormat.format(date);
            } catch (Exception e) {
                System.out.print("Please input valid date (dd-MM-yyyy): ");
            }
        }
    }
}
