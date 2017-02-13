package implementations;

import classes.User;
import factories.HibernateUtil;
import interfaces.UserInterface;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by theendcomplete on 13.02.2017.
 */
public class UserInterfaceImplementation implements UserInterface {
    @Override
    public void addUser(User user) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
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
    public void updateUser(Long id, User user) throws SQLException {

    }

    @Override
    public User getUserById(Long id) throws SQLException {
        Session session = null;
        User user = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            user = session.load(User.class, id);
        } catch (Exception e) {
            System.out.println("ошибка при вставке " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return user;
    }

    @Override
    public User getUserByName(String name) throws SQLException {
        Session session = null;
        User user = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            user = session.load(User.class, name);
        } catch (Exception e) {
            System.out.println("ошибка при вставке " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return user;
    }

    @Override
    public Collection getAllUsers() throws SQLException {


        return null;
    }

    @Override
    public void deleteUser(User user) throws SQLException {

    }
}
