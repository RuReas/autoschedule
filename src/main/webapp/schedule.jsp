<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Schedule</title>
</head>
<body>
<section>
    <h2><a href="index.html">Home</a></h2>
    <h3>Schedule</h3>
    <a href="schedule?action=create">Add Departure</a>
    <hr>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>Description</th>
            <th>Departure</th>
            <th>Arrival</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <c:forEach items="${schedule}" var="departure">
            <jsp:useBean id="departure" scope="page" type="net.usachev.autoschedule.model.Departure"/>
            <tr>
                <td>${departure.description}</td>
                <td> ${departure.start} </td>
                <td>${departure.end}</td>
                <td><a href="schedule?action=update&id=${departure.id}">Update</a></td>
                <td><a href="schedule?action=delete&id=${departure.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>