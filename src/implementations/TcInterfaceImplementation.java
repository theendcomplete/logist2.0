package implementations;

import classes.TransportCompany;
import factories.HibernateUtil;
import interfaces.TransportCompanyInterface;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by theendcomplete on 19.01.2017.
 */
public class TcInterfaceImplementation implements TransportCompanyInterface {


    @Override
    public void addTc(TransportCompany transportCompany) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(transportCompany);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ошибка при добавлении транспортной компании  " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void updateTc(Long id, TransportCompany transportCompany) throws SQLException {


    }

    @Override
    public TransportCompany getTcById(Long id) throws SQLException {
        Session session = null;
        TransportCompany transportCompany = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transportCompany = session.load(TransportCompany.class, id);
        } catch (Exception e) {
            System.out.println("ошибка при получении транспортной компании по айди " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return transportCompany;
    }

    @Override
    public Collection getAllTcs() throws SQLException {

        Session session = null;
        List tcs = new ArrayList<TransportCompany>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tcs = session.createCriteria(TransportCompany.class).list();
        } catch (Exception e) {
            System.out.println("ошибка при получении списка транспортных компаниий " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return tcs;

    }

    @Override
    public void deleteTc(TransportCompany transportCompany) throws SQLException {


        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(transportCompany);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ошибка при удалении транспортной компании " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

}
