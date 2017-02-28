package part1;

import java.util.Random;

/**
 * Fill this 20 x 20 int array with random numbers. The numbers should have
 * values between 0 and 99. Then use a nested loop to print out the array row by
 * row with the numbers in evenly spaced columns.
 *
 * @author Jason Heyer
 */
public class T1P1 {

    public static void main(String[] args) {
        Random gen = new Random();
        int[][] matrix = new int[20][20];

        // Code to fill array with random ints
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random()*100);
            }
        }
        // Code to print array row by row
         for(int row=0; row < matrix.length; row++){
            for(int column=0; column < matrix[row].length; column++){ //note [row].length
                System.out.printf("%5d ",matrix[row][column]);
            }
            System.out.println("");
        }
    }
}