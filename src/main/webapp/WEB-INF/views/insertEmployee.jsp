<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>사원 등록</title>
  <style>
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background-color: #f1f2f6;
      padding: 30px;
    }

    h2 {
      text-align: center;
      color: #2d3436;
    }

    form {
      max-width: 500px;
      margin: 0 auto;
      padding: 25px;
      background-color: #ffffff;
      border-radius: 10px;
      box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    }

    label {
      display: block;
      margin-top: 15px;
      font-weight: bold;
      color: #2f3542;
    }

    input, select {
      width: 100%;
      padding: 10px;
      margin-top: 5px;
      border: 1px solid #dcdde1;
      border-radius: 5px;
      box-sizing: border-box;
    }

    button {
      margin-top: 25px;
      width: 100%;
      padding: 12px;
      background-color: #00a8ff;
      color: white;
      font-size: 16px;
      font-weight: bold;
      border: none;
      border-radius: 5px;
      cursor: pointer;
      transition: background-color 0.3s ease;
    }

    button:hover {
      background-color: #74b9ff;
    }
  </style>
</head>
<body>
  <h2>사원 등록</h2>
  <form action="${pageContext.request.contextPath}/employee/insert" method="post">
    <label for="empName">이름</label>
    <input type="text" name="empName" id="empName" required>

    <label for="empNo">주민번호</label>
    <input type="text" name="empNo" id="empNo" required>

    <label for="email">이메일</label>
    <input type="email" name="email" id="email">

    <label for="phone">전화번호</label>
    <input type="text" name="phone" id="phone">

    <label for="jobTitle">직책</label>
    <input type="text" name="jobTitle" id="jobTitle">

    <label for="deptId">부서번호</label>
    <input type="number" name="deptId" id="deptId">

    <label for="salary">급여</label>
    <input type="number" step="0.01" name="salary" id="salary">

    <label for="activeYn">재직여부</label>
    <select name="activeYn" id="activeYn">
      <option value="Y">Y</option>
      <option value="N">N</option>
    </select>

    <button type="submit">등록</button>
  </form>
</body>
</html>
