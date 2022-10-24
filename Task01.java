package ru.ru.exeption.exep002.homework;

import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
пользователя ввод данных.

Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task01 {
    public static void main(String[] args) {
        System.out.print("Enter the float number: ");
        float number = returnFloat();
        System.out.println(number);
    }

    private static float returnFloat() {
        float returnNumber = 0;
        boolean check = true;
        try (Scanner sc = new Scanner(System.in)) {
            while (check) {
                String number = sc.nextLine();
                if (number == null) {
                    throw new RuntimeException("Number is null");
                }
                try {
                    returnNumber = Float.parseFloat(number);
                    check = false;
                } catch (NumberFormatException ex) {
                    System.out.println("Input isn't correct " + ex.getMessage());
                }

            }
        }
        return returnNumber;
    }
}