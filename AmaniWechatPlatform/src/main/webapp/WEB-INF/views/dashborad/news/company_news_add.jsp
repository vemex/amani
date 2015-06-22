<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>微信公众平台管理后台--五五来客</title>
<meta name="description" content="微信公众平台管理后台--五五来客" />
<meta name="keywords" content="微信公众平台管理后台--五五来客" />
<link href="${ROOT_PATH }content/css/common.css" type="text/css"
	rel="stylesheet" />
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/jquery.js"></script>
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/artDialog/jquery.artDialog.js"></script>
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/artDialog/artDialog.iframeTools.js"></script>
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/public.js"></script>
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/jquery.form.js"></script>

</head>
<!--在线编辑器-->
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/ueditor/ueditor.config.js"></script>
 
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/ueditor/ueditor.all.js"></script>
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/ueditor/lang/zh-cn/zh-cn.js"></script>
<!--在线编辑器-->
<body>
	<div class="manageBoxs">
		<h1>
			<i></i>品牌介绍 » 信息管理
		</h1>
		<div class="itemCateNav">
			<div class="cateChoose">
				<a href="${ROOT_PATH }Dashboard/News/News/list"><span
					id="txt">信息管理</span><span id="bgr"></span></a> <a
					href="${ROOT_PATH }Dashboard/News/News/add" class="on"><span
					id="txt">添加信息</span><span id="bgr"></span></a>
			</div>
		</div>
		<div class="itemSrhBoxs">
			<!--关键字查询-->
			<ul class="keySearchBoxs"></ul>
		</div>
		<div class="doNoticeBox">
			<ul>
				1、带“
				<font style="color: red;">*</font>”的为必填项，请认真填写。
			</ul>
		</div>
		<div class="formBoxs admin_table">
			<form action="" id="customerForm" name="customerForm" method="post"
				enctype="multipart/form-data">
				<table width="100%" border="0" cellspacing="1" cellpadding="5">
					<input type="hidden" name="submitted" id="submitted" value="save">
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1">&nbsp;&nbsp;<span
							class="red">*</span>标题
						</td>
						<td width="89%" class="td2"><input type="text" name="title"
							id="title" class="lk-input" style="width: 450px"></td>
					</tr>

					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1">&nbsp;&nbsp;年份</td>
						<td width="89%" class="td2"><input type="text"
							name="subtitle" id="subtitle" class="lk-input"
							style="width: 450px"></td>
					</tr>

					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1">&nbsp;&nbsp;活动时间</td>
						<td width="89%" class="td2"><input type="text"
							name="subtitle" id="subtitle" class="lk-input"
							style="width: 450px"></td>
					</tr>

					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1">&nbsp;&nbsp;<span
							class="red">*</span>标题图
						</td>
						<td width="89%" class="td2"><input type="file" id="path"
							name="path" class="lk-input" /></td>
					</tr>
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1">&nbsp;&nbsp;信息简介</td>
						<td width="89%" class="td2"><textarea id="descr" name="descr"
								cols="60" rows="4"></textarea></td>
					</tr>
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1">&nbsp;&nbsp;外链地址</td>
						<td width="89%" class="td2"><input type="text" id="link"
							name="link" class="lk-input" style="width: 450px" /></td>
					</tr>
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1">&nbsp;&nbsp;<span
							class="red">*</span>信息详情
						</td>
						<td width="89%" class="td2">
							<div style="width: 750px;">
								<script id="content" name="content" type="text/plain"></script>
							</div>
						</td>
					</tr>
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1">&nbsp;&nbsp;启用</td>
						<td width="89%" class="td2"><input type="checkbox"
							id="isopen" name="isopen" value="1" checked> 启用</td>
					</tr>
					<tr class="tr1 vt">
						<td width="11%" align="right" class="td1">&nbsp;</td>
						<td width="89%" class="td2"><span id="lk_submit"><a
								href="javascript:;" id="submitFrom">提交</a></span> <span id="lk_submit"><a
								href="javascript:;" id="resetBtn">重填</a></span></td>
					</tr>
				</table>
			</form>
		</div>
		<div style="width: 100%; height: 15px; float: left;">&nbsp;</div>
	</div>
	<script language="javascript">
        $(function () {
            var editor = UE.getEditor('content');
            $("#submitFrom").click(function () {
                var options = {
                    beforeSubmit: function () {
                        var title = $("#title").val();
                        if (title == "") {
                            altTip("请输入标题！", 'error', function () {
                            });
                            return false;
                        }
                        var path = $("#path").val();
                        if (path == "") {
                            altTip("请选择需要上传的图片！", 'error', function () {
                            });
                            return false;
                        }
                    },
                    success: function (txt) {
                        if (txt == 1) {
                            altTip('信息更新成功！', 'succeed', function () {
                                location.href = '/admin/news/index/index/<?php echo $cid ?>';
                            });
                            return false;
                        } else {
                            altTip('信息更新失败！', 'error', function () {
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
</body>
</html>