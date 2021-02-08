<%-- 
    Document   : editnote
    Created on : Feb 3, 2021, 9:00:59 PM
    Author     : 792268
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note Page</title>
    </head>
    <body>
        <h1>Simple Note Keeper!</h1>
        <h2>Edit Note</h2>
        <form>
            Title: ${note.titleInfo}<input type="text" name="titleInfo">
            <br>
            Contents: <textarea>
            </textarea>
            <br>
            <input type="button" value="Save">
        </form>
    </body>
</html>
