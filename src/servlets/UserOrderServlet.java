package servlets;

import classes.Driver;
import implementations.DriverInterfaceImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by theendcomplete on 19.01.2017.
 */
@WebServlet(name = "UserOrderServlet")
public class UserOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Driver driver = new Driver();
        DriverInterfaceImplementation driverInterfaceImplementation = new DriverInterfaceImplementation();


//        try {
//            driverInterfaceImplementation.addDriver(driver);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
