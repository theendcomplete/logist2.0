package servlets;

import classes.Car;
import implementations.CarInterfaceImplementation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by theendcomplete on 19.01.2017.
 */
@WebServlet(name = "UserOrderServlet")
public class CreateCarsServlet extends HttpServlet {
    public List<Car> carList = new ArrayList<Car>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

//        Car car1 = new Car();
//        car1.setModel("Peugeot Boxer");
//        car1.setNumber("О 693 АУ 777");
//        carList.add(car1);
//
//        Car car2 = new Car();
//        car2.setModel("VW Caddy");
//        car2.setNumber("М 398 ВО 777");
//        carList.add(car2);
//
//        Car car3 = new Car();
//        car3.setModel("Ford Transit");
//        car3.setNumber("О 277 УК 777");
//        carList.add(car3);
//
//        Car car4 = new Car();
//        car4.setModel("Mercedes Sprinter");
//        car4.setNumber("О 659 ВУ 777");
//        carList.add(car4);
//
//        CarInterfaceImplementation carInterfaceImplementation = new CarInterfaceImplementation();
//        for (Car c: carList) {
//            try {
//                carInterfaceImplementation.addCar(c);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Car> carList = new ArrayList<Car>();
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        Car car1 = new Car();
        car1.setModel("Peugeot Boxer");
        car1.setNumber("О 693 АУ 777");
        carList.add(car1);

        Car car2 = new Car();
        car2.setModel("VW Caddy");
        car2.setNumber("М 398 ВО 777");
        carList.add(car2);

        Car car3 = new Car();
        car3.setModel("Ford Transit");
        car3.setNumber("О 277 УК 777");
        carList.add(car3);

        Car car4 = new Car();
        car4.setModel("Mercedes Sprinter");
        car4.setNumber("О 659 ВУ 777");
        carList.add(car4);

        CarInterfaceImplementation carInterfaceImplementation = new CarInterfaceImplementation();
        for (Car c : carList) {
            try {
                carInterfaceImplementation.addCar(c);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
//
//
//
//        URL url = new URL("http://localhost:8080/Order");
//        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//        conn.setRequestMethod("POST");
//        conn.connect();
//        CarInterfaceImplementation carInterfaceImplementation = new CarInterfaceImplementation();
//        for (Car c: carList) {
//            try {
//                carInterfaceImplementation.addCar(c);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }


//        Driver driver = new Driver();
//        driver.s
//        DriverInterfaceImplementation driverInterfaceImplementation = new DriverInterfaceImplementation();


//        try {
//            driverInterfaceImplementation.addDriver(driver);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
