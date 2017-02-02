package implementations;

import classes.Car;
import interfaces.CarInterface;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by theendcomplete on 19.01.2017.
 */
public class CarInterfaceImplementation implements CarInterface {


    @Override
    public void addCar(Car car) throws SQLException {

    }

    @Override
    public void updateCar(Long id, Car car) throws SQLException {

    }

    @Override
    public Car getCarById(Long id) throws SQLException {
        return null;
    }

    @Override
    public Collection getAllCars() throws SQLException {
        return null;
    }

    @Override
    public void deleteCar(Car car) throws SQLException {

    }
}
