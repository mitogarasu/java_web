<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Введите ваше имя</title>
</head>
<body>
    <h1>Пожалуйста, введите ваше имя</h1>
    <form action="${pageContext.request.contextPath}/hello" method="post">
        <label for="username">Имя:</label>
        <input type="text" id="username" name="username">
        <input type="submit" value="Отправить">
    </form>
</body>
</html>
