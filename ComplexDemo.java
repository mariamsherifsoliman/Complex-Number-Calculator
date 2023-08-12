
package assignment2;
// create a class and a diver class that do operations on complex numbers

import java.util.Scanner;

class Complex{
    private double real, imaginary; // create private instance variables as well as constructors
    public Complex(){ 
    real=0;
    imaginary=0;
}
    public Complex (double realpart, double imaginarypart){
        real=realpart;
        imaginary=imaginarypart;
        
    } 
    public Complex add(Complex other){ // add two complex numbers and return the result as a new object
        double realnew = this.real + other.real;
        double imaginarynew = this.imaginary + other.imaginary;
        return new Complex(realnew, imaginarynew);
    }
    public Complex subtract(Complex other) { // subtract two complex numbers and return the result as a new object
double newReal = this.real - other.real;
double newImaginary = this.imaginary - other.imaginary;
return new Complex(newReal, newImaginary);
}
    public Complex multiply(Complex other) { // multiply two complex numbers and return the result as a new object
double newReal = this.real * other.real - this.imaginary * other.imaginary;
double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
return new Complex(newReal, newImaginary);
}
    public Complex divide(Complex other) {// divide two complex numbers and return the result as a new object
double r = ((this.real * other.real) + (this.imaginary * other.imaginary)) / ((other.real * other.real) + (other.imaginary * other.imaginary));
double i = ((this.imaginary * other.real) - (this.real * other.imaginary)) / ((other.real * other.real) + (other.imaginary * other.imaginary));
return new Complex(r, i);
}
    public double getReal(){ // setters and getters because the data is private
    return real;
}
public double getIm(){
    return imaginary;
}
public void setReal (double v) {
    real=v;
}
public void setIm (double b) {
    imaginary=b;
}
public void tostring(){
   System.out.println("Solution: " + real + " + " + imaginary + "i");
}
}

public class ComplexDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int option=0;
         while(option!=5){
             System.out.println("Select an option\n 1) Addition \n 2) Subtraction \n 3) Multipliation \n 4) Division \n 5) Exit");
             option=input.nextInt();
             input.nextLine();
             switch(option){
                 case 1: 
                     System.out.println("Enter real part of number 1: ");
                     int r1=input.nextInt();
                     System.out.println("Enter imaginary part of number 1: ");
                     int i1=input.nextInt();
                     System.out.println("Enter real part of number 2: ");
                     int r2=input.nextInt();
                     System.out.println("Enter imaginary part of number 2: ");
                     int i2=input.nextInt();
                     Complex c1 = new Complex(r1, i1);
                     Complex c2 = new Complex(r2, i2);
                     Complex add = c1.add(c2);
                     add.tostring();
                     break;
                 case 2: 
                     System.out.println("Enter real part of number 1: ");
                     int rr1=input.nextInt();
                     System.out.println("Enter imaginary part of number 1: ");
                     int ii1=input.nextInt();
                     System.out.println("Enter real part of number 2: ");
                     int rr2=input.nextInt();
                     System.out.println("Enter imaginary part of number 2: ");
                     int ii2=input.nextInt();
                     Complex cc1 = new Complex(rr1, ii1);
                     Complex cc2 = new Complex(rr2, ii2);
                     Complex sub = cc1.subtract(cc2);
                     sub.tostring();
                     break;
                 case 3: 
                     System.out.println("Enter real part of number 1: ");
                     int rrr1=input.nextInt();
                     System.out.println("Enter imaginary part of number 1: ");
                     int iii1=input.nextInt();
                     System.out.println("Enter real part of number 2: ");
                     int rrr2=input.nextInt();
                     System.out.println("Enter imaginary part of number 2: ");
                     int iii2=input.nextInt();
                     Complex ccc1 = new Complex(rrr1, iii1);
                     Complex ccc2 = new Complex(rrr2, iii2);
                     Complex mult = ccc1.multiply(ccc2);
                     mult.tostring();
                     break;
                 case 4: 
                     System.out.println("Enter real part of nominator: ");
                     int rrrr1=input.nextInt();
                     System.out.println("Enter imaginary part of nominator: ");
                     int iiii1=input.nextInt();
                     System.out.println("Enter real part of denominator: ");
                     int rrrr2=input.nextInt();
                     System.out.println("Enter imaginary part of denominator: ");
                     int iiii2=input.nextInt();
                     Complex cccc1 = new Complex(rrrr1, iiii1);
                     Complex cccc2 = new Complex(rrrr2, iiii2);
                     Complex div = cccc1.divide(cccc2);
                     div.tostring();
                     break;
                 case 5:
                     break;
             }
       
    }
}
}
