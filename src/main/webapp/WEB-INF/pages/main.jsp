<%--
  Created by IntelliJ IDEA.
  User: wqt19
  Date: 2023/12/17
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/logout">退出登录</a>
<a href="${pageContext.request.contextPath}/getStudents">查看全部学生信息</a>
<h2>查询学生信息</h2>
<form action="${pageContext.request.contextPath}/select" method="post">
    学生姓名：
    <label>
        <input type="text" name="name" required><br/><br/>
    </label>
    <button type="submit">查询</button>
</form>
<br>
<br>

<h2>添加学生信息</h2>
<form action="${pageContext.request.contextPath}/insert" method="post">
    学生id：
    <label>
        <input type="number" name="id" required><br><br>
    </label>
    学生姓名：
    <label>
        <input type="text" name="name" required><br><br>
    </label>
    学生年龄：
    <label>
        <input type="number" name="age" required><br><br>
    </label>
    学生年级：
    <label>
        <input type="text" name="gender" required><br><br>
    </label>
    学生编号：
    <label>
        <input type="text" name="number" required><br><br>
    </label>
    学生地址：
    <label>
        <input type="text" name="address" required><br><br>
    </label>
<%--    因为"status"字段是用于服务器响应中的状态码字段。因此，在请求头中不应该包含名为"status"的字段。--%>
<%--    当我这里写了一个名为status的字段--%>
<%--    如果你的请求中包含了名为"status"的字段，那么它可能被视为无效的请求信息帧，从而导致出现400错误。--%>
<%--    学生状态：--%>
<%--    <label>--%>
<%--        <input type="number" name="status"><br><br>--%>
<%--    </label>--%>
    <button type="submit">添加</button>
</form>
<br>
<br>

<h2>删除学生信息</h2>
<form action="${pageContext.request.contextPath}/delete" method="post">
    id：
    <label>
        <input type="number" name="id" required>
    </label>
    <input type="submit" value="确认删除">
</form>
<br>
<br>

<h2>修改学生信息</h2>
<form action="${pageContext.request.contextPath}/update" method="post">
    学生id：
    <label>
        <input type="number" name="id" required><br/><br/>
    </label>
    学生姓名：
    <label>
        <input type="text" name="name" required><br/><br/>
    </label>
    学生年龄：
    <label>
        <input type="number" name="age" required><br/><br/>
    </label>
    <button type="submit">修改</button>
</form>
</body>
</html>