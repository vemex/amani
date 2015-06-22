<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../header.jsp"%>
</head>
<body>
	<div class="mainBoxs">
		<table width="100%" height="100%" border="0" cellpadding="0"
			cellspacing="0">
			<tr>
				<td id="leftSonNavBox" valign="top" width="150" height="100%">
					<div class="leftSonNavBox">
						<h1>品牌介绍</h1>
					 
						<div class="maxNavBoxs">
							<a href="javascript:;" class="current maxA" target="targetBoxs"><i></i><span></span>品牌介绍</a>
							<ul class="sonNavBox" style="display: block;">
								<a href="${ROOT_PATH }Dashboard/News/CompanyNews/list"
									class="minA" target="targetBoxs"><i></i><span></span>信息管理</a>
								<a href="${ROOT_PATH }Dashboard/News/CompanyNews/add"
									class="minA" target="targetBoxs"><i></i><span></span>添加信息</a>
							</ul>
						</div>
					</div>
				</td>
				<td width="9" height="100%" valign="top"><div id="navToggler"
						class="navToggler">&nbsp;</div></td>
				<td valign="top" height="100%" id="bodyMainBoxs"><iframe
						src="#" name="targetBoxs" scrolling="0" frameborder="0"></iframe>&nbsp;
				</td>
			</tr>
		</table>
	</div>
	<script type='text/javascript'>
		$(function() {
			$("#navToggler")
					.click(
							function() {
								$("#leftSonNavBox").toggle(400);
								var nowClass = $(this).attr("class");
								var changeClass = (nowClass == 'navToggler') ? 'navTogglerOn'
										: 'navToggler';
								$(this).removeClass(nowClass).addClass(
										changeClass);
							});
			//二级菜单点击效果
			$('.sonNavBox a').click(function() {
				$('.sonNavBox a').removeClass('current');
				$(this).addClass('current');
			}).first().trigger('click');

			var url = $('.sonNavBox a').first().attr('href');
			$('#bodyMainBoxs').find('iframe').attr('src', url);
		});
	</script>

</body>
</html>