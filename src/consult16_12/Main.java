package consult16_12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 2;

        String operator = scanner.next();

        String s = "+";
        char s2 = '+';

        switch (operator) {
            case "+": {
                System.out.println(a + b);
                break;
            }
            case "-": {
                System.out.println(a - b);
                break;
            }
            case "*": {
                System.out.println(a * b);
                break;
            }
            case "/": {
                System.out.println(a / b);
                break;
            }
            default: {
                System.out.println("Error!");
            }
        }

        if (operator.equals("+")) {
            System.out.println(a + b);
        } else if (operator.equals("-")) {
            System.out.println(a - b);
        } else if (operator.equals("*")) {
            System.out.println(a * b);
        } else if (operator.equals("/")) {
            System.out.println(a / b);
        } else {
            System.out.println("Error!");
        }
    }

}
