package ru.synergyitacademy.lesson6;

class Konb extends Golos {
    private String voice = "игого";

    public Konb(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}
