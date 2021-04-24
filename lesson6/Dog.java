package ru.synergyitacademy.lesson6;

class Dog extends Golos {
    private String voice = "гав";

    public Dog(String animal) {
        super(animal);
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}