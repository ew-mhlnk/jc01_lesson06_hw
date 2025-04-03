package edu.training.jc.wh;

public class Task19 {

	public static void main(String[] args) {
        int sum = 0;
        int term = 1; // Первый член последовательности (2⁰)
        
        for (int i = 0; i <= 10; i++) {
            sum += term;
            term *= 2; // Умножаем на 2 для получения следующего члена
        }
        
        System.out.println("Сумма ряда: " + sum);
    }
}