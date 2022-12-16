package consult16_12.inheritence;

public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat_name", "scottish", 3, 4, 38, true, 1);
        Dog dog = new Dog("Dog_name", "Irish wolfhound", 4, 20, 60, false, 2);
        Snail snail = new Snail("Dog_name", "Irish wolfhound", 4, 20, 60, false, 2);

        cat.makeSound();
        dog.makeSound();
        snail.makeSound();
    }
}
