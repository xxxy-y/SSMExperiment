<%--
  Created by IntelliJ IDEA.
  User: wqt19
  Date: 2023/12/17
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>allStudents</title>
</head>
<body>
<c:forEach items="${studentsList}" var="student">
    <p>${student}</p><br>
</c:forEach>
</body>
</html>