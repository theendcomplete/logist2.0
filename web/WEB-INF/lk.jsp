<%@ page import="classes.Order" %>
<%@ page import="classes.User" %>
<%@ page import="java.util.ArrayList" %>
<%--
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
    <title>Личный кабинет</title>


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
    User user = new User();
    if ((request.getSession().getAttribute("user") != null)) {
        user = (User) (request.getSession().getAttribute("user"));

        ArrayList<Order> orders = new ArrayList();
        if (request.getAttribute("orders") != null) {
            orders = (ArrayList<Order>) request.getAttribute("orders");
        }

%>


<div class="container">
    <h2>Список ваших заявок за последние 30 дней</h2>
    <%--<p>Список заявок со статусом "new"</p>--%>
    <table class="table table-striped">


        <% if (orders.size() > 0) {
        %>
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
            <th>Водитель</th>
        </tr>
        </thead>
        <tbody>
        <%

            for (int i = 0; i < orders.size(); i++) {
                Order order = orders.get(i);
                Long orderId = order.getOrder_ID();
        %>

        <% if (order.getStatus().equals("delegated")) {
        %>
        <tr class='clickable-row success'
            data-href="${pageContext.request.contextPath}/single_order?order=<%=orderId.toString()%>"
        >
                <%
                }
                else {
            %>
        <tr class='clickable-row'
            data-href="${pageContext.request.contextPath}/single_order?order=<%=orderId.toString()%>"
        ><%
            }
        %>
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
            <%--водитель--%>
            <td>
                <%=order.getDriver().getName()%>
            </td>
        </tr>

        <%
            }//конец итерации
        } else {%>
        <div class="container">
            <div class="text-center" style="margin: 30px 30px 30px 30px;">
                <H1> Нет активных заявок :(</H1>
            </div>
            <div class="image" align="center">
                <!--<img src="../resources/pict/success.jpg" height="453" width="604"/></div>-->
                <img src="${pageContext.request.contextPath}/resources/pict/noorders.jpg" height="453" width="604"/>
            </div>
        </div>
        <% }//конец if'a
        %>

        </tbody>
    </table>
</div>


<%
    }

%>
<%--<div class="container">--%>
<%--<div class="text-center" style="margin: 30px 30px 30px 30px;">--%>
<%--<H1> Нет активных заявок :(</H1>--%>
<%--</div>--%>
<%--<div class="image" align="center">--%>
<%--<!--<img src="../resources/pict/success.jpg" height="453" width="604"/></div>-->--%>
<%--<img src="${pageContext.request.contextPath}/resources/pict/noorders.jpg" height="422" width="600"/>--%>
<%--</div>--%>
<%--</div>--%>
<%


%>

<%--<%=order.getStartDate().toString()%>--%>
</div> <!-- /container -->


</body>
</html>
