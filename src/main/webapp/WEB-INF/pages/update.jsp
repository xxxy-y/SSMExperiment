<%--
  Created by IntelliJ IDEA.
  User: wqt19
  Date: 2023/12/17
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<c:set var="success" value="success"/>
<c:if test="${flag==success}">success update student</c:if>
<c:if test="${flag!=success}">fail update student</c:if>
</body>
</html>
