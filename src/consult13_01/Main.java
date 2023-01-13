package consult13_01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = scanner.nextDouble();
        String breed = scanner.next();
        String color = scanner.next();
        int age = scanner.nextInt();

        if (weight > 6) {
            System.out.println("Too fat!");
        }

        Cat cat1 = new Cat(breed, age, weight, color);

        System.out.println(cat1);

        /*Cat cat1 = new Cat("Scottish fold", 5, 4.4, "Light gray");
        Cat cat2 = new Cat("Scottish straight", 7, 6.4, "Black");

        Cat cat3 = new Cat("Scottish straight", 3, 6.4, "Black");

        System.out.println(cat1);
        System.out.println(cat2);*/
    }
}
