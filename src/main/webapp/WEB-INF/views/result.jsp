<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>사원 목록</title>
  <style>
    body {
      font-family: "맑은 고딕", sans-serif;
      background-color: #f5f5f5;
      padding: 30px;
    }
    h2 {
      color: #333;
    }
    p {
      margin-bottom: 10px;
    }
    table {
      width: 100%;
      border-collapse: collapse;
      background-color: white;
      box-shadow: 0 0 5px rgba(0,0,0,0.1);
    }
    th, td {
      border: 1px solid #ccc;
      padding: 12px 10px;
      text-align: center;
    }
    th {
      background-color: #2c3e50;
      color: white;
    }
    td form {
      display: inline-block;
      margin: 0 2px;
    }
    button {
      padding: 6px 12px;
      border: none;
      border-radius: 4px;
      color: white;
      cursor: pointer;
    }
    button[type="submit"] {
      background-color: #3498db;
    }
    button[type="submit"]:hover {
      background-color: #2980b9;
    }
    button.delete {
      background-color: #e74c3c;
    }
    button.delete:hover {
      background-color: #c0392b;
    }
  </style>
</head>
<body>
  <h2>Spring MVC 결과</h2>
  <p>전달된 메시지: ${message}</p>
  <p>전달된 메시지: ${myMsg}</p>
  <p>DB 시간: ${dbTime}</p>
<div style="text-align: right; margin-bottom: 10px;">
  <form action="${pageContext.request.contextPath}/employee/insertForm" method="get" style="display:inline;">
    <button type="submit" style="background-color: #27ae60; padding: 8px 14px; border-radius: 4px; color: white; border: none; cursor: pointer;">
      + 사원 생성
    </button>
  </form>
</div>

  <table>
    <thead>
      <tr>
        <th>사번</th>
        <th>이름</th>
        <th>주민번호</th>
        <th>이메일</th>
        <th>전화번호</th>
        <th>입사일</th>
        <th>직책</th>
        <th>부서</th>
        <th>급여</th>
        <th>재직 여부</th>
        <th>관리</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="emp" items="${employeeList}">
        <tr>
          <td>${emp.empId}</td>
          <td>${emp.empName}</td>
          <td>${emp.empNo}</td>
          <td>${emp.email}</td>
          <td>${emp.phone}</td>
          <td>${emp.hireDate}</td>
          <td>${emp.jobTitle}</td>
          <td>${emp.deptId}</td>
          <td>${emp.salary}</td>
          <td>${emp.activeYn}</td>
          <td>
            <form action="${pageContext.request.contextPath}/employee/delete" method="post">
              <input type="hidden" name="empId" value="${emp.empId}">
              <button type="submit" class="delete" onclick="return confirm('정말 삭제하시겠습니까?');">삭제</button>
            </form>
            <form action="${pageContext.request.contextPath}/employee/editForm" method="get">
              <input type="hidden" name="empId" value="${emp.empId}">
              <button type="submit">수정</button>
            </form>
          </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</body>
</html>
