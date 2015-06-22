<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../header.jsp"%>
<body>
	<div class="manageBoxs">
		<h1>
			<i></i>品牌介绍 » 信息管理
		</h1>
		<div class="itemCateNav">
			<div class="cateChoose">
				<a href="${ROOT_PATH }Dashboard/News/News/list"
					class="on"><span id="txt">信息管理</span><span id="bgr"></span></a>
				 <a href="${ROOT_PATH }Dashboard/News/News/add"><span
					id="txt">添加信息</span><span id="bgr"></span></a>
			</div>
		</div>
		<div class="itemSrhBoxs">
			<!--关键字查询-->
			<ul class="keySearchBoxs">
			</ul>
		</div>
		<!--列表开始-->
		<div id="itemListBoxs" class="itemListBoxs m10">
			<form method="post" id="newsForm" name="newsForm"
				action="">
				<table width="100%" border="0" cellspacing="1" cellpadding="5"
					style="background: #EAEAEA;">
					<tbody>
						<tr class="itemTitleTr">
							<td width="40" align="center"><span class="cp"
								onclick="CheckAll(document.FORM)">全选</span></td>
							<td width="50" align="center">开启</td>
							<td width="*" align="left">标题</td>
							<td width="150" align="center">创建时间</td>
							<td width="50">操作</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"><input type="checkbox"
									id="id[]" name="id[]" value="34"></span></td>
							<td class="td2" align="center"><span class="s3">开启</span></td>
							<td class="td2" align="left">董事长程军建先生提出“阿玛尼，您身边的专属美容美发师”的最新定位，根据这一定位公司开始进行全面的品质升级，并推出全新的CI识别系统，全方位提升环境品质及服务品质。</td>
							<td class="td2" align="center">2015-03-13 17:43</td>
							<td class="td2 adminDoBoxs">
								<div>
									<a href="/admin/news/index/edit/?id=34" class="editBtns"
										title="编辑">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"><input type="checkbox"
									id="id[]" name="id[]" value="33"></span></td>
							<td class="td2" align="center"><span class="s3">开启</span></td>
							<td class="td2" align="left">阿玛尼门店覆盖全上海，门店数量达到50家。</td>
							<td class="td2" align="center">2015-03-13 17:43</td>
							<td class="td2 adminDoBoxs">
								<div>
									<a href="/admin/news/index/edit/?id=33" class="editBtns"
										title="编辑">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"><input type="checkbox"
									id="id[]" name="id[]" value="32"></span></td>
							<td class="td2" align="center"><span class="s3">开启</span></td>
							<td class="td2" align="left">阿玛尼以上海为起点，开始迈出全国扩张的步伐，第一站首先入驻南昌。</td>
							<td class="td2" align="center">2015-03-13 17:42</td>
							<td class="td2 adminDoBoxs">
								<div>
									<a href="/admin/news/index/edit/?id=32" class="editBtns"
										title="编辑">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"><input type="checkbox"
									id="id[]" name="id[]" value="31"></span></td>
							<td class="td2" align="center"><span class="s3">开启</span></td>
							<td class="td2" align="left">成立公司新总部，不断完善内部管理系统，阿玛尼商学院正是成立。</td>
							<td class="td2" align="center">2015-03-13 17:42</td>
							<td class="td2 adminDoBoxs">
								<div>
									<a href="/admin/news/index/edit/?id=31" class="editBtns"
										title="编辑">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"><input type="checkbox"
									id="id[]" name="id[]" value="30"></span></td>
							<td class="td2" align="center"><span class="s3">开启</span></td>
							<td class="td2" align="left">根据国际最新潮流趋势，成立烫染研修学院，在美发烫染专业方向培养专家型烫染师、色彩师。</td>
							<td class="td2" align="center">2015-03-13 17:42</td>
							<td class="td2 adminDoBoxs">
								<div>
									<a href="/admin/news/index/edit/?id=30" class="editBtns"
										title="编辑">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"><input type="checkbox"
									id="id[]" name="id[]" value="29"></span></td>
							<td class="td2" align="center"><span class="s3">开启</span></td>
							<td class="td2" align="left">企业内刊出世，公司官网、微博等网络平台正式上线。同年，公司成立系统开发部，开始自主研发美业专属管理软件。</td>
							<td class="td2" align="center">2015-03-13 17:41</td>
							<td class="td2 adminDoBoxs">
								<div>
									<a href="/admin/news/index/edit/?id=29" class="editBtns"
										title="编辑">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
					 
						<tr class="listPageTr">
							<td colspan="10" align="left" style="background: #FEFFEE;">
								<span id="lk_submit"><a href="javascript:;"
									onclick="CheckAll(document.newsForm);">全选</a></span> <span
								id="lk_submit"><a href="javascript:;"
									onclick="CheckAll(document.newsForm, '');">反选</a></span>
								<div style="width: auto; float: right;">
									<span
										style="width: auto; float: left; padding: 3px 15px 0 0; font-size: 14px;">
										<span>选中操作：</span> <select id="dotype" name="dotype">
											<option value="open">开启</option>
											<option value="close">关闭</option>
											<option value="del">删除</option>
									</select>
									</span> <span id="lk_submit"><a href="javascript:;"
										id="submitBtn">提交</a></span>
								</div>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
	</div>
	<script type="text/javascript">
        $(function () {
            $('#submitBtn').click(function () {
                var len = $(':checkbox[name="id[]"][checked]').length;
                if (len < 1) {
                    altTip('请选择需要进行操作的信息！', 'error', function () {
                    });
                    return false;
                } else {
                    altTip('您确定要对已选择的信息进行操作吗？', 'question', function () {
                        this.close();
                        var options = {
                            beforeSubmit: function () {
                            },
                            success: function (txt) {
                                if (txt == 1) {
                                    altTip('信息更新成功！', 'succeed', function () {
                                        location.reload();
                                    });
                                    return false;
                                } else {
                                    altTip('信息更新失败！', 'error', function () {
                                    });
                                    return false;
                                }
                            }
                        };
                        $('#newsForm').ajaxSubmit(options);
                        return false;
                    }, function () {
                    });
                    return false;
                }
            });

            $('.deleteBtns').click(function () {
                $(':checkbox[name="id[]"]').attr('checked', false);
                $(this).parents('tr').find(':checkbox[name="id[]"]').attr('checked', true);
                $('#dotype').val('del');
                $('#submitBtn').trigger('click');
            });
        });
    </script>


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