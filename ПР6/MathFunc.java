public class MathFunc implements MathCalculable {
    public double pow(double base,int exp){double r=1;int e=Math.abs(exp);for(int i=0;i<e;i++)r*=base;return exp<0?1/r:r;}
    public double modulus(Complex c){return Math.sqrt(c.getRe()*c.getRe()+c.getIm()*c.getIm());}
    public double circumference(double r){return 2*PI*r;}
}