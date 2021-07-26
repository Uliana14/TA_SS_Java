package HW_TA_JAVA_2;

import java.util.ArrayList;
import java.util.Objects;

public class Car implements Alarm, Vehicle{

    String brand;
    String model;
    int speed =0;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }
    public String getBrand() {
        return brand;
    }

    @Override
    public void speedUp(int speedToUp) {
      speed=speedToUp;
    }

    @Override
    public void slowDown(int speedToDown) {
        speed=speedToDown;
    }




}
