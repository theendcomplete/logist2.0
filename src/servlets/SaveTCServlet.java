package servlets;

import classes.TransportCompany;
import implementations.TcInterfaceImplementation;

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
@WebServlet(name = "SaveTCServlet")
public class SaveTCServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        TransportCompany tc = new TransportCompany();

        if (request.getParameter("name") != null) {
            tc.setName(request.getParameter("name"));
        }

        if (request.getParameter("address") != null) {
            tc.setAddress(request.getParameter("address"));
        }

        if (request.getParameter("phone") != null) {
            tc.setPhone(request.getParameter("phone"));
        }

        if (request.getParameter("comment") != null) {
            tc.setComment(request.getParameter("comment"));
        }

//        if (request.getParameter("fileinput") != null) {
//            tc.setImage(request.getParameter("fileinput"));
//        }

        TcInterfaceImplementation tcInterfaceImplementation = new TcInterfaceImplementation();
        try {
            tcInterfaceImplementation.addTc(tc);
            PrintWriter out = response.getWriter();
            out.println("it works, order.servlet");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        PrintWriter out = response.getWriter();
        out.println("Транспортная сохранена");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println("SaveTC, GET");

    }
}
