import java.util.Scanner;

public class Arrayoper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double avg = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);

        sc.close();
    }
}