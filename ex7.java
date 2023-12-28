import java.util.Scanner;

public class ex7
{
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            int age;

            System.out.println("Enter your age: ");
            age = scanner.nextInt();

            if(age >= 75)
            {
                System.out.println("You are elder person!");
            }
            else if(age >= 18)
            {
                System.out.println("You are adult!");
            }
            else
            {
                System.out.println("You are baby!");
            }
        }
    }

}