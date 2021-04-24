package ru.synergyitacademy.lesson6;

class Golos extends Animal {
    private String type = "издает звук";

    public Golos(String animal) {
        super(animal);
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + type;
    }
}