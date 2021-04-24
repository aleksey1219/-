package ru.synergyitacademy.lesson6;

class Konb extends Golos {
    private String voice = "игого";

    public Konb(String animal) {
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
