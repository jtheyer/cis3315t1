package part3;

/**
 * Write 100 random ints to a text file; one int per line. Use a try with
 * resources and a catch block as needed. Add a finally block that prints the
 * words "All done".
 *
 * @author Jason Heyer
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class T1P3 {

    public static java.io.File file;
    public static ArrayList<Integer> myList = new ArrayList<>();
//makes random Integers;

    public static String randNumString(int amount) {
        String s = "";
        for (int i = 0; i < amount; i++) {
            s += (int) (Math.random() * 100) + " ";
        }
        return s;
    }

    public static void makeFile(int numOfLines, int listSize, String fileName) {
        //create file
        T1P3.file = new java.io.File(fileName);
        if (file.exists()) {
            System.out.println(file + " exists...");
        }

        int lines = numOfLines;
        try (PrintWriter output = new java.io.PrintWriter(file)) {
            for (int i = 0; i < lines; i++) {
                output.println(randNumString(listSize));
            }
        } catch (Exception ex) {
            System.out.println("File not found");
        } finally {
            System.out.println("All done");
        }
    }

    public static void main(String[] args) {
            makeFile(100, 1, "numFile.txt");
    }
}
