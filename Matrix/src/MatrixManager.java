/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
class MatrixManager {
    GetData getData = new GetData();
    
    int[][] getMatrix1(String msg) {
        System.out.println(msg);
        int row = getData.getRow("Enter Row Matrix 1:");
        int column = getData.getColumn("Enter Column Matrix 1:");
        int [][] matrix1 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = getData.getInteger("Enter Matrix1["+(i+1)+"]["
                            +(j+1)+"]:");
            }
        }
        return matrix1;
    }
    
    int[][] getMatrix2(int[][] matrix1, int selectOption) {
        int rowMatrix1 = matrix1.length;
        int columnMatrix1 = matrix1[0].length;
        int rowMatrix2, columnMatrix2;
        // Compare select with 1 or 2 to input matrix for addition or subtraction matrix
        if (selectOption == 1 || selectOption == 2) {

            // loop until user enter correct row of second matrix
            while (true) {
                rowMatrix2 = getData.getRow("Enter Row Matrix 2:");
                // compare row matrix 1 with row matrix 2
                if (rowMatrix1 == rowMatrix2) {
                    break;
                } else {
                    System.out.println("Row of 2 matrix must equal");
                }
            }

            // loop until user enter correct column of second matrix
            while (true) {
                columnMatrix2 = getData.getColumn("Enter Column Matrix 2:");
                // compare column matrix 1 with column matrix 2
                if (columnMatrix1 == columnMatrix2) {
                    break;
                } else {
                    System.out.println("Column of 2 matrix must equal");
                }
            }
            
        } else {
            
            // Loop until user enter correct row of matrix 2
            while (true) {
                rowMatrix2 = getData.getRow("Enter Row Matrix 2:");
                // Compare column matrix 1 with row matrix 2
                if (columnMatrix1 == rowMatrix2) {
                    break;
                } else {
                    System.out.println("Row of matrix 2 must equal"
                            + " Column of matrix 1");
                }               
            }
            
            columnMatrix2 = getData.getColumn("Enter Column Matrix 2:");

        }
        
        int[][] matrix2 = new int[rowMatrix2][columnMatrix2];
        // Loop use to accsess from first element to last element in row of second matrix 
        for (int i = 0; i < rowMatrix2; i++) {
            // Loop use to accsess from first element to last element in column of second matrix
            for (int j = 0; j < columnMatrix2; j++) {
                matrix2[i][j] = getData.getInteger("Enter Matrix2[" + (i + 1)
                        + "][" + (j + 1) + "]:");
            }
        }
        return matrix2;
    }

    int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int rowMatrix1 = matrix1.length;
        int rowMatrix2 = matrix2.length;
        int columnMatrix2 = matrix2[0].length;
        int[][] result = new int[rowMatrix1][columnMatrix2];
        // Loop use to accsess from first element to last element in row of matrix 1
        for (int i = 0; i < rowMatrix1; i++) {
            //Loop use to acess from first element to last element in column of matrix 2
            for (int j = 0; j < columnMatrix2; j++) {
                //Loop use to acess from first element to last element in row of matrix 2
                for (int k = 0; k < rowMatrix2; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int column = matrix1[0].length;
        int[][] result = new int[row][column];
        // Loop use to accsess from first element to last element in row of matrix 
        for (int i = 0; i < row; i++) {
            // Loop use to accsess from first element to last element in column of matrix 
            for (int j = 0; j < column; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int column = matrix1[0].length;
        int[][] result = new int[row][column];
        // Loop use to accsess from first element to last element in row of matrix 
        for (int i = 0; i < row; i++) {
            // Loop use to accsess from first element to last element in column of matrix 
            for (int j = 0; j < column; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    

    
    
}
