package ru.synergyitacademy.lesson7.inner.Barier;

import ru.synergyitacademy.lesson7.inner.Ychasnik;

public class Ctena extends Barier {
    private int CtenaLength;

    public Ctena(String name, int CtenaLength) {
        super(name);
        this.CtenaLength = CtenaLength;
    }

    @Override
    public boolean yslovie(Ychasnik ychasnik) {
        System.out.println("Высота барьера \"" + super.getName() + "\" составляет: " + this.CtenaLength + " м.");
        //Спортсмен прыгает и мы проверяем, преодолел ли он барьер
        ychasnik.jump();
        if (this.CtenaLength <= ychasnik.getMaxHeight()) {
            System.out.println(ychasnik.getName() + " успешно преодолел барьер!");
            return true;
        } else {
            System.out.println(ychasnik.getName() + " не смог преодолеть барьер...");
            return false;
        }
    }
}