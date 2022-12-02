package homework;

import java.util.Scanner;

public class Main {
    //TODO
    // Сделать глобальную переменную static Scanner и считать два значения в методе main, передать их в функцию, вычислить
    // их разность и вывести на консоль из метода main

    //TODO
    // 1. Сделать глобальную переменную static Scanner      +
    // 2. считать два значения в методе main                +
    // 3. передать их в функцию                             +
    // 4. вычислить их разность                             +
    // 5. вернуть в main                                    +
    // 6. вывести на консоль из метода main


    // Scanner -- класс для считывания значений из консоли
    static Scanner scanner = new Scanner(System.in);  // 1. Сделать глобальную переменную static Scanner

    public static void main(String[] args) {
        int a = scanner.nextInt();  // 2. считать два значения в методе main
        int b = scanner.nextInt();  // 2. считать два значения в методе main

        // 5. вернуть в main
        int d = calculateDiff(a, b); // 3. передать их в функцию

        // 6. вывести на консоль из метода main
        System.out.println(d);

        //System.out.println(calculateDiff(a, b));
    }

    static int calculateDiff(int a, int b) {
        return a - b;   // 4. вычислить их разность
    }
}
