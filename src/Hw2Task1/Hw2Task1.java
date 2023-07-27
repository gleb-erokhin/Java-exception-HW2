package Hw2Task1;

import java.util.Scanner;
/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 * */
public class Hw2Task1 {
    public static void main(String[] args) {
        // read input data
        Scanner scanner = new Scanner(System.in);
        float title = 0f;

        // processing display result
        System.out.println("Введите значение float (0,0):");
        while (scanner.hasNext()) {
            if(scanner.hasNextFloat()){
                title = scanner.nextFloat();
                break;
            } else {
                String input = scanner.next();
                System.out.println("Введенные данные = " + input + "," + "неверные, введите значение снова");
                }
            }
        System.out.println(title);
        scanner.close();
        }
    }



