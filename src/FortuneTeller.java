import java.util.*;

public class FortuneTeller {

    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 10: ");

        Scanner number = new Scanner(System.in);
        int inputtedNum = number.nextInt();

        if (inputtedNum < 5) {
            System.out.println("You will be happy all the day");
        } else {
            System.out.println("You will enjoy your life");
        }
    }
}
