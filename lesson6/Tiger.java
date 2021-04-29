package ru.synergyitacademy.lesson6.lesson6;

class Tiger extends Golos {
    private String voice = "ррррр";

    public Tiger() {
        super("Тигр");
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}
