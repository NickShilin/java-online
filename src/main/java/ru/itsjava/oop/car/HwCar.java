package ru.itsjava.oop.car;
import lombok.Data;

//import java.util.Objects;
@Data
public class HwCar {

    private final String model;
    private double engine;

    public HwCar(String model, double engine) {
        this.model = model;
        this.engine = engine;
    }

    public HwCar(String model) {
        this.model = model;
    }

//    public HwCar(String model, double engine) {
//        this.model = model;
//        this.engine = engine;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        HwCar hwCar = (HwCar) o;
//
//        if (Double.compare(hwCar.engine, engine) != 0) return false;
//        return model.equals(hwCar.model);
//    }
//
//    @Override
//    public int hashCode() {
//        return model.hashCode();
//    }
//
//    @Override
//    public String toString() {
//        return "HwCar{" +  "model='" + model + ", engine=" + engine + '}';
//    }
}