package interfaces;


import classes.User;

import java.sql.SQLException;
import java.util.Collection;

public interface UserInterface {

    void addUser(User user) throws SQLException;

    void updateUser(Long id, User user) throws SQLException;

    User getUserById(Long id) throws SQLException;

    User getUserByName(String name) throws SQLException;

    Collection getAllUsers() throws SQLException;

    void deleteUser(User user) throws SQLException;


//    public Collection getByDriver(Driver driver) throws SQLException;
//    public Collection getBussesByRoute(Route route) throws SQLException;

}