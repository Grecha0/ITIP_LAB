package lab5;


import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomInputMismatchException {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        try{
            int number = Integer.parseInt(scan.nextLine());
            System.out.println("Вывод: " + number);
            scan.close();
        } catch (InputMismatchException ex){
            System.out.println("Enter number");
        } catch (NumberFormatException ex){
            System.out.println("Введенное значение не является числом!");
        }
    }
}