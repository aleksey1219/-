package ru.synergyitacademy.lesson6.lesson6;

class konb extends Golos {
    private String voice = "игого";


    public konb() {
        super("конь");
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}

