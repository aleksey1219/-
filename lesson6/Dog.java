package ru.synergyitacademy.lesson6.lesson6;

class Dog extends Golos {
    private String voice = "гав";

    public Dog() {
        super("собака");
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}