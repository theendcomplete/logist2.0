package classes;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "drivers")
public class Driver {
    private Long id;
    private String name;
    private Car car;
    private Set Drivers = new HashSet();

    public Driver() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
