package ru.itsjava.hw2;

public class MainFigure {
    public static void main(String[] args) {
        Figure triangle = new Triangle(3, 4, 5);
        triangle.printSquare();
        triangle.printPerimeter();

        System.out.println();
        Figure quadrant = new Quadrant(3);
        quadrant.printSquare();
        quadrant.printPerimeter();

        System.out.println();
        Figure rect = new Rect(3, 8);
        rect.printSquare();
        rect.printPerimeter();

        System.out.println();
        Figure circle = new Circle(3);
        circle.printSquare();
        circle.printPerimeter();
    }
}
