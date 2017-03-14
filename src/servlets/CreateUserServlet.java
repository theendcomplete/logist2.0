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
import java.util.UUID;

/**
 * Created by theendcomplete on 14.02.2017.
 */
@WebServlet(name = "CreateUserServlet")
public class CreateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


//        PrintWriter out = response.getWriter();
//        out.println("it works, CreateUserServlet POST");
        User u = createUser(request, response);
        if (u != null) {
            request.setAttribute("user", u);
            request.getRequestDispatcher("/order").forward(request, response);
        } else {
            PrintWriter out = response.getWriter();
            out.println("user = null, CreateUserServlet POST");
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


        PrintWriter out = response.getWriter();
        out.println("it works, CreateUserServlet GET");

        out.println("order");
//        request.getRequestDispatcher("/order").forward(request, response);
        response.sendRedirect("/order");
    }


    private User createUser(HttpServletRequest request, HttpServletResponse response) {
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setLogin(request.getParameter("login"));
        user.setPhone((request.getParameter("phone")));
        user.setEmail(request.getParameter("email"));
        user.setPassword(String.valueOf((request.getParameter("password")).hashCode()));
        user.setType("user");
//        UUID uuid = ;
//        String randomUUIDString = uuid.toString();
        user.setPin(UUID.randomUUID().toString());
        int hash = user.getPassword().hashCode();
        UserInterfaceImplementation userInterfaceImplementation = new UserInterfaceImplementation();
        try {
            userInterfaceImplementation.addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
            user = null;
        }
        return user;
    }
}
