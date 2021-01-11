<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="../../css/base.css">
    <link rel="stylesheet" href="../../css/reg.css">
</head>
<body>
<div id="ajax-hook"></div>
<div class="wrap">
    <div class="wpn">
        <div class="form-data pos">
            <div class="title" >
                <p>个人健康信息管理系统</p>
            </div>
            <form action="http://localhost:8080/people_war_exploded/user/check" method="POST">
                <p style="color: #c82333" text="${msg}"></p>

                <div class="form1" href="main">
                    <p class="p-input pos" STYLE="padding-top: 15px">
                        <label for="num">用户名</label>
                        <input type="text" id="num">
                        <span class="tel-warn num-err hide"><em>账号或密码错误，请重新输入</em><i class="icon-warn"></i></span>
                    </p>
                    <p class="p-input pos">
                        <label for="pass">密码</label>
                        <input type="password" style="display:none">
                        <input type="password" id="pass" autocomplete="new-password">
                        <span class="tel-warn pass-err hide"><em>账号或密码错误，请重新输入</em><i class="icon-warn"></i></span>
                    </p>
                </div>
                <div class="r-forget cl">
                    <a href="./getpass.html" class="y">忘记密码</a>
                </div>
                <button class="lang-btn off log-btn" type="submit">登录</button>
                <a class="lang-btn resign" href="resign.html">注册</a>
                <p class="right">Powered by © 2020</p>
            </form>
        </div>
    </div>
</div>
</div>
<script src="../../js/jquery.js"></script>
<script src="../../js/agree.js"></script>
<script src="../../js/login.js"></script>
<div style="text-align:center;">
</div>
</body>
</html>