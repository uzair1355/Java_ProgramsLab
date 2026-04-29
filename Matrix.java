import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {

        // 2 1D arrays
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {5, 4, 6, 8, 0};

        // merge to 2D
        int[][] arr2D = {arr, arr1};

        // merged 1D array
        int[] merged = new int[arr.length + arr1.length];

        int k = 0;

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                merged[k] = arr2D[i][j];
                k++;
            }
        }

        Arrays.sort(merged);

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}