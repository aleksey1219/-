package ru.synergyitacademy.lesson6.lesson6;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat(),
                new Dog(),
                new Tiger(),
                new Korova(),
                new Konb()};
        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
