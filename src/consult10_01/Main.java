package consult10_01;


// 1. Создать класс ThisTest
// 2. Объявить поле private String name
// 3. Объявить конструктор, который будет получать name и устанавливать значение аргумента name в поле name
// 4. Создать метод thisGetName(), который будет возвращать name, используя this
// 5. Создать метод getName(ThisTest t), который будет возвращать name, не используя this через t
// 6. В методе main вывести в консоль результаты выполнения обоих методов у объекта ThisTest

public class Main {
    public static void main(String[] args) {
        ThisTest t = new ThisTest("Test");
        System.out.println(t.getName(t));
        System.out.println(t.thisGetName());
    }
}

class ThisTest {
    private String name;

    public ThisTest(String name) {
        this.name = name;
    }

    public String thisGetName() {
        return this.name;
    }

    public String getName(ThisTest t) {
        return t.name;
    }
}
