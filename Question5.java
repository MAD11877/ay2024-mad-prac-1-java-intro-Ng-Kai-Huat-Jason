import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    /**
     * Prompt the user for number. This input indicates the number of integers the
     * user will be entering next.
     * Print out the mode (highest occurrence) from the set of integers.
     * e.g.
     * > 5
     * > 2
     * > 4
     * > 1
     * > 3
     * > 4
     * 4
     * 
     * e.g.
     * > 4
     * > 2
     * > 2
     * > 3
     * > 3
     * 2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner in = new Scanner(System.in);

    // Prompt user for number of integers
    int numIntegers = in.nextInt();

    int[] integers = new int[numIntegers];

    // Get integers from user
    for (int i = 0; i < numIntegers; i++) {
      integers[i] = in.nextInt();
    }

    // Find highest occuring number and print out
    int highestCount = 0;
    int mode = integers[0]; // Initialize mode with first element (arbitrary)

    for (int i = 0; i < numIntegers; i++) {
      int currentCount = 1;
      for (int j = i + 1; j < numIntegers; j++) {
        if (integers[i] == integers[j]) {
          currentCount++;
        }
      }

      if (currentCount > highestCount) {
        highestCount = currentCount;
        mode = integers[i];
      }
    }

    // Print the highest occurring number
    System.out.println(mode);

    in.close();
  }

}
