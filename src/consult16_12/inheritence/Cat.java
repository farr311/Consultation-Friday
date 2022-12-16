package consult16_12.inheritence;

public class Cat extends Animal {


    public Cat(String name, String breed, int age, int weight, int height, boolean isFemale, int speed) {
        super(name, breed, age, weight, height, isFemale, speed);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
