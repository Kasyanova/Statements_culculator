package com.max.idea;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double one = in.nextDouble();

        System.out.println("Введите второе число: ");
        double two = in.nextDouble();

        System.out.println("Введите знак (‘+’, ‘-’, ‘*’ или ‘/’): ");
        char symb = in.next().charAt(0);

        double res = 0;
        switch (symb) {
            case '+':
                res = one+two;
                break;
            case '-'  :
                res = one-two;
                break;
            case '*'  :
                res = one*two;
                break;
            case '/'  :
                res = one/two;
                break;
        }
        System.out.println(res);

    }
}