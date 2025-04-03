package edu.training.jc.wh;

public class Task07 {
    public static void main(String[] args) {
        int m = 15; 
        int n = 20;
        int newM, newN;
        
        if (m > n) {
            newM = m;
            newN = m;
        } else if (m < n) {
            newM = n;
            newN = n;
        } else { 
            newM = 0;
            newN = 0;
        }
        
        System.out.println("Новое значение m: " + newM);
        System.out.println("Новое значение n: " + newN);
    }
}