package tapshiriqlar;

public class Person {
    public String name;
    public String surname;
    public int age;

    public Person(){
        super();
    }
    public Person(String name){
        this.name = name;
    }

    public void methodInPerson(){
        System.out.println("Men person classindan gelirem");
    }
}
