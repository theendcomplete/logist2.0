package classes;

import java.util.HashSet;
import java.util.Set;

public class Car {
    private Long car_ID;
    private String number;
    private String model;
    private Set Cars = new HashSet();

    public Car() {
    }

    public Long getCar_ID() {
        return car_ID;
    }

    public void setCar_ID(Long car_ID) {
        this.car_ID = car_ID;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Set getCars() {
        return Cars;
    }

    public void setCars(Set cars) {
        Cars = cars;
    }
}
