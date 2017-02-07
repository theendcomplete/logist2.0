package classes;

public class Driver {
    private Long driver_ID;
    private String name;
    private classes.Car Car;

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


    public classes.Car getCar() {
        return Car;
    }

    public void setCar(classes.Car car) {
        Car = car;
    }
}
