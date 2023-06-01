
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>join</title>
</head>
<body>
    <h1> 회원가입</h1>
    <form action="/joinOk" method="post">
        ID : <input type="text" name="memberId"><br />
        PW : <input type="password" name="memberPw"><br />
        NAME : <input type="text" name="memberName"><br />
        PHONE : <input type="text" name="memberPhone"><br />
        MAIL : <input type="text" name="memberEmail"><br />
        <input type="submit" value="회원가입">
        <input type="button" value="취소" onclick="cencel();">
    </form>

</body>
</html>

<script>
    function cencel(){
        window.location.href='/login.jsp'
    }
</script>