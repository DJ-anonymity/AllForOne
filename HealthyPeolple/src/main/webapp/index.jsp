<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <style type="text/css">
        a {
            text-decoration: none;
            color: black;
            font-size: 18px;
        }

        h3 {
            width: 180px;
            height: 38px;
            margin: 100px auto;
            text-align: center;
            line-height: 38px;
            border-radius: 4px;

        }
        div{
            border-color: transparent;
            box-shadow: 0 0 40px rgba(0,0,0,.05);
        }
        .click{
            width: 340px;
            font-size: 18px;
            font-weight: bold;
            color: white;
            height: 50px;
            line-height: 50px;
            text-align: center;
            margin: 20px auto;
            display: block;
            border-radius: 5px;
            cursor: pointer;
            background-color: #42a5f5;
        }
    </style>
</head>
<body>
<h1 style="text-align: center;padding-top: 10%">个人健康信息管理系统</h1>
<h3>
    <div style="background-color: #42a5f5;border-radius: 5px;">
        <a class="btn btn-info" style="text-align:center;color: #fff;font-size: 18px;"
           href="http://localhost:8080/people_war_exploded/login.html">欢迎加入我们</a>
    </div>
</h3>

</body>

</html>