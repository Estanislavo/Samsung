package com.company;

public class Complex {
    private double realPart;
    private double imagePart;
    private Complex(double real,double image){
        realPart = real;
        imagePart = image;
    }
    @Override
    public String toString(){
        if (realPart%1==0 && imagePart%1==0 ){
            if (realPart==0 && imagePart!=0)
                return (int)imagePart + "i";
            else if (realPart!=0 && imagePart==0)
                return Integer.toString((int)realPart);
            else if (imagePart>0)
                return (int)realPart + "+" + (int)imagePart + "i";
            else
                return (int)realPart + "-" + (-(int)imagePart) + "i";
        }
        else{
            if (realPart==0 && imagePart!=0)
                return imagePart + "i";
            else if (realPart!=0 && imagePart==0)
                return Double.toString(realPart);
            else if (imagePart>0)
                return realPart + "+" + imagePart + "i";
            else
                return realPart + "-" + (-imagePart) + "i";
        }
    }
    private void plus(double real, double image){
        realPart+=real;
        imagePart+=image;
    }
    private void minus(double real,double image){
        realPart-=real;
        imagePart-=image;
    }
    private void multiply(double real,double image){
        double firstPart = realPart;
        realPart = realPart*real-imagePart*image;
        imagePart = firstPart*image+real*imagePart;
    }
    private void divide(double real, double image){
        double wholePart = realPart*real - (imagePart*(-image));
        double denominator=(real*real)+(image*image);
        double complexPart = (imagePart*real)+(realPart*(-image));
        wholePart /= denominator;
        complexPart /= denominator;
        realPart = wholePart;
        imagePart = complexPart;
    }
}
