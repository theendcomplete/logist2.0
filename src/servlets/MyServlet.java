package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
//            user = (User) request.getAttribute("user");
//            request.setAttribute("user", user);
            request.getRequestDispatcher("/WEB-INF/lk.jsp").forward(request, response);
        } else
            request.getRequestDispatcher("/login").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

//        User user = new User();
        if (request.getSession().getAttribute("user") != null) {
//            user = (User) request.getSession().getAttribute("user");
//            request.setAttribute("user", user);
            request.getRequestDispatcher("/WEB-INF/lk.jsp").forward(request, response);
        } else
            request.getRequestDispatcher("/login").forward(request, response);
    }
}
