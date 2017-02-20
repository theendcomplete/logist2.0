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

        if (request.getAttribute("user") != null) {
            user = (User) request.getAttribute("user");
        } else {
            if ((request.getAttribute("login") != null) && (request.getAttribute("password") != null)) {

                User userChecked = null;
                UserInterfaceImplementation userInterfaceImplementation = new UserInterfaceImplementation();
                try {
                    userChecked = userInterfaceImplementation.checkUserLoginAndPassword(user.getLogin(), user.getPassword());
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                if (userChecked != null)
                    user = userChecked;
            }
        }

//        System.out.println(user.getPassword());
//        System.out.println("Slayer123".hashCode());
        request.getRequestDispatcher("/order").forward(request, response);
//        response.sendRedirect("/order.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


        PrintWriter out = response.getWriter();
//        user = (User) request.getAttribute("user");
//        System.out.println(user.getPassword());
//        System.out.println("Slayer123".hashCode());
        out.println("it works, order.servlet");


        out.println("order");
        request.getRequestDispatcher("/order.jsp").forward(request, response);


    }

//
//    class PostDeleteAdapter extends HttpServletRequestWrapper {
//        public String getMethod(){ return "POST"; }
//    }
}
