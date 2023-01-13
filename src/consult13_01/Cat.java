package consult13_01;

public class Cat {
    private String breed;
    private int age;
    private double weight;
    private String color;

    public Cat(String breed, int age, double weight, String color) {
        this.breed = breed;
        this.age = age;

        if (checkWeight(weight)) {
            this.weight = weight;
        } else {
            throw new RuntimeException("The cat can't be this fat!");
        }

        this.color = color;
    }

    private boolean checkWeight(double weight) {
        return weight <= 6;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
