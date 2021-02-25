package main.java.com.mun.automated.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTask1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter name/names");
        String str = reader.readLine();
        String[] names = str.split(" ");
        for (String x : names) {
            System.out.println("Hello " + x);
        }
    }
}
