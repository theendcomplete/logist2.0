package interfaces;


import classes.Car;
import classes.Contact;

import java.sql.SQLException;
import java.util.Collection;

public interface ContactInterface {

    void addContact(Contact contact) throws SQLException;

    void updateContact(Long id, Contact contact) throws SQLException;

    Car getContactById(Long id) throws SQLException;

    Collection getAllContacts() throws SQLException;

    void deleteContact(Contact contact) throws SQLException;

    Contact searchContactByName(String name, String phone) throws SQLException;


//    public Collection getByDriver(Driver driver) throws SQLException;
//    public Collection getBussesByRoute(Route route) throws SQLException;

}