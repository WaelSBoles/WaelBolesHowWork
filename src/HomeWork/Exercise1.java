package HomeWork;

public class Exercise1 {
    public static void main(String[] args) {
        // The sequence \"  inserts a double quote in a string.
        String statement= " we are so-called \"Christian\" the origin of Egypt";
        System.out.println(statement);
        String txt= " we are \\ Coptic\\ in Egypt";
        System.out.println(txt);

        String newLine=" Hello \n World";
        System.out.println(newLine);

        String tab="new \tworld";
        System.out.println(tab);

        String formFeed="Hello\f world";
        System.out.println(formFeed);
    }
}
