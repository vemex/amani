<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<%@ include file="../header.jsp"%>
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/news.de.js"></script>

</head>
<body>
	<div class="manageBoxs">
		<h1>
			<i></i>素材管理 &raquo; 添加素材
		</h1>
		<div class="itemCateNav">
			<div class="cateChoose">
				<a href="${ROOT_PATH }Dashboard/Home/Basic/Material/index"><span
					id="txt">素材列表</span><span id="bgr"></span></a> <a
					href="${ROOT_PATH }Dashboard/Home/Basic/Material/add" class="on">
					<span id="txt">添加素材</span><span id="bgr"></span>
				</a>

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
				<form action="" id="customerForm" name="customerForm" method="post">
					<input type="hidden" name="id" id="id" value=""> <input
						type="hidden" name="submitted" id="submitted" value="save">
					<table width="100%" border="0" cellspacing="1" cellpadding="5">
						<tr class="tr1 vt">
							<td width="11%" align="right" class="td1">&nbsp;&nbsp;<span
								class="red">*</span>标题
							</td>
							<td width="89%" class="td2"><input type="text" name="title"
								id="title" value="" class="input input_wa" style="width: 450px">
							</td>
						</tr>
						<tr class="tr1 vt" style="display: none;">
							<td width="11%" align="right" class="td1">&nbsp;&nbsp;副标题</td>
							<td width="89%" class="td2"><input type="text"
								name="subtitle" id="subtitle" value="" class="input input_wa"
								style="width: 400px"></td>
						</tr>
						<tr class="tr1 vt" style="display: none;">
							<td width="11%" align="right" class="td1">&nbsp;&nbsp;来源</td>
							<td width="89%" class="td2"><span style="line-height: 180%;">
									<input type="text" name="source_from" id="source_from"
									class="input input_wa" value="" style="width: 300px">&nbsp;&nbsp;
									作者：<input type="text" name="author" id="author"
									class="input input_wa" value="" style="width: 120px">
							</span></td>
						</tr>
						<tr class="tr1 vt" style="display: none;">
							<td width="11%" align="right" class="td1">&nbsp;&nbsp;资讯推荐</td>
							<td width="89%" class="td2"><span style="line-height: 180%;">
									<label><input type="checkbox" id="isrec" name="isrec"
										value="1"> 推荐资讯（列表提前排序）&nbsp;&nbsp;</label> <!--<label><input type="checkbox" id="hot" name="hot" value="1"> 热点推荐（今日热点、图文热点）&nbsp;&nbsp;</label>
                                <label><input type="checkbox" id="new" name="new" value="1"> 最新资讯&nbsp;&nbsp;</label>-->
							</span></td>
						</tr>
						<tr class="tr1 vt">
							<td width="11%" align="right" class="td1">&nbsp;&nbsp;<span
								class="red">*</span>代表图
							</td>
							<td width="89%" class="td2"><input class="input input_wa"
								type="text" name="path" id="path" value="" style="width: 200px" />
								<input type="button" class="imageUpload" rel="path" value="选择图片" />
								<span style="margin-left: 10px; color: #F00">如果图片是外部链接直接填写链接地址即可。</span>
							</td>
						</tr>
						<tbody id="videopath" style="display: none;">
							<tr class="tr1 vt">
								<td width="11%" align="right" class="td1">&nbsp;&nbsp;视频路径</td>
								<td width="89%" class="td2"><input type="text"
									name="videopath" id="videopath" value="" class="input input_wa"
									style="width: 400px"></td>
							</tr>
						</tbody>
						<tr class="tr1 vt">
							<td width="11%" align="right" class="td1">&nbsp;&nbsp;外链地址</td>
							<td width="89%" class="td2"><input type="text" name="link"
								id="link" value="“ class=" input input_wa" style="width: 400px"><span
								style="margin-left: 10px; color: #F00">填写了外链地址用户点击该文章将跳转到该地址。</span></td>
						</tr>
						<tr class="tr1 vt" style="display: none;">
							<td width="11%" align="right" class="td1">&nbsp;&nbsp;信息简介</td>
							<td width="89%" class="td2"><textarea id="descr"
									name="descr" cols="60" rows="4"></textarea></td>
						</tr>
						<tr class="tr1 vt">
							<td width="11%" align="right" class="td1">&nbsp;&nbsp;<span
								class="red">*</span>信息详情
							</td>
							<td width="89%" class="td2"><textarea id="contents"
									name="contents"
									style="width: 600px; height: 250px; font-size: 12px;"><?php echo $newsInfo['content']; ?></textarea>
							</td>
						</tr>
						<tr class="tr1 vt" style="display: none;">
							<td width="11%" align="right" class="td1">&nbsp;&nbsp;关键字设置</td>
							<td width="89%" class="td2"><input type="text" name="tags"
								id="tags" value="" class="input input_wa" style="width: 400px"></td>
						</tr>
						<tr class="tr1 vt" style="display: none;">
							<td width="11%" align="right" class="td1">&nbsp;&nbsp;预约上线时间</td>
							<td width="89%" class="td2"><input type="text" name="uptime"
								value="<?php echo date(" Y-m-dH:i:s", $newsInfo['uptime']) ?>"
								onFocus="WdatePicker({minDate: '%y-%M-%d', dateFmt: 'yyyy-MM-dd
								HH:mm', alwaysUseStartDate: true})" class="input input_wa Wdate"
								style="width:160px"></td>
						</tr>
						<tr class="tr1 vt">
							<td width="11%" align="right" class="td1">&nbsp;&nbsp;启用</td>
							<td width="89%" class="td2"><input type="checkbox"
								id="isopen" name="isopen" value=" 启用" /></td>
						</tr>
						<tr class="tr1 vt">
							<td width="11%" align="right" class="td1">&nbsp;</td>
							<td width="89%" class="td2"><span id="lk_submit"><a
									href="javascript:;" rel="customerForm" id="submitFrom">提交</a></span> <span
								id="lk_submit"><a href="javascript:;" rel="customerForm"
									id="resetBtn">重填</a></span></td>
						</tr>
					</table>
				</form>
			</div>
			<div style="width: 100%; height: 15px; float: left;">&nbsp;</div>
		</div>
		<script language="javascript">
        $(function () {
            $("#submitFrom").click(function () {
                news.chkAddGoods($(this).attr("rel"));
            });
        });
    </script>
</body>
</html>