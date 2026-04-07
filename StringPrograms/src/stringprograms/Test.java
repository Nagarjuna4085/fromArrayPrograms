package stringprograms;

public class Test {
    public static void main(String[] args) {
        // String contains 4 standard chars and 1 emoji (which uses 2 slots)
        String str = "Java🚀";

        System.out.println("String: " + str);
        System.out.println("Total Memory Slots (length): " + str.length()); // Outputs 6
        System.out.println("------------------------------------");

        int i = 0;
        int count = 0;

        while (i < str.length()) {
            count++;
            
            // 1. Get the Unique Digital ID (Code Point)
            int cp = str.codePointAt(i);
            
            // 2. Determine how many memory slots this ID occupies
            int memorySlots = Character.charCount(cp);
            
            // 3. Print the result (Fixed the print statement here)
            System.out.println("Char #" + count + ": " + Character.toString(cp) + 
                               " | ID: " + cp + 
                               " | Memory Slots Used: " + memorySlots +
                               " | Current Index: " + i);

            // 4. THE MAGIC STEP: 
            // This ensures we jump over the extra slot if the character is 'heavy'
            i += memorySlots;
        }
        
        System.out.println("------------------------------------");
        System.out.println("Actual Human-Readable Count: " + count); // Outputs 5
    }
}