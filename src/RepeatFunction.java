import java.util.Scanner;

public class RepeatFunction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean isRepeatOn = true;

        while (isRepeatOn) {
            System.out.println("Current song is playing");
            System.out.println("Would you like to stop this and play next song?");

            String userInput = input.nextLine();

            if (userInput.equals("yes")) {
                isRepeatOn = false;
            }

        }
        System.out.println("Play Next Song");

    }

}
