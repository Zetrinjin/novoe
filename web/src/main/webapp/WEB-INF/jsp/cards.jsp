<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<%@include file="header.jsp"%>



<div>
<h2>Создание новой карты </h2>

    <form method="post" action="/web/cards"  >
        <label for="cardName">Имя </label>
        <input type="text" id="cardName" name="cardName" required ><br>


        <input type="submit" value="Создать" >
    </form>
 </div>

 <p>пусть будет какая то надпись</p>

<%@include file="footer.jsp"%>