
import java.util.Scanner;
import java.util.regex.Pattern;

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
    int getSelect(String msg, int min, int max) {
        String input;
        while (true) {            
            System.out.print(msg);
            input = sc.nextLine().trim();
            if(input.isEmpty()) {
                System.out.println("Can't input empty");
            }else {
                try {
                    int select = Integer.parseInt(input);
                    if(select <min || select > max) {
                        throw new NumberFormatException();
                    }return select;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid,please input positive number "
                            + "in range [1;4]");
                }
            }
        }
    }
    int getID(String msg) {
        String input;
        while (true) {            
            System.out.print(msg);
            input = sc.nextLine().trim();
            if(input.isEmpty()) {
                System.out.println("Can't input empty");
            }else {
                try {
                    int id = Integer.parseInt(input);
                    if(id <= 0) {
                        throw new NumberFormatException();
                    }return id;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid,please input positive number "
                            + "greater than 0");
                }
            }
        }
    }
    
    String getString(String msg, String err, String regex){
        String input;
        while (true) {            
            System.out.print(msg);
            input = sc.nextLine().trim();
            if(input.isEmpty()) {
                System.out.println("Can't input empty");
                continue;
            }else if(input.matches(regex)) {
                return input;
            }
            System.out.println(err);
        }
    }
    
    String getPhone(String msg){
        String phone;
        while (true) {            
            System.out.println(msg);
            phone = sc.nextLine().trim();
            if(phone.isEmpty()) {
                System.out.println("Can't input empty");
                continue;
            }
            Pattern p0 = Pattern.compile("^[0-9]{10}$");
            Pattern p1 = Pattern.compile("^[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}$");
            Pattern p2 = Pattern.compile("^[0-9]{3}[.]{1}[0-9]{3}[.]{1}[0-9]{4}$");
            Pattern p3 = Pattern.compile("^[0-9]{3}[ ]{1}[0-9]{3}[ ]{1}[0-9]{4}$");
            Pattern p4 = Pattern.compile("^[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}[ ]{1}(x|ext)[0-9]{4}$");
            Pattern p5 = Pattern.compile("^\\([0-9]{3}\\)[-]{1}[0-9]{3}[-]{1}[0-9]{4}$");
            if(p0.matcher(phone).find() || p1.matcher(phone).find() 
                    || p2.matcher(phone).find() || p3.matcher(phone).find()
                    || p4. matcher(phone).find() || p5.matcher(phone).find()){
                System.out.println("Phone is correct form");
                return phone;
            }
            System.out.println("Please input Phone flow\n"
                              +". 1234567890\n"
                              +". 123-456-7890\n"
                              +". 123-456-7890 x1234\n"  
                              +". 123-456-7890 ext1234\n"                          
                              +". (123)-456-7890\n"
                              +". 123.456.7890\n"
                              +". 123 456 7890\n");
                                
        }
    }
    
}
