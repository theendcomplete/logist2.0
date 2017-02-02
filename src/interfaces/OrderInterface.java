package interfaces;


import classes.Order;

import java.sql.SQLException;
import java.util.Collection;

public interface OrderInterface {

    void addOrder(Order order) throws SQLException;

    void updateOrder(Long id, Order order) throws SQLException;

    Order getOrderById(Long id) throws SQLException;

    Collection getAllOrders() throws SQLException;

    void deleteOrder(Order order) throws SQLException;

//    public Collection getByDriver(Driver driver) throws SQLException;
//    public Collection getBussesByRoute(Route route) throws SQLException;

}