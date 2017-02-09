<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//RU" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>

<head>
    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/>

    <meta http-equiv="X-RU-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


    <title>Создание заявки на транспортировку</title>
    <script src="https://code.jquery.com/jquery-1.12.4.js" type="javascript"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js" type="javascript"></script>

    <script type="javascript">
        $(function () {
            $("#date_deadline").datepicker({
                dateFormat: "dd.mm.yy"
            });
        });
    </script>
    <%--//---Рабочий />--%>
</head>


<body bgcolor="#FFFFFF" text="#000000">


<%--<div class="container-narrow">--%>
<div class="container theme-showcase" role="main">
    <H1 class="text-center" style="margin: 10px 10px 10px 10px;">Создание заявки на транспортировку</H1>


    <div class="row">
        <div class="col-md-4">
            <div class="text" style="margin: 20px 20px 20px 20px;">
                Телефон отдела логистики: 1922 <br>
                e-mail:<a href="mailto:logist@dances.ru">logist@dances.ru</a>
            </div>
        </div>
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <div class="btn-group">
                <button type="button" class="btn btn-default">Анонимно</button>
                <button type="button" class="btn btn-default">Логин</button>
                <%--<button type="button" class="btn btn-default">Right</button>--%>
            </div>
        </div>

    </div>
    <div class="row">
        <div class="col-md-8">.col-md-8</div>
        <div class="col-md-4">.col-md-4</div>
    </div>
    <div class="row">
        <div class="col-md-4">.col-md-4</div>
        <div class="col-md-4">.col-md-4</div>
        <div class="col-md-4">.col-md-4</div>
    </div>
    <div class="row">
        <div class="col-md-6">

        </div>
        <div class="col-md-6">.col-md-6</div>
    </div>


</div>


</body>
</html>