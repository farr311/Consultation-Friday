package matrices;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] a = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
        };

        int[][] arr = generateArray();
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }*/

        int[] left = {1, 2, 3, 4, 5};
        int[] right = {6, 7, 3, 8, 9};


        int n = 5;
        for (int i = 0; i < n; i++) {
            int headSpaceCount;

            if (i <= n / 2) {
                headSpaceCount = i;
            } else {
                headSpaceCount = n - i - 1;
            }

            int tailSpaceCount = headSpaceCount;
            int middleSpaceCount = n - headSpaceCount * 2 - 2;

            //TODO: используя код выше, написать логику расчета leftValue и rightValue
            int leftValue = 0;
            int rightValue = 0;

            String s;

            if (i == n / 2) {
                s = " ".repeat(headSpaceCount) + leftValue + " ".repeat(tailSpaceCount);
            } else {
                s = " ".repeat(headSpaceCount) + leftValue + " ".repeat(middleSpaceCount) + rightValue
                        + " ".repeat(tailSpaceCount);
            }

            System.out.println(s);
        }

        //TODO: Написать алгоритм расчета headSpaceCount, используя n и i
        //  0
        //  1
        //  2
        //  1
        //  0
        /*int n = 5;

        for (int i = 0; i < n; i++) {
            int headSpaceCount;

            if (i <= n / 2) {
                headSpaceCount = i;
            } else {
                headSpaceCount = n - i - 1;
            }


            System.out.println(headSpaceCount);
        }*/




        /*System.out.println("1");
        System.out.println(" 2");
        System.out.println("  3");
        System.out.println("   4");
        System.out.println("    5");*/
    }

    static int[][] generateArray() {
        Random r = new Random();

        int n = 5;

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = r.nextInt(100);
            }
        }

        return arr;
    }
}
