package ru.synergyitacademy.lesson7.inner;

public class Cat implements Ychasnik {
    private String name;
    private int doroga;
    private int ctena;

    public Cat(String name, int doroga, int ctena) {
        this.name = name;
        this.doroga = doroga;
        this.ctena = ctena;
    }

    @Override
    public void run() {
        System.out.println("Кот " + this.name + "Пробежал " + this.doroga + "М");
    }

    @Override
    public void jump() {
        System.out.println("Кот " + this.name + " прыгнул на " + this.ctena + " м.");
    }

    @Override
    public int DorogaLength() {
        return doroga;
    }

    @Override
    public int CtenaHeight() {
        return ctena;
    }

    @Override
    public String nameYchasnik() {
        return name;
    }
}