package interfaces;


import classes.Car;
import classes.Contractor;

import java.sql.SQLException;
import java.util.Collection;

public interface ContractorInterface {

    void addContractor(Contractor contractor) throws SQLException;

    void updateContractor(Long id, Contractor contractor) throws SQLException;

    Car getContractorById(Long id) throws SQLException;

    Collection getAllContractors() throws SQLException;

    void deleteContractor(Contractor contractor) throws SQLException;


//    public Collection getByDriver(Driver driver) throws SQLException;
//    public Collection getBussesByRoute(Route route) throws SQLException;

}