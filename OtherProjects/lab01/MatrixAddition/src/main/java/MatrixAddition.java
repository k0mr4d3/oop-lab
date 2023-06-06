import java.util.Scanner;

public class MatrixAddition
{
    public static void main(String[] args)
    {
        Scanner myInput = new Scanner(System.in);

        System.out.print("enter matrix size (rows and columns): ");

        int row = myInput.nextInt();
        int col = myInput.nextInt();

        int[][] firstMatrix = new int[row][col];
        int[][] secondMatrix = new int[row][col];
        int[][] sumMatrix = new int[row][col];

        System.out.println("enter the first matrix: ");

        for (int i=0; i<row; ++i)
        {
            for (int j=0; j<col; ++j)
            {
                firstMatrix[i][j] = myInput.nextInt();
            }
        }

        System.out.println("enter the second matrix: ");

        for (int i=0; i<row; ++i)
        {
            for (int j=0; j<col; ++j)
            {
                secondMatrix[i][j] = myInput.nextInt();
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("sum matrix = ");

        for (int i=0; i<row; ++i)
        {
            for (int j=0; j<col; ++j)
            {
                System.out.printf("%d ", sumMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
