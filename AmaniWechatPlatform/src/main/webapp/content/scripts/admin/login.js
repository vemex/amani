// JavaScript Document
var reg = function(){
	mails = /^[0-9a-zA-Z_\-\.]+@[0-9a-zA-Z_\-]+(\.[0-9a-zA-Z_\-]+)*$/; 
	this.mailExp = new RegExp(mails);
	this.usernameExp = new RegExp("^[a-zA-Z0-9\u4e00-\u9fa5]{2,15}$");
	this.passwordExp = new RegExp("^[a-zA-Z0-9\u4e00-\u9fa5]{6,18}$");
	this.mobileExp = new RegExp("^0?(13[0-9]|15[012356789]|18[0236789]|14[57])[0-9]{8}$");
	//this.telExp = new RegExp("^(([0/+]/d{2,3}-)?(0/d{2,3})-)?(/d{7,8})(-(/d{3,}))?$");
	this.telExp = /^((0\d{2,3})-)(\d{7,8})(-(\d{3,}))?$/;
};

function chklogin(){
	var username = $("#username").val();
	var password = $("#password").val();
	var chkcode = $("#chkcode").val();
	if(username=="" || username=="手机号码登录"){
		art.dialog.tips("请输入您的登录名！");
		//showMsg("请输入您注册的手机号码登录！");
		$("#username").focus();
		return false;	
	/*}else if(!IsMobile(username)){
		art.dialog.tips("对不起，您输入的手机号码格式不正确，请重新输入！");
		//showMsg("对不起，您输入的手机号码格式不正确，请重新输入！");
		$("#username").focus();
		return false;*/	
	}
	if(password==""){
		art.dialog.tips("请输入您的登录密码！");
		//showMsg("请输入您的登录密码！",1);
		return false;	
	}
	if(chkcode==""){
		art.dialog.tips("请输入正确的验证码！");
		//showMsg("请输入正确的验证码！",1);
		return false;	
	}else{
		var chkcodetrue = 1;
		$.ajax({
			type:'get',
			url: "/ajax/ucenter/",
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
		//showMsg("对不起，您输入的验证码不正确，请重新输入！");
		return false;	
	}else{
		var options = {
			dataType : 'json',
			success:function(txt){
				if(txt.isok==true){
					refreshs(txt.data,'/ucenter/');
				}else{
					refreshs(txt.data,'/ucenter/login/');
				}
			}
		};
		$('#loginForm').ajaxSubmit(options);
		return false;
	}
}

$(function(){
	//登录提交验证
	$("#submitBtn").click(function(){
		chklogin();
	});
	//找回密码操作
	$("#getPassBtn").click(function(){
		art.dialog.open('/ucenter/login/getpass/', {
			id: "getpass",
			title: "找回密码",
			height : 160,
			width : 350,
			lock: true
		});
		return false;
	});
})