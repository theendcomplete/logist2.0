package implementations;

import classes.Order;
import interfaces.OrderInterface;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by theendcomplete on 19.01.2017.
 */
public class OrderInterfaceImplementation implements OrderInterface {

    @Override
    public void addOrder(Order order) throws SQLException {
        
    }

    @Override
    public void updateOrder(Long id, Order order) throws SQLException {

    }

    @Override
    public Order getOrderById(Long id) throws SQLException {
        return null;
    }

    @Override
    public Collection getAllOrders() throws SQLException {
        return null;
    }

    @Override
    public void deleteOrder(Order order) throws SQLException {

    }
}
