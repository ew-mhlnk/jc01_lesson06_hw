package edu.training.jc.wh;

public class Task17 {

	public static void main(String[] args) {

		  double start = -5.0;
	        double end = 5.0;
	        double step = 0.5;
	        
	        System.out.println("Таблица значений функции y = 5 - x²/2");
	        System.out.println("--------------------------------------");
	        System.out.println("    x    |    y");
	        System.out.println("--------------------------------------");
	        
	        for (double x = start; x <= end; x += step) {
	            double y = 5 - Math.pow(x, 2) / 2;
	            System.out.printf("%7.2f  | %7.2f%n", x, y);
	        }
	        
	        System.out.println("--------------------------------------");
	    }
	}