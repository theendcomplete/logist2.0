package implementations;

import classes.Order;
import factories.HibernateUtil;
import interfaces.OrderInterface;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by theendcomplete on 19.01.2017.
 */
public class OrderInterfaceImplementation implements OrderInterface {

    @Override
    public void addOrder(Order order) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ошибка при вставке " + e);
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }

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
