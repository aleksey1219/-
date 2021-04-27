package ru.synergyitacademy.lesson6;

class Tiger extends Golos {
    private String voice = "ррррр";

    public Tiger(String animal) {
        super(animal);
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}
