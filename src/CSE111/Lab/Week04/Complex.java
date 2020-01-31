package CSE111.Lab.Week04;

public class Complex{
    private double realPart;
    private double imaginaryPart;

    public Complex(){
        this(0.0,0.0);
    }

    public Complex(double realPart, double imaginaryPart){
        setRealPart(realPart);
        setImaginaryPart(imaginaryPart);
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

//    public Complex add(Complex c){
//        return new Complex((this.realPart+c.realPart),(this.imaginaryPart+c.imaginaryPart));
//    }

    public <C extends Complex> C add(C c){
        return (C)new Complex((this.realPart+c.getRealPart()),(this.imaginaryPart+c.getImaginaryPart()));
    }

    public Complex mul (Complex c){
        return new Complex(this.getRealPart()*c.getRealPart()-this.getImaginaryPart()*c.getImaginaryPart(),this.getRealPart()*c.getImaginaryPart()+c.getRealPart()*this.getImaginaryPart());
    }

    public Complex divide (Complex c){
        double div = (c.realPart*c.realPart+c.imaginaryPart*c.imaginaryPart);
        c=new Complex(c.getRealPart()/div,-c.getImaginaryPart()/div);
        return mul(c);
    }

    public String toString(){
        if(getImaginaryPart()!=0)
            return String.format("%.2f+ i%.2f", getRealPart(), getImaginaryPart());
        else
            return String.format("%.2f", getRealPart());
    }
}
