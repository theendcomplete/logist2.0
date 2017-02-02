package interfaces;


import classes.Unit;

import java.sql.SQLException;
import java.util.Collection;

public interface UnitInterface {

    public void addUnit(Unit unit) throws SQLException;

    public void updateUnit(Long id, Unit unit) throws SQLException;

    public Unit getUnitById(Long id) throws SQLException;

    public Collection getAllUnit() throws SQLException;

    public void deleteUnit(Unit unit) throws SQLException;

//    public Collection getByDriver(Driver driver) throws SQLException;
//    public Collection getBussesByRoute(Route route) throws SQLException;

}