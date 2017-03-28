package implementations;

import classes.Contact;
import classes.Driver;
import classes.Order;
import classes.User;
import factories.HibernateUtil;
import interfaces.OrderInterface;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

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
            e.printStackTrace();
            System.out.println("ошибка при добавлении заявки " + e);
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }

    }

    @Override
    public void updateOrder(Long id, Order order) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(order);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ошибка при добавлении заявки " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }


    @Override
    public Collection filterOrders(Driver driver, Date startDate, Date endDate, String status) throws SQLException {
        Session session = null;
        List orders = new ArrayList<Order>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria orderCriteria = session.createCriteria(Order.class);
            if (driver.getDriver_ID() != 5L) {
                orderCriteria.add(Restrictions.eq("Driver", driver));
            }
            if (!status.equals("Любой")) {
                orderCriteria.add(Restrictions.eq("status", status));
            }
            if (startDate != null) {
                orderCriteria.add(Restrictions.ge("workDate", startDate));
            }
            if (endDate != null) {
                orderCriteria.add(Restrictions.lt("workDate", endDate));
            }
            orders = session.createCriteria(Order.class).list();
            orders = orderCriteria.list();

        } catch (Exception e) {
            System.out.println("ошибка при поиске пользователя по логину и паролю  " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return orders;
    }


    @Override
    public Order getOrderById(Long id) throws SQLException {
        Session session = null;
        Order order = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            order = session.load(Order.class, id);
            Contact contact = order.getContact();
            Driver driver = order.getDriver();
            User user = order.getUser();

        } catch (Exception e) {
            System.out.println("ошибка при поиске заявки по айди " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return order;
    }

    @Override
    public Collection getAllOrders() throws SQLException {
        Session session = null;
        List orders = new ArrayList<Order>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            orders = session.createCriteria(Order.class).list();
        } catch (Exception e) {
            System.out.println("ошибка при получении списка заявок " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return orders;
    }

    @Override
    public Collection getOrdersByStatus(String status) throws SQLException {


        Session session = null;
        List orders = new ArrayList<Order>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria orderCriteria = session.createCriteria(Order.class);

            orderCriteria.add(Restrictions.eq("status", status));
            orders = session.createCriteria(Order.class).list();
            orders = orderCriteria.list();

        } catch (Exception e) {
            System.out.println("ошибка при поиске пользователя по логину и паролю  " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return orders;
//        return null;
    }

    @Override
    public Collection getOrdersByUser(User user) throws SQLException {
        Session session = null;
        List orders = new ArrayList<Order>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria orderCriteria = session.createCriteria(Order.class);

            orderCriteria.add(Restrictions.eq("user", user));
            orders = session.createCriteria(Order.class).list();
            orders = orderCriteria.list();
        } catch (Exception e) {
            System.out.println("ошибка при получении списка заявок " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return orders;
    }


    @Override
    public void deleteOrder(Order order) throws SQLException {

    }
}
