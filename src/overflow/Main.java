package overflow;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        byte a = 127;

        System.out.println(a);

        System.out.println(a + 1);  // сумма приводится к integer, поэтому переполнение не происходит
        System.out.println(a + 42); // int c = a + 42;

        System.out.println("Integer overflow");
        System.out.println(a + Integer.MAX_VALUE);

        a += 1; // a = a + 1  byte переполняется (переменная a не может содержать значение > 127)

        System.out.println(a);


        long l = Long.MAX_VALUE;

        System.out.println("+".repeat(100));

        System.out.println(l);
        System.out.println(l + 1);  // long переполняется, никакого приведения типов не происходит

        System.out.println((long) Integer.MAX_VALUE + Integer.MAX_VALUE);

        int x = 10;
        String s = "test";
        boolean y = true;

        //BigInteger b = new BigInteger("1359187139851938519385713957315713985713987195375317798769842649749");
        //System.out.println(b.multiply(new BigInteger("13513713713517393195135175")));

        // boolean < byte < short == char < int == float < long == double

        //TODO
        // 1. Создать глобальную переменную Scanner (так же как в дз)
        // 2. Считать 3 значения из консоли в методе main
        // 3. Передать эти 3 значения в метод findMin(int a, int b, int c)
        // 4. Найти меньшее значение из 3
        // 5. Вернуть это значение
        // 6. В методе main вывести полученное значение в консоль
    }
}
