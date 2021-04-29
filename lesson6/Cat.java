package ru.synergyitacademy.lesson6.lesson6;

class Cat extends Golos {
    private String voice = "Мяу";

    public Cat() {
        super("кошка");
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}