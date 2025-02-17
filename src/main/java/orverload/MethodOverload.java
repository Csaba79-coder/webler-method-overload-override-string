package orverload;

public class MethodOverload {

    public static void main(String[] args) {
        double num1 = 2.0;
        int num2 = 5;
        double result = add(num1, num2);
        System.out.println(result);
        int res = add(num2, num1);
        System.out.println(res);
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static double add(double number1, int number2) {
        return Double.parseDouble(String.valueOf(number1)) + number2;
    }

    private static int add(int number1, double number2) {
        return (int) (number1 + number2);
    }

    // https://www.geeksforgeeks.org/5-ways-to-convert-double-to-integer-in-java/
    /*private static long add(double num1, double num2) {
        return Math.round(num1) + Math.round(num2);
    }*/
    /*private static int add(double num1, double num2) {
        return (int) Math.round(num1) + (int) Math.round(num2);
    }*/
    private static int add(double num1, double num2) {
        return (int) (Math.round(num1) + Math.round(num2));
    }

    private static int add(int number1, String number2) {
        int number = Integer.parseInt(number2); // TODO ezzel hasonlítani!
        return number + number1;
        //return Integer.parseInt(number1 + number2); // TODO megnézni, hogy van-e különbség!
    }

    private static String add(String number1, int number2) {
        return number1 + number2;
    }

    private static int add() {
        return 1000;
    }

    // ezzel azt szerettem volna szimbolizálni, hogy akár nulla, vagy bármennyi String is lehet ...
    private static String add(String... args) {
        return null;
    }

    private static String add(String txt1, String txt2) {
        return txt1 + txt2;
    }

    private static String add(String text1, int num1, int num2, String text2) {
        return text1 + num1 + num2 + text2;
    }
}
