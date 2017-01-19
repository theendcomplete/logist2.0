package interfaces;


import classes.Driver;

import java.sql.SQLException;
import java.util.Collection;

public interface DriverInterface {

    public void addDriver(Driver driver) throws SQLException;

    public void updateDriver(Long id, Driver driver) throws SQLException;

    public Driver getDriverById(Long id) throws SQLException;

    public Collection getAllDrivers() throws SQLException;

    public void deleteDriver(Driver driver) throws SQLException;

//    public Collection getByDriver(Driver driver) throws SQLException;
//    public Collection getBussesByRoute(Route route) throws SQLException;

}