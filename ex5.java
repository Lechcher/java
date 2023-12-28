import java.util.Scanner;

public class ex5
{
    public static void main(String[] args)
    {

        // Math.max(x, y): Find the max value between x and y
        // Math.min(x, y): Find the min value between x and y
        // Math.abs(x): Return the absolute value from x
        // Math.sprt(x): Return the square root from x
        // Math.round(x): Round out the x
        // Math.ceil(x): Round up the x
        // math.floor(x): Round down the x

        /* Example for this part */
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        int max;

        System.out.println("Enter x: ");
        x = scanner.nextInt();

        System.out.println("Enter y: ");
        y = scanner.nextInt();

        max = Math.max(x, y);

        System.out.println("The max in the number: " + max);

        scanner.close();
        

    }

}