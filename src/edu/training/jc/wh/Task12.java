package edu.training.jc.wh;

public class Task12 {
    public static void main(String[] args) {
        double a = 0;  // Начало отрезка
        double b = 3; // Конец отрезка
        double c = 14; // Переменная c
        double h = 1;  // Шаг

        double x = a;
        while (x <= b) { // Пока x не превысит b
            double y; // Переменная y
            
            if (x == 15) {
                y = (x + c) * 2; // Если x = 15
            } else {
                y = (x - c) + 6; // Если x != 15
            }

            System.out.println("x = " + x + ", y = " + y);

            x += h;
        }
    }
}
