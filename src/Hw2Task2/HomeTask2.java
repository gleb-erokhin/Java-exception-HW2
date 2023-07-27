package Hw2Task2;

<<<<<<< HEAD
/**
 * Задание 2
 * try {
 *    int d = 0;
 *    double catchedRes1 = intArray[8] / d;
 *    System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *    System.out.println("Catching exception: " + e);
 * }
 * */
=======
>>>>>>> 92994126d1efc44e329a6bfa47c6bca8e136a7fe
import java.util.Arrays;

public class HomeTask2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            double[] intArray = new double[9];
//            intArray[1] = 6.3;
            double catchedRes1 = intArray[1] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
// В связи с тем что в массиве используются числа типа Double исключение в 13 строке никогда не будет вызвано,
// это связано с обработкой вещественных чисел в java на уровне распределения памяти, так как для вещественных чисел
// сущестует понятие NaN (что мы получаем сейчас) и INFINITY (появится если установить не нулевое значение элемента
// массива как в строке 10.
    }
}
