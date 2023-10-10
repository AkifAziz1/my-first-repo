package Ikinci_Ay_Telimi.beans;

public class Students {
    private String name;
    private String surname;
    private int age;
    private String className;


    public Students() {
    }

    public Students(String name, String surname, int age, String clasName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = clasName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getFullInfo() {
        return (this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getClassName());
    }
}

