package ru.synergyitacademy.lesson3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Test phyria = new Test();
        phyria.display();

    }
}

class Test {
    Scanner scanner = new Scanner(System.in);

    public int F(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return F(n - 1) + F(n - 2);
    }

    void display() {
        System.out.print("введите  n-ый член последовательности Фибоначчи: ");
        System.out.println(F(scanner.nextInt()));
    }
}