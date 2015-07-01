<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../header.jsp"%>
<body>
	<div class="manageBoxs">
		<h1>
			<i></i>基本设置 &raquo; 帐号设置
		</h1>
		<div class="doNoticeBox">
			<ul>
				1、带“
				<font style="color: red;">*</font>”的为必填项，请认真填写。
				<br /> 2、以下信息是通过微信公众平台下的“功能->高级功能->开发模式”下设置或获取。
			</ul>
		</div>
		<div class="formBoxs admin_table">
			<form action="${ROOT_PATH }Dashboard/Basic/AccountSet/Post" id="customerForm" name="customerForm" method="post">
				<table width="100%" border="0" cellspacing="1" cellpadding="5">
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1"><span class="red">*</span>
							Token：</td>
						<td width="89%" class="td2"><input id="token"
							class="lk-input" name="token" value="${WXConfiguration.token }" style="width: 500px;" />&nbsp;&nbsp;<span>对应微信公众帐号中设置的Token,必须和微信帐号中设置的统一</span></td>
					</tr>
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1"><span class="red">*</span>
							AppId：</td>
						<td width="89%" class="td2" id="editorBoxs"><input id="appid"
							class="lk-input" value="${WXConfiguration.appid }" name="appid"
							style="width: 500px;" />&nbsp;&nbsp;<span>对应微信公众帐号中生成的AppId</span></td>
					</tr>
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1"><span class="red">*</span>
							AppSecret：</td>
						<td width="89%" class="td2" id="editorBoxs"><input
							id="appsecret" class="lk-input"
							value="${WXConfiguration.appsecret }" name="appsecret"
							style="width: 500px;" />&nbsp;&nbsp;<span>对应微信公众帐号中生成的AppSecret</span></td>
					</tr>
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1"><span class="red">*</span>
							微信支付商户号：</td>
						<td width="89%" class="td2" id="editorBoxs"><input id="mchid"
							class="lk-input" value="${WXConfiguration.mchid }" name="mchid"
							style="width: 500px;" />&nbsp;&nbsp;<span>对应微信支付中的商户号</span></td>
					</tr>
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1"><span class="red">*</span>
							Key：</td>
						<td width="89%" class="td2" id="editorBoxs"><input id="key"
							class="lk-input" value="${WXConfiguration.key }"
							name="key" style="width: 500px;" />&nbsp;&nbsp;<span>对应微信支付中的商户支付密钥Key</span></td>
					</tr>
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1">&nbsp;</td>
						<td width="89%" class="td2"><input type="hidden"
							name="action" id="action" value="save" /> <span id="lk_submit"><a
								href="javascript:;" rel="customerForm" id="submitFrom">提交</a></span> <span
							id="lk_submit"><a href="javascript:;" rel="customerForm"
								id="resetBtn">重填</a></span></td>
					</tr>
				</table>
			</form>
		</div>

		<div style="width: 100%; height: 15px; float: left;">&nbsp;</div>
		<script language="javascript">
			$(function() {
				//表单验证
				$("#submitFrom").click(
						function() {
							var token = $("#token").val();
							if (token == "") {
								altTip('请输入您在微信公众号中设置的Token。', 'error',
										function() {
										});
								return false;
							}
							var appid = $("#appid").val();
							if (appid == "") {
								altTip('请输入您在微信公众号中分配给您的AppId号。', 'error',
										function() {
										});
								return false;
							}
							var appsecret = $("#appsecret").val();
							if (appsecret == "") {
								altTip('请输入您在微信公众号中分配给您的AppSecret。', 'error',
										function() {
										});
								return false;
							}
							var options = {
								beforeSubmit : function() {
								},
								success : function(responseTxt) {
									var json= jQuery.parseJSON(responseTxt);
									if (json.isSuccessed) {
										altTip('信息更新成功！', 'succeed',
												function() {
													location.reload();
												});
										return false;
									} else {
										altTip('信息更新失败！', 'error', function() {
										});
										return false;
									}
								}
							};
							$('#customerForm').ajaxSubmit(options);
							return false;
						});
			});
		</script>
	</div>

</body>
</html>