package edu.training.jc.wh;

public class Task16 {

	public static void main(String[] args) {
		
		int n = 10; 
        long product = 1; 
        long currentTerm = 1; 
        
        System.out.println("Члены последовательности и их произведение:");
        System.out.println("a1 = " + currentTerm);
        
        for (int i = 2; i <= n; i++) {
            currentTerm = 6 + currentTerm; 
            product *= currentTerm; 
            
            System.out.println("a" + i + " = " + currentTerm);
        }
        
        System.out.println("\nПроизведение первых " + n + " членов последовательности: " + product);
    }
}