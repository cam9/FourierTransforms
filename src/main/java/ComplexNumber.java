import java.text.DecimalFormat;

public class ComplexNumber {
    public double r;
    public double i;

    public ComplexNumber(double r, double i){
        this.r = r;
        this.i = i;
    }

    public ComplexNumber(double r){
        this(r,0);
    }

    public ComplexNumber multiply(ComplexNumber c){
        double r,i;
        r = this.r*c.r - this.i*c.i;
        i = this.i*c.r + this.r*c.i;
        return new ComplexNumber(r,i);
    }

    public ComplexNumber multiply(double n){
        double r,i;
        r = this.r*n;
        i = this.i*n;
        return new ComplexNumber(r,i);
    }

    public ComplexNumber divide(double n){
        double r,i;
        r = this.r/n - this.i/n;
        i = this.i/n + this.r/n;
        return new ComplexNumber(r,i);
    }

    public ComplexNumber add(ComplexNumber c){
        double r,i;
        r = this.r+c.r;
        i = this.i+c.i;
        return new ComplexNumber(r,i);
    }

    public ComplexNumber subtract(ComplexNumber c){
        double r, i;
        r = this.r-c.r;
        i =  this.i-c.i;
        return new ComplexNumber(r,i);
    }

    public double absValue(){
        return Math.sqrt(r*r+i*i);
    }

    public String toString(){
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        return "["+decimalFormat.format(r)+","+decimalFormat.format(i)+"]";
    }
}
