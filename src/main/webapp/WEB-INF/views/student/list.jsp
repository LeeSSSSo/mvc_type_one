<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>학생 목록</title>
</head>
<body>
    <h2>학생 목록</h2>

    <table border="1" cellpadding="5" cellspacing="0">
        <thead>
            <tr>
                <th>학번</th>
                <th>이름</th>
                <th>성별</th>
                <th>나이</th>
                <th>학과</th>
                <th>관리</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="std" items="${studentList}">
                <tr>
                    <td>${std.studentId}</td>
                    <td>${std.name}</td>
                    <td>${std.gender}</td>
                    <td>${std.age}</td>
                    <td>${std.department}</td>
                    <td>
                        <!-- ✏️ 수정 -->
                        <form action="${pageContext.request.contextPath}/student/editForm" method="post" style="display:inline;">
                            <input type="hidden" name="stdId" value="${std.studentId}" />
                            <button type="submit">수정</button>
                        </form>

                        <!-- ❌ 삭제 -->
                        <form action="${pageContext.request.contextPath}/student/delete" method="post" style="display:inline;" onsubmit="return confirm('정말 삭제하시겠습니까?');">
                            <input type="hidden" name="stdId" value="${std.studentId}" />
                            <button type="submit">삭제</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <br>
    <a href="${pageContext.request.contextPath}/student/insertForm">+ 학생 등록하기</a>
</body>
</html>
