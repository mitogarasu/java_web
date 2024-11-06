<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Приветствие</title>
</head>
<body>
    <c:choose>
        <c:when test="${not empty username}">
            <h1>Привет, ${username}!</h1>
        </c:when>
        <c:otherwise>
            <h1>Привет, гость!</h1>
        </c:otherwise>
    </c:choose>
</body>
</html>
