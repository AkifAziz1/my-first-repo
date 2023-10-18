package tapshiriqlar.numune;

class EsasSinif {
    public void Yaz() {
        System.out.println("Esas Sinif");
    }
}

class Toreyen_1 extends EsasSinif {
    public void Yaz() {
        System.out.println("Toreyen_1 sinifi ");
    }
}

class Toreyen_2 extends EsasSinif {
    public void Yaz() {
        System.out.println("Toreyen_2 sinifi ");
    }
}

class Toreyen_3 extends EsasSinif {
    public void Yaz() {
        System.out.println("Toreyen_3 sinifi ");
    }

    public class Program {
        public static void Yaz(EsasSinif t) {
            t.Yaz();
        }

        public static void main(String[] args) {
            Toreyen_1 t1 = new Toreyen_1();
            Toreyen_2 t2 = new Toreyen_2();
            Toreyen_3 t3 = new Toreyen_3();

            Yaz(t1);
            Yaz(t2);
            Yaz(t3);
            t1.Yaz();
        }
    }
}


