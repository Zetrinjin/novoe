<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<%@taglib prefix="c" uri="jakarta.tags.core"%>

<%@include file="header.jsp"%>


<div>
    <table border="1" >
        <thead>
        <tr>
            <th>News ID</th>
            <th>News title</th>
            <th>News headline</th>
        </tr>
        </thead>

        <tbody>
             <c:forEach var="news" items="${newsList}" >
                                <tr>
                                    <td> <c:out value="${news.id}" />${news.id}</td>
                                    <td><c:out value="${news.title" />}</td>
                                    <td><c:out value="${news.headline}" /></td>

                                </tr>
                            </c:forEach>
        </tbody>
    </table>
</div>


<%@include file="footer.jsp"%>