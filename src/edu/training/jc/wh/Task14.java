package edu.training.jc.wh;

public class Task14 {
    public static void main(String[] args) {
        double mult = 1;

        for (int i = 1; i <= 200; i++) 
            mult *= Math.pow(i, 2); 

        System.out.println("Произведение квадратов первых 200 чисел = " + mult);
    }
}
