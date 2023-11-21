package Step4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args) {
            // Print out a running total of all the
            try {
                // try catch
                PrintWriter fileOut = new PrintWriter("out.txt");

                fileOut.println("hello");

                fileOut.close();

                System.out.println("done");

                Scanner fileIn = new Scanner((new File("output.txt")));
                while (fileIn.hasNext()) {
                    String lineIn = fileIn.nextLine();
                }
                System.out.println("done!");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }


        
    }


            // values in the input file.
