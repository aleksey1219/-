package ru.synergyitacademy.lesson9;

public class Zapusk {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car.Human human = new Car.Human("Иванов В.В.");
        Car car = new Car("LADA", "GRANTA", human);
        Car.Human copuhuman = human;
        Car copucar = car;
        Car.Human clonehuman = human.clone();
        Car clonecar = car.clone();
        System.out.println("Оригинал:");
        System.out.println("Водитель: " + human);
        System.out.println("Автомобиль: " + car);
        System.out.println(human.print());
        System.out.println(car.print());
        System.out.println("Копия:");
        System.out.println("Водитель: " + copuhuman);
        System.out.println("Автомобиль: " + copucar);
        System.out.println(copuhuman.print());
        System.out.println(copucar.print());
        System.out.println("Клон:");
        System.out.println("Водитель: " + clonehuman);
        System.out.println("Автомобиль: " + clonecar);
        System.out.println(clonehuman.print());
        System.out.println(clonecar.print());
        System.out.println("Меняем данные");
        car.setBrend("KIA");
        car.setModel("RIO ");
        human.setNameDriver("Иванов Г.Д.");
        System.out.println("Объект:");
        System.out.println("Водитель: " + human);
        System.out.println("Автомобиль: " + car);
        System.out.println(car.print());
        System.out.println("Копия:");
        System.out.println("Водитель: " + copuhuman);
        System.out.println("Автомобиль: " + copucar);
        System.out.println(copucar.print());
        System.out.println("Клон:");
        System.out.println("Водитель: " + clonehuman);
        System.out.println("Автомобиль: " + clonecar);
        System.out.println(clonecar.print());
    }
}