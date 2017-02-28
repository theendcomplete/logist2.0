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


<form id="login-form" action="/saveTC" method="POST" role="form" class="form-horizontal">
    <legend>
        <H1 class="text-center" style="margin: 30px 30px 30px 30px;">Пожалуйста, введите данные транспортной</H1>
    </legend>

    <div class="form-group">
        <label class="col-md-4 control-label" for="name">Название</label>
        <div class="col-md-4">
            <input id="name" name="name" type="text" placeholder="например, ДЕловые линии"
                   class="form-control input-md" required="">
            <%--<span class="help-block">Нет логина? Жмите сюда -  <a href="/register.jsp">у меня нет логина</a></span>--%>
        </div>
    </div>

    <div class="form-group">
        <label class="col-md-4 control-label" for="address">Адрес</label>
        <div class="col-md-4">
            <input id="address" name="address" type="text" placeholder="например, 1-й Иртышский проезд, 10А, стр. 1"
                   class="form-control input-md" required="">
            <%--<span class="help-block">Нет логина? Жмите сюда -  <a href="/register.jsp">у меня нет логина</a></span>--%>
        </div>
    </div>
    <!-- File Button http://getbootstrap.com/css/#forms -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="fileinput" class="control-label">Схема проезда</label>
        <div class="col-md-4">

            <input type="file" id="fileinput" name="fileinput">
            <span class="help-block">Приложите схему проезда (необязатеьно)</span>
        </div>
    </div>

    <div class="form-group">
        <label class="col-md-4 control-label" for="phone">Телефон</label>
        <div class="col-md-4">
            <input id="phone" name="phone" type="text" placeholder="+7(495) 988 76 89"
                   class="form-control input-md" required="">
            <%--<span class="help-block">Нет логина? Жмите сюда -  <a href="/register.jsp">у меня нет логина</a></span>--%>
        </div>
    </div>

    <%--private String comment;--%>
    <%--private Order orders;--%>


    <!-- Password input-->
    <div class="form-group">
        <label class="col-md-4 control-label" for="comment">Комментарий</label>
        <div class="col-md-4">
            <input id="comment" name="comment" type="comment"
                   placeholder="например, 'вход со стороны синих ворот', или 'по вторникам на ресепшене неадекватная женщина' "
                   class="form-control input-md">
            <%--<span class="help-block">тут - ваш пароль, все так же при помощи клавиатуры</span>--%>
        </div>
    </div>

    <!-- Button  -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="saveTC"></label>
        <div class="col-md-12" align="center">
            <%--<button id="signin" name="signin" class="btn btn btn-primary">Войти</button>--%>
            <%--<button id="signin" name="signin" class="btn btn-primary">Войти</button>--%>
            <button id="saveTC" class="btn btn-primary">Сохранить</button>

        </div>
    </div>

    </fieldset>
</form>
<%--<a href="/order" class="btn btn-block" align="center">Заказать без логина</a>--%>
<%--<a href="/order" button id="register" name="register" class="btn btn-block" align="center">у меня нет логина</a>--%>

</div> <!-- /container -->


</body>
</html>
