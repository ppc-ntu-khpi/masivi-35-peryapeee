import java.util.Arrays
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
/**
 *
 * @author Инна
 */

 public class Main 
{
    public static void main(String[] args) {
	        int[][] sourceMatrix = new int[4][4];
	        int[][] transposedMatrix = new int[4][4];

	        sourceMatrixWithFiller(sourceMatrix);
	        transposedMatrix(sourceMatrix, transposedMatrix);
	    }
/**
 * Method for initial matrix
 * @param sourceMatrix
 * @return sourceMatrix
 */
	    public static int[][] sourceMatrixWithFiller(int[][] sourceMatrix) {
	        int numberFiller = 1;
	        System.out.println("The source matrix:");
	        for (int i = 0; i < sourceMatrix.length; i++) {
	            for (int j = 0; j < sourceMatrix[i].length; j++) {
	                sourceMatrix[i][j] = numberFiller++;
	                System.out.print(sourceMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	        return sourceMatrix;   
	    }
/**
 * Method for transposing and displaying a new matrix
 * @param sourceMatrix
 * @param transposedMatrix
 * @return transposedMatrix
 */
	    public static int[][] transposedMatrix(int[][] sourceMatrix, int[][] transposedMatrix) {
	        for (int i = 0; i < sourceMatrix.length; i++) {
	            for (int j = 0; j < sourceMatrix[i].length; j++) {
	                transposedMatrix[j][i] = sourceMatrix[i][j];
	            }
	        }
	        System.out.println("Transposed matrix:");
	        for (int i = 0; i < transposedMatrix.length; i++) {
	            for (int j = 0; j < transposedMatrix[i].length; j++) {
	                System.out.print(transposedMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	        return transposedMatrix; 
	    }
}
