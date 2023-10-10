package Ikinci_Ay_Telimi;

import Ikinci_Ay_Telimi.beans.util.InputUtil;
import Ikinci_Ay_Telimi.beans.util.MenuUtil;

public class Main {

    public static void main(String[] args) {
        int menu = 0;

        while (true) {
            menu = InputUtil.requireNumber("What do you want to do?" +
                    "\n1. Register Student " +
                    "\n2. Show All Students" +
                    "\n3. Find Stuent" +
                    "\n4. Update Student :" +
                    "\n5. Exit" + "\n"); /* yeniden while'in ichine girmemek uchun Bize lazim olan emeliyyatlari yerine yetirdikden sonra exit edirik ve
                                     sistem basha chatir*/
            MenuUtil.processMenu(menu);
        }

    }

    public static void showSuccessOperMessage() {
        System.out.println("operaration completed succsesfully:");
    }
}


