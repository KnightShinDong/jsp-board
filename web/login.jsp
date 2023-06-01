
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

    <h1>로그인</h1>
    <form action="/loginOk" method="post">
        ID : <input type="text" name="memberId" size="10"><br/>
        PW : <input type="password" name="memberPw" size="10"><br/>
        <input type="submit" value="로그인">&nbsp&nbsp<input type="button" value="회원가입" onclick="joinMember();">
    </form>
</body>
</html>

<script>
    function joinMember() {
        window.location.href = "/join.jsp";
    }
</script>