package ru.synergyitacademy.lesson3;

import java.util.Scanner;

public class BaseConstructions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три коэффициенты a, b, c квадратного уравнения (a*x^2 + b*x + c = 0). ");
        double a, b, c, D;
        System.out.print("a: ");
        a = scanner.nextDouble();
        System.out.print("b: ");
        b = scanner.nextDouble();
        System.out.print("c: ");
        c = scanner.nextDouble();
        D = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0 ");
        } else if (D > 0) {
            double x1, x2;
            x1 = -b - Math.sqrt(D) / 2 * a;
            x2 = -b + Math.sqrt(D) / 2 * a;
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / 2 * a;
            System.out.println("x = " + x);
        } else {
            System.out.println("Нет действительных решений уравнения");
        }
    }
}