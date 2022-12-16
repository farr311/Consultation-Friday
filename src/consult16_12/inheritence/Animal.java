package consult16_12.inheritence;

public class Animal {

    public String name;
    public String breed;
    public int age;
    public int weight;
    public int height;
    public boolean isFemale;
    public int speed;

    public Animal(String name, String breed, int age, int weight, int height, boolean isFemale, int speed) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.isFemale = isFemale;
        this.speed = speed;
    }

    public void makeSound() {
        System.out.println("...");
    }

    public int move(int time) {
        return speed * time;
    }
}
