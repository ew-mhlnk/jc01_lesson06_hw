package edu.training.jc.wh;

public class Task15 {

	public static void main(String[] args) {
		
		int n = 200;
        long prev = 0;
        
        for (int i = 1; i <= n; i++) {
            long cube = (long) i * i * i;
            long diff = cube - prev;
            System.out.println("Для числа " + i + ": " + diff);
            prev = cube;
        }
    }
}