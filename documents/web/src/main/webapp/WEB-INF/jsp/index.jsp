<%--
  Created by IntelliJ IDEA.
  User: Dina Maskalik
  Date: 03.03.2021
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="header.jsp"/>

<%--<ul class="list-group list-group-horizontal">--%>
<%--    <li class="list-group-item"><a class="page-link" href="?pageCount=5">5</a></li>--%>
<%--    <li class="list-group-item"><a class="page-link" href="?pageCount=10">10</a></li>--%>
<%--</ul>--%>

<table class="table">
    <thead>
    <tr>
        <th scope="col"></th>
        <th scope="col">Name</th>
        <c:forEach begin="0" end="20">
            <th scope="col"></th>
        </c:forEach>
        <th scope="col">Create date</th>
        <th scope="col">Who create</th>
        <th scope="col">With whom</th>
        <th scope="col">Period of execution</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${documentsList}" var="document">
        <tr>
            <td></td>
            <td><a href="/doc/document/${document.documentId}"/>${document.documentName.documentName}</td>
            <c:forEach begin="0" end="20">
                <td></td>
            </c:forEach>
            <td>${document.createDate}</td>
            <td>${document.personWhoConcludedContract}</td>
            <td>${document.personWithWhomTheContractWasSigned}</td>
            <td>${document.periodOfExecution}</td>
            <td>
                <form action="/doc/document/edit/${document.documentId}" method="get">
                    <button class="btn btn-outline-success" type="submit">Edit</button>
                </form>
<%--                <button type="submit"><a href="/doc/document/edit/${document.documentId}">  Edit   </a> </button>--%>

            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<nav aria-label="Page navigation example">
    <ul class="pagination justify-content-center">
        <c:forEach var="number" begin="1" end="${pageCount}">
            <li class="page-item" tabindex="0">
                    <%--                <a class="page-link" href="/doc?pageNumber=${number}" name="pageNumber">--%>
                <a class="page-link" href="?pageNumber=${number}">
                        ${number}
                </a>
            </li>
        </c:forEach>

    </ul>
</nav>

<jsp:include page="footer.jsp"/>
