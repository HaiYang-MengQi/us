<%--
  Created by IntelliJ IDEA.
  User: 汪海洋
  Date: 2023/7/11
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form method="post" action="/Modify">
    id:<input type="text" name="id" id="id" value="1"><br>
    账户名:<input type="text" name="user_name" id="user_name" placeholder="在此输入您的用户名"><br>
    密码:<input type="password" name="user_password" id="user_password"><br>
    性别:<input type="text" name="sex" id="sex"><br>
    电话:<input type="text" name="tel" id="tel"><br>
    地址:<input type="text" name="address" id="address"><br>
    留言:<input type="text" name="word" id="word"><br>
    <input type="submit" value="修改">
    <input type="reset" value="重置">
</form>
</body>
</html>
