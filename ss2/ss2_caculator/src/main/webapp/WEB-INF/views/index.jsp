<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>index</title>
</head>
<body>
<form action="caculator" method="post">
    <h1>Caculator</h1>
    <div class="form-group">
        <label for="firstNumber"></label>
        <input type="number"
               class="form-control" name="firstNumber" id="firstNumber" aria-describedby="helpId" placeholder="Input number 1">
        <label for="twoNumber"></label>
        <input type="number"
               class="form-control" name="twoNumber" id="twoNumber" aria-describedby="helpId" placeholder="Input number 2">
    </div>
    <br>
        <div>
            <input type="submit" value="Addition(+)" name="caculator">
            <input type="submit" value="Subtraction(-)" name="caculator">
            <input type="submit" value="Multiplication(*)" name="caculator">
            <input type="submit" value="Division(/)" name="caculator">
        </div>
</form>

<c:if test="${messageError != null}">
    <h1>Result:${messageError}</h1>
</c:if>

<c:if test="${messageError == null && result != 0}">
    <h1>Result: ${result}</h1>
</c:if>


</body>
</html>