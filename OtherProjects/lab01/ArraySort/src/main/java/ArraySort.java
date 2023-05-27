import java.util.Scanner;
import java.util.Arrays;

public class ArraySort
{
    public static void main(String[] args)
    {
        Scanner myInput = new Scanner(System.in);

        System.out.print("enter array size: ");
        int n = myInput.nextInt();

        System.out.println("enter array elements:");

        int[] array = new int[n];
        int sum = 0;
        double average = 0.0f;

        for (int i=0; i<n; ++i)
        {
            array[i] = myInput.nextInt();
            sum += array[i];
        }

        Arrays.sort(array);
        average = (double)sum/(double)n;

        System.out.print("sorted array = ");
        for (int i=0; i<n; ++i)
        {
            System.out.printf("%d ", array[i]);
        }
        System.out.printf("\nsum = %d\navg = %f\n", sum, average);
    }
}
