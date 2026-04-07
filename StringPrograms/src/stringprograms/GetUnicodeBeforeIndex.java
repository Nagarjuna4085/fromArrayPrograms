package stringprograms;

public class GetUnicodeBeforeIndex {
    public static void main(String[] args) {
        // Original String from sample
        String str = "ramaresource.com";
        
        System.out.println("Original String : " + str);

        // 1. Get Unicode before index 1 (the 'r')
        int val1 = str.codePointBefore(1);

        // 2. Get Unicode before index 10 (the 'u')
        int val2 = str.codePointBefore(10);

        // Displaying results
        System.out.println("Character(unicode point) before index 1 = " + val1);
        System.out.println("Character(unicode point) before index 10 = " + val2);
    }
}