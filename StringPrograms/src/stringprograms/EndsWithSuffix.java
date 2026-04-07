package stringprograms;

public class EndsWithSuffix {
    public static void main(String[] args) {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";
        String suffix = "se";

        // 1. Check if "Python Exercises" ends with "se"
        // Result is false because it ends with "s"
        boolean result1 = str1.endsWith(suffix);
        System.out.println("\"" + str1 + "\" ends with \"" + suffix + "\"? " + result1);

        // 2. Check if "Python Exercise" ends with "se"
        // Result is true
        boolean result2 = str2.endsWith(suffix);
        System.out.println("\"" + str2 + "\" ends with \"" + suffix + "\"? " + result2);
    }
}