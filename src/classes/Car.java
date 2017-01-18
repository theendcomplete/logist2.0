package classes;

import java.util.HashSet;
import java.util.Set;

public class Car {
    private Long id;
    private String number;
    private String model;
    private Set Cars = new HashSet();

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
