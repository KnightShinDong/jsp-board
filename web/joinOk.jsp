<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false"%>
<%@ page import="com.sdh.board.*" %>
<%@ page import="com.sdh.board.dao.MemberDao" %>
<% request.setCharacterEncoding("UTF-8");%>

<html>
<head>
    <meta charset="UTF-8">
    <title>loginOk</title>
</head>
<body>
    <%
        int joinResult = (Integer)request.getAttribute("joinResult");
        if (joinResult == 1 ){
    %>
            <script>
                alert("${message}");
                window.location.href="login.jsp";
            </script>
    <%
        } else {
    %>
            <script>
                alert("${message}");
                window.location.href="join.jsp";
            </script>
    <%
        }
    %>
</body>
</html>
