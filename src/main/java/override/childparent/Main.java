package override.childparent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.greeting();
        Child child = new Child();
        child.greeting();
        Object parentObject = new Parent();
        //parentObject.greeting(); // ilyen nincs a szülőben!!!
        // Object esetében equals, toString és a hashCode metódusok vannak! 3 nagyon alap!
        boolean isEqual = parentObject.equals(parent);
        System.out.println(isEqual);
        // List<Integer> nums = new LinkedList<>(); //new ArrayList<>();
        // ArrayList<Integer> numbers = new ArrayList<>();
    }
}
