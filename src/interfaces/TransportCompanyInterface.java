package interfaces;


import classes.TransportCompany;

import java.sql.SQLException;
import java.util.Collection;

public interface TransportCompanyInterface {

    void addTc(TransportCompany transportCompany) throws SQLException;

    void updateTc(Long id, TransportCompany transportCompany) throws SQLException;

    TransportCompany getTcById(Long id) throws SQLException;

    Collection getAllTcs() throws SQLException;

    void deleteTc(TransportCompany transportCompany) throws SQLException;


//    public Collection getByDriver(Driver driver) throws SQLException;
//    public Collection getBussesByRoute(Route route) throws SQLException;

}