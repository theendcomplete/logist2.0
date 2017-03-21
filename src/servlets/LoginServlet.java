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
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        UserInterfaceImplementation userInterfaceImplementation = new UserInterfaceImplementation();
        User user = null;
        try {
            user = userInterfaceImplementation.checkUserLoginAndPassword(request.getParameter("login"), request.getParameter("password"));
        } catch (SQLException e) {
            e.printStackTrace();
            PrintWriter out = response.getWriter();
            out.println("SQL Error " + e);
        }
        if (user != null) {
            if (user.getType().equals("user")) {
                request.getSession().setAttribute("user", user);
                request.getRequestDispatcher("/order").forward(request, response);
            } else if (user.getType().equals("logist")) {
                request.getSession().setAttribute("user", user);
                request.getRequestDispatcher("/logist").forward(request, response);
            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


        request.getRequestDispatcher("login.jsp").forward(request, response);


    }
}
