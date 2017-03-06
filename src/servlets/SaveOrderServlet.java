package servlets;

import classes.Contact;
import classes.Order;
import classes.User;
import implementations.ContactInterfaceImplementation;
import implementations.OrderInterfaceImplementation;

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


        order.setUser((User) request.getSession().getAttribute("user"));

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

