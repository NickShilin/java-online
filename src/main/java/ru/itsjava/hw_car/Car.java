package ru.itsjava.hw_car;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {
    public String brand;
    private static double price = 250_000;

    public String color;

    public double getPrice(){

        return price;
    }

}
