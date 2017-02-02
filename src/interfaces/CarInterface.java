package interfaces;


import classes.Car;

import java.sql.SQLException;
import java.util.Collection;

public interface CarInterface {

    public void addCar(Car car) throws SQLException;

    public void updateCar(Long id, Car car) throws SQLException;

    public Car getCarById(Long id) throws SQLException;

    public Collection getAllCars() throws SQLException;

    public void deleteCar(Car car) throws SQLException;

//    public Collection getByDriver(Driver driver) throws SQLException;
//    public Collection getBussesByRoute(Route route) throws SQLException;

}