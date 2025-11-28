public class Complex {
    private double re,im; public Complex(double re,double im){this.re=re;this.im=im;}
    public double getRe(){return re;} public double getIm(){return im;}
    public String toString(){return re+(im>=0?"+":"")+im+"i";}
}