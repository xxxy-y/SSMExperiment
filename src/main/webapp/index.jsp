<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        用户登录
    </title>
</head>
<body>
<h2>用户登录</h2>
<br>
<form action="${pageContext.request.contextPath}/login" method="post">
    <div>${msg}</div>
    用户名：
    <label>
        <input type="text" name="username">
    </label>
    <br>
    <br>
    密码：
    <label>
        <input type="text" name="password">
    </label>
    <br>
    <br>
    <input type="submit" value="登录">
</form>
</body>
</html>