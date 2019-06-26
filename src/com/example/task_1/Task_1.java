package com.example.task_1;
import java.util.Scanner;
public class Task_1 {
    public static void main(String args[]){
        int s = 0;
        int e = 10;
        int w = 20;
        int a = s + (int) (Math.random() * e); // Генерация 1-го числа от 0 до 10
        int b = e + (int) (Math.random() * w); // Генерация 2-го числа от 10 до 20
        int c = s + (int) (Math.random() * e); //Генерация 3-го числа от 0 до 10
        System.out.println("Программа решает квадратное уравнение ax^2 + bx + c = 0");
        System.out.println("Если:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int D;
        D= b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D))/ (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }

    }
}

