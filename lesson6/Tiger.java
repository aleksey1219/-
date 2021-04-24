package ru.synergyitacademy.lesson6;

class Tiger extends Golos {
    private String voice = "ррррр";

    public Tiger(String animal) {
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
