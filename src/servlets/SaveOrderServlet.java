package servlets;

import classes.Contact;
import classes.Driver;
import classes.Order;
import classes.User;
import implementations.ContactInterfaceImplementation;
import implementations.DriverInterfaceImplementation;
import implementations.OrderInterfaceImplementation;
import implementations.UserInterfaceImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

//import java.time.format.DateTimeFormatter;

//import java.time.format.DateTimeFormatter;

//import java.time.LocalDate;
//import java.util.Date;

/**
 * Created by theendcomplete on 20.12.2016.
 */
@WebServlet(name = "SaveOrderServlet")
public class SaveOrderServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


        Order order = new Order();
        order.setAddress(request.getParameter("address"));
//        order.setUser((User) request.getAttribute("user"));
        order.setWhom(request.getParameter("whom"));
        order.setTarget(request.getParameter("target"));
        order.setSum(request.getParameter("sum"));
        order.setCargo(request.getParameter("cargo"));
        order.setStatus("new");


        order.setDover(request.getParameter("dover"));
        order.setParking(request.getParameter("parking"));
        order.setHeat(request.getParameter("heat"));
        order.setWepay(request.getParameter("wepay"));
        order.setBig(request.getParameter("big"));

        if (request.getSession().getAttribute("user") != null) {
            order.setUser((User) request.getSession().getAttribute("user"));
        } else {

            User user = null;
            user.setName(request.getParameter("name"));

            UserInterfaceImplementation userInterfaceImplementation = new UserInterfaceImplementation();
            try {
                user = userInterfaceImplementation.getUserByName(user.getName());
            } catch (SQLException e) {
                e.printStackTrace();
            }

            if (user == null) {
                user.setName(request.getParameter("name"));
                user.setPin(UUID.randomUUID().toString());

                try {
                    userInterfaceImplementation.addUser(user);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            order.setUser(user);

        }

        DriverInterfaceImplementation driverInterfaceImplementation = new DriverInterfaceImplementation();
        try {
            Driver noOne = driverInterfaceImplementation.getDriverById(5L);
            order.setDriver(noOne);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        order.setStartDate(convertStringToDate(request.getParameter("startDate")));
        order.setEndDate(convertStringToDate(request.getParameter("endDate")));
        order.setAddress(request.getParameter("address"));
        if (request.getParameter("contact_name") != null) {
            Contact contact = new Contact();
            contact.setName(request.getParameter("contact_name"));
            contact.setPhone(request.getParameter("contact_phone"));
            ContactInterfaceImplementation contactInterfaceImplementation = new ContactInterfaceImplementation();
            try {
                contactInterfaceImplementation.addContact(contact);
                order.setContact(contact);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        order.setComment(request.getParameter("comment"));
        OrderInterfaceImplementation orderInterfaceImplementation = new OrderInterfaceImplementation();
        try {
            orderInterfaceImplementation.addOrder(order);
            request.getRequestDispatcher("/WEB-INF/success.html").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
    }

    private Date convertStringToDate(String string) {
        Date date = new Date();
        Locale russianLocale = new Locale.Builder().setLanguage("ru").setRegion("RU").build();
        try {
            date = new SimpleDateFormat("dd.MM.yyyy, HH:mm", russianLocale).parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}

