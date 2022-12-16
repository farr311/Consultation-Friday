package findmin;

import java.util.Scanner;

public class Main {

    //TODO
    // 1. Создать глобальную переменную Scanner (так же как в дз)
    // 2. Считать 3 значения из консоли в методе main
    // 3. Передать эти 3 значения в метод findMin(int a, int b, int c)
    // 4. Найти меньшее значение из 3
    // 5. Вернуть это значение
    // 6. В методе main вывести полученное значение в консоль

    //TODO
    // 1. Создать глобальную переменную Scanner (так же как в дз)
    // 2. Считать 3 значения из консоли в методе main
    // 3. Передать эти 3 значения в метод findMax(int a, int b, int c)
    // 4. Найти большее значение из 3
    // 5. Вернуть это значение
    // 6. В методе main вывести полученное значение в консоль

    static Scanner scanner = new Scanner(System.in); // 1. Создать глобальную переменную Scanner

    public static void main(String[] args) {
        int a = scanner.nextInt();  // 2. Считать 3 значения из консоли в методе main
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = findMin(a, b, c);   // 3. Передать эти 3 значения в метод findMin(int a, int b, int c)

        System.out.println(d);  // 6. В методе main вывести полученное значение в консоль
    }

    static int findMin(int a, int b, int c) {
        // 4. Найти меньшее значение из 3
        if (a <= b && a <= c) {
            return a;    // 5. Вернуть это значение
        } else if (b <= c) {
            return b;    // 5. Вернуть это значение
        } else {
            return c;     // 5. Вернуть это значение
        }
    }

    static int findMin2(int a, int b, int c) {
        return Math.min(Math.min(a, b), Math.min(b, c)) ;
    }
}
