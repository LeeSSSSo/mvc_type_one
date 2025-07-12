<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 수정</title>
</head>
<body>
<h2>사원 수정</h2>
<form action="${pageContext.request.contextPath}/employee/update" method="post">
  <input type="hidden" name="empId" value="${emp.empId}">
  이름: <input type="text" name="empName" value="${emp.empName}" required><br>
  주민번호: <input type="text" name="empNo" value="${emp.empNo}" required><br>
  이메일: <input type="email" name="email" value="${emp.email}"><br>
  전화번호: <input type="text" name="phone" value="${emp.phone}"><br>
  직책: <input type="text" name="jobTitle" value="${emp.jobTitle}"><br>
  부서번호: <input type="number" name="deptId" value="${emp.deptId}"><br>
  급여: <input type="number" step="0.01" name="salary" value="${emp.salary}"><br>
  재직여부: <select name="activeYn">
    <option value="Y" ${emp.activeYn == 'Y' ? 'selected' : ''}>Y</option>
    <option value="N" ${emp.activeYn == 'N' ? 'selected' : ''}>N</option>
  </select><br>
  <button type="submit">수정</button>
</form>
</body>
</html>