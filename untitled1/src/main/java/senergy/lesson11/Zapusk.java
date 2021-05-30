package senergy.lesson11;

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

    public static class Car implements Cloneable {
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
}