package stringprograms;

public class GetUnicodeAtIndex {
    public static void main(String[] args) {
        // Original String from sample
        String str = "google.com";
        
        System.out.println("Original String : " + str);

        // 1. Get Unicode at index 1 (the 'o')
        int val1 = str.codePointAt(1);

        // 2. Get Unicode at index 9 (the 'm')
        int val2 = str.codePointAt(9);

        // Displaying results
        System.out.println("Character(unicode point) at index 1 = " + val1);
        System.out.println("Character(unicode point) at index 9 = " + val2);
    }
}