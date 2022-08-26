import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        sc.nextLine();

        String b = sc.nextLine();

        System.out.println("Number is "+ a + " and the string is " + b);

    }
}