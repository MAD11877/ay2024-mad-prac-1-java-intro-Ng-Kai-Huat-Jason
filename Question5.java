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

    System.out.print("Enter the number of integers: ");
    int numIntegers = in.nextInt();

    int currentMode = 0;
    int maxCount = 0;

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

    if (hasMultipleModes(numIntegers, maxCount)) {
      System.out.println("The data is multimodal.");
    } else {
      System.out.println("The mode of the data is: " + currentMode);
    }
  }

  private static boolean hasMultipleModes(int numIntegers, int maxCount) {
    return maxCount > 1;
  }
}
