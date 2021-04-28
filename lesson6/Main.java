package ru.synergyitacademy.lesson6.lesson6;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new cat(),
                new dog(),
                new tiger(),
                new korova(),
                new konb()};
        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
