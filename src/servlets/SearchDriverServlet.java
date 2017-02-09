package servlets;

import classes.Driver;
import implementations.DriverInterfaceImplementation;

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
public class SearchDriverServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


        DriverInterfaceImplementation driverInterfaceImplementation = new DriverInterfaceImplementation();
        Driver driver = null;
        try {
            driver = driverInterfaceImplementation.getDriverById((long) 3);
        } catch (SQLException e) {
            e.printStackTrace();
            PrintWriter out = response.getWriter();
            out.println("SQL Error " + e);
        }
        if (driver != null) {
            PrintWriter out = response.getWriter();
            out.println("Найден " + driver.getName() + " на " + driver.getCar().getModel());
        }
        PrintWriter out = response.getWriter();
        out.println("it works");

    }
}
