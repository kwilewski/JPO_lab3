import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
public class SpringApplet extends JApplet {
    public void init(){

    }
    public void paint(){

    }
    public static void main (String[] args){
        Vector2D w1=new Vector2D(2,4);
        Vector2D w2=new Vector2D(4,3);
        Vector2D suma=w1.suma(w2);
        Vector2D roznica=w1.roznica(w2);
        Vector2D normal1=w1.normal();
        Vector2D normal2=w2.normal();
        double l1=w1.dlugosc();
        double l2=w2.dlugosc();
        Vector2D iloczyn=w1.iloczyn(2);
        System.out.println("Wektory:");
        w1.info();
        w2.info();
        System.out.println("Suma:");
        suma.info();
        System.out.println("Roznica:");
        roznica.info();
        System.out.println("Wektory znormalizowane:");
        normal1.info();
        normal2.info();;
        System.out.println("Dlugosc wektora 1: "+l1);
        System.out.println("Dlugosc wektora 2: "+l2);
        System.out.println("Iloczyn:");
        iloczyn.info();


    }


}