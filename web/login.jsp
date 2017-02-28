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


<form id="login-form" action="/login" method="POST" role="form" class="form-horizontal">
    <legend>
        <H1 class="text-center" style="margin: 30px 30px 30px 30px;">Пожалуйста, представьтесь</H1>
    </legend>

    <div class="form-group">
        <label class="col-md-4 control-label" for="login">Имя пользователя</label>
        <div class="col-md-4">
            <input id="login" name="login" type="text" placeholder="например, ivanov"
                   class="form-control input-md" required="">

            <span class="help-block">Нет логина? Жмите сюда -  <a href="/register.jsp">у меня нет логина</a></span>


        </div>
    </div>

    <!-- Password input-->
    <div class="form-group">
        <label class="col-md-4 control-label" for="password">Пароль</label>
        <div class="col-md-4">
            <input id="password" name="password" type="password" placeholder="например, пароль"
                   class="form-control input-md" required="">
            <span class="help-block">тут - ваш пароль, все так же при помощи клавиатуры</span>
        </div>
    </div>

    <!-- Button  -->
    <div class="form-group">
        <label class="col-md-4 control-label" for="signin"></label>
        <div class="col-md-12" align="center">
            <%--<button id="signin" name="signin" class="btn btn btn-primary">Войти</button>--%>
            <%--<button id="signin" name="signin" class="btn btn-primary">Войти</button>--%>
            <button id="signin" class="btn btn-primary">Войти</button>

        </div>
    </div>

    </fieldset>
</form>
<a href="/order" class="btn btn-block" align="center">Заказать без логина</a>
<%--<a href="/order" button id="register" name="register" class="btn btn-block" align="center">у меня нет логина</a>--%>

</div> <!-- /container -->


</body>
</html>
