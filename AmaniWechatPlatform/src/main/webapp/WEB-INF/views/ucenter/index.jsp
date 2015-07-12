<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="keywords" content="" />
        <meta name="description" content="" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <meta name="apple-mobile-web-app-status-bar-style" content="black">
        <meta name="format-detection" content="telephone=no">
<title>会员中心</title>
<link rel="stylesheet" type="text/css" media="screen"
	href="${ROOT_PATH }content/css/style.css?v=1.7">
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
<script src="${ROOT_PATH }content/scripts/jquery-1.10.1.min.js"></script>
<script src="${ROOT_PATH }content/scripts/jquery.form.js"></script>
<script src="${ROOT_PATH }content/scripts/public.js"></script>
<script
	src="${ROOT_PATH }content/scripts/artDialog/jquery.artDialog.js?skin=idialog"></script>
<script
	src="${ROOT_PATH }content/scripts/artDialog/artDialog.iframeTools.js"></script>
<script src="${ROOT_PATH }content/scripts/jquery.fancybox.pack.js"></script>
<script src="${ROOT_PATH }content/scripts/lk.js"></script>
<script src="${ROOT_PATH }content/scripts/custom-form-elements.min.js"></script>
</head>
<body>

	<section class="memMenu">
	<ul>
		<li class="on"><a href="/ucenter/">卡片</a></li>
		<li class="on"><a href="/book/">预约</a></li>
		<li class="on"><a href="/ucenter/coupon/">优惠劵</a></li>
	</ul>
	</section>
	<section class="memCheck_top">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td>
				<div class="xzkh llselect">
					<span>卡号：</span> <span class="wz">
						<?php echo $list[$id]['cardid'] ?>
					</span> <a href="#xzkh" class="contFancybox">更换</a>
				</div>
			</td>
			<td>卡类型：<?php echo $cardinfo['cardtypeName'] ?></td>
		</tr>
		<tr>
			<td>姓名：<?php echo $cardinfo['membername'] ? substr($cardinfo['membername'], 0, 3) . "***" : ''; ?></td>
			<td>手机：<?php echo $cardinfo['memberphone'] ? substr($cardinfo['memberphone'], 0, 3) . "****" . substr($cardinfo['memberphone'], -4) : ''; ?></td>
		</tr>
		<tr>
			<td colspan="2">证件号：<?php echo $cardinfo['memberpaperworkno'] ? substr($cardinfo['memberpaperworkno'], 0, 4) . "********" . substr($cardinfo['memberpaperworkno'], -4) : ''; ?></td>
		</tr>
		<tr>
			<td>储值账户余额：<?php echo $cardinfo['account2Amt'] ?></td>
			<td>赠送帐户：<?php echo $cardinfo['account6Amt'] ?></td>
		</tr>
		<tr>
			<td>积分余额：<?php echo $cardinfo['account3Amt'] ?></td>
			<td><a href="/ucenter/index/editpwd/" style="color: #7fb854">修改消费密码</a></td>
		</tr>
	</table>
	</section>
	<section class="memCheck_bottom">
	<div class="title">
		<h3 class="cur">账户历史</h3>
		<h3>疗程明细</h3>
	</div>
	<div class="box">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<th class="titleft">日期</th>
				<th>类型</th>
				<th>账户</th>
				<th>金额</th>
			</tr>
			<?php
            if ($log):
                foreach ($log as $v):
                    ?>
			<tr>
				<td class="titleft">
					<?php echo $v['chagedate']; ?>
				</td>
				<td>
					<?php echo $v['changebilltype']; ?>
				</td>
				<td>
					<?php echo $v['strAccountTypeName']; ?>
				</td>
				<td class="price">￥<?php echo $v['changeamt']; ?></td>
			</tr>
			<?php
                endforeach;
            endif;
            ?>
		</table>
	</div>
	<div class="box" style="display: none;">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<th class="titleft">名称</th>
				<th>剩余次数</th>
				<th>最后消费时间</th>
			</tr>
			<?php
            if ($treatment):
                foreach ($treatment as $v):
                    ?>
			<tr>
				<td class="titleft">
					<?php echo $v['bprojectname']; ?>
				</td>
				<td>
					<?php echo $v['lastcount']; ?>
				</td>
				<td class="price">
					<?php echo $v['saledate']; ?>
				</td>
			</tr>
			<?php
                endforeach;
            endif;
            ?>
		</table>
	</div>
	</section>
	<div class="ht15"></div>
	<div id="xzkh" class="wztc">
		<span><img
			src="${ROOT_PATH }content/images/front/selecttit.jpg" width="128"
			height="40" /></span>
		<?php
    if ($list):
        foreach ($list as $v):
            ?>
		<a href="/ucenter/index/index/?id=<?php echo $v['id']; ?>">
			<?php echo $v['cardid'] ?>
		</a>
		<?php
        endforeach;
    endif;
    ?>
		<a href="/ucenter/index/binding/">新增卡号</a>
	</div>
	<script src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
	<script>
		
	</script>
	<script>
		$(function() {
			$('img').css('max-width', '100%');
		});
	</script>
	<div style="display: none;">
		<script language="javascript" type="text/javascript"
			src="http://js.users.51.la/17832034.js"></script>
		<noscript>
			<a href="http://www.51.la/?17832034" target="_blank"><img
				alt="&#x6211;&#x8981;&#x5566;&#x514D;&#x8D39;&#x7EDF;&#x8BA1;"
				src="http://img.users.51.la/17832034.asp" style="border: none" /></a>
		</noscript>
	</div>
</body>
</html>