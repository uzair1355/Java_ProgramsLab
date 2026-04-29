import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int odd_terms = 0;
        int even_terms = 0;

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                even_terms++;
            } else {
                odd_terms++;
            }
        }

        for (int k = arr.length - 1; k >= 0; k--) {
            System.out.print(arr[k] + " ");
        }

        System.out.println("\nAnd even / odd no of terms : " + even_terms + " " + odd_terms);

        sc.close();
    }
}