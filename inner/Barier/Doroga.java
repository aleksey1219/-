package ru.synergyitacademy.lesson7.inner.Barier;

import ru.synergyitacademy.lesson7.inner.Ychasnik;

public class Doroga extends Barier {
    private int DorogaLength;

    public Doroga(String name, int DorogaLength) {
        super(name);
        this.DorogaLength = DorogaLength;
    }

    @Override
    public boolean yslovie(Ychasnik ychasnik) {
        System.out.println("Длинна дорожки \"" + super.getName() + "\" составляет: " + this.DorogaLength + " м.");
        ychasnik.run();
        if (this.DorogaLength <= ychasnik.getMaxDistance()) {
            System.out.println(ychasnik.getName() + " успешно пробежал дистанцию!");
            return true;
        } else {
            System.out.println(ychasnik.getName() + " не смог пробежать дистанцию...");
            return false;
        }
    }
}