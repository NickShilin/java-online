package ru.itsjava.hw2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Figure {
    private int r;
    public static final double PI = 3.14159265;


    public void printSquare() {

        double squareCircle = PI*r*r;
        System.out.println("Площадь Круга= " + squareCircle);
    }
    public void printPerimeter() {

        System.out.println("Периметр Kруга= " + (2*PI*r));
    }
}
