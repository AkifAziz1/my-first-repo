package Ikinci_Ay_Telimi;

import beans.Students;
import util.InputUtil;
import util.MenuUtil;
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
            MenuUtil.processMenu(menu);
        }
    }
}


