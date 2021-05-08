package ru.synergyitacademy.lesson7.inner;

import ru.synergyitacademy.lesson7.inner.Barier.Barier;
import ru.synergyitacademy.lesson7.inner.Barier.Doroga;
import ru.synergyitacademy.lesson7.inner.Barier.Ctena;

import java.util.Random;

public class Zapuck {
    public static void main(String[] args) {
        Random random = new Random();
        Ychasnik yhasnik[] = new Ychasnik[3];
        yhasnik[0] = new Human("Алексей ", random.nextInt(100), random.nextInt(8));
        yhasnik[1] = new Cat("Барсик ", random.nextInt(50), random.nextInt(20));
        yhasnik[2] = new Robot("Wild ", random.nextInt(200), random.nextInt(50));
        Barier barier[] = new Barier[2];
        barier[0] = new Doroga("Лес ", 40);
        barier[1] = new Ctena("Бревно ", 5);
        for (int i = 0; i < yhasnik.length; i++) {
            boolean win = true;
            for (int j = 0; j < barier.length; j++) {
                win = barier[j].yslovie(yhasnik[i]);
                if (!win) {
                    break;
                }
            }
            if (win) {
                System.out.println("Спортсмен " + yhasnik[i].nameYchasnik() + " преодолел все препятствия!!!");
            } else {
                System.out.println("Спортсмен " + yhasnik[i].nameYchasnik() + " сошел с дистанции...");
            }
            System.out.println();
        }
    }
}

