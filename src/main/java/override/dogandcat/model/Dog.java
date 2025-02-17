package override.dogandcat.model;

public class Dog extends Animal {

    public Dog() {
        super();
        age = 5;
    }

    @Override
    public void giveNoise() {
        System.out.println("Hello, I am a dog! ... woof woof woof");
        System.out.println("I am " + age + " years old");
        System.out.println("Number of animals: " + numberOfAnimal);
    }

    public String canIReachObjectMethods(int age) {
        super.giveNoise();
        this.age = age;
        return "I am (this) " + this.age + " years old. And I am (super) " + super.age + " years old";
    }

    public String canIReachObjectMethods() {
        this.giveNoise();
        return "I am (this) " + this.age + " years old. And I am (super) " + super.age + " years old";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", number of animals=" + numberOfAnimal +
                '}';
    }
}
