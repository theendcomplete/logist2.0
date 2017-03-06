package servlets;

import classes.Order;
import classes.User;
import implementations.OrderInterfaceImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by theendcomplete on 19.01.2017.
 */
@WebServlet(name = "LogistServlet")
public class LogistServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.println("it works");

        out.println("logistPOST");


        User logist = new User();


        if (request.getSession().getAttribute("user") != null) {
            logist = (User) request.getSession().getAttribute("user");
            if (logist.getType().equals("logist")) {
                Collection resultOrders = getOrdersByStatus("new");
//                request.setAttribute("logist", logist);
//                request.getSession().setAttribute("user", logist);
                request.setAttribute("orders", resultOrders);
                request.getRequestDispatcher("/WEB-INF/logist.jsp").forward(request, response);
            } else
                request.getRequestDispatcher("/order").forward(request, response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


        PrintWriter out = response.getWriter();
        out.println("it works");

        out.println("logist");
        User logist = new User();
        if (request.getSession().getAttribute("user") != null) {
            logist = (User) request.getSession().getAttribute("user");
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
//            if (logist.getType().equals("logist")) {
//                Collection resultOrders = getOrdersByStatus("new");
//                request.setAttribute("logist", logist);
//                request.setAttribute("orders", resultOrders);
//                request.getRequestDispatcher("/WEB-INF/logist.jsp").forward(request, response);
//            } else
//                request.getRequestDispatcher("/order").forward(request, response);
        }


        request.getRequestDispatcher("/WEB-INF/logist.jsp").forward(request, response);

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
}
