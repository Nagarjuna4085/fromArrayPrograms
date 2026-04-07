package stringprograms;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String author1 = "Stephen Edwin King";
        String author2 = "Walter Winchell";
        String author3 = "stephen edwin king";

        // 1. Comparing different names
        boolean match1 = author1.equalsIgnoreCase(author2);
        System.out.println("\"" + author1 + "\" equals \"" + author2 + "\"? " + match1);

        // 2. Comparing same name with different casing
        boolean match2 = author1.equalsIgnoreCase(author3);
        System.out.println("\"" + author1 + "\" equals \"" + author3 + "\"? " + match2);
    }
}