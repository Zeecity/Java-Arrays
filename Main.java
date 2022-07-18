import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the dimensions of the 2 by 2 array: ");
        int i = input.nextInt();
        int j = input.nextInt();

        int[][] arr = new int[i][j];

        System.out.println("Enter the elements: ");
        for (int row = 0; row <i; row++)
        {
            for (int col = 0; col < j; col++)
            {
                arr[row][col] = input.nextInt();
            }
        }

        System.out.println("1. All the data: ");
        for (int row = 0; row <i; row++)
        {
            for (int col = 0; col < j; col++)
            {
                //Q1. All the data
                System.out.println("    " + arr[row][col]);
            }
        }

        if(j >= 5)
        {
            System.out.println("2. All the data in the fifth column");
            for (int row = 0; row < i; row++)
            {
                    //Q2. All the data in the fifth column
                    System.out.println("    " + arr[row][4]);
            }
        }else
        {
            System.out.println("2. The array doesn't have up to 5 columns" + " ");
        }

        if( i >= 4)
        {
            System.out.println("3. All the data in the fourth row");
            for (int col = 0; col < j; col++)
                {
                    //Q3. All the data in the fourth row
                    System.out.println("    " + arr[3][col]);

                }
        }else
        {
            System.out.println("3. The array doesn't have up to 4 rows " + " ");
        }

        System.out.println("4. Diagonal elements: ");
        for (int row = 0; row <i; row++)
        {
            for (int col = 0; col < j; col++)
            {
                //Q4. All the diagonal elements
                if(row == col){
                    System.out.println("    " + arr[row][col]);
                }

            }
        }
        //Q5. The sum of the first and last elements
        int sum = arr[0][0] + arr[i-1][j-1];
        System.out.println("5. The sum of the first and last elements = "+ sum);

    }
}