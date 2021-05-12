package ru.synergyitacademy.lesson7.inner;

public class Human implements Ychasnik {
    private String name;
    private int doroga;
    private int ctena;

    public Human(String name, int doroga, int ctena) {
        this.name = name;
        this.doroga = doroga;
        this.ctena = ctena;
    }

    @Override
    public void run() {
        System.out.println("Спортсмен " + this.name + "Пробежал " + this.doroga + "М");
    }

    @Override
    public void jump() {
        System.out.println("Спортсмен " + this.name + " прыгнул на " + this.ctena + " м.");
    }

    @Override
    public int getMaxDistance() {
        return doroga;
    }

    @Override
    public int getMaxHeight() {
        return ctena;
    }

    @Override
    public String getName() {
        return name;
    }
}
