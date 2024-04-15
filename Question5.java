import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    int NoOfInts = in.nextInt();

    int[] myInts = new int[NoOfInts];

    for (int i = 0; i < NoOfInts; i++) {
      myInts[i] = in.nextInt();
    }

    in.close();

    int mode = 0;

    for (int i = 0; i < NoOfInts; i++) {
      int num1;
      int num2;

      num1 = myInts[i];
      num2 = mode;

      if (num1 > num2) {
        mode = num1;
      }
      else{
        mode = num2;
      }
    }

    System.out.println(mode);
  }
}
