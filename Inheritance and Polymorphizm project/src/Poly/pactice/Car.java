package Poly.pactice;

public class Car {

    public  int a = 2;


    public void drive(){
        /* this.get classname deyende java gedir heqiqetde olan classin adini da chixarir . demesek sadece car classinin
        drive methodudu chagiracag */
        System.out.println(this.getClass().getName() + "Drive ");
    }
}
