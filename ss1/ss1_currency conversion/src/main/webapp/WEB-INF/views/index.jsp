<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form action="/viewPrice" method="post">
    <div class="form-group">
        <label for="price">Nhập tỉ giá muốn đổi</label>
        <br>
        <input type="number"
               class="form-control" name="price" id="price" aria-describedby="helpId" placeholder="USD" >
        <input type="submit" value="submit" onclick="/price">
    </div>
</form>

</body>
</html>