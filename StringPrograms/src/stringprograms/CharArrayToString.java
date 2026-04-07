package stringprograms;

public class CharArrayToString {
    public static void main(String[] args) {
        // 1. Create a character array
        char[] charArray = {'T', 'h', 'e', ' ', 'b', 'o', 'o', 'k', ' ', 
                            'c', 'o', 'n', 't', 'a', 'i', 'n', 's', ' ', 
                            '2', '3', '4', ' ', 'p', 'a', 'g', 'e', 's', '.'};

        // 2. Create a new String object using the array
        String str = new String(charArray);

        // 3. Display the result
        System.out.println(str);
    }
}