package classes;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class Driver {
    private Long driver_ID;
    private String name;
    private Set Drivers = new HashSet();
    private Collection<Car> car;
    private Collection<Order> orders;

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

    public Set getDrivers() {
        return Drivers;
    }

    public void setDrivers(Set drivers) {
        Drivers = drivers;
    }

    public Collection<Car> getCar() {
        return car;
    }

    public void setCar(Collection<Car> car) {
        this.car = car;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public void setOrders(Collection<Order> orders) {
        this.orders = orders;
    }
    //    public Long getDriver_ID() {
//        return driver_ID;
//    }
//
//    public void setDriver_ID(Long driver_ID) {
//        this.driver_ID = driver_ID;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Set getDrivers() {
//        return Drivers;
//    }
//
//    public void setDrivers(Set drivers) {
//        Drivers = drivers;
//    }
//
//    public Collection<Car> getCar() {
//        return car;
//    }
//
//    public void setCar(Collection<Car> car) {
//        this.car = car;
//    }
//
//    public Collection<Order> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(Collection<Order> orders) {
//        this.orders = orders;
//    }
}
