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

    <p>Для изменения заявки достаточно кликнуть по ней мышью</p>
    <%--<p>Список заявок со статусом "new"--%>
    <form class="form-horizontal" method="POST" action="${pageContext.request.contextPath}/logist?action=filter">
        <%--<div class="container">--%>
        <fieldset class="col-md-16">

            <div class="form-group col-md-4">
                <label for="status">Фильтровать по статусу:</label>
                <select class="form-control" name="status" id="status">
                    <option>Любой</option>
                    <option>В работе</option>
                    <option>Готово</option>
                    <option>Новая</option>
                    <option>Отменена</option>
                </select>
            </div>

            <div class='col-md-4'>
                <div class="form-group">
                    <label for="driver">По водителю</label>
                    <select class="form-control" name="driver" id="driver">
                        <option value="5">Любой\Не назначен</option>
                        <option value="1">Андрей Шишкин</option>
                        <option value="3">Владимир Зотов</option>
                        <option value="2">Евгений Савин</option>
                        <option value="4">Константин Мациборко</option>
                        <option value="6">Николай Гусев</option>
                        <option value="7">Сергей Ходов</option>
                    </select>
                </div>
            </div>


            <div class="form-group col-md-4">
                <label class="col-md-4 control-label" for="startDate">По дате</label>
                <div class="col-md-12">
                    <%--<div class="container">--%>
                    <%--<label class="col-md-4 control-label" for="startDate"> с </label>--%>
                    <div class='col-md-6'>
                        <div class="form-group">
                            <div class='input-group date' name='startDate' id='startDate' required="true">
                                <input type='text' class="form-control" name='startDate'/>
                                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
                            </div>
                        </div>
                    </div>

                    <div class='col-md-6'>
                        <%--<label class="col-md-4 control-label" for="endDate"></label>--%>
                        <div class="form-group">
                            <div class='input-group date' name='endDate' id='endDate' required="true">
                                <input type='text' class="form-control" name='endDate'/>
                                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
                            </div>
                            <div class="col-md-4">
                                <%--<button id="confirm" name="confirm" class="btn btn-primary">Фильтровать</button>--%>
                                <button id="confirm" name="confirm" class="btn btn-primary">Фильтровать</button>
                            </div>
                        </div>

                    </div>


                </div>
                <%--<div class="col-md-6">--%>
                <%--<button id="confirm" name="confirm" class="btn btn-primary">Фильтровать</button>--%>
                <%--</div>--%>
                <%--</div>--%>

            </div>
            <%--<label class="col-md-4 control-label" for="confirm"></label>--%>

            <%--<div class="form-group col-md-4">--%>
            <%--<label class="col-md-4 control-label" for="confirm"></label>--%>


        </fieldset>
        <%--</div>--%>

    </form>
    <%--</p>--%>

    <table class="table table-striped table-bordered table-hover">
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

        <% if (orders.size() > 0) {
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
                <%=order.getUser().getName().toString()%>
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
                <%=order.getDriver().getName()%>
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
<script type="text/javascript">
    $(function () {
        $('#startDate').datetimepicker({
            useCurrent: false, //Important! See issue #1075
            sideBySide: true,
            locale: 'ru',
//            defaultDate: moment().add(1, 'days'),
            format: 'DD.MM.YYYY, HH:mm'
        });
        $('#endDate').datetimepicker({
            useCurrent: false, //Important! See issue #1075
            sideBySide: true,
            locale: 'ru',
//            defaultDate: moment().add(2, 'days'),
            format: 'DD.MM.YYYY, HH:mm'
        });
        $("#startDate").on("dp.change", function (e) {
            $('#endDate').data("DateTimePicker").minDate(e.date);

        });
        $("#endDate").on("dp.change", function (e) {
            $('#startDate').data("DateTimePicker").maxDate(e.date);
        });
    });
</script>

</html>
