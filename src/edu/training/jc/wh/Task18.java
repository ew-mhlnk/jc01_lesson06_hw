package edu.training.jc.wh;

public class Task18 {

	public static void main(String[] args) {
        int n = 10; // Можно изменить на нужное значение
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        
        System.out.println("Сумма: " + sum);
    }
}