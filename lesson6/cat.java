package ru.synergyitacademy.lesson6.lesson6;

class cat extends Golos {
    private String voice = "Мяу";

    public cat() {
        super("кошка");
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}