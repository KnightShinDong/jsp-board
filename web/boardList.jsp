<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>게시판</title>
</head>
<body>
    <h1>게시판 페이지</h1>
    <table style="border:1px">
        <tr>
            <td>번호</td>
            <td>이름</td>
            <td>제목</td>
            <td>날짜</td>
            <td>조회수</td>
        </tr>
        <c:forEach items="${list}" var="dto">
            <tr>
                <td>번호</td>
                <td>이름</td>
                <td>제목</td>
                <td>날짜</td>
                <td>조회수</td>
            </tr>
        </c:forEach>
        <tr>
            <td style="align-content:center" colspan="5" >
                <input type="button" value="글쓰기" onclick="boardWrite();">
            </td>
        </tr>
    </table>

</body>
</html>

<script>
    function boardWrite(){
        window.location.href="/boardWrite";
    }
</script>