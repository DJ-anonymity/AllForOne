$(function(){
	// var tab = 'account_number';
	// // 选项卡切换
	// $(".account_number").click(function () {
	// 	$('.tel-warn').addClass('hide');
	// 	tab = $(this).attr('class').split(' ')[0];
	// 	checkBtn();
    //     $(this).addClass("on");
    //     $(".message").removeClass("on");
    //     $(".form2").addClass("hide");
    //     $(".form1").removeClass("hide");
    // });
	// // 选项卡切换
	// $(".message").click(function () {
	// 	$('.tel-warn').addClass('hide');
	// 	tab = $(this).attr('class').split(' ')[0];
	// 	checkBtn();
	// 	$(this).addClass("on");
    //     $(".account_number").removeClass("on");
	// 	$(".form2").removeClass("hide");
	// 	$(".form1").addClass("hide");
	//
    // });

	$('#login-username').keyup(function(event) {
		$('.tel-warn').addClass('hide');
		checkBtn();
	});

	$('#login-password').keyup(function(event) {
		$('.tel-warn').addClass('hide');
		checkBtn();
	});

	$('#realname').keyup(function(event) {
		$('.tel-warn').addClass('hide');
		checkBtn();
	});
	$('#username').keyup(function(event) {
		$('.tel-warn').addClass('hide');
		checkBtn();
	});
	$('#password').keyup(function(event) {
		$('.tel-warn').addClass('hide');
		checkBtn();
	});

	// $('#num2').keyup(function(event) {
	// 	$('.tel-warn').addClass('hide');
	// 	checkBtn();
	// });
	//
	// $('#veri-code').keyup(function(event) {
	// 	$('.tel-warn').addClass('hide');
	// 	checkBtn();
	// });

	// 按钮是否可点击
	// function checkBtn()
	// {
	// 	$(".log-btn").off('click');
	// 	if (true) {
	// 		var user = $.trim($('#username').val());
	// 		var pass = $.trim($('#password').val());
	// 		if (inp != '' && pass != '') {
	// 			if (!$('.code').hasClass('hide')) {
	// 				code = $.trim($('#veri').val());
	// 				if (code == '') {
	// 					$(".log-btn").addClass("off");
	// 				} else {
	// 					$(".log-btn").removeClass("off");
	// 					sendBtn();
	// 				}
	// 			} else {
	// 				$(".log-btn").removeClass("off");
	// 					sendBtn();
	// 			}
	// 		} else {
	// 			$(".log-btn").addClass("off");
	// 		}
	// 	} else {
	// 		var phone = $.trim($('#num2').val());
	// 		var code2 = $.trim($('#veri-code').val());
	// 		if (phone != '' && code2 != '') {
	// 			$(".log-btn").removeClass("off");
	// 			sendBtn();
	// 		} else {
	// 			$(".log-btn").addClass("off");
	// 		}
	// 	}
	// }
	//
	// function checkPass(pass){
	// 	if (pass == '') {
	// 		$('.pass-err').removeClass('hide').text('请输入密码');
	// 		return false;
	// 	} else {
	// 		$('.pass-err').addClass('hide');
	// 		return true;
	// 	}
	// }
	//
	// function checkCode(code){
	// 	if (code == '') {
	// 		// $('.tel-warn').removeClass('hide').text('请输入验证码');
	// 		return false;
	// 	} else {
	// 		// $('.tel-warn').addClass('hide');
	// 		return true;
	// 	}
	// }

	// 登录点击事件


	document.getElementById("login").addEventListener("click", function () {
		var name = document.getElementById("login-username").value;
		var password = document.getElementById("login-password").value;
		if(name == null || password == null){
			alert("账号密码不能为空");
			return;
		}
		$.ajax({
			url: "/user/checkLogin",
			type: "post",
			//发送的数据
			data: JSON.stringify({username:name,password:password}),
			contentType: "application/json;charset=UTF-8",
			dataType: "json",
			success: function (data) {
				if (data.status == 0){
					alert(data.msg);
				}
				else{
					alert("登录成功")
					window.location.href="index2.html";
				}
			}
		})
	})





});