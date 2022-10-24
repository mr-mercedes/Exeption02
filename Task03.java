package ru.ru.exeption.exep002.homework;
/*
Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */

/**
 * Delete Throwable exception on first
 * Add new block try - catch and remove into action with arrays
 */
public class Task03 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }

        try {
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }

    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}

