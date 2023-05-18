<%@ page
        language="java"
        contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>S2-059 Demo</title>
</head>
<body>
<s:a id="%{id}">S2-059</s:a>
</body>
<script>
  document.querySelector("body > a").text = document.querySelector("body > a").id
</script>
</html>