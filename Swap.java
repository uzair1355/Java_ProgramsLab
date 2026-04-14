// Write a Java program to swap two variables with or without third variable.

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Ist no");
        double x = scanner.nextDouble();
        System.out.println("Enter 2nd no");
        double y = scanner.nextDouble();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Swap using two numbers x and y respectively " + x +" "+y);

        System.out.println("Enter Ist no");
        double m = scanner.nextDouble();
        System.out.println("Enter 2nd no");
        double n = scanner.nextDouble();
        double temp;
        temp = m;
        m = n;
        n = temp;

        System.out.println("Swap using temp numbers x and y respectively " + m +" "+ n);

    }

}
