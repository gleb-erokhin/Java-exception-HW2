package Hw2Task3;

import java.io.FileNotFoundException;

/**
 * public static void main(String[] args) throws Exception {
 *    try {
 *        int a = 90;
 *        int b = 3;
 *        System.out.println(a / b);
 *        printSum(23, 234);
 *        int[] abc = { 1, 2 };
 *        abc[3] = 9;
 *    } catch (Throwable ex) {
 *        System.out.println("Что-то пошло не так...");
 *    } catch (NullPointerException ex) {
 *        System.out.println("Указатель не может указывать на null!");
 *    } catch (IndexOutOfBoundsException ex) {
 *        System.out.println("Массив выходит за пределы своего размера!");
 *    }
 * }
 * public static void printSum(Integer a, Integer b) throws FileNotFoundException {
 *    System.out.println(a + b);
 * }
 * */
public class HomeTask3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
//            Если указать null в значении переменной, то мы всегда будем попадать на NullPointerException и
//            никогда не придем к строке 15, тоже самое будет если строки 19 и 21 поменять местами
            printSum(null, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
//            Убрал в самый низ исключение Throwable, но так как Throwable является родителем для NullPointerException
//            и IndexOutOfBoundsException, то это исключение никогда не сработает
        }  catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

//    в данном методе в выбросе исключения throws FileNotFoundException нет никакого смысла, так как метод printSum
//    и main не работают с файлами
    public static void printSum(Integer a, Integer b)  {
        System.out.println(a + b);
    }

}
