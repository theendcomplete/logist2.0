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
    <%
        Order order = new Order();
        if (request.getAttribute("order") != null) {
            order = (Order) request.getAttribute("order");


    %>
    <title>
        Заявка № <%=order.getOrder_ID()%>
    </title>


    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css"/>

    <%--<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.6/moment.min.js"></script>--%>
    <script src="${pageContext.request.contextPath}/resources/js/moment.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" type="text/javascript"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" type="text/javascript"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"
            type="text/javascript"></script>
</head>
<body>


<div class="container">
    <h2>Изменить заявку</h2>
    <%--<p>Список заявок со статусом "new"</p>--%>
    <table class="table table-striped table-bordered table-hover">
        <thead>
        <th>Поле</th>
        <th>В заявке</th>
        <th>Изменить на</th>

        </thead>
        <tbody>
        <tr>
            <%--id--%>
            <td class="alert-success">
                ID
            </td>
            <td>
                <%=order.getOrder_ID().toString()%>
            </td>
            <td>
                <%--<%=order.getOrder_ID().toString()%>--%>
            </td>
        </tr>
        <tr>
            <td class="alert-success">
                Адрес
            </td>
            <td>
                <%=order.getAddress()%>
            </td>
            <td>
                <%--<%=order.getOrder_ID().toString()%>--%>
            </td>
        </tr>
        <tr>
            <td class="alert-success">
                Цель поездки
            </td>
            <td>
                <%=order.getTarget()%>
            </td>
            <td>
                <%--<%=order.getOrder_ID().toString()%>--%>
            </td>
        </tr>
        <tr>
            <td class="alert-success">
                С/По
            </td>
            <td>
                <%=order.getStartDate().toString()%>/
                <%--</td>--%>
                <%--<td>--%>
                <%=order.getEndDate().toString()%>
            </td>
            <td>

            </td>
        </tr>
        <tr>
            <td class="alert-success">
                Статус
            </td>
            <td>
                <%=order.getStatus()%>
            </td>
            <td>
                <%--<%=order.getOrder_ID().toString()%>--%>
            </td>
        </tr>
        <tr>
            <td class="alert-success">
                Кто заказал
            </td>
            <td>
                <%=order.getUser().getName().toString()%>
            </td>
            <td>
                <%--<%=order.getOrder_ID().toString()%>--%>
            </td>
        </tr>
        <tr>
            <td class="alert-success">
                Сумма
            </td>
            <td>
                <%=order.getSum()%>
            </td>
            <td>
                <p>
                    <%=order.getDover()%>
                </p>
                <p>
                    <%=order.getHeat()%>
                </p>
                <p>
                    <%=order.getWepay()%>
                </p>
                <p>
                    <%=order.getBig()%>
                </p>
                <p>
                    <%=order.getParking()%>
                </p>
            </td>
        </tr>
        <tr>
            <td class="alert-success">
                Водитель
            </td>
            <td>
                <%=order.getDriver().getName()%>
            </td>
            <td>

                <div class="form-group">
                    <label for="driver">Select list:</label>
                    <select class="form-control" id="driver">
                        <option>Андрей</option>
                        <option>Владимир</option>
                        <option>Евгений</option>
                        <option>Николай</option>
                    </select>
                </div>
                <%--<select name="driver">--%>
                <%--<option value="Андрей">Андрей</option>--%>
                <%--<option value="Владимир">Владимир</option>--%>
                <%--<option value="Евгений">Евгений</option>--%>
                <%--<option value="Сергей">Сергей</option>--%>
                <%--<option value="Николай">Николай</option>--%>
                <%--</select>--%>
            </td>
        </tr>
        </tbody>
    </table>
    <%--</div>--%>

    <%
        }
    %>

    <%=order.getStartDate().toString()%>


</div> <!-- /container -->


</body>
</html>
