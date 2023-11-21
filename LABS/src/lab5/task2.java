package lab5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class task2 {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream inputStream = new FileInputStream("src/lab5/first.txt");
            FileOutputStream outputStream = new FileOutputStream("src/lab5/second.txt");
            byte[] bytes = new byte[inputStream.available()];
            int length;
            while ((length = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, length);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Founded");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
    }
}
}