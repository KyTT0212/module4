<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>index</title>
</head>
<body>
<c:if test="${condiment == null}">
    <form action="save">
        <h1>Sandwich Condiments</h1>
        <div class="form-check">
            <label class="form-check-label">
                <input type="checkbox" class="form-check-input" name="condiment" id="Lettuce" value="Lettuce" >
                <strong>Lettuce</strong>
            </label>
            <label class="form-check-label">
                <input type="checkbox" class="form-check-input" name="condiment" id="Tomato" value="Tomato" >
                <strong>Tomato</strong>
            </label>
            <label class="form-check-label">
                <input type="checkbox" class="form-check-input" name="condiment" id="Mustard" value="Mustard" >
                <strong>Mustard</strong>
            </label>
            <label class="form-check-label">
                <input type="checkbox" class="form-check-input" name="condiment" id="Sprouts" value="Sprouts" >
                <strong>Sprouts</strong>
            </label>
            <hr>
            <input type="submit" value="Save">
        </div>
    </form>

</c:if>
<c:if test="${condiment != null}">
    <c:choose>
        <c:when test="${condiment != null}">
            <h2>The selected locations are:</h2>
            <c:forEach items="${condiment}" var="condiment">
                <li>${condiment}</li>
            </c:forEach>
        </c:when>
    </c:choose>
</c:if>
<h1 style="color: red">${messageError}</h1>

</body>
</html>