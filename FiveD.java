import java.util.Scanner;

public class FiveD {
    public static void main(String[] args) {
        System.out.println("enter 5-digit no ");
        Scanner input = new Scanner(System.in);
        int numbs = input.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        int iteration = 0;

        if (numbs >= 10000 && numbs <= 99999) {
            while (numbs > 0) {
                int digit = numbs % 10;

                numbs = numbs / 10;
                iteration++;

                if (iteration % 2 != 0) {
                    oddSum = oddSum + digit;
                } else {
                    evenSum = evenSum + digit;
                }
            }

            System.out.println("oddsum: " + oddSum);
            System.out.println("evensum: " + evenSum);
            System.out.println("Difference " + (oddSum - evenSum));
        } else {
            System.out.println("not valid 5-digit no");
        }

        input.close();
    }
}