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
<body>
	<div class="manageBoxs">
		<h1>
			<i></i>自定义菜单 » 菜单管理
		</h1>
		<div class="itemCateNav">
			<div class="cateChoose">
				<a href="${ROOT_PATH }Dashboard/CustomerMenu/MenuList" class="on"><span
					id="txt">菜单管理</span><span id="bgr"></span></a>
			</div>
		</div>
		<div class="itemSrhBoxs"></div>
		<div class="doNoticeBox">
			<div style="line-height: 22px; padding-left: 10px;">
				<ul>
					<li>1、创建自定义菜单后，由于微信客户端缓存，需要24小时微信客户端才会展现出来。建议测试时可以尝试取消关注公众账号后再次关注，则可以看到创建后的效果。</li>
					<li>2、菜单类型如果为“网页链接 (view)”时请在“链接地址或KEY值”中填写相应的链接URL。</li>
					<li>3、菜单类型如果为“内置素材推送”时请在“链接地址或KEY值”中选择需要推送的素材。</li>
					<li>4、菜单类型如果为“自定义开发”时请在“链接地址或KEY值”中填写事件KEY值，KEY值必须以字母开头，请勿使用纯数字字符；针对开发人员使用。</li>
					<li>5、如果只有一级菜单，不需要二级菜单，请将一级菜单下的二级菜单全部禁用即可定义一级菜单。</li>
					<li>6、一级菜单最多4个汉字，二级菜单最多7个汉字。链接地址不超过256字节。</li>
				</ul>
			</div>
		</div>
		<div id="itemListBoxs" class="itemListBoxs m10">
			<form name="FORM" method="post" id="custommailtplForm"
				action="${ROOT_PATH }Dashboard/CustomerMenu/MenuList">
				<table width="100%" border="0" cellspacing="1" cellpadding="5"
					style="background: #CCC;">
					<tbody>
						<tr class="itemTitleTr">
							<td width="10%" align="center">是否启用</td>
							<td width="25%" align="center">菜单名称</td>
							<td align="center">菜单类型</td>
							<td width="25%" align="center">链接地址或者key</td>
						</tr>
						<tr class="listTr" id="parent_1" style="background: #EEE;">
							<td align="center" style="border-bottom: 1px solid #CCC;"><input
								type="checkbox" id="isopen" name="menu[1][isopen]" checked=""
								value="1"></td>
							<td align="left" style="border-bottom: 1px solid #CCC;"><img
								src="${ROOT_PATH}content/css/go_down.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[1][name]" id="name" style="width: 200px;"
								value="微商城" class="lk-input"></td>
							<td align="center" style="border-bottom: 1px solid #CCC;"><select
								name="menu[1][type]" class="type" style="">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center" style="border-bottom: 1px solid #CCC;"><input
								type="text" name="menu[1][key]" id="key" style="width: 200px;"
								value="http://amani.chinamani.com/shop/" class="lk-input">
							</td>
						</tr>
					</tbody>
					<tbody rel="1">
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[4][isopen]" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[4][name]" id="name" style="width: 200px;"
								value="" class="lk-input"></td>
							<td align="center"><select name="menu[4][type]" class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[4][key]"
								id="key" style="width: 200px;" value="" class="lk-input">
							</td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[5][isopen]" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[5][name]" id="name" style="width: 200px;"
								value="" class="lk-input"></td>
							<td align="center"><select name="menu[5][type]" class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[5][key]"
								id="key" style="width: 200px;" value="" class="lk-input">
							</td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[6][isopen]" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[6][name]" id="name" style="width: 200px;"
								value="" class="lk-input"></td>
							<td align="center"><select name="menu[6][type]" class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[6][key]"
								id="key" style="width: 200px;" value="" class="lk-input">
							</td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[7][isopen]" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[7][name]" id="name" style="width: 200px;"
								value="" class="lk-input"></td>
							<td align="center"><select name="menu[7][type]" class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[7][key]"
								id="key" style="width: 200px;" value="" class="lk-input">
							</td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[8][isopen]" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[8][name]" id="name" style="width: 200px;"
								value="" class="lk-input"></td>
							<td align="center"><select name="menu[8][type]" class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[8][key]"
								id="key" style="width: 200px;" value="" class="lk-input">
							</td>
						</tr>
					</tbody>
					<tbody>
						<tr class="listTr" id="parent_2" style="background: #EEE;">
							<td align="center" style="border-bottom: 1px solid #CCC;"><input
								type="checkbox" id="isopen" name="menu[2][isopen]" checked=""
								value="1"></td>
							<td align="left" style="border-bottom: 1px solid #CCC;"><img
								src="${ROOT_PATH}content/css/go_down.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[2][name]" id="name" style="width: 200px;"
								value="扫码支付" class="lk-input"></td>
							<td align="center" style="border-bottom: 1px solid #CCC;"><select
								name="menu[2][type]" class="type" style="">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center" style="border-bottom: 1px solid #CCC;"><input
								type="text" name="menu[2][key]" id="key" style="width: 200px;"
								value="http://amani.chinamani.com/ucenter/scancode"
								class="lk-input"></td>
						</tr>
					</tbody>
					<tbody rel="2">
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[9][isopen]" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[9][name]" id="name" style="width: 200px;"
								value="" class="lk-input"></td>
							<td align="center"><select name="menu[9][type]" class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[9][key]"
								id="key" style="width: 200px;" value="" class="lk-input">
							</td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[10][isopen]" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[10][name]" id="name"
								style="width: 200px;" value="" class="lk-input"></td>
							<td align="center"><select name="menu[10][type]"
								class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[10][key]"
								id="key" style="width: 200px;" value="" class="lk-input">
							</td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[11][isopen]" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[11][name]" id="name"
								style="width: 200px;" value="" class="lk-input"></td>
							<td align="center"><select name="menu[11][type]"
								class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[11][key]"
								id="key" style="width: 200px;" value="" class="lk-input">
							</td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[12][isopen]" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[12][name]" id="name"
								style="width: 200px;" value="" class="lk-input"></td>
							<td align="center"><select name="menu[12][type]"
								class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[12][key]"
								id="key" style="width: 200px;" value="" class="lk-input">
							</td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[13][isopen]" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[13][name]" id="name"
								style="width: 200px;" value="" class="lk-input"></td>
							<td align="center"><select name="menu[13][type]"
								class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[13][key]"
								id="key" style="width: 200px;" value="" class="lk-input">
							</td>
						</tr>
					</tbody>
					<tbody>
						<tr class="listTr" id="parent_3" style="background: #EEE;">
							<td align="center" style="border-bottom: 1px solid #CCC;"><input
								type="checkbox" id="isopen" name="menu[3][isopen]" checked=""
								value="1"></td>
							<td align="left" style="border-bottom: 1px solid #CCC;"><img
								src="${ROOT_PATH}content/css/go_down.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[3][name]" id="name" style="width: 200px;"
								value="阿玛尼" class="lk-input"></td>
							<td align="center" style="border-bottom: 1px solid #CCC;"><select
								name="menu[3][type]" class="type" style="display: none;">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center" style="border-bottom: 1px solid #CCC;"><input
								type="text" name="menu[3][key]" id="key"
								style="display: none; width: 200px;"
								value="http://wechat.chinamani.com/" class="lk-input"></td>
						</tr>
					</tbody>
					<tbody rel="3">
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[14][isopen]" checked="" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[14][name]" id="name"
								style="width: 200px;" value="本月活动" class="lk-input"></td>
							<td align="center"><select name="menu[14][type]"
								class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[14][key]"
								id="key" style="width: 200px;"
								value="http://amani.chinamani.com/activity/index/"
								class="lk-input"></td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[15][isopen]" checked="" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[15][name]" id="name"
								style="width: 200px;" value="在线预约" class="lk-input"></td>
							<td align="center"><select name="menu[15][type]"
								class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[15][key]"
								id="key" style="width: 200px;"
								value="http://amani.chinamani.com/book/index/" class="lk-input">
							</td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[16][isopen]" checked="" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[16][name]" id="name"
								style="width: 200px;" value="商城订单" class="lk-input"></td>
							<td align="center"><select name="menu[16][type]"
								class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[16][key]"
								id="key" style="width: 200px;"
								value="http://amani.chinamani.com/ucenter/coupon/"
								class="lk-input"></td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[17][isopen]" checked="" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[17][name]" id="name"
								style="width: 200px;" value="会员中心" class="lk-input"></td>
							<td align="center"><select name="menu[17][type]"
								class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[17][key]"
								id="key" style="width: 200px;"
								value="http://amani.chinamani.com/ucenter/" class="lk-input">
							</td>
						</tr>
						<tr class="listTr">
							<td align="center"><input type="checkbox" class="isopen"
								name="menu[18][isopen]" checked="" value="1"></td>
							<td align="left"><img
								src="${ROOT_PATH}content/css/weixin_menu.png"
								style="vertical-align: middle; margin: 0 10px;"> <input
								type="text" name="menu[18][name]" id="name"
								style="width: 200px;" value="了解我们" class="lk-input"></td>
							<td align="center"><select name="menu[18][type]"
								class="type">
									<option value="view" selected="">网页链接 (view)</option>
									<option value="material">内置素材推送</option>
									<option value="click">自定义开发 (click)</option>
							</select></td>
							<td align="center"><input type="text" name="menu[18][key]"
								id="key" style="width: 200px;"
								value="http://amani.chinamani.com/brand/index/" class="lk-input">
							</td>
						</tr>
					</tbody>
					<tbody>
						<tr class="listPageTr">
							<td colspan="10" align="left" style="background: #FEFFEE;">
								<span id="lk_submit"><a href="javascript:;"
									id="submitBtn">提交</a></span>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
	</div>
	<script type="text/javascript">
            $(function() {
                $('.type').change(function(){
                    var type = $(this).val(), obj=$(this).parent(),name = $(this).attr('name').replace('type', 'key');
                    if (type == 'material'){
                        var str = '<select name="'+name+'" id="key">';                       
                                                str += '<option value="2">test</option>';
                                                str += '</select>';
                        obj.next().html(str);
                    } else {
                        obj.next().html('<input type="text" name="'+name+'" style="width:200px;" id="key" class="lk-input" />');
                    }
                });
                
                $('.isopen').click(function(){
                    var obj = $(this).parents('tbody'), pid = obj.attr('rel'), length = obj.find('input[class="isopen"]:checked').length;
                    if (!length){
                        $('#parent_'+pid).find('#key, .type').show();
                    } else {
                        $('#parent_'+pid).find('#key, .type').hide();
                    }
                });
                
                $('tbody').each(function(){
                    var length = $(this).find('input[class="isopen"]:checked').length, pid = $(this).attr('rel');
                    if (!length){
                        $('#parent_'+pid).find('#key, .type').show();
                    } else {
                        $('#parent_'+pid).find('#key, .type').hide();
                    }
                });
                
                $('#submitBtn').click(function() {
                    var options = {
                        beforeSubmit: function() {
                        },
                        success: function(txt) {
                            if (txt == 1) {
                                altTip('信息更新成功！', 'succeed', function() {
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
                    $('#custommailtplForm').ajaxSubmit(options);
                });

                $('.deleteBtns').click(function() {
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