import java.util.Scanner;


public class ex9
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // logical operators
        // &&: And
        // ||: Or
        // !: Not

        System.out.println("Game is completed! Press Q and q key to quit...");
        String response = scanner.nextLine();

        if(response.equals("q") || response.equals("Q"))
        {
            System.out.println("Loading to the main menu!");
        }
        else
        {
            System.out.println("Thanks you playing the game!");
        }

    }
}