package ru.itsjava.oop.car;

public class HwTest {
    public static void main(String[] args) {
        HwCar bmw = new HwCar("BMW",  2.5);
        HwCar fiat = new HwCar("Fiat",  1.5);

        System.out.println("Bmw.equals(Fiat) = " + bmw.equals(fiat));

        System.out.println("bmw.toString() = " + bmw);
        System.out.println("fiat.toString() = " + fiat);

        System.out.println("bmw.getEngine() = " + bmw.getEngine());
        System.out.println("fiat.getEngine() = " + fiat.getEngine());

        bmw.setEngine(5.0);

        System.out.println("bmw.getEngine() = " + bmw.getEngine());
    }

}
