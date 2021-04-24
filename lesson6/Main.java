package ru.synergyitacademy.lesson6;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Кошка"),
                new Dog("Собака"),
                new Tiger("Тиигр "),
                new Korova("Корова"),
                new Konb("Конь")};
        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
