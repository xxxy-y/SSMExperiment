<%--
  Created by IntelliJ IDEA.
  User: wqt19
  Date: 2023/12/17
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>select</title>
</head>
<body>
符合条件的学生数据如下：
<br>
<br>
<c:forEach items="${studentList}" var="student">
    <p>${student}</p>
</c:forEach>
</body>
</html>
