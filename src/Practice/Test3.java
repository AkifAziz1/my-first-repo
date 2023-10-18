package Practice;

public class Test3 {


    private String urunadi;
    private String marka;
    private String model;


    public Test3() { // constractor
        this.urunadi = "Osman";
        this.marka = "opel";
        this.model = "Frontera";
        ObyektYaradilandaMeniChagir();
    }

    public void ObyektYaradilandaMeniChagir() {
        System.out.println("Vacib ish gorurem");
    }

    public String getUrunadi() {

        return urunadi;
    }

    public void setUrunadi(String urunadi) {

        this.urunadi = urunadi;
    }

    public String getMarka() {

        return marka;
    }

    public void setMarka(String marka) {

        this.marka = marka;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }


}

