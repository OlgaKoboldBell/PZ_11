<%--
  Created by IntelliJ IDEA.
  User: Olga
  Date: 29.03.2024
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>points_of_interest</title>
</head>
<body>
<form action="points_of_interest" method="post">
    <p>Визначні місця</p>
    <p>Яхтклуб</p>
    <img src="data:image/jpeg;base64,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">
    <a href="/">На головну</a>
</form>
</body>
</html>
