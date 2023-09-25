package util;

import Ikinci_Ay_Telimi.Config;
import beans.Students;

public class StudentUtil {
    public static Students fillStudent() {
        String name = InputUtil.requireText("Enter name");
        String surname = InputUtil.requireText("Enter surname");
        int age = InputUtil.requireNumber("Enter age");
        String className = InputUtil.requireText("Enter class");

        Students st = new Students(name, surname, age, className);
        return st;
    }

    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Students st = Config.students[i];
            System.out.println((i+1) + ". " + st.getFullInfo()); // i+1 edirik, chunki mushteri bizden 0-ci indexi isteye bilmez
        }
    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("Neche telebe qeydiyyatdan kechireceksiniz?");
        Config.students = new Students[count];
        for (int i = 0; count > i; i++) {
            System.out.println((i + 1) + ". Register");
            Config.students[i] = StudentUtil.fillStudent();
        }
        System.out.println("Registration completed succsesfully:");
        String s = "";
        StudentUtil.printAllRegisteredStudents() ;
        System.out.println(s);
    }

    public static void  findStudentsAndPrint() {
        String text = InputUtil.requireText("Type name, surname or class name");
        Students [] result = findStudents(text);
        for(int i = 0; i<result.length; i++){
            System.out.println(result[i].getFullInfo());
        }
    }

    public static Students[] findStudents(String text) {

        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Students st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }
        }
        Students[] result = new Students[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Students st = Config.students[ i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found] = st;
                found++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Students [] students = {
                new Students("ad1","soyad1",11,"9A"),
                new Students("asd2","soyad1",11,"9A"),
                new Students("aed1","soyasd1",11,"9A"),
                new Students("ad1","soyad1",11,"9A")
        };
        Config.students = students;

    }public static void updateStudents(){
        //PrintAllRegisteredstudents mothodunu chagiririg ki registr olunan telebeden birini suchib update ede bilsin
        StudentUtil.printAllRegisteredStudents();// Her kesi chapa ver

        int i = InputUtil.requireNumber("Nechenci adamda deyishiklik edeceksiniz?");//1

        System.out.println("yeni melumatlari daxil edin:");
        Students s = StudentUtil.fillStudent();//yeni melumati daxil et

        //Config.students[i] = s;  // Burda gedirik PrintAllStudents methoduna chunki orda indeksle gostermemishik. Yenisi ashdagi setirde
        // i-1 edirik ki, mushteri 1 daxil edende 0-ci indexe getsin
        Config.students[i-1] = s; //
    }
}

