<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>《${title}》的详细信息</h1>
<br><br><br>
	<table border=2　width=250>
    <tr><th>作者详细信息</th></tr>
    <tr><th>姓名 ： ${author[0]}</th></tr>
    <tr><td>城市 ： ${author[1]}</td></tr>
    <tr><td>年龄 ： ${author[2]}</td></tr>
    </table>
<br><br><br>
<table border=2　width=250>
    <tr><th>书籍详细信息</tr>
    <tr><th>ISBN  ： ${book[0]}</th></tr>
    <tr><td>出版商       ： ${book[1]}</td></tr>
    <tr><td>出版日期   ： ${book[2]}</td></tr>
    <tr><td>价钱           ： ${book[3]}</td></tr>
    </table>
</body>
</html>