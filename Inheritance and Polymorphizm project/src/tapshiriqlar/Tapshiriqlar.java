package tapshiriqlar;

import static tapshiriqlar.Teacher.myMethod;

public class Tapshiriqlar {
    public static void main(String[] args) {
        User u = new User();
        Person p = u; /* buna deyirik polyporphizm.
        Yeni, p heqiqetde User obyekti olmagina baxmayaraq ozunu Person kimi aparir */

        u.methodInPerson();
    }
}

