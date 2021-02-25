package main.java.com.mun.automated.fundamentals;

/*
Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
и вывести результат на консоль.
*/

public class MainTask4 {
    public static void main(String[] args) {
        int sum = 0;
        int multiplication = 1;

        for (String x : args) {
            try {
                sum += Integer.parseInt(x);
                multiplication *= Integer.parseInt(x);
            } catch (NumberFormatException e) {
                System.out.println(x + " - is not number!");
            }
        }

        System.out.println("sum = " + sum);
        System.out.println("multiplication = " + multiplication);
    }
}
