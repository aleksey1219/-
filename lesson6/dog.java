package ru.synergyitacademy.lesson6.lesson6;

class dog extends Golos {
    private String voice = "гав";

    public dog() {
        super("собака");
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}