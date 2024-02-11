<%--For displaying Previous link except for the 1st page--%>
        <c:if test="${currentPage != 1}">
            <td><a href="news?page=${currentPage - 1}">Previous</a></td>
        </c:if>

        <%--For displaying Page numbers.
        The when condition does not display a link for the current page--%>
        <table border="1" cellpadding="5" cellspacing="5">
            <tr>
                <c:forEach begin="1" end="${totalPages}" var="page">
                    <c:choose>
                        <c:when test="${currentPage eq page}">
                            <td>${page}</td>
                        </c:when>
                        <c:otherwise>
                            <td><a href="news?page=${page}">${page}</a></td>
                        </c:otherwise>
                    </c:choose>
                </c:forEach>
            </tr>
        </table>

        <%--For displaying Next link --%>
        <c:if test="${currentPage lt totalPages}">
            <td><a href="news?page=${currentPage + 1}">Next</a></td>
        </c:if>