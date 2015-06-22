<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../header.jsp"%>
<body>
	<div class="manageBoxs">
		<div class="formBoxs admin_table">
			<form action="" id="customerForm" name="customerForm" method="post">
				<table width="100%" border="0" cellspacing="1" cellpadding="5">
					<tr class="tr1 vt">
						<td width="25%" align="right" class="td1"><span class="red">*</span>
							信息类型：</td>
						<td class="td2"><label><input type='radio' id="type1"
								value="1" checked name="type" />文字</label> <label><input
								type='radio' id="type2" value="2" name="type" />图文</label></td>
					</tr>
					<tr class="tr1 vt" id='text'>
						<td align="right" class="td1"><span class="red">*</span>
							回复内容：</td>
						<td class="td2"><textarea id="content" class="lk-input"
								name="content" style="width: 90%; height: 100px;"></textarea></td>
					</tr>
					<tr class="tr1 vt" id='news' style='display: none;'>
						<td align="right" class="td1"><span class="red">*</span>
							选择信息：</td>
						<td class="td2">
							<div id='selected_list' style='line-height: 30px;'>已选中：</div>
							<ul class='news_list' style="height: auto;">
								<?php
                                if ($news) {
                                    foreach ($news as $v) {
                                        ?>
								<li style="width: 160px;"><label title='<?php echo $v['title']; ?>'><input
										type='checkbox' class='news_id' name='news_id[]'
										value='<?php echo $v['id']; ?>'><?php echo $v['title']; ?></label></li>
								<?php
                                    }
                                } else {
                                    echo '请先添加文章';
                                }
                                ?>
							</ul>
						</td>
					</tr>
					<tr class="tr1 vt">
						<td align="right" class="td1">&nbsp;</td>
						<td class="td2"><input type="hidden" name="action"
							id="action" value="save" /> <input type="hidden" name="id"
							id="id" value="<?php echo $info['id']; ?>" /> <span
							id="lk_submit"><a href="javascript:;" rel="customerForm"
								id="submitFrom">提交</a></span> <span id="lk_submit"><a
								href="javascript:;" rel="customerForm" id="resetBtn">重填</a></span></td>
					</tr>
				</table>
			</form>
		</div>
		<div style="width: 100%; height: 15px; float: left;">&nbsp;</div>
	</div>
	<script type="text/javascript">
        $(function () {
            //表单验证
            $("#submitFrom").click(function () {
                var type = $(":radio[name='type'][checked]").val();
                if (type == 1) {
                    var content = $('#content').val();
                    if (!content) {
                        altTip('请输入信息内容。', 'error', function () {
                        });
                        return false;
                    }
                } else if (type == 2) {
                    var news_len = $(":checkbox[name='news_id[]']").length;
                    if (news_len < 1) {
                        altTip('请选择信息。', 'error', function () {
                        });
                        return false;
                    }
                }
                var options = {
                    beforeSubmit: function () {
                    },
                    success: function (txt) {
                        if (txt == 1) {
                            altTip('信息更新成功！', 'succeed', function () {
                                top.location.reload();
                                ;
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

            $('#type1').click(function () {
                $('#text').show();
                $('#news').hide();
            });
            $('#type2').click(function () {
                $('#text').hide();
                $('#news').show();
            });
            $(":radio[name='type'][checked]").trigger('click');

            $('.news_id').click(function () {
                var id = $(this).val(), title = $(this).parent().attr('title'), checked = $(this).attr('checked');
                if (checked) {
                    $('#selected_list').append("<label title='" + title + "' id='news_" + id + "'><input type='checkbox' checked value='" + id + "'>" + title + "</label>");
                } else {
                    $('#selected_list').find('#news_' + id).remove();
                }
            });

            $('#selected_list').find('input').live('click', function () {
                var id = $(this).val();
                $(this).parent().remove();
                $('.news_id').each(function () {
                    if ($(this).val() == id) {
                        $(this).attr('checked', false);
                    }
                });
            });
        });
    </script>
</body>
</html>