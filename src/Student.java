import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.25;
        String studentFirstName = "Sreedevi";
        String studentLastName = "Abhilash";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentSecondInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentSecondInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
        System.out.println("What would you like to update?");


        try (Scanner input = new Scanner(System.in)) {
            double studentGPA1 = input.nextDouble();

            System.out.println(studentFirstName + " " + studentLastName + " has now a GPA of " + studentGPA1);
        }

        // TODO Auto-generated method stub

    }

}
