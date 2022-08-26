import java.util.Scanner;

public class SingleMCQ {

    public static void main(String[] args) {

        String question = "What is the colour of Sky?";
        String choiceOne = "red";
        String choiceTwo = "blue";
        String choiceThree = "yellow";


        System.out.println(question);
        System.out.println("Options are: " + choiceOne + " " + choiceTwo + " " + choiceThree);
        String correctAnswer = choiceTwo;
        Scanner input = new Scanner(System.in);
        String userChoice = input.next();

        if (correctAnswer.equals(userChoice.toLowerCase())) {

            System.out.println(userChoice);
            System.out.println("Answer is Correct");
        } else {
            System.out.println("Incorrect Answer, the correct answer is " + choiceTwo);
        }

    }

}

