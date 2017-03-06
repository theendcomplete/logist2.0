<%--
  Created by IntelliJ IDEA.
  User: theendcomplete
  Date: 14.02.2017
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="classes.Order" %>
<%@ page import="classes.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <title>Список заявок</title>


    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css"/>
    <%--<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.6/moment.min.js"></script>--%>
    <script src="${pageContext.request.contextPath}/resources/js/moment.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>


</head>

<script type="text/javascript">
    jQuery(document).ready(function ($) {
        $(".clickable-row").click(function () {
            window.location = $(this).data("href");
        });
    });
</script>

<body>

<%--<legend>--%>
<%--<H1 class="text-center" style="margin: 30px 30px 30px 30px;">Список заявок</H1>--%>
<%--</legend>--%>
<%--todo--%>

<%--http://stackoverflow.com/questions/28295313/display-an-arraylist-on-a-jsp-page--%>

<%
    User logist = new User();
    if (request.getAttribute("logist") != null) {
        logist = (User) request.getAttribute("logist");
        request.setAttribute("logist", logist);
    }
    ArrayList<Order> orders = new ArrayList();
    if (request.getAttribute("orders") != null) {
        orders = (ArrayList<Order>) request.getAttribute("orders");
    }
%>


<div class="container">
    <h2>Список заявок</h2>
    <p>Список заявок со статусом "new"</p>
    <p>Для изменения заявки достаточно кликнуть( по ней мышью</p>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>Заказал</th>
            <th>Адрес</th>
            <th>С</th>
            <th>По</th>
            <th>О грузе</th>
            <th>Комментарий</th>
            <th>Статус</th>
            <th>Кнопка</th>
        </tr>
        </thead>
        <tbody>

        <% if (orders.size() > 0) {
            for (int i = 0; i < orders.size(); i++) {
                Order order = orders.get(i);
                Long orderId = order.getOrder_ID();
        %>
        <%--class="success"--%>
        <%--<tr>--%>
        <tr class='clickable-row'
            data-href="${pageContext.request.contextPath}/single_order?order=<%=orderId.toString()%>"
        >
            <%--id--%>
            <td>
                <%=order.getOrder_ID().toString()%>
            </td>
            <%--Заказал--%>
            <td>
                <%--<%=order.getUser().toString()%>--%>
            </td>
            <%--Адрес--%>
            <td>
                <%=order.getAddress()%>
            </td>
            <%--С--%>
            <td>
                <%=order.getStartDate().toString()%>
            </td>
            <%--По--%>
            <td>
                <%=order.getEndDate().toString()%>
            </td>
            <%--О грузе--%>
            <td>
                <%=order.getCargo()%>
            </td>
            <%--Комментарий--%>
            <td>
                <%=order.getComment()%>
            </td>
            <%--Статус--%>
            <td>
                <%=order.getStatus()%>
            </td>
            <%--Кнопка--%>
            <td>
                <%=order.getOrder_ID().toString()%>
            </td>
        </tr>

        <%
                }//конец итерации
            } //конец if'a
        %>

        </tbody>
    </table>
</div>


<br>


</body>


</html>
