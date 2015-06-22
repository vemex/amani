<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../header.jsp"%>

<body>
	<div class="manageBoxs">
		<h1>
			<i></i>素材管理 &raquo; 素材列表
		</h1>
		<div class="itemCateNav">
			<div class="cateChoose">
				<a href="${ROOT_PATH }Dashboard/Home/Basic/Material/index"
					class="on"><span id="txt">素材列表</span><span id="bgr"></span></a> <a
					href="${ROOT_PATH }Dashboard/Home/Basic/Material/add"> <span
					id="txt">添加素材</span><span id="bgr"></span></a>

			</div>
			<div class="itemSrhBoxs">
				<!--关键字查询-->
				<ul class="keySearchBoxs">
				</ul>
			</div>
			<!--列表开始-->
			<div id="itemListBoxs" class="itemListBoxs m10">
				<form method="post" id="newsForm" name="newsForm" action="">
					<table width="100%" border="0" cellspacing="1" cellpadding="5"
						style="background: #EAEAEA;">
						<tr class="itemTitleTr">
							<td width="40" align="center"><span class="cp"
								onClick="CheckAll(document.FORM)">全选</span></td>
							<td width="50" align="center">开启</td>
							<td width="*" align="left">标题</td>
							<td width="150" align="center">创建时间</td>
							<td width="50">操作</td>
						</tr>

						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"><input type="checkbox"
									id="id[]" name="id[]" value=""></span></td>
							<td class="td2" align="center"><span class='s3'>开启</span></td>
							<td class="td2" align="left"></td>
							<td class="td2" align="center"></td>
							<td class="td2 adminDoBoxs">
								<div>
									<a href="" class="editBtns" title="编辑">&nbsp;</a> <a
										href="javascript:;" class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>

						<tr class="tr1 vt">
							<td colspan="7" style="background: #FFF;" align="center"
								height="50" class="td2">--暂无记录！</td>
						</tr>

						<tr class="listPageTr">
							<td colspan="7" align="center"><div class="pageBoxs">
									<?php echo $pagestr; ?>
								</div></td>
						</tr>

						<tr class="listPageTr">
							<td colspan="10" align="left" style="background: #FEFFEE;">
								<span id="lk_submit"><a href="javascript:;"
									onClick="CheckAll(document.newsForm);">全选</a></span> <span
								id="lk_submit"><a href="javascript:;"
									onClick="CheckAll(document.newsForm, '');">反选</a></span>
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
					</table>
				</form>
			</div>
		</div>
		<script type='text/javascript'>
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
	</div>
</body>
</html>