<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>학생 수정</title>
</head>
<body>
    <h2>학생 정보 수정</h2>
    <form action="${pageContext.request.contextPath}/student/update" method="post">

        <input type="hidden" name="studentId" value="${std.studentId}">
        이름: <input type="text" name="name" value="${std.name}"><br>
        성별: <input type="text" name="gender" value="${std.gender}"><br>
        나이: <input type="text" name="age" value="${std.age}"><br>
        학과: <input type="text" name="department" value="${std.department}"><br>
        <input type="submit" value="수정">
    </form>
</body>
</html>
s