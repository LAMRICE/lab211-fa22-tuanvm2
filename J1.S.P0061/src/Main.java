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
        InputData inputData = new InputData();

        //Step 1:Display GUI and Input Data
        //Input data for Rectangle
        Rectangle newRectangle = inputData.inputRectangle();
        //Input data for Circle
        Circle newCircle = inputData.inputCircle();
        //Input data for Triangle
        Triangle newTriangle = inputData.inputTriangle();
        //Step 2: Display the information of Triangle, Rectangle, Circle
        newRectangle.printResult();
        newCircle.printResult();
        newTriangle.printResult();
    }

}
