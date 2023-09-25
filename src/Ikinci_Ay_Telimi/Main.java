package Ikinci_Ay_Telimi;

import beans.Students;
import util.InputUtil;
import util.StudentUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menu = 0;

        while (true) {
            menu = InputUtil.requireNumber("What do you want to do?" +
                    "\n1. Register Student " +
                    "\n2. Show All Students" +
                    "\n3. Find Stuent" +
                    "\n4. Update Student :" + "\n");

            if (menu == 1) {
                StudentUtil.registerStudents();
            } else if (menu == 2) {
                StudentUtil.printAllRegisteredStudents();
            } else if (menu == 3) {
                StudentUtil.findStudentsAndPrint();
            } else if (menu == 4) {
                StudentUtil.updateStudents();
            }
        }
    }
}

