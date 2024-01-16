package Poly.pactice;
 
import java.util.Random;


public class Car {
    static void sumTest(int ... v){
        System.out.println(v.length);

    }

    public static void main(String[] args) {
        sumTest();
        sumTest(3);
        sumTest(1,2,3,4);
    }


    public void drive() {
        System.out.println("Car Drive ");
    }
}
