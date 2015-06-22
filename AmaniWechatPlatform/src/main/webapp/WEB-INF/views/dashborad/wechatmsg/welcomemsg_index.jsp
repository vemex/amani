<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../header.jsp"%>
<body>
	<div class="manageBoxs">
		<h1>
			<i></i> 欢迎语设置 » 欢迎语管理
		</h1>
		<div class="itemCateNav">
			<div class="cateChoose">
				<a href="${ROOT_PATH }Dashboard/WechatMsg/WelcomeMsg/index"
					class="on"><span id="txt">信息管理</span><span id="bgr"></span></a> <a
					href="${ROOT_PATH }Dashboard/WechatMsg/WelcomeMsg/add"><span
					id="txt">添加信息</span><span id="bgr"></span></a>
			</div>
		</div>
		<div class="itemSrhBoxs"></div>
		<div id="itemListBoxs" class="itemListBoxs m10">
			<form name="FORM" method="post" id="custommailtplForm"
				action="">
				<table width="100%" border="0" cellspacing="1" cellpadding="5"
					style="background: #EAEAEA;">
					<tbody>
						<tr class="itemTitleTr">
							<td width="5%" align="center"><span class="cp"
								onclick="CheckAll(document.FORM);">全选</span></td>
							<td width="5%" align="center">状态</td>
							<td width="10%" align="center">类型</td>
							<td align="left">标题</td>
							<td width="20%" align="center">发件时间</td>
							<td align="center" width="50">操作</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="1">
							</span></td>
							<td align="center"><span style="color: green;">开启</span></td>
							<td align="center">文字</td>
							<td align="left">欢迎语</td>
							<td align="center">2014-11-13 13:18:12</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a
										href="${ROOT_PATH }Dashboard/WechatMsg/WelcomeMsg/edit"
										class="editBtns" title="编辑">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listPageTr">
							<td colspan="10" align="left" style="background: #FEFFEE;">
								<span id="lk_submit"><a href="javascript:;"
									onclick="CheckAll(document.FORM);">全选</a></span> <span id="lk_submit"><a
									href="javascript:;" onclick="CheckAll(document.FORM, '');">反选</a></span>
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
                        $('#custommailtplForm').ajaxSubmit(options);
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