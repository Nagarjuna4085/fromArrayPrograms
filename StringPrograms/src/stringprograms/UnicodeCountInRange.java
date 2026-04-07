package stringprograms;

public class UnicodeCountInRange {
    public static void main(String[] args) {
        // Original String from sample
        String str = "ramaresource.com";
        
        System.out.println("Original String : " + str);

        // We want to count code points in a specific range
        // For example: from index 1 to 10
        int startIndex = 1;
        int endIndex = 10;

        // The method returns the number of Unicode code points in the range
        int count = str.codePointCount(startIndex, endIndex);

        // Displaying results
        System.out.println("Codepoint count from index " + startIndex + " to " + endIndex + " = " + count);
        
        
        String str1 = "Java🚀";
     // Start at index 1 ('a'), Stop before index 4 ('🚀')
     int count1 = str1.length()	; 

     // It counts 'a', 'v', 'a'
     System.out.println(count1); // Output: 3
    }
}