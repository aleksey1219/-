package ru.synergyitacademy.lesson6.lesson6;

class Golos extends Animal {
    private String type = "издает звук";

    private String animal;

    public Golos(String type) {
        this.animal = type;
    }

    @Override
    public void voice() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        switch (animal) {
            case "кошка":
                return "кошка " + type;
            case "собака":
                return "собака " + type;
            case "Тигр":
                return "тигр " + type;
            case "корова":
                return "корова " + type;
            case "конь":
                return "конь " + type;
            default:
                return "нет такого животного ";
        }
    }
}