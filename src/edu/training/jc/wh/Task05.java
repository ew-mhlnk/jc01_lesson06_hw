package edu.training.jc.wh;

public class Task05 {

	public static void main(String[] args) {
		double x = 10;
        double y = 20;
        
        if (x < y) {
            double sum = (x + y) / 2;
            double product = (x * y) * 2;
            x = sum;
            y = product;
        } else if (x > y) {
            double sum = (x + y) / 2;
            double product = (x * y) * 2;
            y = sum;
            x = product;
        }
        
        System.out.println("Новое значение x: " + x);
        System.out.println("Новое значение y: " + y);
    }
}