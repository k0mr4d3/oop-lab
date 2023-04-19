import java.util.Scanner;

public class StarTower
{
    public static void main(String[] args)
    {
        Scanner myInput = new Scanner(System.in);
        int n = myInput.nextInt();

        for (int i=1; i<=n; ++i)
        {
            for (int j=1; j<=(n-i); ++j)
            {
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i-1); ++k)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
