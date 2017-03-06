package servlets;

import classes.User;
import implementations.UserInterfaceImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by theendcomplete on 19.01.2017.
 */
@WebServlet(name = "UserOrderServlet")
public class UserOrderServlet extends HttpServlet {
    User user;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        if (request.getSession().getAttribute("user") != null) {
            user = (User) request.getSession().getAttribute("user");
            if (user.getType().equals("logist")) {
                request.setAttribute("logist", user);
                request.getRequestDispatcher("/logist").forward(request, response);
            }
        } else {
            if ((request.getParameter("login") != null) && (request.getParameter("password") != null)) {
                String login = request.getParameter("login");
                String password = request.getParameter("password");
                User userChecked = null;
                UserInterfaceImplementation userInterfaceImplementation = new UserInterfaceImplementation();
                try {
                    userChecked = userInterfaceImplementation.checkUserLoginAndPassword(login, password);
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                if (userChecked != null)
                    user = userChecked;
//                request.setAttribute("user", userChecked);
                request.getSession().setAttribute("user", userChecked);

            }
        }
//        Order order = new Order();
//        OrderInterfaceImplementation orderInterfaceImplementation = new OrderInterfaceImplementation();
//        try {
//            orderInterfaceImplementation.addOrder(order);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        request.getRequestDispatcher("/order.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


        PrintWriter out = response.getWriter();
        out.println("it works, order.servlet");


        if (user != null) {
            request.setAttribute("user", user);
        }
        out.println("order");
        request.getRequestDispatcher("/order.jsp").forward(request, response);


    }
}
