package ru.synergyitacademy.lesson6.lesson6;

class korova extends Golos {
    private String voice = "мууууу";

    public korova() {
        super("корова");
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}