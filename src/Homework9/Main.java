package Homework9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1.
        
        Student myStudent = new Student("Алибек", 200, 2023);
        System.out.println(myStudent);
        myStudent.increaseYear();
        System.out.println("Новый год обучения: " + myStudent.getYear());

        myStudent.setName("Егор");
        myStudent.setID(113);
        myStudent.setYear(2020);
        System.out.println(myStudent);
        myStudent.increaseYear();
        System.out.println("Новый год обучения: " + myStudent.getYear());

        // 2.
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());

        // 3.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение длины квадрата: ");
        double a = scanner.nextDouble();

        Square mySquare = new Square(a);

        double area = mySquare.getArea();
        double perimeter = mySquare.getPerimeter();
        double diagonal = mySquare.getDiagonal();

        System.out.println(mySquare.toString());

        // 4.

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите значение: ");
        double value = scanner1.nextDouble();
        System.out.println("Введите единицу измерения температуры: ");
        char scale = scanner1.next().charAt(0);

        Temperature myTemperature = new Temperature(value, scale);
        System.out.println(myTemperature.toString());
    }
}