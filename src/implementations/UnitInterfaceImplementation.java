package implementations;

import classes.Car;
import classes.Unit;
import factories.HibernateUtil;
import interfaces.UnitInterface;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by theendcomplete on 19.01.2017.
 */
public class UnitInterfaceImplementation implements UnitInterface {


    @Override
    public void addUnit(Unit unit) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(unit);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ошибка при добавлении единицы измерения " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void updateUnit(Long id, Unit unit) throws SQLException {


    }

    @Override
    public Unit getUnitById(Long id) throws SQLException {
        Session session = null;
        Unit unit = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            unit = session.load(Unit.class, id);
        } catch (Exception e) {
            System.out.println("ошибка при поиске по айди единицы измерения " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return unit;
    }

    @Override
    public Collection getAllUnits() throws SQLException {

        Session session = null;
        List units = new ArrayList<Unit>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            units = session.createCriteria(Car.class).list();
        } catch (Exception e) {
            System.out.println("ошибка при получении списка всех единиц измерения " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return units;

    }

    @Override
    public void deleteUnit(Unit unit) throws SQLException {

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(unit);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ошибка при удалении единицы измерения " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

}
