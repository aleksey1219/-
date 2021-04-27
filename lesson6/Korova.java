package ru.synergyitacademy.lesson6;

class Korova extends Golos {
    private String voice = "мууууу";

    public Korova(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}
