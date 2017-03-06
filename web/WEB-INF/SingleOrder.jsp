<%@ page import="classes.Order" %><%--
  Created by IntelliJ IDEA.
  User: theendcomplete
  Date: 14.02.2017
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <title>Логин</title>


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
<body>


<%
    Order order = new Order();
    if (request.getAttribute("order") != null) {
        order = (Order) request.getAttribute("order");


%>


<div class="container">
    <h2>изменить заявку</h2>
    <%--<p>Список заявок со статусом "new"</p>--%>
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
        <tr>
            <%--id--%>
            <td>
                <%=order.getOrder_ID().toString()%>
            </td>
        </tr>
        </tbody>
    </table>
</div>

<%
    }


%>

<%=order.getStartDate().toString()%>
</div> <!-- /container -->


</body>
</html>
