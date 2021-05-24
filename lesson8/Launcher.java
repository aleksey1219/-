package ru.synergyitacademy.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Launcher {
    public static void main(String[] args) {
try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
while (true){
    System.out.print("Введите значение температуры ");
    Double temp =Double.parseDouble(br.readLine());
    System.out.println("Выберите конвертер (1-6): ");
    System.out.println("Из Цельсий в Фаренгейт (1):");
    System.out.println("Из Цельсий в Кельвин   (2):");
    System.out.println("Из Фаренгейт в Цельсий (3):");
    System.out.println("Из Фаренгейт в Кельвин (4):");
    System.out.println("Из Кельвин в Цельсий   (5):");
    System.out.println("Из Кельвин в Фаренгейт (6):");
    int select= Integer.parseInt(br.readLine());
    switch (select){
        case 1:
if (temp>=-273.0){
    System.out.println("Результат: " + temp + " С = " + Converter.getConverter(Temperature.FAR).convert(temp) + " F");
} else {
    System.out.println("Значение температуры не может быть меньше -273 С");
}
            break;
        case 2:
            if (temp >= -273.0) {
                System.out.println("Результат: " + temp + " С = " + Converter.getConverter(Temperature.KELV).convert(temp) + " K");
            } else {
                System.out.println("Значение температуры не может быть меньше -273 С");
            }
            break;
        case 3:
            if (temp >= -459.4) {
                System.out.println("Результат: " + temp + " F = " + Converter.getConverter(Temperature.FAR_CELS).convert(temp) + " C");
            } else {
                System.out.println("Значение температуры не может быть меньше 459.4 F");
            }
            break;
        case 4:
            if (temp >= -459.4) {
                System.out.println("Результат: " + temp + " F = " + Converter.getConverter(Temperature.FAR_KELV).convert(temp) + " K");
            } else {
                System.out.println("Значение температуры не может быть меньше -459.4 F");
            }
            break;
        case 5:
            if (temp >= 0) {
                System.out.println("Результат: " + temp + " K = " + Converter.getConverter(Temperature.KELV_CELS).convert(temp) + " C");
            } else {
                System.out.println("Значение температуры не может быть меньше 0 K");
            }
            break;
        case 6:
            if (temp >= 0) {
                System.out.println("Результат: " + temp + " K = " + Converter.getConverter(Temperature.KELV_FAR).convert(temp) + " F");
            } else {
                System.out.println("Значение температуры не может быть меньше 0 K");
            }
            break;
        default: System.out.println("Неправильно выбран конвертер");
            break;
    }
    System.out.print("Закрыть программу? (exit): ");
    if (br.readLine().equals("exit")) {
        break;
    }
    System.out.println();
}
} catch (IOException e) {
    System.out.println("не корректное значение");
}

    }
}
