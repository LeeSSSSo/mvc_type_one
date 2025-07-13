<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>학생 등록</title>
</head>
<body>
    <h2>학생 등록</h2>
   <form action="${pageContext.request.contextPath}/student/insertStudent" method="post">

        학번: <input type="text" name="studentId"><br>
        이름: <input type="text" name="name"><br>
        성별: <input type="text" name="gender"><br>
        나이: <input type="text" name="age"><br>
        학과: <input type="text" name="department"><br>
        <input type="submit" value="등록">
    </form>
</body>
</html>
