package ru.synergyitacademy.lesson6;

class Korova extends Golos {
    private String voice = "мууууу";

    public Korova(String animal) {
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