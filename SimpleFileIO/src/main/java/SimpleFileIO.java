import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SimpleFileIO {
    public static void main(String[] args) throws  Exception
    {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

        out.println("This is the first line of my text");
        out.println("This is the Second Line of my file");
        out.println("This is the third lin of my text");
        out.flush();
        out.close();

        Scanner sc = new Scanner(new BufferedReader(new FileReader("OutFile.txt")));
        while (sc.hasNextLine()){
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        }
        System.out.println("Thats all in my file");
    }
}

