package classes;

import java.util.HashSet;
import java.util.Set;


public class Driver {
    private Long driver_ID;
    private String name;
    private Car car;
    private Set Drivers = new HashSet();

    public Driver() {

    }

    public Long getDriver_ID() {
        return driver_ID;
    }

    public void setDriver_ID(Long driver_ID) {
        this.driver_ID = driver_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Set getDrivers() {
        return Drivers;
    }

    public void setDrivers(Set drivers) {
        Drivers = drivers;
    }
}
