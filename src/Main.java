import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println(function(5));
        System.out.println(function(6));
        System.out.println(function(8));

        int value = function(10);
        int v2 = procedure(10);

        procedure(5);
        procedure(6);
        procedure(8);


        test();*/

        Test.performStaticAction();     // Вызов статического метода у объекта класса
        Test t = new Test();            // Создание экземпляра класса Test
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();
        t.performAction();              // Вызов экземплярного метода у объекта t (экземпляра класса Test)


        // Класс -- шаблон, на основе которого создаются объекты, которыми мы можем оперировать в Java
        // Экземпляр -- объект, сконструированный на основе шаблона (класса)
        // Метод -- функция (либо процедура), которая привязана к объекту.
        //      В Java все функции (и процедуры) являются методами, так как они привязаны к объектам
        // Конструктор -- специальный метод, который позволяет создать экземпляр класса
        // void -- ключевое слово, которое указывает, что метод не возвращает ничего (что соответствует логике работы процедуры)
        // static -- ключевое слово, которое используется для вызова методов в main напрямую
        //                           которое используется для вызова методов, привязанных к классу, а не к его экземплярам



        //t.performStaticAction();

        //Test t2 = new Test();

        int a = function(5);
        a += 42; // a = a + 42;

        System.out.println(a);
        procedure(5);
    }

    static int function(int a) {
        return a * 2;
    }

    /*static Test getTest() {

    }*/


    static void test() {
    }

    static void procedure(int a) {
        System.out.println(a * 2);
    }
}