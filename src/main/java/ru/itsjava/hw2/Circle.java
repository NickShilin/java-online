package ru.itsjava.hw2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle extends Figure {
    private int r;


    public void printSquare() {

        double squareCircle = PI*r*r;
        System.out.println("Площадь Круга= " + squareCircle);
    }
    public void printPerimeter() {

        System.out.println("Периметр Kруга= " + (2*PI*r));
    }
}
