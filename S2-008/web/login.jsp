<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>S2-008</title>
</head>
<body>
<h2>S2-008</h2>
<p>link: <a href="https://struts.apache.org/docs/s2-007.html">https://struts.apache.org/docs/s2-007.html</a></p>

<s:form action="login">
    <s:textfield name="username" label="username" />
    <s:textfield name="password" label="password" />
    <s:textfield name="age" label="age" />
    <s:submit></s:submit>
</s:form>
</body>
</html>