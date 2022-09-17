import java.io.FileWriter;
import java.io.PrintWriter;

public class SimpleFileIO {
    public static void main(String[] args) throws  Exception
    {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

        out.println("This is the first line of my text");
        out.println("This is the Second Line of my file");
        out.println("This is the third lin of my text");
        out.flush();
        out.close();
    }
}

