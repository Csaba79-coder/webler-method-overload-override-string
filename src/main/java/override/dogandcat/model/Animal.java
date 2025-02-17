package override.dogandcat.model;

public class Animal {

    public int age = 10; // erre a this kulcsszóval lehet hivatkozni
    public static int numberOfAnimal = 0; // célja egy counter!

    public Animal() {
        numberOfAnimal++;
    }

    public void giveNoise() {
        System.out.println("Hello, I am an animal! ... eh eh eh");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", number of animals=" + numberOfAnimal +
                '}';
    }
}
