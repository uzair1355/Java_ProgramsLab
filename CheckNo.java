import java.util.Scanner;

public class CheckNo {
    public static void main(String[] args) {
        System.out.println("enter no to be checked ");
        Scanner input = new Scanner(System.in);
        int numbs = input.nextInt();

        // to check neg / posi/ zero
        if (numbs == 0) {
            System.out.println(numbs + " is zero");
        } else {
            System.out.println(numbs > 0 ? "number is positive " : " number is negative ");
        }

        // even / odd
        System.out.println(numbs % 2 == 0 ? "number even" : "number odd");

        // multiple of 5
        System.out.println(numbs % 5 == 0 ? "number is multiple of 5" : "number is not-multiple of 5");

        // 3-digit
        System.out.println(numbs > 100 && numbs < 999 ? "number is a 3-DIGIT no" : "number is not a 3-DIGIT no");

        input.close();
    }
}