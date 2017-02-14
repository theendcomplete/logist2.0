package implementations;

import classes.Car;
import factories.HibernateUtil;
import interfaces.CarInterface;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by theendcomplete on 19.01.2017.
 */
public class CarInterfaceImplementation implements CarInterface {


    @Override
    public void addCar(Car car) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(car);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ошибка при добавлении машины " + e);
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }


    }

    @Override
    public void updateCar(Long id, Car car) throws SQLException {


    }

    @Override
    public Car getCarById(Long id) throws SQLException {
        Session session = null;
        Car car = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            car = session.load(Car.class, id);
        } catch (Exception e) {
            System.out.println("ошибка при поиске машины по айди " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return car;


    }

    @Override
    public Collection getAllCars() throws SQLException {

        Session session = null;
        List cars = new ArrayList<Car>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            cars = session.createCriteria(Car.class).list();
        } catch (Exception e) {
            System.out.println("ошибка при получении списка всех машин " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return cars;

    }

    @Override
    public void deleteCar(Car car) throws SQLException {


        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(car);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ошибка при удалении машины " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
