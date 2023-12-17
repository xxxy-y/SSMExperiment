<%--
  Created by IntelliJ IDEA.
  User: wqt19
  Date: 2023/12/17
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>
        delete
    </title>
</head>
<body>
<c:set var="success" value="success"/>
<c:if test="${flag==success}">success delete student</c:if>
<c:if test="${flag!=success}">false delete student</c:if>
</body>
</html>
