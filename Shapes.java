
import java.util.Scanner;

public class Shapes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enrter sides of Rectanle🍕");
        System.out.println("Enter Ist side of Rectanle");
        double x = scanner.nextDouble();
        System.out.println("Enter 2nd side of Rectangle");
        double y = scanner.nextDouble();
        System.out.println("Area of Rectangle is" + (x * y) + "and Perimeter is " + (2 * (x + y)));
        System.out.println("Enter radius of Circle😊");
        double r = scanner.nextDouble();
        System.out.println("Area of Circle is" + (3.14 * r * r) + "Perimeter is " + (2 * 3.14 * r));

    }

}
