<%--
  Created by IntelliJ IDEA.
  User: 汪海洋
  Date: 2023/7/13
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注销页面</title>
</head>
<body>
<form method="post" action="/Cancel">
    <input type="text" name="id" id="id" placeholder="请输入你要注销的用户ID"/><br>
    <input type="submit" value="注销" />
    <input type="reset" value="重新输入"/>
</form>
</body>
</html>
