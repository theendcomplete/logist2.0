package servlets;

import classes.Order;
import implementations.OrderInterfaceImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by theendcomplete on 19.01.2017.
 */
@WebServlet(name = "SingleOrderServlet")
public class SingleOrderServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        if (request.getParameter("order") != null) {
            Order order = new Order();
            Long id = Long.valueOf(request.getParameter("order"));
            OrderInterfaceImplementation orderInterfaceImplementation = new OrderInterfaceImplementation();
            try {
                order = orderInterfaceImplementation.getOrderById(id);
                request.setAttribute("order", order);
                request.getRequestDispatcher("/WEB-INF/SingleOrder.jsp").forward(request, response);
            } catch (SQLException e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
            }
        }

    }
}
