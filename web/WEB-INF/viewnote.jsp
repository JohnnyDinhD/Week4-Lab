<%-- 
    Document   : viewnote
    Created on : Feb 3, 2021, 9:00:50 PM
    Author     : 792268
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <h3>Title:</h3>${note.titleInfo}
        <h3>Contents:</h3>
        <p>${note.contentInfo}</p>
        <a href="note?edit">Edit</a>
    </body>
</html>
