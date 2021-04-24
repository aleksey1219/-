package ru.synergyitacademy.lesson6;

class Cat extends Golos {
    private String voice = "Мяу";

    public Cat(String animal) {
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