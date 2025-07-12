<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 등록</title>
</head>
<body>
<h2>사원 등록</h2>
<form action="${pageContext.request.contextPath}/employee/insert" method="post">
  이름: <input type="text" name="empName" required><br>
  주민번호: <input type="text" name="empNo" required><br>
  이메일: <input type="email" name="email"><br>
  전화번호: <input type="text" name="phone"><br>
  직책: <input type="text" name="jobTitle"><br>
  부서번호: <input type="number" name="deptId"><br>
  급여: <input type="number" step="0.01" name="salary"><br>
  재직여부: <select name="activeYn">
    <option value="Y">Y</option>
    <option value="N">N</option>
  </select><br>
  <button type="submit">등록</button>
</form>
</body>
</html>