package ru.gb;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. 
 * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
 * необходимо повторно запросить у пользователя ввод данных.
 */
import java.util.Scanner;
 public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        float value;

        do {
            System.out.println("Введите дробное число: ");
            if (!scanner.hasNextFloat()) {
                System.out.println("Ошибка ввода. Это не дробное число!");
                System.out.println("Повторите ввод.");
                scanner.next();
            }
        } while (!scanner.hasNextFloat());

        value = scanner.nextFloat();
        System.out.println("Вы ввели число => " + value);
        scanner.close();
    }
}
