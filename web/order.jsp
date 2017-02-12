<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//RU" "http://www.w3.org/TR/html4/loose.dtd">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<html>

<head>

    <!-- Latest compiled and minified CSS -->
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


    <%--Работает--%>
    <!-- Latest compiled and minified CSS -->
    <%--<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"--%>
    <%--integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>

    <%--&lt;%&ndash;<!-- Optional theme -->&ndash;%&gt;--%>
    <%--<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"--%>
    <%--integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">--%>


    <%--<script src="https://code.jquery.com/jquery-1.12.4.js"></script>--%>
    <%--<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>--%>

    <%--<script src="resources/js/moment.js"></script>--%>
    <%--<script src="resources/js/transition.js"></script>--%>
    <%--<script src="resources/js/collapse.js"></script>--%>


    <%--/Работает--%>
    <%--<script src="resources/js/bootstrap-datetimepicker.js"></script>--%>
    <%--<link rel="stylesheet" href="resources/js/bootstrap-datetimepicker.css">--%>

    <%--<script type="text/javascript"--%>
    <%--src="${pageContext.request.contextPath}/resources/js/bootstrap-datetimepicker.js"></script>--%>

    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/>
    <meta http-equiv="X-RU-Compatible" content="IE=edge,chrome=1">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <title>Создание заявки на транспортировку</title>


</head>


<body bgcolor="#FFFFFF" text="#000000">


<%--<div class="container-narrow">--%>
<div class="container theme-showcase" role="main">

    <form class="form-horizontal">
        <fieldset>

            <!-- Form Name -->
            <%--<legend>Создание заявки на транспорт</legend>--%>
            <legend>
                <H1 class="text-center" style="margin: 10px 30px 10px 10px;">Создание заявки на транспортировку</H1>
            </legend>

            <div class="container">
                <div class="row">
                    <div class='col-sm-6'>
                        <div class="form-group">
                            <div class='input-group date' id='datetimepicker1'>
                                <input type='text' class="form-control"/>
                                <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
                            </div>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#datetimepicker1').datetimepicker();
                        });
                    </script>
                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="name">Ваше имя</label>
                <div class="col-md-5">
                    <input id="name" name="name" type="text" placeholder="Ваше имя" class="form-control input-md"
                           required="true">
                    <span class="help-block">Вас так зовут</span>
                </div>
            </div>


            <div class="form-group">
                <label class="col-md-4 control-label" for="name">Ваше имя</label>
                <div class="col-md-5">
                    <input id="whom" name="whom" type="whom" placeholder="Кому отдать груз"
                           class="form-control input-md"
                           required="true">
                    <span class="help-block">Кому отдать?</span>
                </div>
            </div>

            <!-- Select Basic -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="target">Цель транспортировки</label>
                <div class="col-md-4">
                    <select id="target" name="target" class="form-control">
                        <option value="1">Доставить что-то</option>
                        <option value="2">Забрать что-то</option>
                        <option value="3">Другое</option>
                    </select>
                    <span class="help-block">Зачем нужна машина?</span>
                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="startDate">Поездка с</label>
                <div class="col-md-4">


                    <div class="container">
                        <div class='col-md-3'>
                            <div class="form-group">
                                <div class='input-group date' id='datetimepicker6'>
                                    <input type='text' class="form-control"/>
                                    <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
                                </div>
                            </div>
                        </div>


                        <div class='col-md-3'>
                            <div class="form-group">
                                <div class='input-group date' id='datetimepicker7'>
                                    <input type='text' class="form-control"/>
                                    <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#datetimepicker6').datetimepicker({
                                useCurrent: false, //Important! See issue #1075
                                sideBySide: true,
                                locale: 'ru',
                                format: 'DD.MM.YYYY, HH:mm'
                            });
                            $('#datetimepicker7').datetimepicker({
                                useCurrent: false, //Important! See issue #1075
                                sideBySide: true,
                                locale: 'ru',
                                format: 'DD.MM.YYYY, HH:mm'
                            });
                            $("#datetimepicker6").on("dp.change", function (e) {
                                $('#datetimepicker7').data("DateTimePicker").minDate(e.date);
                            });
                            $("#datetimepicker7").on("dp.change", function (e) {
                                $('#datetimepicker6').data("DateTimePicker").maxDate(e.date);
                            });
                        });
                    </script>


                    <%----%>
                    <%--<input id="startDate" name="startDate" type="text" placeholder="Дата начала"--%>
                    <%--class="form-control input-md" required="true">--%>
                    <%--<span class="help-block">Когда можно будет забрать?</span>--%>
                </div>
            </div>

            <%--<!-- Text input-->--%>
            <%--<div class="form-group">--%>
            <%--<label class="col-md-4 control-label" for="endDate">Поездка по</label>--%>
            <%--<div class="col-md-4">--%>
            <%--<input id="endDate" name="endDate" type="text" placeholder="Крайний срок"--%>
            <%--class="form-control input-md" required="true">--%>
            <%--<span class="help-block">Когда станет поздно забирать?</span>--%>
            <%--</div>--%>
            <%--</div>--%>
            <%--<!-- Text input-->--%>


            <div class="row">

            </div>

            <!-- Textarea -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="address">Адрес</label>
                <div class="col-md-4">
                    <textarea class="form-control" id="address" name="address" placeholder="Куда ехать?"></textarea>
                </div>
            </div>

            <!-- File Button http://getbootstrap.com/css/#forms -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="fileinput" class="control-label">Схема проезда</label>
                <div class="col-md-4">

                    <input type="file" id="fileinput" name="fileinput">
                    <span class="help-block">Приложите схему проезда</span>
                </div>
            </div>


            <!-- Multiple Checkboxes (inline) -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="dop">Дополнительно</label>


                <div class="col-md-6 ">
                    <label class="checkbox-inline" for="dop-0">
                        <input type="checkbox" name="dop" id="dop-0" value="1">
                        Доверенность
                    </label>
                    <label class="checkbox-inline" for="dop-1">
                        <input type="checkbox" name="dop" id="dop-1" value="2">
                        Платный въезд\парковка
                    </label>
                    <label class="checkbox-inline" for="dop-2">
                        <input type="checkbox" name="dop" id="dop-2" value="3">
                        Отправлять теплом
                    </label>
                    <label class="checkbox-inline" for="dop-3">
                        <input type="checkbox" name="dop" id="dop-3" value="4">
                        Отправка за нас счёт
                    </label>
                    <label class="checkbox-inline" for="dop-4">
                        <input type="checkbox" name="dop" id="dop-4" value="5">
                        Габаритный груз
                    </label>
                </div>
            </div>


            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="contact_name">Контактное лицо:</label>
                <div class="col-md-4">
                    <input id="contact_name" name="contact_name" type="text"
                           placeholder="Введите имя контактного лица"
                           class="form-control input-md">
                    <span class="help-block">Кому звонить, если что?</span>
                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="contact_phone">Контактный телефон</label>
                <div class="col-md-4">
                    <input id="contact_phone" name="contact_phone" type="text" placeholder="+7(888) 123 45 67"
                           class="form-control input-md">
                    <span class="help-block">Куда звонить, если что?</span>
                </div>
            </div>


            <!-- Textarea -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="comment">Комментарий</label>
                <div class="col-md-4">
                    <textarea class="form-control" id="comment" name="comment"></textarea>
                    <span class="help-block">Давным-давно, в далёкой-далёкой галактике....</span>
                </div>
            </div>

            <!-- Button -->
            <div class="form-group">
                <%--<label class="col-md-4 control-label" for="confirm">Отправить заявку</label>--%>
                <label class="col-md-4 control-label" for="confirm"></label>
                <div class="col-md-4">
                    <button id="confirm" name="confirm" class="btn btn-primary">Отправить заявку</button>
                </div>
            </div>

        </fieldset>
    </form>


</div>

</div>
</div>

</body>

</html>