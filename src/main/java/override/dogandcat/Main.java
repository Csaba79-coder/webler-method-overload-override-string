package override.dogandcat;

import override.dogandcat.model.Animal;
import override.dogandcat.model.Cat;
import override.dogandcat.model.Dog;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.giveNoise(); // Hello, I am an animal! ... eh eh eh
        int counter = Animal.numberOfAnimal; // statikus változó osztály példányositása nélkül
        int age = animal.age; // osztály mezőjét pedig a példányon keresztül érem el példányositás után!
        System.out.println(counter);
        System.out.println(age);
        new Animal().giveNoise();
        System.out.println(animal); // itt a coubter már 2
        Dog dog = new Dog();
        dog.giveNoise();
        System.out.println(dog);
        Cat cat = new Cat();
        cat.giveNoise();
        System.out.println(cat);
        System.out.println("---------------------------------");
        Dog currentDog = new Dog();
        String result = currentDog.canIReachObjectMethods(100);
        System.out.println(result);
        System.out.println("---------------------------------");
        Dog currDog = new Dog();
        String res = currDog.canIReachObjectMethods();
        System.out.println(res);
    }
}
