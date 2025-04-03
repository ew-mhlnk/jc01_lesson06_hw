package edu.training.jc.wh;

public class Task06 {
	   public static void main(String args[]) {
	        double x = -5;
	        double y = 20;
	        
	        if (x == 0 && y == 0) {
	            System.out.println("Точка находится в начале координат");
	        } else if (x == 0) {
	            System.out.println("Точка лежит на оси Y");
	        } else if (y == 0) {
	            System.out.println("Точка лежит на оси X");
	        } else if (x > 0 && y > 0) {
	            System.out.println("I координатная четверть");
	        } else if (x < 0 && y > 0) {
	            System.out.println("II координатная четверть");
	        } else if (x < 0 && y < 0) {
	            System.out.println("III координатная четверть");
	        } else if (x > 0 && y < 0) {
	            System.out.println("IV координатная четверть");
	        }
	    }
	}