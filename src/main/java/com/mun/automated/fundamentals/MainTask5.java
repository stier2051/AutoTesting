package main.java.com.mun.automated.fundamentals;

/*
Ввести число от 1 до 12. Вывести на консоль название месяца,
соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */

public class MainTask5 {
    public static void main(String[] args) {
        try {
            System.out.println(getMonth(Integer.parseInt(args[0])));
        } catch (NumberFormatException e) {
            System.out.println("incorrect value");
        }
    }

    public static String getMonth(int number) {
        return switch (number) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "value is unknown!";
        };
    }
}
