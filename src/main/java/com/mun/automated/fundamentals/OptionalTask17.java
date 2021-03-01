package main.java.com.mun.automated.fundamentals;

/*
Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
 */

import java.util.Random;

public class OptionalTask17 {
    public static void main(String[] args) {

        /* генерим рандомное количество (до 10) рандомных чисел */
        int [] arrayOfNumbers = new int[getRandomInt(1, 10)];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = getRandomInt(1, 100000);
        }

        /* показываем весь список чисел */
        System.out.print("list of numbers: ");
        for (int x : arrayOfNumbers) {
            System.out.print(x + " ");
        }
        /* перебираем список и разбиваем число на цифры */
        for (int x : arrayOfNumbers) {
            boolean isInterrupt = false;
            String str = "" + x;
            char[] ch = str.toCharArray();

            /* перебираем каждую цифру числа */
            for (int i = 0; i < ch.length-1; i++) {
                for (int j = i+1; j < ch.length; j++) {
                    if (ch[i] == ch[j]) {
                        isInterrupt = true;
                        break;
                    }
                }
                if (isInterrupt) break;
            }
            if (!isInterrupt) {
                System.out.println();
                System.out.println("result: " + x);
                break;
            }
        }
    }

    public static int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
