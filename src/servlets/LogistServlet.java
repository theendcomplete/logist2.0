package servlets;

import classes.Driver;
import classes.Order;
import classes.User;
import implementations.DriverInterfaceImplementation;
import implementations.OrderInterfaceImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

/**
 * Created by theendcomplete on 19.01.2017.
 */
@WebServlet(name = "LogistServlet")
public class LogistServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("Недостаточно прав доступа");

        out.println("logistPOST");


        User logist = new User();
        Collection resultOrders;

        if (request.getSession().getAttribute("user") != null) {
            logist = (User) request.getSession().getAttribute("user");
            if (logist.getType().equals("logist")) {
                if (request.getParameter("action") != null) {

                    switch (request.getParameter("action")) {
                        case ("filter"):
                            Driver driver = new Driver();

                            DriverInterfaceImplementation driverInterfaceImplementation = new DriverInterfaceImplementation();
                            try {
                                driver = driverInterfaceImplementation.getDriverById(Long.valueOf(request.getParameter("driver")));
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                            Date startDate = convertStringToDate(request.getParameter("startDate"));
                            Date endDate = convertStringToDate(request.getParameter("endDate"));
                            String status = request.getParameter("status");
                            resultOrders = filterOrders(driver, startDate, endDate, status);
//            resultOrders.addAll(getOrdersByStatus("В работе"));
//            resultOrders.addAll(getOrdersByStatus("new"));
//                request.setAttribute("logist", logist);
//            request.getSession().setAttribute("user", logist);
                            request.setAttribute("orders", resultOrders);
                            request.getRequestDispatcher("/WEB-INF/logist.jsp").forward(request, response);
                            break;
                        case ("logist"):
                            resultOrders = getOrdersByStatus("Новая");
                            resultOrders.addAll(getOrdersByStatus("В работе"));
                            request.setAttribute("orders", resultOrders);
                            request.getRequestDispatcher("/WEB-INF/logist.jsp").forward(request, response);
                            break;
                        default:
                    }
//                    if (request.getParameter("action").equals("filter")) {
////                        Collection resultOrders = getOrdersByStatus(request.getParameter("status"));
//                        Driver driver = new Driver();
//
//                        DriverInterfaceImplementation driverInterfaceImplementation = new DriverInterfaceImplementation();
//                        try {
//                            driver = driverInterfaceImplementation.getDriverById(Long.valueOf(request.getParameter("driver")));
//                        } catch (SQLException e) {
//                            e.printStackTrace();
//                        }
//                        Date startDate = convertStringToDate(request.getParameter("startDate"));
//                        Date endDate = convertStringToDate(request.getParameter("endDate"));
//                        String status = request.getParameter("status");
//
//                        Collection resultOrders = filterOrders(driver, startDate, endDate, status);
//
////            resultOrders.addAll(getOrdersByStatus("В работе"));
////            resultOrders.addAll(getOrdersByStatus("new"));
////                request.setAttribute("logist", logist);
////            request.getSession().setAttribute("user", logist);
//                        request.setAttribute("orders", resultOrders);
//                        request.getRequestDispatcher("/WEB-INF/logist.jsp").forward(request, response);
////                    }
//                } else if (request.getParameter("action").equals("logist")) {
//                    Collection resultOrders = getOrdersByStatus("Новая");
//                    resultOrders.addAll(getOrdersByStatus("В работе"));
////                    resultOrders.addAll(getOrdersByStatus("new"));
//                    request.setAttribute("orders", resultOrders);
//                    request.getRequestDispatcher("/WEB-INF/logist.jsp").forward(request, response);
//
//                } else {
//                    Collection resultOrders = getOrdersByStatus("Новая");
//                    resultOrders.addAll(getOrdersByStatus("В работе"));
////                    resultOrders.addAll(getOrdersByStatus("new"));
//                    request.setAttribute("orders", resultOrders);
//                    request.getRequestDispatcher("/WEB-INF/logist.jsp").forward(request, response);
//                }
//
//            } else
//                request.getRequestDispatcher("/order").forward(request, response);
                } else {
                    resultOrders = getOrdersByStatus("Новая");
                    resultOrders.addAll(getOrdersByStatus("В работе"));
//                    resultOrders.addAll(getOrdersByStatus("new"));
                    request.setAttribute("orders", resultOrders);
                    request.getRequestDispatcher("/WEB-INF/logist.jsp").forward(request, response);
                }
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("it works");
        out.println("logist GET");
//        User logist = new User();
        if (request.getSession().getAttribute("user") != null) {
//            logist = (User) request.getSession().getAttribute("user");
            if (request.getAttribute("order") != null) {
                Order order = new Order();
                OrderInterfaceImplementation orderInterfaceImplementation = new OrderInterfaceImplementation();
                try {
                    order = orderInterfaceImplementation.getOrderById((Long) request.getAttribute("order"));
                    request.getRequestDispatcher("/order").forward(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }

//        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        request.getRequestDispatcher("/login").forward(request, response);

    }

    private Collection getOrdersByStatus(String status) {

        OrderInterfaceImplementation orderInterfaceImplementation = new OrderInterfaceImplementation();
        try {
            return orderInterfaceImplementation.getOrdersByStatus(status);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Collection filterOrders(Driver driver, Date startDate, Date endDate, String status) {

        OrderInterfaceImplementation orderInterfaceImplementation = new OrderInterfaceImplementation();
        try {
            return orderInterfaceImplementation.filterOrders(driver, startDate, endDate, status);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Date convertStringToDate(String string) {
        Date date = null;
        Locale russianLocale = new Locale.Builder().setLanguage("ru").setRegion("RU").build();
        if (string != null) {
            try {
                date = new SimpleDateFormat("dd.MM.yyyy, HH:mm", russianLocale).parse(string);
                return date;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return date;
    }
}
