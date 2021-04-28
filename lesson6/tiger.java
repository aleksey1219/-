package ru.synergyitacademy.lesson6.lesson6;

class tiger extends Golos {
    private String voice = "ррррр";

    public tiger() {
        super("Тигр");
    }

    @Override
    public String toString() {
        return super.toString() + " " + voice;
    }
}
