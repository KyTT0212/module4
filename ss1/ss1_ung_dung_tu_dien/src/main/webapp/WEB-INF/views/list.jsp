<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 3/27/2023
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${key.equalsIgnoreCase(key.en)}">
        <h1>---${key}---</h1>
        <h1> Nghĩa là: ${word}</h1>
    </c:when>
    <c:otherwise>
        không tìm thấy
    </c:otherwise>
</c:choose>

</body>
</html>
