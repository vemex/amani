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
<link href="${ROOT_PATH }content/css/admin/index.css" type="text/css"
	rel="stylesheet" />
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/jquery.js"></script>
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/artDialog/jquery.artDialog.js"></script>
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/artDialog/artDialog.iframeTools.js"></script>
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/jquery.form.js"></script>
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/public.js"></script>
<script type="text/javascript"
	src="${ROOT_PATH }content/scripts/admin/basic.js"></script>

</head>
<body>

	<div class="headerBoxs">
		<ul>
			<li class="headerMenu"><a href='${ROOT_PATH }Dashboard/Index'
				class="on">微信后台管理</a></li>
			<li class='logoBoxs'><img
				src='${ROOT_PATH }content/imgs/logo.png' /></li>
			<li class="headerNav"><span>欢迎您，<strong>admin</strong></span>
				<div>
					<a href="/" target="_blank">[前台首页]</a> <a href="javascript:;"
						id="edpass">[更改密码]</a> <a href="${ROOT_PATH }Dashboard/logout">[安全退出]</a>
				</div></li>
		</ul>
	</div>
	<div class="mainBoxs">
		<div class="leftNavBoxs">
			<div id="topArrow" class="topArrow" onmouseout="removeCss(this)"
				onmouseover="addCss(this)"></div>
			<div class="lkMenu switch">
				<ul id="UI">
					<!--<li class="current"><a title="控制台" target="main" href="http://amani.chinamani.com/admin/main/"><i class="icon-1"></i><span>服务号</span></a></li>-->
					<li><a title="基本设置" target="main"
						href="${ROOT_PATH }Dashboard/Basic/Index"><i class="icon-2"></i><span>基本设置</span></a></li>
					<li><a title="回复设置" target="main"
						href="${ROOT_PATH }Dashboard/WechatMsg/Index"><i
							class="icon-3"></i><span>回复设置</span></a></li>
					<li><a title="人工客服" target="main"
						href="${ROOT_PATH }Dashboard/Sms/Index"><i class="icon-4"></i><span>人工客服</span></a></li>
					<li><a title="自定义菜单" target="main"
						href="${ROOT_PATH }Dashboard/CustomerMenu/Index"><i class="icon-5"></i><span>自定义菜单</span></a></li>
					<li><a title="品牌介绍" target="main"
						href="${ROOT_PATH }Dashboard/News/CompanyNewsIndex"><i
							class="icon-7"></i><span>品牌介绍</span></a></li>
					<li><a title="本月活动" target="main"
						href="${ROOT_PATH }Dashboard/News/MarketingActivityNewsIndex"><i
							class="icon-45"></i><span>本月活动</span></a></li>
					<li><a title="发型秀" target="main"
						href="${ROOT_PATH }Dashboard/News/HairshowNewsIndex"><i
							class="icon-31"></i><span>发型秀</span></a></li>
					<li><a title="产品管理" target="main"
						href="${ROOT_PATH }Dashboard/Shop/Product"><i class="icon-43"></i><span>产品管理</span></a></li>
					<li><a title="订单管理" target="main"
						href="${ROOT_PATH }Dashboard/Shop/Order"><i class="icon-44"></i><span>订单管理</span></a></li>
					<li><a title="会员管理" target="main"
						href="${ROOT_PATH }Dashboard/Member/Index"><i class="icon-36"></i><span>会员管理</span></a></li>
					<li><a title="宣传单页" target="main"
						href="${ROOT_PATH }Dashboard/Shop/Mpages"><i class="icon-11"></i><span>宣传单页</span></a></li>
				</ul>
			</div>
			<div id="bottomArrow" class="bottomArrow"></div>
		</div>
		<div class="rightNavBoxs">
			<iframe src="${ROOT_PATH }Dashboard/Home/Index" frameborder="0"
				name="main"></iframe>
		</div>
	</div>
	<script type="text/javascript" language="javascript">
		//更改顶部样式
		function ChangeNavigationClass(obj) {
			$(obj).addClass("current").siblings("li").removeClass("current");
		}
		function addCss(obj) {
			$(obj).addClass("topArrowMouseover");
		}
		function removeCss(obj) {
			$(obj).removeClass();
			$(obj).addClass("topArrow");
		}
		$(document).ready(function() {
			$("#Ul li:first-child").addClass("current");

			$("#bottomArrow").mouseover(function() {
				$("#bottomArrow").addClass("bottomArrowMouseover");
			});
			$("#bottomArrow").mouseout(function() {
				$("#bottomArrow").removeClass("bottomArrowMouseover");
				$("#bottomArrow").addClass("bottomArrow");
			});

			$(".switch").Scroll({
				line : 1,
				speed : 200,
				up : "bottomArrow",
				down : "topArrow"
			});
			$("#UI").find("a").click(function() {
				$(this).parent().siblings().removeClass("current");
				$(this).parent().addClass("current");
			});

		});
	</script>

</body>
</html>