<%--
  Created by IntelliJ IDEA.
  User: PPCC
  Date: 2020/11/19
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="${pageContext.request.contextPath}/js/jquery.js" type="text/javascript">

    </script>

    <script type="text/javascript">
   var userList=new Array();
   userList.push({username:"zhangsan",age:18});
   userList.push({username:"lisi",age:16});

   console.log(userList)
   $.ajax({
       type:"POST",
       url:"${pageContext.request.contextPath}/user/query2",
       contentType: 'application/json;charset=utf-8',
       data:JSON.stringify(userList),
       dataType:"json",
       success: function (data) {
           console.log(data);
       },
       error: function (data) {
           console.log("ERROR:" + JSON.stringify(data));
       }

   });




    </script>
</head>
<body>

</body>
</html>
