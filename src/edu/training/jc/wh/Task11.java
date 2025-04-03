package edu.training.jc.wh;

public class Task11 {
    public static void main(String[] args) {
        double a = 0;  
        double b = 4;  
        double h = 1;  

        double x = a;
        while (x <= b) {
            double y; 
            
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }

            System.out.println("x = " + x + ", y = " + y);

            x += h;
        }
    }
}