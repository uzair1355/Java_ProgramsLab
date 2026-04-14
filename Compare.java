
import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Ist no");
        double m = scanner.nextDouble();
        System.out.println("Enter 2nd no");
        double n = scanner.nextDouble();
        if (m == n) {
            System.out.println(" Both are Equal");
        } else if (m > n) {
            System.out.println("Ist no is Greatest");
        } else {
            System.out.println("2nd is Greatest");
        }
    }

}
