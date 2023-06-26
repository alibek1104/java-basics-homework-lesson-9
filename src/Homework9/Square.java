package Homework9;

public class Square {

    private double a;

    public Square(double a) {
        this.a = a;

    }

    public double getArea() {
        return a * a;
    }
    public double getPerimeter() {
        return 4 * a;
    }
    public double getDiagonal() {
        return Math.sqrt(2) * a;
    }

    public String toString() {
        return "Сторона квадрата: " + a + ", площадь квадрата: " + getArea() + ", периметр квадрата:" + getPerimeter() + ", диагональ квадрата: " + getDiagonal();
    }
}
