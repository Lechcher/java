import java.util.Scanner;

public class ex8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int date;

        System.out.println("Enter date: ");
        date = scanner.nextInt();

        switch (date)
        {
            case 2:
            System.out.println("Today is Monday!");
            break;

            case 3:
            System.out.println("Today is Tuesday!");
            break;

            case 4:
            System.out.println("Today is Wednesday!");
            break;

            case 5:
            System.out.println("Today is Thursday!");
            break;

            case 6:
            System.out.println("Today is Friday!");
            break;

            case 7:
            System.out.println("Today is Saturday!");
            break;

            case 8:
            System.out.println("Today is Sunday!");
            break;

            default: System.out.println("The number that you entered is invalid!"); 
        }
    }

}