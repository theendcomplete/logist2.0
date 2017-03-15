package servlets;

import classes.User;
import implementations.OrderInterfaceImplementation;
import implementations.UserInterfaceImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by theendcomplete on 06.03.2017.
 */
@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
//        User user = new User();
        if (request.getSession().getAttribute("user") != null) {
            User user = (User) request.getSession().getAttribute("user");
            Collection resultOrders = getOrdersByUser(user);
            request.setAttribute("orders", resultOrders);
            request.getRequestDispatcher("/WEB-INF/lk.jsp").forward(request, response);
        }
        if (request.getParameter("name") != null) {
            User user = findUserByName(request.getParameter("name"));
            request.getSession().setAttribute("user", user);
            Collection resultOrders = getOrdersByUser(user);
            request.setAttribute("orders", resultOrders);
            request.getRequestDispatcher("/WEB-INF/lk.jsp").forward(request, response);


        } else {
            request.setAttribute("action", "lk");
            request.getRequestDispatcher("/historyLogin.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        if (request.getSession().getAttribute("user") != null) {
            User user = (User) request.getSession().getAttribute("user");
            Collection resultOrders = getOrdersByUser(user);
            request.setAttribute("orders", resultOrders);
            request.getRequestDispatcher("/WEB-INF/lk.jsp").forward(request, response);
        } else {
            request.setAttribute("action", "lk");
            request.getRequestDispatcher("/historyLogin.jsp").forward(request, response);
        }
    }

    private Collection getOrdersByUser(User user) {

        OrderInterfaceImplementation orderInterfaceImplementation = new OrderInterfaceImplementation();
        try {
            return orderInterfaceImplementation.getOrdersByUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    private User findUserByName(String name) {
        UserInterfaceImplementation userInterfaceImplementation = new UserInterfaceImplementation();
        User user = new User();
        user.setName(name);

        try {
            user = userInterfaceImplementation.getUserByName(name);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;

    }

}
