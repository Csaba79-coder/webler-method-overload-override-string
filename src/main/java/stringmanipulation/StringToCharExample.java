package stringmanipulation;

public class StringToCharExample {

    // https://www.lipsum.com/ <- Lorem Ipsum generátor

    public static void main(String[] args) {
        String ipsum = "What is Lorem Ipsum?\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the " +
                "industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and " +
                "scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap " +
                "into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the " +
                "release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing " +
                "software like Aldus PageMaker including versions of Lorem Ipsum.";

        System.out.println("A szöveg hossza: " + ipsum.length());
        int index = 2;
        int unicode = stateOfCharAt(ipsum, index);
        System.out.println(unicode);
        int nonExistingIndex = 10000;
        int res = stateOfCharAt(ipsum, nonExistingIndex);
        System.out.println(res);

        char[] letters = ipsum.toCharArray();
        int counter = 0;
        char character = 'a';
        for (char letter : letters) {
            if (letter == character) {
                counter++;
            }
        }
        System.out.println(counter);

        String word = "Hello World";
        int countWord = word.split(" ").length;
        System.out.println(countWord);
    }

    // https://en.wikipedia.org/wiki/List_of_Unicode_characters

    private static int stateOfCharAt(String str, int index) {
        if (index < 0 || index > str.length() - 1) {
            return -1;
        }
        return str.codePointAt(index);
        // return str.charAt(index); // háttérben a char-t int-é alakítja!
    }
}
