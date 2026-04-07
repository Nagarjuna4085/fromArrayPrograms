package stringprograms;

public class CompareStringBuffer {
    public static void main(String[] args) {
        String str1 = "example.com";
        String str2 = "Example.com";
        
        // Creating a StringBuffer with the same text as str1
        StringBuffer sb = new StringBuffer("example.com");

        // 1. Comparing identical content
        boolean result1 = str1.contentEquals(sb);
        System.out.println("Comparing " + str1 + " and " + sb + ": " + result1);

        // 2. Comparing different content (Case Difference)
        boolean result2 = str2.contentEquals(sb);
        System.out.println("Comparing " + str2 + " and " + sb + ": " + result2);
    }
}