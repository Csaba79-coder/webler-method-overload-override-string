package override.dogandcat.model;

public class Cat extends Animal {

    public Cat() {
        super();
    }

    @Override
    public void giveNoise() {
        System.out.println("Hello, I am a cat! ... meow meow meow");
        System.out.println("I am " + age + " years old.");
        System.out.println("Number of animals: " + numberOfAnimal);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", number of animals=" + numberOfAnimal +
                '}';
    }
}
