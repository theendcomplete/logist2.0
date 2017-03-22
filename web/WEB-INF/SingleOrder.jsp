<%@ page import="classes.Order" %>
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

    <form class="form-horizontal" method="POST" action="${pageContext.request.contextPath}/saveOrder?action=logist">
        <fieldset class="col-md-12">
            <table class="table table-striped table-bordered table-hover">
                <thead>
                <th class='col-md-3'>Поле</th>
                <th class='col-md-3'>В заявке</th>
                <th class='col-md-3'>Изменить на</th>

                </thead>
                <tbody>
                <tr>
                    <%--id--%>
                    <td class="row alert-success">
                        ID
                    </td>
                    <td>
                        <%=order.getOrder_ID().toString()%>
                    </td>
                    <td class="row">
                        <%--<%=order.getOrder_ID().toString()%>--%>
                    </td>
                </tr>
                <tr>
                    <td class="row alert-success">
                        Адрес
                    </td>
                    <td class="row">
                        <%=order.getAddress()%>
                    </td>
                    <td class="row">
                        <%--<%=order.getOrder_ID().toString()%>--%>
                    </td>
                </tr>
                <tr>
                    <td class="row alert-success">
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
                    <td class="row">
                        <div class='col-md-9'>
                            <div class="form-group">
                                <div class='input-group date ' name='workDate' id='workDate' required="true">
                                    <input type='text' class="form-control" name='workDate'/>
                                    <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
                                </div>
                            </div>
                        </div>

                    </td>
                </tr>
                <tr>
                    <td class="row alert-success">
                        Статус
                    </td>
                    <td>
                        <%=order.getStatus()%>
                    </td>
                    <td class="row">
                        <div class='col-md-9'>

                            <div class="form-group">
                                <label for="status">Установить статус:</label>
                                <select class="form-control" name="status" id="status">
                                    <option>В работе</option>
                                    <option>Готово</option>
                                    <option>Новая</option>
                                    <option>Отменена</option>
                                </select>
                            </div>
                        </div>
                        <%--<%=order.getOrder_ID().toString()%>--%>
                    </td>
                </tr>
                <tr>
                    <td class="row alert-success">
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
                    <td class="row alert-success">
                        Сумма
                    </td>
                    <td>
                        <%=order.getSum()%>
                    </td>
                    <td class="row">
                        <div class='col-md-9'>
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
                        </div>
                    </td>
                </tr>
                <tr>
                    <td class="row alert-success">
                        Водитель
                    </td>
                    <td>
                        <%=order.getDriver().getName()%>
                    </td>
                    <td class="row">
                        <div class='col-md-9'>
                            <div class="form-group">
                                <label for="driver">Кто поедет:</label>
                                <select class="form-control" name="driver" id="driver">
                                    <option value="1">Андрей Шишкин</option>
                                    <option value="3">Владимир Зотов</option>
                                    <option value="2">Евгений Савин</option>
                                    <option value="4">Константин Мациборко</option>
                                    <option value="6">Николай Гусев</option>
                                    <option value="7">Сергей Ходов</option>
                                    <option value="5">Не назначен</option>
                                </select>
                            </div>
                        </div>
                    </td>
                </tr>
                </tbody>

            </table>

            <input type="hidden" name="id" value="<%=order.getOrder_ID()%>">

            <div class="form-group">
                <%--<label class="col-md-4 control-label" for="confirm">Отправить заявку</label>--%>
                <label class="col-md-3 control-label" for="confirm"></label>
                <div class="col-md-3">
                    <button id="confirm" align="center" name="confirm" class="btn btn-primary">Сохранить</button>
                </div>
            </div>
            <%--<input class="button" align="right" type="submit" value="Сохранить"/>--%>

        </fieldset>
    </form>
    <%--</div>--%>

    <%
        }
    %>

    <%--<%=order.getStartDate().toString()%>--%>


</div> <!-- /container -->


</body>

<script type="text/javascript">
    $(function () {
        $('#workDate').datetimepicker({
            useCurrent: false, //Important! See issue #1075
            sideBySide: true,
            locale: 'ru',
            defaultDate: moment().add(1, 'days'),
            format: 'DD.MM.YYYY, HH:mm'
        });


    });
</script>

</html>
