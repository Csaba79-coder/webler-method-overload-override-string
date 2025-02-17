package stringmanipulation;

import stringmanipulation.value.Color;

public class Main {

    public static void main(String[] args) {

        Color redEnum1 = Color.RED;
        Color redEnum2 = Color.RED;
        System.out.println(redEnum1);
        System.out.println(redEnum2);
        boolean isRedEnumEquals = (redEnum1.equals(redEnum2));
        System.out.println(isRedEnumEquals);
        String red = "red";
        String redEnum = String.valueOf(Color.RED);
        if (red.equalsIgnoreCase(redEnum)) {
            System.out.println("Red enum egyenlő a red stringel");
        } else {
            System.out.println("Red enum nem egyenlő a red stringgel");
        }
        if (red.toUpperCase().equals(redEnum)) {
            System.out.println("Red enum egyenlő a red stringel");
        }

        System.out.println(Color.SPRING_GREEN);
    }
}
