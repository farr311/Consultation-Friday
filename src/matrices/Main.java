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

        int[] left = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] right = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};


        int n = 9;
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

            System.out.println(s);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
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

    static String repeatSpaces(int count) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(" ");
        }
        return s.toString();
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
