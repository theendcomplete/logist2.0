package classes;

public class Car {
    private Long car_ID;
    private String number;
    private String model;

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
}
