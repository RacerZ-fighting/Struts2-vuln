<%--
  Created by IntelliJ IDEA.
  User: 欣海余诚
  Date: 2020/7/18
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>S2-013 Demo</title>
  </head>
  <body>
  <h2>S2-013 Demo</h2>
  <p>Try add some parameters in URL</p>
  <s:a id="url" action="HelloWorld" includeParams="all">this is link</s:a>
  </body>
</html>
