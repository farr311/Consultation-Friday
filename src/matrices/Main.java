package matrices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] a = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };

        //int[][] arr = generateArray();
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }*/

        int[] left = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] right = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};


        int n = 145;
        outputCross(generateArray(n), generateArray(n), 1);
        /*outputCross(left, right);
        outputCross(left, right);*/
    }

    static void outputCross(int[] left, int[] right, int count) {
        //int n = 9;
        int n = left.length;
        for (int i = 0; i < n; i++) {
            int headSpaceCount;
            if ((n % 2 == 0 && i < n / 2) || (n % 2 == 1 && i <= n / 2)) {
                headSpaceCount = i;
            } else if (n % 2 == 0 && i == n / 2) {
                headSpaceCount = i - 1;
            } else {
                headSpaceCount = n - i - 1;
            }

            int tailSpaceCount = headSpaceCount;
            int middleSpaceCount = n - headSpaceCount * 2 - 2;

            int leftValue;
            if (i <= n / 2) {
                leftValue = left[i];
            } else {
                leftValue = right[i];
            }

            int rightValue;
            if (i <= n / 2) {
                rightValue = right[i];
            } else {
                rightValue = left[i];
            }

            String s;
            if (n % 2 == 1 && i == n / 2) {
                s = repeatSpaces(headSpaceCount) + leftValue + repeatSpaces(tailSpaceCount);
            } else {
                s = repeatSpaces(headSpaceCount) + leftValue + repeatSpaces(middleSpaceCount) + rightValue
                        + repeatSpaces(tailSpaceCount);
            }

            System.out.println(s.repeat(count));

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static String repeatSpaces(int count) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(" ");
        }
        return s.toString();
    }

    static int[] generateArray(int n) {
        Random r = new Random();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(0, 10);
        }

        return arr;
    }
}
