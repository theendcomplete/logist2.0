package servlets;

import classes.Car;
import classes.Driver;
import implementations.CarInterfaceImplementation;
import implementations.DriverInterfaceImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by theendcomplete on 19.01.2017.
 */
@WebServlet(name = "UserOrderServlet")
public class CreateDriversServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Driver> driverList = new ArrayList<Driver>();
        List<Car> carList = new ArrayList<Car>();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");


        Car car1 = new Car();
        car1.setModel("Peugeot Boxer");
        car1.setNumber("О 693 АУ 777");


        Driver driver1 = new Driver();
        driver1.setCar(car1);
        driver1.setName("Андрей Шишкин");


        Car car2 = new Car();
        car2.setModel("VW Caddy");
        car2.setNumber("М 398 ВО 777");

        Driver driver2 = new Driver();
        driver2.setCar(car2);
        driver2.setName("Евгений Савин");

        Car car3 = new Car();
        car3.setModel("Ford Transit");
        car3.setNumber("О 277 УК 777");

        Driver driver3 = new Driver();
        driver3.setCar(car3);
        driver3.setName("Владимир Зотов");


        Car car4 = new Car();
        car4.setModel("Mercedes Sprinter");
        car4.setNumber("О 659 ВУ 777");
        driverList.add(driver1);
        driverList.add(driver2);
        driverList.add(driver3);
//        driverList.add(driver1);


        DriverInterfaceImplementation driverInterfaceImplementation = new DriverInterfaceImplementation();
        CarInterfaceImplementation carInterfaceImplementation = new CarInterfaceImplementation();

        for (Driver d : driverList) {
            try {
                driverInterfaceImplementation.addDriver(d);
                carInterfaceImplementation.addCar(d.getCar());
                PrintWriter out = response.getWriter();
                out.println("added: " + d.getName() + "  on car: " + d.getCar().getModel());
            } catch (SQLException e) {

                e.printStackTrace();
                PrintWriter out = response.getWriter();
                out.println("error: " + e);
            }
        }
    }
}
