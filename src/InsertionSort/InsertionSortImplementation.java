package InsertionSort;

import java.util.Arrays;

public class InsertionSortImplementation {
    public static void main(String[] args) {
        // new InsertionSortImplementation().run(new int[] { 1, 4, 2, 5, 8, 0, 4, 8, 3, 8, 9 });
        // new InsertionSortImplementation().run(new int[] { 9, 1, 2, 3, 4, 5, 6, 7, 8 });
        new InsertionSortImplementation().run(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 });
    }

    private void run(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int keyElement = input[i];
            int x = i - 1;
            while (x > -1 && input[x] > keyElement) {
                input[x + 1] = input[x];
                x--;
            }
            input[x + 1] = keyElement;
        }
        System.out.println(Arrays.toString(input));
    }
}
