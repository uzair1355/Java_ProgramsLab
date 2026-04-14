
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.println("Enter firt no");
        double x = s.nextDouble();
        System.out.println("Enter 2nd no");
        double y = s.nextDouble();

        System.out.println("Sum is " + (x + y));
        System.out.println("Sub is " + (x - y));
        System.out.println("Mult is " + (x * y));
        if (y != 0) {

            System.out.println("Division is " + (x / y));
            System.out.println("Remainder is " + (x % y));

        } else {

            System.out.println("Division : cannot divide by zero");
            System.out.println("Remainder: cannot divide by zero");

        }

        s.close();
    }

}
