<%--
  Created by IntelliJ IDEA.
  User: akdls
  Date: 2023-05-30
  Time: 오후 3:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        int loginResult = (Integer)request.getAttribute("loginResult");
        if (loginResult == 1){
    %>
            <script>
                alert("${message}");
                window.location.href="/boardList.jsp";
            </script>
    <%
        } else {
    %>
            <script>
                alert("${message}");
                window.location.href="/login.jsp";
            </script>
    <%
        }
    %>

</body>
</html>
