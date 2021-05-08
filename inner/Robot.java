package ru.synergyitacademy.lesson7.inner;

public class Robot implements Ychasnik {
    private String name;
    private int doroga;
    private int ctena;

    public Robot(String name, int doroga, int ctena) {
        this.name = name;
        this.doroga = doroga;
        this.ctena = ctena;
    }

    @Override
    public void run() {
        System.out.println("Робот " + this.name + "Пробежал " + this.doroga + "М");
    }

    @Override
    public void jump() {
        System.out.println("Робот " + this.name + " прыгнул на " + this.ctena + " м.");
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
