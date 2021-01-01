<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>resign</title>
    <link rel="stylesheet" type="text/css" href="../css/base.css">
    <link rel="stylesheet" type="text/css" href="../css/reg.css">
</head>
<body>
<div id="ajax-hook"></div>
<div class="wrap">
    <div class="wpn">
        <div class="form-data pos">
            <div class="title" >
                <p>个人健康信息管理系统</p>
            </div>
            <form action="http://localhost:8080/people_war_exploded/user/resign" method="POST">
                <div class="form1" href="main">
                    <p class="p-input pos">
                        <label for="name">姓名</label>
                        <input type="name" style="display:none">
                        <input type="text" id="name">
                    </p>
                    <p class="p-input pos" STYLE="padding-top: 15px">
                        <label for="num">用户名</label>
                        <input type="text" id="num">
                    </p>
                    <p class="p-input pos">
                        <label for="pass">密码</label>
                        <input type="password" style="display:none">
                        <input type="password" id="pass">
                    </p>
                </div>

                <button class="lang-btn off log-btn" type="submit">确认</button>
                <p class="right">Powered by © 2020</p>
            </form>
        </div>
    </div>
</div>
</div>
<script src="../js/jquery.js"></script>
<script src="../js/agree.js"></script>
<script src="../js/login.js"></script>
<div style="text-align:center;">
</body>
</html>