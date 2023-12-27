import java.util.Scanner;

public class ex3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your name?: ");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("What is your favorite food?");
        String favoriteFood = scanner.nextLine();

        System.out.println("Hello " + name + "!");
        System.out.println("You age is " + age + " years old");
        System.out.println("You like " + favoriteFood + "!");


    }

}