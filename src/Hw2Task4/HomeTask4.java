package Hw2Task4;

import java.util.Scanner;

/**Разработайте программу,
 * которая выбросит Exception, когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 * */
public class HomeTask4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String string = in.nextLine();
        string = string.trim();
        if(string.isEmpty())
            throw new IllegalArgumentException("Строка пустая!");
        else
            System.out.println(string);

    }
}
