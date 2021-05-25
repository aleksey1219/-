package ru.synergyitacademy.lesson9;

public class Car implements Cloneable {
    private String brend;
    private String model;
    private Human human;

    public Car(String brend, String model, Human human) {
        this.brend = brend;
        this.model = model;
        this.human = human;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Car clone() throws CloneNotSupportedException {
        Car newcar = (Car) super.clone();
        Human newhuman = new Human(human.namehuman);
        newcar.setHuman(newhuman);
        return newcar;
    }

    public String print() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", human='" + human.namehuman + '\'' +
                '}';
    }

    static class Human implements Cloneable {
        private String namehuman;

        public Human(String namehuman) {
            this.namehuman = namehuman;
        }

        public void setNameDriver(String namehuman) {
            this.namehuman = namehuman;
        }

        public Human clone() throws CloneNotSupportedException {
            return (Human) super.clone();
        }

        public String print() {
            return "Human{" +
                    "namehuman='" + namehuman + '\'' +
                    '}';
        }
    }
}