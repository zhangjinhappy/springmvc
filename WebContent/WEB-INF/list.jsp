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

    <table border="1" align ="center"  width ="50%">
        <tr>
         <th>序号</th>
         <th>姓名</th>
         <th>密码</th>
         <th>操作</th>
        </tr>
        <c:forEach items="${studentlist}" var="shop">
           <tr align ="center">
              <td>${shop.id}</td>
              <td>${shop.username}</td>
              <td>${shop.password}</td>
              <td>
                  <a href="${pageContext.request.contextPath}/shop/update/${shop.id}">编辑</a>|
                  <a href="${pageContext.request.contextPath}/shop/del/${shop.id}">删除</a>
              </td>
           </tr>
        </c:forEach>
           <tr align ="center">
              <td colspan="4">
                 <a href="${pageContext.request.contextPath}/add">增加</a>
              </td>
           </tr>
       
    </table>
</body>
</html>