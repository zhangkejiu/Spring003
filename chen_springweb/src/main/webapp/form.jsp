<%--
  Created by IntelliJ IDEA.
  User: PPCC
  Date: 2020/11/19
  Time: 21:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/user/query6" method="post">

    <input type="text" name="userList[0].username" value=""/><br>
    <input type="text" name="userList[0].age" value=""/><br>
    <input type="text" name="userList[1].username" value=""/><br>
    <input type="text" name="userList[1].age" value=""/><br>

    <input type="submit" value="submit"/>
</form>

</body>
</html>
