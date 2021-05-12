package ru.synergyitacademy.lesson7.inner.Barier;

import ru.synergyitacademy.lesson7.inner.Ychasnik;
import ru.synergyitacademy.lesson7.inner.Zapuck;

public abstract class Barier {
    private String name;

    public Barier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean yslovie(Ychasnik yhasnik);
}
