<%@page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <title>Hello Page</title>
    <style>
        p.msg { border: solid 1px lightgray; padding: 10px; }
    </style>
</head>
<body>
<h1>Hello!</h1>
<p class="msg">${datas}</p>
<hr>
<form method="post" action="/post">
    <input type="text" name="name"><br>
    <input type="text" name="mail"><br>
    <input type="text" name="tel"><br>
    <input type="text" name="age"><br>
    <input type="submit">
</form>
</body>
</html>