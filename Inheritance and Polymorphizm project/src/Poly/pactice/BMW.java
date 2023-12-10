package Poly.pactice;

public class BMW extends Car {
    public static void main(String[] args) {
        String[] days = new String[]{"Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday"};
        for(int i = 1; i<days.length;i++)
            System.out.println(days[i]);
    }


    public void drive() {
        System.out.println("BMW Drive");
    }
}
