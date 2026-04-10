package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ClassicRead {
    public static void main(String[] args) {
        File file = new File("C:/data/image.jpg");
        byte[] bFile = new byte[(int) file.length()];

        // 'Try-with-resources' automatically closes the stream for us
        try (FileInputStream fis = new FileInputStream(file)) {
            
            // Read the data into the byte array
            fis.read(bFile);
            
            System.out.println("Read " + bFile.length + " bytes manually.");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
