
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
public class InputData {
    
    
    double inputDouble() {
        Scanner sc = new Scanner(System.in);
        String input;
        while (true) {            
            input = sc.nextLine().trim();
            if(input.isEmpty()) {
                System.out.println("Can't input empty");
            }else {
                try {
                    double number = Double.parseDouble(input);
                    if(number > 0) {
                        return number;
                    } throw new NumberFormatException();
                } catch (NumberFormatException e) {
                    System.out.println("Invalid");
                }
            }
        }
    } 
           

    Rectangle inputRectangle() {
        System.out.println("=====Calculator Shape Program=====");
        System.out.println("Please input side width of Rectangle: ");
        double width = inputDouble();
        System.out.println("Please input length of Rectangle: ");
        double length = inputDouble();
        return new Rectangle(width, length);
    }

    Circle inputCircle() {
        System.out.println("Please input radius of Circle: ");
        double radius = inputDouble();
        return new Circle(radius);
    }

    Triangle inputTriangle() {
        while (true) {            
            System.out.println("Please input side A of Triangle: ");
            double a = inputDouble();
            System.out.println("Please input side B of Triangle: ");
            double b = inputDouble();
            System.out.println("Please input side C of Triangle: ");
            double c = inputDouble();
            if(a + b > c && b + c > a && a + c > b) {
                return new Triangle(a, b, c);
            } else {
                System.out.println("Can't create triangle , please input flow "
                        + "rule: The sum of any two sides is always "
                        + "greater than the other side ");
            }
        }
        
            
    }
    
}
