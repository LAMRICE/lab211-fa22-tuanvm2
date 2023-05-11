/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
class Display {

    void displayMenu() {
        System.out.println("=======Calculator program======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtracton Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
    }

     void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        // Loop use to accsess from first element to last element in row of matrix 
        for (int i = 0; i < row; i++) {
            // Loop use to accsess from first element to last element in column of matrix            
            for (int j = 0; j < column; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }

    
    void displayResult(int[][] matrix1, int[][] matrix2, int[][] matrixResult, int select) {
        System.out.println("-------- Result --------");
        displayMatrix(matrix1);
        // compare select with 1 to print operator +
        if (select == 1) {
            System.out.println("+");
            // compare select with 2 to print operator -    
        } else if (select == 2) {
            System.out.println("-");
        } else {
            System.out.println("*");
        }
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(matrixResult);
    }

    
}
