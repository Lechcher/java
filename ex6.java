import java.util.Random;

public class ex6
{
    public static void main(String[] args)
    {
        Random random = new Random();

        // int x = random.nextInt(6);
        double y = random.nextDouble();
        boolean b = random.nextBoolean();

        System.out.println(y);
        System.out.println(b);
    }

}