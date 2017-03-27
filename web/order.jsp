<%@ page import="classes.User" %>
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
    <script src="${pageContext.request.contextPath}/resources/js/moment.js"></script>
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

<%

    User user = new User();
//    user.setLogin("anonimous");
    user.setName("");

    if (request.getSession().getAttribute("user") != null) {
        user = (User) request.getSession().getAttribute("user");
    }


%>
<div class="text-right">
    <a href="${pageContext.request.contextPath}/me"><%=user.getName()%> История заявок
    </a>
</div>

<%--<div class="container-narrow">--%>
<div class="container theme-showcase" role="main">

    <form class="form-horizontal" method="POST" action="${pageContext.request.contextPath}/saveOrder">
        <fieldset>

            <!-- Form Name -->
            <%--<legend>Создание заявки на транспорт</legend>--%>
            <legend>
                <H1 class="text-center" style="margin: 30px 30px 30px 30px;">Создание заявки на транспортировку</H1>
            </legend>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="name">Кто заказал</label>
                <div class="col-md-4">
                    <input id="name" name="name" type="text" placeholder="Ваше имя" class="form-control input-md"
                           required="true" maxlength="255" value="<%=user.getName()%>">
                    <span class="help-block">Вас так зовут</span>
                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="name">Кому отгружать</label>
                <div class="col-md-4">
                    <input id="whom" name="whom" type="whom" value="<%=user.getName()%>" placeholder="Кому отдать груз"
                           class="form-control input-md" maxlength="255">
                    <span class="help-block">Кому отдать?</span>
                </div>
            </div>

            <!-- Select Basic -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="target">Цель транспортировки</label>
                <div class="col-md-4">
                    <select id="target" name="target" class="form-control">
                        <option value="Доставить">Доставить что-то</option>
                        <option value="Забрать">Забрать что-то</option>
                        <option value="Другое">Другое</option>
                    </select>
                    <span class="help-block">Зачем нужна машина?</span>
                </div>
            </div>

            <!-- Textarea -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="cargo">Груз</label>
                <div class="col-md-4">
                    <textarea class="form-control" id="cargo" name="cargo" placeholder="О грузе"
                              required="true" maxlength="255"> </textarea>
                    <span class="help-block">Количество и единицы измерения, у кого забрать, нужно ли что-то дополнительное при перевозке</span>
                </div>

            </div>


            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="startDate">Время поездки</label>
                <div class="col-md-8">
                    <%--<div class="container">--%>
                    <%--<label class="col-md-4 control-label" for="startDate"> с </label>--%>
                    <div class='col-md-3'>
                        <div class="form-group">
                            <div class='input-group date' name='startDate' id='startDate' required="true">
                                <input type='text' maxlength="255" class="form-control" name='startDate'/>
                                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
                            </div>
                        </div>
                    </div>


                    <%--<label class="col-md-4 control-label" for="endDate"> по </label>--%>

                    <div class='col-md-3'>
                        <div class="form-group">
                            <div class='input-group date' name='endDate' id='endDate' required="true">
                                <input type='text' maxlength="255" class="form-control" name='endDate'/>
                                <span class="input-group-addon">
                    <span class="glyphicon glyphicon-calendar"></span>
                </span>
                            </div>
                        </div>
                    </div>
                </div>

                <script type="text/javascript">
                    $(function () {
                        $('#startDate').datetimepicker({
                            useCurrent: false, //Important! See issue #1075
                            sideBySide: true,
                            locale: 'ru',
                            defaultDate: moment().add(1, 'days'),
                            format: 'DD.MM.YYYY, HH:mm'
                        });
                        $('#endDate').datetimepicker({
                            useCurrent: false, //Important! See issue #1075
                            sideBySide: true,
                            locale: 'ru',
                            defaultDate: moment().add(2, 'days'),
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

                <%--</div>--%>
            </div>

            <div class="row">

            </div>


            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="sum">Сумма водителю</label>
                <div class="col-md-4">
                    <input id="sum" name="sum" type="text" placeholder="1 000 рублей"
                           class="form-control input-md" maxlength="255">
                    <span class="help-block">Сумма к выдаче водителю (на отправку товара, парковку и т.д.)</span>
                </div>
            </div>


            <div class="form-group">
                <label class="col-md-4 control-label" for="address">Адрес</label>
                <div class="col-md-4">
                    <textarea class="form-control" id="address" name="address" placeholder="Куда ехать?"
                              required="true" maxlength="255"> </textarea>
                    <span class="help-block">В случае отправки транспортной - "Куда отправлять"</span>
                </div>
            </div>


            <!-- File Button http://getbootstrap.com/css/#forms -->
            <%--<div class="form-group">--%>
            <%--<label class="col-md-4 control-label" for="fileinput" class="control-label">Схема проезда</label>--%>
            <%--<div class="col-md-4">--%>

            <%--<input type="file" id="fileinput" name="fileinput">--%>
            <%--<span class="help-block">Приложите схему проезда (необязатеьно)</span>--%>
            <%--</div>--%>
            <%--</div>--%>

            <!-- Multiple Checkboxes (inline) -->
            <div class="form-group">
                <%--<label class="col-md-4 control-label" for="dop">Дополнительно</label>--%>
                <label class="col-md-4 control-label">Дополнительно</label>

                <div class="col-md-6 ">
                    <label class="checkbox-inline" for="dover">
                        <input type="checkbox" name="dover" id="dover" value="Доверенность">
                        Доверенность
                    </label>
                    <label class="checkbox-inline" for="parking">
                        <input type="checkbox" name="parking" id="parking" value="Платный въезд\парковка">
                        Платный въезд\парковка
                    </label>
                    <label class="checkbox-inline" for="heat">
                        <input type="checkbox" name="heat" id="heat" value="Теплом">
                        Отправлять теплом
                    </label>
                    <label class="checkbox-inline" for="wepay">
                        <input type="checkbox" name="wepay" id="wepay" value="За наш счёт">
                        Отправка за нас счёт
                    </label>
                    <label class="checkbox-inline" for="big">
                        <input type="checkbox" name="big" id="big" value="Габаритный груз">
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
                           class="form-control input-md" maxlength="255">
                    <span class="help-block">Кому звонить, если что?</span>
                </div>
            </div>

            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label" for="contact_phone">Контактный телефон</label>
                <div class="col-md-4">
                    <input id="contact_phone" name="contact_phone" type="text" placeholder="+7(888) 123 45 67"
                           class="form-control input-md" maxlength="255">
                    <span class="help-block">Куда звонить, если что?</span>
                </div>
            </div>

            <!-- Textarea -->
            <div class="form-group">
                <label class="col-md-4 control-label" for="comment" required="true">Комментарий</label>
                <div class="col-md-4">
                    <textarea class="form-control" id="comment" name="comment" maxlength="255"></textarea>
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