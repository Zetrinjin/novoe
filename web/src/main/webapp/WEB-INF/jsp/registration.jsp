<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="header.jsp"%>


<div >
    <h3>Добро пожаловать в регистрацию</h3>

    <form method="post"  action="/web/registration" >
        <label for="userName">Логин:</label>
        <input type="text" id="userName" name="userName" required ><br>


        <label for="password">Пароль:</label>
        <input type="text" id="password" name="password" required ><br>

        <input type="submit" value="Зарегистрироваться" >
    </form>
</div>


<%@include file="footer.jsp"%>