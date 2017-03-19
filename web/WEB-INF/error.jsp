<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: theendcomplete
  Date: 19.03.2017
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
    <meta charset="UTF-8">
    <title>УПС!</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
    <div class="text-center" style="margin: 30px 30px 30px 30px;">
        <H1> Что-то тут пошло не так :( </H1>
    </div>
    <div class="image" align="center">
        <!--<img src="../resources/pict/success.jpg" height="453" width="604"/></div>-->
        <img src="../resources/pict/fail.jpg" height="394" width="434"/>
    </div>
    <div class="text-center" style="margin: 30px 30px 30px 30px;">
        <%
            Exception exception = new Exception();
            if (request.getParameter("error") != null) {
                exception = (SQLException) request.getAttribute("error");
            }
        %>
        <%=exception.printStackTrace()%>
    </div>
</div>
</body>
</html>
