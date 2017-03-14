<%--
  Created by IntelliJ IDEA.
  User: theendcomplete
  Date: 15.02.2017
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>
<head>
    <title>Регистрация</title>


    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css"/>

    <%--<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.6/moment.min.js"></script>--%>
    <script src="/resources/js/moment.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>
</head>
<body>
<form class="form-horizontal" action="${pageContext.request.contextPath}/createUser" method="POST" role="form">
    <fieldset>

        <!-- Form Name -->
        <legend>
            <H1 class="text-center" style="margin: 30px 30px 30px 30px;">Регистрация</H1>
        </legend>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="name">Фамилия и Имя</label>
            <div class="col-md-4">
                <input id="name" name="name" type="text" placeholder="Вася Васин" class="form-control input-md"
                       required="">
                <span class="help-block">да, просто имя и фамилия</span>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="login">Имя пользователя</label>
            <div class="col-md-4">
                <input id="login" name="login" type="text" placeholder="vasin, pusik72, ivanovivan "
                       class="form-control input-md bfh-phone" required="">
                <span class="help-block">используется для входа</span>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="phone">Телефон</label>
            <div class="col-md-4">
                <%--<input id="phone" name="phone" type="tel" placeholder="+7 (888) 555 66 33" class="form-control input-md" required="">--%>
                <input id="phone" name="phone" type="tel" placeholder="+7 (888) 555 66 33"
                       class="form-control input-md " required="">
                <span class="help-block">Номер телефона для связи</span>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="email">Адрес почты</label>
            <div class="col-md-4">
                <input id="email" name="email" type="text" placeholder="pocta232@dances.ru"
                       class="form-control input-md" required="">
                <span class="help-block">Электронаая почта для уведомлений о судьбе ваших заявок</span>
            </div>
        </div>

        <!-- Password input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="password">Пароль</label>
            <div class="col-md-4">
                <input id="password" name="password" type="password" placeholder="********"
                       class="form-control input-md" required="">
                <span class="help-block">Пароль, постарайтесь не забыть</span>
            </div>
        </div>

        <!-- Password input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="password2">Повтор пароля</label>
            <div class="col-md-4">
                <input id="password2" name="password2" type="password" placeholder="********"
                       class="form-control input-md" required="">
                <span class="help-block">Повторите пароль, на всякий случай</span>
            </div>
        </div>

        <!-- Button -->
        <div class="form-group">
            <label class="col-md-4 control-label" for="confirm"></label>
            <div class="col-md-4">
                <button id="confirm" name="confirm" class="btn btn-primary">Сохранить</button>
            </div>
        </div>

    </fieldset>
</form>

</body>
</html>
