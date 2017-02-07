package implementations;

import classes.Driver;
import factories.HibernateUtil;
import interfaces.DriverInterface;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by theendcomplete on 19.01.2017.
 */
public class DriverInterfaceImplementation implements DriverInterface {

    @Override
    public void addDriver(Driver driver) throws SQLException {

//        Order order = new Order();
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(driver);
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
    public void updateDriver(Long id, Driver driver) throws SQLException {

    }

    @Override
    public Driver getDriverById(Long id) throws SQLException {
        Session session = null;
        Driver driver = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            driver = session.load(Driver.class, id);
            driver.getCar();


        } catch (Exception e) {
            System.out.println("ошибка при поиске " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return driver;
    }

    @Override
    public Collection getAllDrivers() throws SQLException {
        return null;
    }

    @Override
    public void deleteDriver(Driver driver) throws SQLException {
    }
}
