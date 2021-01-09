<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
  <p>${spList}</p>
  <c:if test="${empty spList }">
    <form action="${pageContext.request.contextPath}/shop/updateInfo" method="post">
  </c:if>
  <c:if test="${!(empty spList) }">
    <form action="${pageContext.request.contextPath}/shop/saveInfo" method="post">
  </c:if>
   
   序号：<input type="number" name = "id" value="${spList.id }" /><br/>
   姓名：  <input type="text" name = "username" value="${spList.username }" /><br/>
   密码：  <input type="number" name = "password" value="${spList.password }" /><br/>
   
   <input type="submit" value="提交" />
   </form>
</body>
</html>