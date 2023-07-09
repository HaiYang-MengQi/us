<%--
  Created by IntelliJ IDEA.
  User: 汪海洋
  Date: 2023/7/8
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录页面</title>
    <script src="./js/jquery-3.6.0.min.js"></script>
</head>
<body>
    <div id="info">${info}</div>
    <form method="post" action="/login">
        账号:<input type="text" name="user_name" id="user_name" required="required"><br>
        密码:<input type="password" name="user_password" id="user_password" required><br>
        <input type="submit" value="提交">
        <input type="reset" value="清空">
    </form>
</body>
</html>
