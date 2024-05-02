import java.util.*;
import java.io.*;

/**
 * Reverses a string using a recursive function.
 *
 * @author Kent G
 * @version 1.0
 * @since 2024-04-10
 */

class ReverseString{


    /** Private constructor to prevent instantiation. */
    private ReverseString() {
      throw new UnsupportedOperationException("Utility class.");
    }
  
    /**
     * This is the main method.
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        File readFile = new File("input.txt");
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);
            Scanner sc = new Scanner(readFile);
            // Passes input lines to the string reverser then writes them to output.
            while (sc.hasNextLine()) {
                String inputString = sc.nextLine();
                writer.write(stringReverse(inputString));
                writer.newLine();
            }
            writer.close();
            sc.close();
        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        }
    }

   /**
   * Recursive method that reverses its input string.
   *
   * @param inputString passed.
   * @return inputString.
   */
    private static String stringReverse(final String inputString) {
        // Returns the reversed string once its length is zero.
        if (inputString.length() == 0) {
          return inputString;
          /* Otherwise, return the input string passed into the
           * string reverser again but with its index shifted over one
           * added to the first character of the input string.
           */
        } else {
          return stringReverse(inputString.substring(1)) + inputString.charAt(0);
        }
      }
    }