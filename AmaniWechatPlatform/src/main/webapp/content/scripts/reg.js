// JavaScript Document
function chkReg(){
	var username = $("#username").val();
	var password = $("#password").val();
	var repass = $("#repass").val();
	var chkcode = $("#chkcode").val();
	if(username=="" || username=="使用手机号码注册"){
		art.dialog.tips("请输入您要注册的手机号码！");
		$("#username").addClass("lk-input-on").removeClass("lk-input");
		//showMsg("请输入您要注册的手机号码！",3);
		return false;	
	}else if(!IsMobile(username)){
		art.dialog.tips("对不起，您输入的手机号码格式不正确，请重新输入！");
		$("#username").addClass("lk-input-on").removeClass("lk-input");
		//showMsg("对不起，您输入的手机号码格式不正确，请重新输入！",3);
		return false;	
	}else{
		var chkusernametrue = 1;
		$.ajax({
			type:'get',
			url: "/ajax/reg/",
			data:{ act:"chkusername", username:username },
			timeout:90000,
			beforeSend:function(){},
			dataType : 'json',
			async : false,
			success:function(o){
				if(o.data==0) chkusernametrue = 0;
			},
			complete:function(){},
			error:function(){}
		});
	}
	if(!chkusernametrue){
		art.dialog.tips("对不起，您输入的手机号码已被注册，请重新输入！");
		$("#username").addClass("lk-input-on").removeClass("lk-input");
		return false;
	}else{
		$("#username").addClass("lk-input").removeClass("lk-input-on");
	}
	if(password==""){
		art.dialog.tips("请输入您的登录密码！");
		$("#password").addClass("lk-input-on").removeClass("lk-input");
		//showMsg("请输入您的登录密码！",3);
		return false;	
	}else{
		$("#password").addClass("lk-input").removeClass("lk-input-on");
	}
	if(password!=repass){
		art.dialog.tips("对不起，您两次输入的密码不一致，请重新输入！");
		$("#repass").addClass("lk-input-on").removeClass("lk-input");
		//showMsg("对不起，您两次输入的密码不一致，请重新输入！",3);
		return false;	
	}else{
		$("#repass").addClass("lk-input").removeClass("lk-input-on");
	}
	if(chkcode==""){
		art.dialog.tips("请输入正确的验证码！");
		$("#chkcode").addClass("lk-input-on").removeClass("lk-input");
		//showMsg("请输入正确的验证码！",3);
		return false;	
	}else{
		var chkcodetrue = 1;
		$.ajax({
			type:'get',
			url: "/ajax/reg/",
			data:{ act:"chkCodeTrue", chkcode:chkcode },
			timeout:90000,
			beforeSend:function(){},
			dataType : 'json',
			async : false,
			success:function(o){
				if(o.data==0) chkcodetrue = 0;
			},
			complete:function(){},
			error:function(){}
		});
	}
	if(!chkcodetrue){
		art.dialog.tips("对不起，您输入的验证码不正确，请重新输入！");
		$("#chkcode").addClass("lk-input-on").removeClass("lk-input");
		//showMsg("对不起，您输入的验证码不正确，请重新输入！",3);
		return false;	
	}else{
		$("#chkcode").addClass("lk-input").removeClass("lk-input-on");
		var options = {
			dataType : 'json',
			success:function(txt){
				if(txt.isok==true){
					refreshs(txt.data,'/ucenter/login/');
				}
			}
		};
		$('#regForm').ajaxSubmit(options);
		return false;
	}
}

$(function(){
	//登录提交验证
	$("#submitBtn").click(function(){
		chkReg();
	});
})