public class Car {
    private int horsepower;
    private double engineVolume;
    private String model;
    private String brand;
    private int year;
    private boolean isAutomatic;

    public Car(int horsepower, double engineVolume, String model, String brand, int year, boolean isAutomatic) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.isAutomatic = isAutomatic;
    }

    public static void main(String[] args) {
        Car[] cars = {
                new Car(300, 3.0, "M3", "BMW", 2021, true),
                new Car(250, 2.0, "Civic", "Honda", 2019, false),
                new Car(350, 3.5, "Mustang", "Ford", 2020, true),
                new Car(200, 2.5, "Corolla", "Toyota", 2018, false),
                new Car(150, 1.5, "Jazz", "Honda", 2017, false),
                new Car(400, 4.0, "GT-R", "Nissan", 2022, true),
                new Car(180, 2.0, "Cruze", "Chevrolet", 2015, false),
                new Car(220, 2.5, "Impreza", "Subaru", 2020, true),
                new Car(320, 3.0, "S4", "Audi", 2022, true),
                new Car(280, 2.8, "Stinger", "Kia", 2021, true)
        };

        double totalEngineVolume = 0;
        int totalHorsepower = 0;

        for (Car car : cars) {
            totalEngineVolume += car.engineVolume;
            totalHorsepower += car.horsepower;
        }

        System.out.println("The total engine volume of the cars is: " + totalEngineVolume);
        System.out.println("The total horsepower of the cars is: " + totalHorsepower);
    }
}
