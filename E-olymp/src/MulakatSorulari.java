
public class MulakatSorulari {
    public String Sum(String val1, String val2){  //bu metoda iki tane tam sayi string olarak gonderilecek ve bu sayilarin geri gonderilmesi gerekiyor
        int convertVal1= Integer.parseInt(val1);
        int convertVal2= Integer.parseInt(val2);

        int sum = convertVal1 + convertVal2;
        System.out.println(sum);
        return null;
    }



    public static void main(String[] args) {
        String val1 = "123";
        String val2 = "456";

        int convertVal1= Integer.parseInt(val1);
        int convertVal2= Integer.parseInt(val2);

        int sum = convertVal1 + convertVal2;
        System.out.println(sum);

    }
}
