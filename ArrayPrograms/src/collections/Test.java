package collections;

public class Test {
	public static void main(String[] args) {
		String[] array = { "apple", "mango", "banana", "mango" };
		String[] newArray = new String[array.length];
		int newArrayIndex = 0; // Tracks where to insert the next unique element

		for (int i = 0; i < array.length; i++) {
			String currentElement = array[i];
			boolean exists = false;

			// Manual "contains" check
			for (int j = 0; j < newArrayIndex; j++) {
				if (currentElement.equals(newArray[j])) {
					exists = true;
					break;
				}
			}

			// If not found, add it to newArray
			if (!exists) {
				newArray[newArrayIndex] = currentElement;
				newArrayIndex++;
			}
		}

		// Print only the non-null elements
		System.out.println("Unique Elements:");
		for (int i = 0; i < newArrayIndex; i++) {
			System.out.println(newArray[i]);
		}
	}
}