package ru.synergyitacademy.lesson6;

class Dog extends Golos {
    private String voice = "гав";

    public Dog(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}
