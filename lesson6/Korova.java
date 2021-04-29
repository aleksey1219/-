package ru.synergyitacademy.lesson6.lesson6;

class Korova extends Golos {
    private String voice = "мууууу";

    public Korova() {
        super("корова");
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}