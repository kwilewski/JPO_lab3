import java.awt.*;
import java.awt.geom.Line2D;

public class Vector2D {
    public double wspx, wspy;

    public double getWspx(){
        return wspx;
    }
    public void setWspx(){
        this.wspx=0;
    }
    public void setWspx(double wspx){
        this.wspx=wspx;
    }

    public double getWspy(){
        return wspy;
    }
    public void setWspy(){
        this.wspy=0;
    }
    public void setWspy(double wspy){
        this.wspy=wspy;
    }

    public Vector2D(){
        setWspx(0);
        setWspy(0);
    }

    public Vector2D(double x, double y){
        setWspx(x);
        setWspy(y);
    }

    public Vector2D suma(Vector2D x){
        double a=getWspx()+x.getWspx();
        double b=getWspy()+x.getWspy();
        return new Vector2D(a,b);
    }
    public Vector2D roznica(Vector2D x){
        double a=getWspx()-x.getWspx();
        double b=getWspy()-x.getWspx();
        return new Vector2D(a,b);
    }
    public Vector2D iloczyn(double n){
        double a=n*getWspx();
        double b=n*getWspy();
        return new Vector2D(a,b);
    }

    public double dlugosc(){
        return Math.sqrt(getWspx()*getWspx()+getWspy()*getWspy());
    }

    public Vector2D normal(){
        double l=dlugosc();
        return iloczyn(1/l);
    }

    public void info(){
        System.out.println("x: "+getWspx());
        System.out.println("y: "+getWspy());
    }




    public static void main (String[] args){
    }

}
