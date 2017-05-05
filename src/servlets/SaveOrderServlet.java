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

        if (request.getParameter("action") == null) {
            Order order = new Order();
            order.setAddress(request.getParameter("address"));
//        order.setUser((User) request.getAttribute("user"));
            order.setWhom(request.getParameter("whom"));
            order.setTarget(request.getParameter("target"));
            order.setSum(request.getParameter("sum"));
            order.setCargo(request.getParameter("cargo"));
            order.setStatus("Новая");


            order.setDover(request.getParameter("dover"));
            order.setParking(request.getParameter("parking"));
            order.setHeat(request.getParameter("heat"));
            order.setWepay(request.getParameter("wepay"));
            order.setBig(request.getParameter("big"));

            if (request.getSession().getAttribute("user") != null) {
                order.setUser((User) request.getSession().getAttribute("user"));
            } else {

                User user = new User();
                user.setName(request.getParameter("name"));

                UserInterfaceImplementation userInterfaceImplementation = new UserInterfaceImplementation();
                try {
                    user = userInterfaceImplementation.getUserByName(user.getName());
                } catch (SQLException e) {
                    e.printStackTrace();
                    request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
                }

                if (user == null) {
                    user = new User();
                    user.setName(request.getParameter("name"));
                    user.setPin(UUID.randomUUID().toString());

                    try {
                        userInterfaceImplementation.addUser(user);
                    } catch (SQLException e) {
                        e.printStackTrace();
                        request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
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
                request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
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
                    request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
                }
            }

            order.setComment(request.getParameter("comment"));
            OrderInterfaceImplementation orderInterfaceImplementation = new OrderInterfaceImplementation();
            try {
                orderInterfaceImplementation.addOrder(order);
                request.getRequestDispatcher("/WEB-INF/success.html").forward(request, response);
            } catch (SQLException e) {
                e.printStackTrace();
                request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
            }
        }//getparameter("action")
        else {
            OrderInterfaceImplementation orderInterfaceImplementation = new OrderInterfaceImplementation();
            Order order = new Order();
            Driver driver = new Driver();
            DriverInterfaceImplementation driverInterfaceImplementation = new DriverInterfaceImplementation();
            try {
                order = orderInterfaceImplementation.getOrderById(Long.valueOf(request.getParameter("id")));
                order.setWorkDate(convertStringToDate(request.getParameter("workDate")));
                order.setStatus(request.getParameter("status"));
                driver = driverInterfaceImplementation.getDriverById(Long.valueOf(request.getParameter("driver")));
                order.setDriver(driver);
                orderInterfaceImplementation.updateOrder(order.getOrder_ID(), order);
//                request.getRequestDispatcher("/WEB-INF/success.html").forward(request, response);
                request.getRequestDispatcher("/logist").forward(request, response);
            } catch (SQLException e) {
//                e.printStackTrace();
                request.setAttribute("error", e);
                request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
            }

//            request.getRequestDispatcher("/WEB-INF/success.html").forward(request, response);
//            request.getRequestDispatcher("/logist").forward(request, response);
//              order.setDriver();

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

