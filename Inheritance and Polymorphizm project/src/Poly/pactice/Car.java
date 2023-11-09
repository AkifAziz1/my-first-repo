package Poly.pactice;

import java.util.Random;

public class Car {

    public int a = 2;

    private int numForks;

    public static void main(String[] args) {
        int numKnives;
        System.out.print("""
                "# forks = " + numForks +
                 " # knives = " + numKnives +
                # cups = 0""");
    }

    public void drive() {
        System.out.println("Car Drive ");
    }
}
