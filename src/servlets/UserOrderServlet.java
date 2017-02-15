package servlets;

import classes.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by theendcomplete on 19.01.2017.
 */
@WebServlet(name = "UserOrderServlet")
public class UserOrderServlet extends HttpServlet {
    User user;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        user = (User) request.getAttribute("user");
        System.out.println(user.getPassword());
        System.out.println("Slayer123".hashCode());

        request.getRequestDispatcher("/order.jsp").forward(request, response);


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
}
