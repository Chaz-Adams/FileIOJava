package Step4;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args)
    {
        // Print out a running total of all the
        // values in the input file.
        int sum = 0;
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new File("/Users/chaz/Projects/ToDoLabs/FileIOJava/Step4/input.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(fileIn.hasNextInt()){
            sum += fileIn.nextInt();
            System.out.println(sum);
        }
    }
}