package com.company;

public class Complex {
    double real_part;
    double image_part;
    public Complex(double real,double image){
        real_part = real;
        image_part = image;
    }
    @Override
    public String toString(){
        if (real_part%1==0 && image_part%1==0 ){
            if (real_part==0 && image_part!=0)
                return (int)image_part + "i";
            else if (real_part!=0 && image_part==0)
                return Integer.toString((int)real_part);
            else if (image_part>0)
                return (int)real_part + "+" + (int)image_part + "i";
            else
                return (int)real_part + "-" + (-(int)image_part) + "i";
        }
        else{
            if (real_part==0 && image_part!=0)
                return image_part + "i";
            else if (real_part!=0 && image_part==0)
                return Double.toString(real_part);
            else if (image_part>0)
                return real_part + "+" + image_part + "i";
            else
                return real_part + "-" + (-image_part) + "i";
        }
    }
    public void plus(double real, double image){
        real_part+=real;
        image_part+=image;
    }
    public void minus(double real,double image){
        real_part-=real;
        image_part-=image;
    }
    public void multiply(double real,double image){
        double first_part = real_part;
        real_part = real_part*real-image_part*image;
        image_part = first_part*image+real*image_part;
    }
    public void divide(double real, double image){
        double whole_part = real_part*real - (image_part*(-image));
        double denominator=(real*real)+(image*image);
        double complex_part = (image_part*real)+(real_part*(-image));
        whole_part /= denominator;
        complex_part /= denominator;
        real_part = whole_part;
        image_part = complex_part;
    }
}
