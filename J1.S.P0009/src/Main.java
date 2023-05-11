/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        /*Use recursion method to find 45 sequence Fibonacci and 
        display to screen.*/
        findFibonacciAndDisplay(0, 1, 1);
    }

    private static int findFibonacciAndDisplay(int number1, int number2, int count) {
        //The first number recursion method
        if(count == 1) {
            System.out.println("The 45 sequence fibonacci:");
            //Display first Fibonacci number
            System.out.print(number1 + ", ");
//            System.out.println("Number " + count + ": " + number1);
            return findFibonacciAndDisplay(number1, number2, count +1);
        }
        //The second number recursion method
        if(count == 2) {
            //Display second Fibonacci number
            System.out.print(number2 + ", ");
//            System.out.println("Number " + count + ": " + number2);
            return findFibonacciAndDisplay(number1, number2, count +1);
        }
        //Check Fibonacci number is not full 45 number 
        if(count < 45){
            //Display sequence Fibonacci number
            System.out.print((number1 + number2) + ", ");
//            System.out.println("Number " + (count) + ": " + (number1+number2));
            return findFibonacciAndDisplay(number2,number1 + number2, count+1);
        //Stop recursion method to find Fibonacci number         
        }else {
            //Display the last Fibonacci number
            System.out.print(number1 + number2 + ", ");
//            System.out.println("Number " + count + ": " + (number1+number2));
            return -1;
            
        }
        
    }
    
}
