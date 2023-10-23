package Poly.pactice;

public class Main {

    public static void main(String[] args) {
        Car[] cars = {new BMW(), new Mercedes()};

        driveAllCars(cars);
    }

    public static void driveAllCars(Car[] cars){
        for (int i = 0 ; i< cars.length;i++){
            Car c = cars[i];
            c.drive();
        }
    }
}
