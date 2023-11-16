package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        File file = new File("D:/ITIP_LABS/LABS/src/lab5/second.txt");
        try{
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e){
            System.out.println("File Not Founded");
        } catch (java.lang.IllegalStateException e){
            System.out.println("Reading error");
        }
    }
}