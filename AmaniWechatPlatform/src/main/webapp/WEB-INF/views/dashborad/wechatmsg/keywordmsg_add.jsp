<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../header.jsp"%>
<body>
	<div class="manageBoxs">
		<h1>
			<i></i> 关键词设置 » 添加关键词
		</h1>
		<div class="itemCateNav">
			<div class="cateChoose">
				<a href="${ROOT_PATH }Dashboard/WechatMsg/WelcomeMsg/index"><span
					id="txt">信息管理</span><span id="bgr"></span></a> <a
					href="${ROOT_PATH }Dashboard/WechatMsg/WelcomeMsg/add"
					class="on"><span id="txt">添加信息</span><span id="bgr"></span></a>
			</div>
		</div>
		<div class="itemSrhBoxs">&nbsp;</div>
		<div class="doNoticeBox">
			<ul>
				1、带“
				<font style="color: red;">*</font>”的为必填项，请认真填写。
			</ul>
		</div>
		<div class="formBoxs admin_table">
			<form action="" id="customerForm" name="customerForm" method="post">
				<table width="100%" border="0" cellspacing="1" cellpadding="5">
					<tbody>
						<tr class="tr1 vt">
							<td width="11%" align="right" class="td1"><span class="red">*</span>
								标题：</td>
							<td width="89%" class="td2"><input id="title"
								class="lk-input" name="title" value="" style="width: 500px;"></td>
						</tr>
						<tr class="tr1 vt">
							<td width="11%" align="right" class="td1"><span class="red">*</span>
								信息类型：</td>
							<td width="89%" class="td2"><label><input
									type="radio" id="type1" value="1" checked="" name="type">文字</label>
								<label><input type="radio" id="type2" value="2"
									name="type">图文</label></td>
						</tr>
						<tr class="tr1 vt" id="text">
							<td width="11%" align="right" class="td1"><span class="red">*</span>
								信息内容：</td>
							<td width="89%" class="td2"><textarea id="content"
									class="lk-input" name="content"
									style="width: 60%; height: 100px;"></textarea></td>
						</tr>
						<tr class="tr1 vt" id="news" style="display: none;">
							<td width="11%" align="right" class="td1"><span class="red">*</span>
								选择信息：</td>
							<td width="89%" class="td2">
								<div id="selected_list" style="line-height: 30px;">已选中：</div>
								<ul class="news_list">
									<li><label title="test"><input type="checkbox"
											class="news_id" name="news_id[]" value="2">test</label></li>
								</ul>
							</td>
						</tr>
						<tr class="tr1 vt">
							<td width="11%" align="right" class="td1"><span class="red">*</span>
								是否启用：</td>
							<td width="89%" class="td2"><label><input
									type="radio" id="isopen1" value="0" checked="" name="isopen">关闭</label>
								<label><input type="radio" id="isopen2" value="1"
									name="isopen">开启</label></td>
						</tr>
						<tr class="tr1 vt">
							<td width="11%" align="right" class="td1">&nbsp;</td>
							<td width="89%" class="td2"><input type="hidden"
								name="action" id="action" value="save"> <input
								type="hidden" name="cate" id="cate" value="1"> <span
								id="lk_submit"><a href="javascript:;" rel="customerForm"
									id="submitFrom">提交</a></span> <span id="lk_submit"><a
									href="javascript:;" rel="customerForm" id="resetBtn">重填</a></span></td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
		<div style="width: 100%; height: 15px; float: left;">&nbsp;</div>
		<script type="text/javascript" src="${ROOT_PATH }content/scripts/admin/reply.js"></script> 
	</div>

	<div
		style="display: none; position: fixed; left: 0px; top: 0px; width: 100%; height: 100%; cursor: move; opacity: 0; background: rgb(255, 255, 255);"></div>
	<div class="" style="display: none;">
		<div class="aui_outer">
			<table class="aui_border">
				<tbody>
					<tr>
						<td class="aui_nw"></td>
						<td class="aui_n"></td>
						<td class="aui_ne"></td>
					</tr>
					<tr>
						<td class="aui_w"></td>
						<td class="aui_center"></td>
						<td class="aui_e"></td>
					</tr>
					<tr>
						<td class="aui_sw"></td>
						<td class="aui_s"></td>
						<td class="aui_se" style="cursor: se-resize;"></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>