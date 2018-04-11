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

    public Vector2D(){          //konstruktor domyslny
        setWspx(0);
        setWspy(0);
    }

    public Vector2D(double x, double y){            //konstruktor z parametrami
        setWspx(x);
        setWspy(y);
    }

    public Vector2D suma(Vector2D x){           //metoda zwracająca sume wektora ktorego zostala wywolana i podanego za parametr
        double a=getWspx()+x.getWspx();
        double b=getWspy()+x.getWspy();
        return new Vector2D(a,b);
    }
    public Vector2D roznica(Vector2D x){            //metoda zwracajaca roznice
        double a=getWspx()-x.getWspx();
        double b=getWspy()-x.getWspx();
        return new Vector2D(a,b);
    }
    public Vector2D iloczyn(double n){          //metoda zwracajaca iloczyn
        double a=n*getWspx();
        double b=n*getWspy();
        return new Vector2D(a,b);
    }

    public double dlugosc(){            //metoda zwracajaca dlugosc
        return Math.sqrt(getWspx()*getWspx()+getWspy()*getWspy());
    }

    public Vector2D normal(){           //metoda zwracajaca wektor znormalizowany
        double l=dlugosc();
        return iloczyn(1/l);
    }

    public void info(){         //metoda wyswietlajaca informacje o wektorze w konsoli
        System.out.println("x: "+getWspx());
        System.out.println("y: "+getWspy());
    }

    public static void main (String[] args){
    }

}
