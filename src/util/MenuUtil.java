package util;

public class MenuUtil {
    public static void processMenu(int selectedMenu) {

        switch (selectedMenu) {
            case 1:
                StudentUtil.registerStudents();
                break;
            case 2:
                StudentUtil.printAllRegisteredStudents();
                break;
            case 3:
                StudentUtil.findStudentsAndPrint();
                break;
            case 4:
                StudentUtil.updateStudentsWithNewObject();/* Update Student uchun iki eded ishlek method yaratdig. biri yeni obyekt yaratmaqla, digeri ise obyekt yaratmadan
                 ishini gorur. hansini istesek (eyni zamanda olmamaq sherti ile) istifade ede bilerik*/
        }
    }
}
