
/* A java program that:
1.	Accepts the number of rows and columns for any 2-dimensional array
2.	Accepts input for the elements in the array
3.	Prints out all the data in the array
4.	Prints out all the data in the fifth column
5.	Prints out all the data in the fourth row
6.	Prints out all the diagonal elements
7.	Prints the sum of the first and last elements in that array
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimensions for a 2 dimensional array: ");
        int i = input.nextInt();    //number of rows
        int j = input.nextInt();    //number of columns

        int[][] SCORE = new int[i][j];

        System.out.println("Enter the elements of the array: ");
        for (int row = 0; row < i; row++)   //row and col are the indexes
        {
            for (int col = 0; col < j; col++)
            {
                SCORE[row][col] = input.nextInt();
            }
        }

        //Q1. All the data
        System.out.println("    ");
        System.out.print("1. All the data: ");
        for (int row = 0; row <i; row++)
        {
            for (int col = 0; col < j; col++)
            {
                System.out.print(SCORE[row][col] + " ");
            }
        }

        //Q2. All the data in the fifth column
        System.out.println("    ");
        System.out.println("    ");
        if(j >= 5)
        {
            System.out.print("2. All the data in the fifth column: ");
            for (int row = 0; row < i; row++)
            {
                System.out.print(SCORE[row][4] + " ");
            }
        }else
        {
            System.out.println("2. The array doesn't have up to 5 columns" + " ");
        }

        //Q3. All the data in the fourth row
        System.out.println("    ");
        System.out.println("    ");
        if( i >= 4)
        {
            System.out.print("3. All the data in the fourth row: ");
            for (int col = 0; col < j; col++)
            {
                System.out.print(SCORE[3][col] + " ");

            }
        }else
        {
            System.out.println("3. The array doesn't have up to 4 rows " + " ");
        }

        //Q4. All the diagonal elements
        System.out.println("    ");
        System.out.println("    ");
        System.out.print("4. Diagonal elements: ");
        for (int row = 0; row <i; row++)
        {
            for (int col = 0; col < j; col++)
            {
                if(row == col){
                    System.out.print(SCORE[row][col] + " ");
                }

            }
        }

        System.out.println("    ");
        System.out.println("    ");
        //Q5. The sum of the first and last elements
        if(i == 1 && j == 1){
            int sum = SCORE[0][0];
            System.out.println("5. The sum of the first and last elements = " + sum);
        }else
        {
            int sum = SCORE[0][0] + SCORE[i - 1][j - 1];
            System.out.println("5. The sum of the first and last elements = " + sum);
        }

    }
}

