package fileHandling;

import java.io.File;
import java.io.FilenameFilter;

public class FilterFiles {
    public static void main(String[] args) {
        // 1. Specify the directory and the extension you are looking for
        File dir = new File("C:/Users/USER"); 
        String extension = ".ipynb"; // Change this to .pdf, .txt, etc.

        // 2. Check if the directory exists
        if (dir.exists() && dir.isDirectory()) {
            
//            // 3. Create a filter
//            FilenameFilter filter = (directory, name) -> {
//                return name.toLowerCase().endsWith(extension);
//            };
        	
        	FilenameFilter filter = (directory,name)->{
        		return name.toLowerCase().endsWith(extension);
        	};

            // 4. Pass the filter to the list() method
            String[] filteredList = dir.list(filter);

            if (filteredList != null && filteredList.length > 0) {
                System.out.println("Found " + filteredList.length + " match(es):");
                for (String file : filteredList) {
                    System.out.println(file);
                }
            } else {
                System.out.println("No files found with the extension: " + extension);
            }
        } else {
            System.out.println("Directory not found.");
        }
    }
}