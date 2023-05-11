
import java.util.Arrays;
import java.util.Random;
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
public class Main {
    final static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        //Step 1: Input a positive decimal number 
        int sizeArray = inputPositiveDecimalNumber("Enter number of array:");
        
        //Step 2: Input a positive decimal number for search number
        int searchNumber = inputPositiveDecimalNumber("Enter search value: ");
        
        //Step 3: Generate random integer in number range for each array element
        int[] array = generateRandomIntegerNumber(sizeArray);
        
        //Step 4: Display the array
        displayArray(array);
        
        //Step 5: Use linear search to search number in array
        int index = linearSearch(array, searchNumber);
        
        //Step 6: Display the index of search number in array
        displayIndexOfSearchNumber(searchNumber, index);
    }


    public static int inputPositiveDecimalNumber(String msg) {
        int num;
        //loop to until user input correct
        while (true) {            
            try {
                System.out.println(msg);
                num = Integer.parseInt(sc.nextLine().trim());
                //input not for range <= 0 or > max integer
                if(num <= 0 || num > Integer.MAX_VALUE){
                    throw  new NumberFormatException();
                }return num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please input positive "
                        + "decimal number");
            }
        }
    }


    public static int[] generateRandomIntegerNumber(int sizeArray) {
        Random rd = new Random();
        int[] array = new int[sizeArray];
        //loop to acces from first element to the last element of array
        for (int i = 0; i < sizeArray; i++) {
            array[i] = rd.nextInt(sizeArray);
        }
        return array;
    }


    public static void displayArray(int[] array) {
        System.out.println("The array: " + Arrays.toString(array));
    }

    private static int linearSearch(int[] array, int search_number) {
        //Traverse from i to the last element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search_number) {
                return i;
            }
        }
        return -1;
    }

    private static void displayIndexOfSearchNumber(int search_number, int index) {
        if (index == -1) {
            System.out.println("Not Found!!!");
        } else {
            System.out.println("Found " + search_number + " at index:" + index);
        }
    }
}
