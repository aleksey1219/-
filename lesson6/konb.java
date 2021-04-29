package ru.synergyitacademy.lesson6.lesson6;

class Konb extends Golos {
    private String voice = "игого";


    public Konb() {
        super("конь");
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}

