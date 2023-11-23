package Poly.pactice;

import java.util.Random;

public class Car {
    public static void main(String[] input) {
        int plan = 1;
        plan = plan++ + --plan;
        if (plan == 1) {
            System.out.print("Plan A");
        } else {
            if (plan == 2) System.out.print("Plan B");
        } else System.out.print("Plan C");
    }


    public void drive() {
        System.out.println("Car Drive ");
    }
}
