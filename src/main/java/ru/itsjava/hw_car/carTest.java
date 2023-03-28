package ru.itsjava.hw_car;

public class carTest {

    public static void main(String[] args) {

        Car lada = new Car("Lada", "white");

        Car bentley = new Car("Bentley", "black");

        System.out.println("bentley.color = " + bentley.color);
        System.out.println("bentley.brand = " + bentley.brand);
        System.out.println("bentley.getPrice() = " + bentley.getPrice());
        System.out.println();
        System.out.println("lada.color = " + lada.color);
        System.out.println("lada.brand = " + lada.brand);
        System.out.println("lada.getPrice() = " + lada.getPrice());
    }
}
