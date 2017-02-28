package implementations;

import classes.Car;
import classes.Contact;
import factories.HibernateUtil;
import interfaces.ContactInterface;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by theendcomplete on 19.01.2017.
 */
public class ContactInterfaceImplementation implements ContactInterface {


    @Override
    public void addContact(Contact contact) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(contact);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("ошибка при добавлении Контакта " + e);
        } finally {
            if (session != null && session.isOpen()) {

                session.close();
            }
        }
    }

    @Override
    public void updateContact(Long id, Contact contact) throws SQLException {

    }

    @Override
    public Car getContactById(Long id) throws SQLException {
        return null;
    }

    @Override
    public Collection getAllContacts() throws SQLException {
        return null;
    }

    @Override
    public void deleteContact(Contact contact) throws SQLException {

    }

    @Override
    public Contact searchContactByName(String name, String phone) throws SQLException {
        Session session = null;
        Contact contact = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria userCriteria = session.createCriteria(Contact.class);
            userCriteria.add(Restrictions.eq("name", name));
            userCriteria.add(Restrictions.eq("phone", phone));
            contact = (Contact) userCriteria.uniqueResult();
//            session.close();

        } catch (Exception e) {
            System.out.println("ошибка при поиске Контакта по имени и номеру телефона" + e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return contact;
    }

}
