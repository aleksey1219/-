package ru.synergyitacademy.lesson3;

public class LaunchExecutor {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 1; i < n; i++) {
            for (int b = 2; b <= i; b++) {
                if (i % b == 0) {
                    break;
                } else if (i == b + 1) {
                    System.out.println(i);
                }
            }
        }
    }
}
