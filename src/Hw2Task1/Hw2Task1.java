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
        boolean stop = true;
        float title = 0f;

        // processing display result
        System.out.println("Введите значение float (0,0):");
        while (stop) {
            if(scanner.hasNextFloat()){
                title = scanner.nextFloat();
                System.out.println(title);
                stop = false;
            } else {
                System.out.println("Введенные данные = " + title + "," + "неверные, введите значение снова");
            }
        }
    }
//        while (stop) {
//            if(scanner.hasNextFloat()){
//                title = scanner.nextFloat();
//                System.out.println(title);
//                stop = false;
//            } else {
//                System.out.println("Введенные данные = " + title + "," + "неверные, введите значение снова");
//            }
//        }
    }

