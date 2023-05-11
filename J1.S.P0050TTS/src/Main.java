
import java.util.ArrayList;
import java.util.List;

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
        Display display = new Display();
        Calculate calculate = new Calculate();
        GetData getData = new GetData();
        List<Float> numberList = new ArrayList<>();
        int select;
        float A, B, C;
        while (true) {
            //Step 1: Display a menu 
            display.displayMenu();
            //Step 2: Ask users to select an option
            select = getData.getSelect();
            //Step 3: Perform function based on the selected option
            switch (select) {
                //Option 1: Calculate Superlative Equation
                case 1:
                    //Step 1: Input coefficients A
                    A = getData.getCoefficient("Number A: ");
                    //Step 2: Input coefficients B
                    B = getData.getCoefficient("Number B: ");
                    //Step 3: Calculate the solution
                    List<Float> solution1 = calculate.calculateSuperlativeEquation(A, B, numberList);
                    //Step 4: Display solution 
                    display.displaySolution(solution1, select);
                    //Step 5: Display odd number 
                    display.displayOddNumber(numberList, "Number is Odd:");
                    //Step 6: Display even number 
                    display.displayEvenNumber(numberList);
                    //Step 7: Display perfect square number
                    display.displayPerfectSquareNumber(numberList);
                    break;
                //Option 2: Calculate Quadratic Equation
                case 2:
                    //Step 1: Input coefficients A
                    A = getData.getCoefficient("Number A: ");
                    //Step 2: Input coefficients B
                    B = getData.getCoefficient("Number B: ");
                    //Step 3: Input coefficients C
                    C = getData.getCoefficient("Number C: ");
                    //Step 4: Calculate the solution
                    List<Float> solution2 = calculate.calculateQuadraticEquation(A,B,C, numberList);
                    //Step 4: Display solution 
                    display.displaySolution(solution2, select);
                    //Step 5: Display odd number 
                    display.displayOddNumber(numberList,"Odd Number(s):");
                    //Step 6: Display even number 
                    display.displayEvenNumber(numberList);
                    //Step 7: Display perfect square number
                    display.displayPerfectSquareNumber(numberList);
                    break;
                //Option 3: Exit the program
                case 3:
                    System.exit(0);
                    break;
            }
            numberList.clear();
        }

    }
}
