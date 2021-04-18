package ru.synergyitacademy.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class SwtichRunner {
    public static void main(String[] args) throws Exception {
        BigInteger[] massFib = new BigInteger[2];
        massFib[0] = BigInteger.valueOf(0); // нулевой индекс массива равен 0
        massFib[1] = BigInteger.valueOf(1); // нулевой индекс массива равен 1
        System.out.println("Вывести n-ый член последовательности Фибоначчи");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { //исключение
            while (true) { // вход в цикл (условие)
                System.out.print("Вычисление значения числа Фибоначчи: ");
                int numFib = Integer.parseInt(br.readLine());// запись(буферизация)
                if (numFib < 0) { // условие
                    System.out.println("Введено не корректное значение!");
                } else {
                    if (massFib.length <= numFib) {//Если массив меньше чем необходимо, то мы его увеличиваем
                        int oldmass = massFib.length; // старый размер массива
                        massFib = Arrays.copyOf(massFib, fib(numFib + 1).length);// комирует старый массив c возвращением массива большего разряда
                        for (int i = oldmass; i <= numFib; i++) { //цикл с сохранением
                            massFib[i] = massFib[i - 2].add(massFib[i - 1]); //каждое последующее число равно сумме двух предыдущих чисел
                        }
                    }
                    System.out.println("Значение введенного числа Фибоначчи: " + massFib[numFib]);
                }
                System.out.print("Завершить вычисления? (exit): ");
                if (br.readLine().equals("exit")) { // условие выхода из цикла
                    break;
                }
                System.out.println();
            }
        } catch (Exception e) { //обработка исключения
            System.out.println("Введено не целое число!");
        }
    }

    public static BigInteger[] fib(int numUserFib) {//Метод возвращающий массив наибольшего
        BigInteger[] massUserFib = new BigInteger[numUserFib];
        return massUserFib;
    }
}