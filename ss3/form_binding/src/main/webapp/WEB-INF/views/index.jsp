<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Trang chủ</title>
</head>
<body>
<form:form action="settings">
    <h1>Setting</h1>
    <div class="form-group">
        <label for="languages"><strong>Languages</strong></label>
        <form:input path="languages" id="languages"/>
    </div>
</form:form>
</body>
</html>