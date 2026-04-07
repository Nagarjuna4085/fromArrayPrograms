package stringprograms;

public class CompareStringsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // This method ignores whether letters are Capital or Small
        int result = str1.compareToIgnoreCase(str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\" is less than \"" + str2 + "\"");
        } else if (result == 0) {
            // In this case, 'e' and 'E' are treated as equal
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is greater than \"" + str2 + "\"");
        }
    }
}