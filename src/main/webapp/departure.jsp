<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Departure transport</title>
</head>
<body>
<section>
    <h2><a href="index.html">Home</a></h2>
    <h3>${param.action == 'create' ? 'Create departure' : 'Edit departure'}</h3>
    <hr>
    <jsp:useBean id="departure" type="net.usachev.autoschedule.domain.Departure" scope="request"/>
    <form method="post" action="schedule">
        <input type="hidden" name="id" value="${departure.id}">
        <dl>
            <dt>Description:</dt>
            <dd><input type="text" value="${departure.description}" size=40 name="description"></dd>
        </dl>
        <dl>
            <dt>Departure:</dt>
            <dd><input type="datetime-local" value="${departure.start}" name="start"></dd>
        </dl>
        <dl>
            <dt>Arrival:</dt>
            <dd><input type="datetime-local" value="${departure.end}" name="end"></dd>
        </dl>
        <button type="submit">Save</button>
        <button onclick="window.history.back()">Cancel</button>
    </form>
</section>
</body>
</html>
