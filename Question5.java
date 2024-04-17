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
    System.out.print("Enter the number of integers: ");
    int numIntegers = in.nextInt();

    // Check for empty input (optional)
    if (numIntegers == 0) {
      System.out.println("No integers entered.");
      in.close();
      return;
    }

    int currentMode = 0;
    int maxCount = 0;

    // Consume the remaining newline after numIntegers (optional)
    in.nextLine(); // This reads and discards any remaining newline character

    for (int i = 0; i < numIntegers; i++) {
      int currentInt = in.nextInt();
      int currentCount = 1;

      for (int j = i + 1; j < numIntegers; j++) {
        if (currentInt == in.nextInt()) {
          currentCount++;
        }
      }

      if (currentCount > maxCount) {
        maxCount = currentCount;
        currentMode = currentInt;
      }
    }

    in.close();

    System.out.println(currentMode);
  }
}
