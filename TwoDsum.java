import java.util.Scanner;

public class TwoDsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();

        int[][] arr2D = new int[n][m];

        int sum = 0;

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        // Row sum
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr2D[i][j];
            }
            System.out.println("Sum of row = " + sum);
        }

        // Column sum
        for (int j = 0; j < m; j++) {
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr2D[i][j];
            }
            System.out.println("Sum of column = " + sum);
        }

        sc.close();
    }
}