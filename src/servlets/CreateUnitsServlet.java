//package servlets;
//
//import classes.Unit;
//import implementations.UnitInterfaceImplementation;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by theendcomplete on 19.01.2017.
// */
//@WebServlet(name = "CreateUnitsServlet")
//public class CreateUnitsServlet extends HttpServlet {
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Unit> unitList = new ArrayList<Unit>();
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//
//        Unit unit1 = new Unit();
//        unit1.setName("Шт.");
//        unitList.add(unit1);
//
//        Unit unit2 = new Unit();
//        unit2.setName("Пакет");
//        unitList.add(unit2);
//
//        Unit unit3 = new Unit();
//        unit3.setName("Паллет");
//        unitList.add(unit3);
//
//        Unit unit4 = new Unit();
//        unit4.setName("Другая");
//        unitList.add(unit4);
//
//        UnitInterfaceImplementation unitInterfaceImplementation = new UnitInterfaceImplementation();
//        for (Unit u : unitList) {
//            try {
//                unitInterfaceImplementation.addUnit(u);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
