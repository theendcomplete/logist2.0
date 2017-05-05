package implementations;

import classes.User;
import factories.HibernateUtil;
import interfaces.UserInterface;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by theendcomplete on 13.02.2017.
 */
public class UserInterfaceImplementation implements UserInterface {
    @Override
    public void addUser(User user) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.createCriteria(User.class, "user").add(Restrictions.eq("user.name", user.getName())).uniqueResult();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ошибка при добавлении пользователя " + e);
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
            System.out.println("ошибка при поиске пользователя по id " + e);
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
            Criteria userCriteria = session.createCriteria(User.class);
            userCriteria.add(Restrictions.eq("name", name));

            user = (User) userCriteria.uniqueResult();
        } catch (Exception e) {
            System.out.println("ошибка при поиске пользователя по имени  " + e);
            throw new SQLException("ошибка при поиске пользователя по имени  ");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return user;
    }

    @Override
    public User getUserByLogin(String login) throws SQLException {
        Session session = null;
        User user = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            user = session.load(User.class, login);
        } catch (Exception e) {
            System.out.println("ошибка при поиске пользователя по логину  " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return user;
    }

    @Override
    public User checkUserLoginAndPassword(String login, String password) throws SQLException {
        Session session = null;
        User user = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria userCriteria = session.createCriteria(User.class);
            userCriteria.add(Restrictions.eq("login", login));
            userCriteria.add(Restrictions.eq("password", String.valueOf(password.hashCode())));
            user = (User) userCriteria.uniqueResult();
//            session.close();

        } catch (Exception e) {
            System.out.println("ошибка при поиске пользователя по логину и паролю  " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }


        return user;

    }

    @Override
    public Collection getAllUsers() throws SQLException {
        Session session = null;
        List users = new ArrayList<User>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            users = session.createCriteria(User.class).list();
        } catch (Exception e) {
            System.out.println("ошибка при получении списка пользователей " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return users;

    }

    @Override
    public void deleteUser(User user) throws SQLException {


        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ошибка при удалении " + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }
}
