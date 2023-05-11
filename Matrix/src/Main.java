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
        int selectOption;
        Display display = new Display();
        GetData getData = new GetData();
        MatrixManager matrixManager = new MatrixManager();
        while (true) {
            //Step 1: Display a menu
            display.displayMenu();
            //Step 2: Ask users to select option
            selectOption = getData.getSelect("Your choice: ", 1, 4);
            //Step 3: Perform function based on the selected option.
            switch (selectOption) {
                //Option 1: Addition matrixes
                case 1:
                    //Step 1: Input matrix 1
                    int [][] matrix1 = matrixManager.getMatrix1("-------- Addition --------");
                    //Step 2: Input matrix 2
                    int [][] matrix2 = matrixManager.getMatrix2(matrix1, selectOption);
                    //Step 3: Addition 2 matrixes : matrix 1 and matrix 2
                    int [][] matrixResult = matrixManager.additionMatrix(matrix1, matrix2);
                    //Step 4: Display result
                    display.displayResult(matrix1, matrix2, matrixResult, selectOption);
                    break;

                //Option 2: Subtraction matrixes
                case 2:
                    //Step 1: Input matrix 1
                    matrix1 = matrixManager.getMatrix1("-------- Subtraction --------");
                    //Step 2: Input matrix 2
                    matrix2 = matrixManager.getMatrix2(matrix1, selectOption);
                    //Step 3: Subtraction 2 matrixes : matrix 1 to matrix 2
                    matrixResult =matrixManager.subtractionMatrix(matrix1, matrix2);
                    //Step 4: Display result
                    display.displayResult(matrix1, matrix2, matrixResult, selectOption);
                    break;

                //Option 3: Multiplication matrixes
                case 3:
                    //Step 1: Input matrix 1
                    matrix1 = matrixManager.getMatrix1("-------- Multiplication --------");
                    //Step 2: Input matrix 2
                    matrix2 = matrixManager.getMatrix2(matrix1, selectOption);
                    //Step 3: Multiplication 2 matrixes : matrix 1 and matrix 2
                    matrixResult = matrixManager.multiplicationMatrix(matrix1, matrix2);
                    //Step 4: Display result
                    display.displayResult(matrix1, matrix2, matrixResult, selectOption);
                    break;

                //Option 4: Exit program.
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
