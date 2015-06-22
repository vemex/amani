<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file="../header.jsp"%>
<body>
	<div class="manageBoxs">
		<h1>
			<i></i>人工客服 » 信息管理 » 信息列表
		</h1>
		<div class="itemCateNav">
			<div class="cateChoose">
				<a href="" class="on"><span id="txt">信息列表</span><span id="bgr"></span></a>
			</div>
		</div>
		<div class="itemSrhBoxs"></div>
		<div id="itemListBoxs" class="itemListBoxs m10">
			<form name="FORM" method="post" id="custommailtplForm" action="">
				<table width="100%" border="0" cellspacing="1" cellpadding="5"
					style="background: #EAEAEA;">
					<tbody>
						<tr class="itemTitleTr">
							<td width="5%" align="center"><span class="cp"
								onclick="CheckAll(document.FORM);">全选</span></td>
							<td width="10%" align="center">用户名</td>
							<td width="10%" align="center">类型</td>
							<td align="left">信息内容</td>
							<td width="10%" align="center">状态</td>
							<td width="20%" align="center">创建时间</td>
							<td align="center" width="50">操作</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="663">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/9jSYUdMZ2lLnNNkrO1VM6BG5IexShrcMdgiacanibqZnDdDNRKdeIaDLG4fdlVfmJHd2jGgqyibD1vSANSxGdUnCuxSC0OfKx5m/0"
								style="vertical-align: middle; width: 120px;"><br>‘Cancer云。
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">专柜</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-22 13:16:56</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="663" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="662">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/C31qOwQVRMXp9DVCaVrLIoPnSY234G2ibOStYibSLc5sibKnh1MTvibpkw13Q6ZF8s8S4HOE0EMFTDtfGF9zY8TOOs0NM7aRajkc/0"
								style="vertical-align: middle; width: 120px;"><br>.@
								做一只温暖的猴子</td>
							<td align="center">文字</td>
							<td align="left" id="content">wifi</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-22 09:33:58</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="662" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="661">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/C31qOwQVRMXp9DVCaVrLIoPnSY234G2ibOStYibSLc5sibKnh1MTvibpkw13Q6ZF8s8S4HOE0EMFTDtfGF9zY8TOOs0NM7aRajkc/0"
								style="vertical-align: middle; width: 120px;"><br>.@
								做一只温暖的猴子</td>
							<td align="center">文字</td>
							<td align="left" id="content">密码</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-22 09:33:48</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="661" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="660">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/kfXXnichnRDhypJvaBcmUdYzibbfoBTLxkIfBrLiaiaNFOAMWl6nhLj4TsPTsJrgtysdPbsAClWg7OYFWB1tiaoTRFibfgl6hUibGGh/0"
								style="vertical-align: middle; width: 120px;"><br>jasur
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">1</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-21 19:26:18</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="660" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="659">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/Aicuk2rJBbBeFHtM0o8UoicbxyO1qcUvdNxblQWC5EVDNMdG35PHf8WAiacrO618vw9d9JyMYqgS4nxM6NADvwliaZibkOl6F0Sgg/0"
								style="vertical-align: middle; width: 120px;"><br>小陆
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">防晒乳</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-21 17:33:45</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="659" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="658">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/ajNVdqHZLLCVNMibj0Lw2XftfhiacJCYI1NPibI5NExbqKGwA2SqGm2Hqjjxb6bl7cDFYsGPUicWeJiaXvZ2wuk5iaew/0"
								style="vertical-align: middle; width: 120px;"><br>✨
								不忘初</td>
							<td align="center">音频</td>
							<td align="left" id="content">音频</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-20 18:55:26</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="658" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="657">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/ajNVdqHZLLCVNMibj0Lw2XftfhiacJCYI1NPibI5NExbqKGwA2SqGm2Hqjjxb6bl7cDFYsGPUicWeJiaXvZ2wuk5iaew/0"
								style="vertical-align: middle; width: 120px;"><br>✨
								不忘初</td>
							<td align="center">音频</td>
							<td align="left" id="content">音频</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-20 18:54:51</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="657" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="656">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/ajNVdqHZLLB7PO2Ytz0S0Qhwg3Ouz2mHHXcia2Kb5r2TEVL7iaqyP8fEa4icibPLEBENHBqDBv0jiaRNCvWpRXNb2SA/0"
								style="vertical-align: middle; width: 120px;"><br>夜未央
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">护肤</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-20 15:53:00</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="656" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="655">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">音频</td>
							<td align="left" id="content">音频</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-20 11:49:44</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="655" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="654">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">音频</td>
							<td align="left" id="content">音频</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-20 11:49:36</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="654" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="653">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/PiajxSqBRaEJ01wU9WTuUIf1lpYeL30BrRoL8z9ExAdGrDoXSWrV59p7glmD2kNqV8MJvTFVH8gYcfaiaIJBnvSA/0"
								style="vertical-align: middle; width: 120px;"><br>吉小亭
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">免费</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-20 00:19:29</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="653" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="652">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/C31qOwQVRMXp9DVCaVrLIv6g4cd16hfUE9LNRrPCTOKfU8Vvq1I2GWLPagH60J5nrDc2MRiaSTDSAhX1MOdrnYdAVcuD47SaL/0"
								style="vertical-align: middle; width: 120px;"><br>阿童木de麻麻（孙蕾）
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">不解决 顾客投诉问题 不关注了</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 19:47:01</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="652" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="651">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/v6XbW38nFOR718wR5ZQfvsVlfvrYia9fVHpa65iaTWVcSwEF8GtODmzGIKR74hiaLGzvL2qBcrWGJh0Rk4RZYmicTl6lwfoG9Nzw/0"
								style="vertical-align: middle; width: 120px;"><br>方玉华
							</td>
							<td align="center">图片</td>
							<td align="left" id="content"><a
								href="http://mmbiz.qpic.cn/mmbiz/xPCcG4Ux5tBicrw8iaNuo3OAoEg1fkf0UPjQ3OHfCSV0j82zWbllUU509ibEb4xgeyaUZRugbvWHBAzvmNSIH1O7Q/0"
								target="_blank"><img
									src="http://mmbiz.qpic.cn/mmbiz/xPCcG4Ux5tBicrw8iaNuo3OAoEg1fkf0UPjQ3OHfCSV0j82zWbllUU509ibEb4xgeyaUZRugbvWHBAzvmNSIH1O7Q/0"
									style="max-height: 60px;"></a></td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 18:31:36</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="651" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="650">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">嗯</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 14:42:24</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="650" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="649">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">图片</td>
							<td align="left" id="content"><a
								href="http://mmbiz.qpic.cn/mmbiz/28N050lEyEiarGX5cUicn7ZbbeDx1ka8nlISFrHdPUozjVRzKYrJW8L95nve19BfZeO26zcia7RATIXq9XMrfzHgQ/0"
								target="_blank"><img
									src="http://mmbiz.qpic.cn/mmbiz/28N050lEyEiarGX5cUicn7ZbbeDx1ka8nlISFrHdPUozjVRzKYrJW8L95nve19BfZeO26zcia7RATIXq9XMrfzHgQ/0"
									style="max-height: 60px;"></a></td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 14:39:38</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="649" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="648">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">卡伯造型已经通知不合作了</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 14:38:04</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="648" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="647">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">具体是那里三家？如果三家都不合适的话，怎么退钱？</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 14:29:42</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="647" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="646">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/9jSYUdMZ2lK9LDGEZBTucwT1ZUTfUOJ760iafMEqBx2286k73sISWl1s2Vvk8uHPSnDs0atNMpI87icweVypeMKOCrujicCW33D/0"
								style="vertical-align: middle; width: 120px;"><br>不將就
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">起痘的原因</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 12:19:53</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="646" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="645">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/9jSYUdMZ2lK9LDGEZBTucwT1ZUTfUOJ760iafMEqBx2286k73sISWl1s2Vvk8uHPSnDs0atNMpI87icweVypeMKOCrujicCW33D/0"
								style="vertical-align: middle; width: 120px;"><br>不將就
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">谢谢</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 12:19:25</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="645" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="644">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/9jSYUdMZ2lK9LDGEZBTucwT1ZUTfUOJ760iafMEqBx2286k73sISWl1s2Vvk8uHPSnDs0atNMpI87icweVypeMKOCrujicCW33D/0"
								style="vertical-align: middle; width: 120px;"><br>不將就
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">帮我祛痘</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 12:18:59</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="644" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="643">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">昨晚看过了</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 11:45:42</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="643" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="642">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">不要给顾客留下骗钱的感觉</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 11:34:25</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="642" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="641">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">请尽快联系我</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 11:32:42</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="641" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="640">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">问下杭州店撤走后，我的卡里钱啥时能还？</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 11:31:52</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="640" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="639">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/kfXXnichnRDhypJvaBcmUdbHyVHbu9ouIEjdzc9zynsf6U4uB8WMq1VXUwjJ7ho9BVRFyRJDgql7evPMJqiamyS41vLObeXNp9/0"
								style="vertical-align: middle; width: 120px;"><br>Nomo……
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">关注AMANI，我爱电影节</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 11:22:38</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="639" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="638">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">化妆品</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 10:14:57</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="638" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="637">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">护肤品</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 10:14:47</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="637" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="636">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/v6XbW38nFOREMTFdsXXnCLV7mejbpeU7agvRicv4lBibDWIIX5ToqNqMEKldbRib1TPj9hnTCNnaGu8ic5ibmD5cO7A/0"
								style="vertical-align: middle; width: 120px;"><br>VV
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">帮助</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 09:47:14</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="636" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="635">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/v6XbW38nFOREMTFdsXXnCLV7mejbpeU7agvRicv4lBibDWIIX5ToqNqMEKldbRib1TPj9hnTCNnaGu8ic5ibmD5cO7A/0"
								style="vertical-align: middle; width: 120px;"><br>VV
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">ok</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-18 09:47:06</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="635" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="634">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/9jSYUdMZ2lK9LDGEZBTucwT1ZUTfUOJ760iafMEqBx2286k73sISWl1s2Vvk8uHPSnDs0atNMpI87icweVypeMKOCrujicCW33D/0"
								style="vertical-align: middle; width: 120px;"><br>不將就
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">美白</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-17 22:57:22</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="634" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="633">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/9jSYUdMZ2lK9LDGEZBTucwT1ZUTfUOJ760iafMEqBx2286k73sISWl1s2Vvk8uHPSnDs0atNMpI87icweVypeMKOCrujicCW33D/0"
								style="vertical-align: middle; width: 120px;"><br>不將就
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">服装</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-17 22:56:54</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="633" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="632">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/v6XbW38nFOQyFNfToH8ICF4ybBIpfWrB7CTadfM3a5jvXQBVibO4g05G4ME8q0yWHvWnJiaw884t98HWdopn6IMA/0"
								style="vertical-align: middle; width: 120px;"><br>成雨
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">WI-FI</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-17 14:39:47</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="632" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="631">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/C31qOwQVRMXp9DVCaVrLIjzgcejp1iaJ4UAL0keQib6iaZYYlLe3hNav2nxtibScKTTulFAfpb1pqPKh3YLZIGsDQjqwhlia6XhuI/0"
								style="vertical-align: middle; width: 120px;"><br>NicKy
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">帮助</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-17 12:41:26</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="631" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="630">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/C31qOwQVRMXp9DVCaVrLIjzgcejp1iaJ4UAL0keQib6iaZYYlLe3hNav2nxtibScKTTulFAfpb1pqPKh3YLZIGsDQjqwhlia6XhuI/0"
								style="vertical-align: middle; width: 120px;"><br>NicKy
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">111</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-17 12:39:46</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="630" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="613">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">我想查下我之前购买口红的色号</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-16 21:53:25</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="613" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="612">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">我是阿玛尼的会员</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-16 21:53:04</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="612" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="611">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">亲</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-16 21:52:53</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="611" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="610">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">阿玛尼星空店地址</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-15 22:14:58</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="610" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="609">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">链接</td>
							<td align="left" id="content"><a
								href="http://mp.weixin.qq.com/s?__biz=MjM5MjU1MzYxOA==&amp;mid=208694797&amp;idx=1&amp;sn=e67407c12424476ae89d5877d2a0d148#rd"
								target="_blank">标题：2015年6月24日-26日美智产品上海新国际博览中心盛大展会<br>描述：美智堂（上海）生物科技有限公司诚意邀请您参观将于2015年6月24日至26日在龙阳路上海新国际博览中心举办的亚太地区最具规模的美容营养保健品专业展会。
							</a></td>
							<td align="center">未回复</td>
							<td align="center">2015-06-15 20:11:02</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="609" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="608">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/kfXXnichnRDg8H1Bd6uHNwGlicWUNUhtoTL1FKN6pTHdXsBibecJSssOPrWkNBicpDjR5ewf9xotZjemyL00jHytzzty0ib745U7Y/0"
								style="vertical-align: middle; width: 120px;"><br>周未
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">成都有店吗？</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-15 16:37:33</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="608" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="607">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/ajNVdqHZLLALZFTaHBVonzPzmQMSsiaTKqOmRdwWibXBsO0LibTjx5ibjIhOLVcPYZO3YLun6humW6djiaNDGyzKKjw/0"
								style="vertical-align: middle; width: 120px;"><br>ling
								小帅妈妈ε</td>
							<td align="center">文字</td>
							<td align="left" id="content">你好在吗</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-15 12:33:53</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="607" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="606">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/kfXXnichnRDhypJvaBcmUdRdzAz0bU8gbu9Via2sk994OZHJRZqSRibSCB3VWdBicvbGSbUoCPaLZGr8JhfI7DTC7TCjxoWhX5LF/0"
								style="vertical-align: middle; width: 120px;"><br>小璐
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">注册中国最大的微信公众号盈利平台--小小楼
								我们有正规的公司，认证过的网站，不同的产品，多样的文案，专业的团队，捆绑式的收益，是唯一自己拥有几千万粉丝资源的平台，加入我们让我们彼此交流
								共同发展。 微信主们基本以入住，你还在等什么 一切精彩尽在www.xxlou.com</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-15 09:15:15</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="606" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="605">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/9jSYUdMZ2lLnNNkrO1VM6IBVH86woGT2QfpAopT5RJDvYRwUcNjKUTiaumTzUtsXyTFKZ0Q3gmKbmpt2FSicItj2HribLj09VCh/0"
								style="vertical-align: middle; width: 120px;"><br>五</td>
							<td align="center">位置</td>
							<td align="left" id="content">Array</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-14 21:35:56</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="605" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="604">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/kfXXnichnRDhypJvaBcmUdWz63KppwicTDhBIBy2psqMv1Z08BK3cnz2udlOicsl7djcL88crFmaZ0puLEuY9iblcicZJoQcc1MB6/0"
								style="vertical-align: middle; width: 120px;"><br>林夏
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">
								YGBD＃500241199609192442＃047415</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-14 11:53:29</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="604" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="603">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/kfXXnichnRDhypJvaBcmUdUFHJrGBPFib9RLibJlojM4cPJmpialym2eBGo0ViaS2RpRM7ic25qibqqDpVbxAKU7Wj2iaxw6LUrH5tbO/0"
								style="vertical-align: middle; width: 120px;"><br>方天画戟
							</td>
							<td align="center">音频</td>
							<td align="left" id="content">音频</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-14 06:25:57</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="603" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="602">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">在</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-13 16:45:01</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="602" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="601">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/kfXXnichnRDheAJXrECQHVbwtTUCYXTriaNA2HxL4hOFXEX387a4WVBOJag98nzvStUeE5xZ8mNWul08MrV23hKknGk0kmtC4P/0"
								style="vertical-align: middle; width: 120px;"><br>龙</td>
							<td align="center">文字</td>
							<td align="left" id="content">1</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 21:50:13</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="601" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="600">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/UDKJPHUCNEVBdHjHdXWbBKiaJEY3iaNQwfgA35dss85ibZL8mMQeib7yicplqESeey4licoG0k71osDcEbiaUWy5NFbolelwTOG3DDY/0"
								style="vertical-align: middle; width: 120px;"><br>egdp
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">关注AMANI,我爱电影节</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 17:14:20</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="600" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="599">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/WxzEeBkTY1L0n4uyGPgWmYGjfYPWDNJVKLiamRM7M7RFe5hPaKCJYzgvmo3YDtCY34bAiagxEJKMI1hFhzeeZMX6XnvtHPVFfe/0"
								style="vertical-align: middle; width: 120px;"><br>芳儿
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">关注AMANI，我爱电影节</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 17:11:23</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="599" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="598">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">关注AMANI，我爱电影节</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 15:52:04</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="598" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="597">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/C31qOwQVRMXp9DVCaVrLIk6qYFHGeXX4tgfVQIhPIuouTTrnEYaVic7tpdWCmibzBaiaGWObPKG4hGsIia1ja9lxsxJpxK4yZuq9/0"
								style="vertical-align: middle; width: 120px;"><br>红姐
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">关注AMANI,我爱电影节</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 15:01:18</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="597" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="596">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/v6XbW38nFOTEdhHk9cBnOibvDIliaJKjWWNtRjwYB7HX7FEUdzLaOhqm1MlQNpRAtl0sfnWS5QmETk8zvfu0O2bA/0"
								style="vertical-align: middle; width: 120px;"><br>Rachel
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">试用</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 14:45:20</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="596" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="595">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content">染发价格</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 14:21:15</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="595" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="594">
							</span></td>
							<td align="center" id="userinfo"><img src=""
								style="vertical-align: middle; width: 120px;"><br></td>
							<td align="center">文字</td>
							<td align="left" id="content"></td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 12:43:09</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="594" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="593">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/kfXXnichnRDhypJvaBcmUdd1Y4xMciczf112aWvVYX41EDicVBoPxPgVevFfdFsHkAyE8k6UzLITyeGojIibKPuzb92hFSYDE1RA/0"
								style="vertical-align: middle; width: 120px;"><br>马蒙蒙
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">
								YGDB#320381198712110626#047103</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 12:20:41</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="593" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="592">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/kfXXnichnRDhypJvaBcmUdTr3YfVJbiaHnbDT1kekliagXWY6RBicW9ybKxibYb6ibdtTPibgKloCHpzuPgKjhPZqe3PoJRwjQ6Qr4y/0"
								style="vertical-align: middle; width: 120px;"><br>♚
								.Choco＆Lee</td>
							<td align="center">文字</td>
							<td align="left" id="content">YGBD320924199109270860#047102
							</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 12:11:03</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="592" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="591">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/kfXXnichnRDhypJvaBcmUdTr3YfVJbiaHnbDT1kekliagXWY6RBicW9ybKxibYb6ibdtTPibgKloCHpzuPgKjhPZqe3PoJRwjQ6Qr4y/0"
								style="vertical-align: middle; width: 120px;"><br>♚
								.Choco＆Lee</td>
							<td align="center">文字</td>
							<td align="left" id="content">
								ygbd#320924199109270860#047102</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 12:09:10</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="591" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
						<tr class="listTr">
							<td class="td2" align="center"><span
								style="padding-top: 1px;"> <input type="checkbox"
									id="id[]" name="id[]" value="590">
							</span></td>
							<td align="center" id="userinfo"><img
								src="http://wx.qlogo.cn/mmopen/kfXXnichnRDhypJvaBcmUdS0IVib5IFicIfdwEtFgN2eOiaDU92k3QIRxkzFicnrRdOZfy3x7e4iafoaX1wySVlk1iaVb6EchbicqgFB/0"
								style="vertical-align: middle; width: 120px;"><br>待续中......
							</td>
							<td align="center">文字</td>
							<td align="left" id="content">1</td>
							<td align="center">未回复</td>
							<td align="center">2015-06-12 12:07:48</td>
							<td align="center" class="adminDoBoxs">
								<div>
									<a href="javascript:;" rel="590" class="sendMailBtns"
										title="回复">&nbsp;</a> <a href="javascript:;"
										class="deleteBtns" title="删除">&nbsp;</a>
								</div>
							</td>
						</tr>
					 
						<tr class="listPageTr">
							<td colspan="7" align="center"><div class="pageBoxs">
									<div class="pages">
										<b>上一页</b><b>1</b><a href="/admin/sms/index/?p=2">2</a><a
											href="/admin/sms/index/?p=3">3</a><a
											href="/admin/sms/index/?p=4">4</a><a
											href="/admin/sms/index/?p=5">5</a><a
											href="/admin/sms/index/?p=6">6</a><a
											href="/admin/sms/index/?p=7">7</a><a
											href="/admin/sms/index/?p=8">8</a><a
											href="/admin/sms/index/?p=9">9</a><span>…</span><a
											href="/admin/sms/index/?p=63">63</a><a
											href="/admin/sms/index/?p=64">64</a><a
											href="/admin/sms/index/?p=2" class="nextprev">下一页</a><span
											class="fl">记录<strong style="color: red;">634</strong>条&nbsp;&nbsp;共<strong
											style="color: red;">64</strong>页
										</span>
									</div>
								</div></td>
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
            $('#content img').css('max-height', '60px');
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

            //删除
            $('.deleteBtns').click(function () {
                $(':checkbox[name="id[]"]').attr('checked', false);
                $(this).parents('tr').find(':checkbox[name="id[]"]').attr('checked', true);
                $('#dotype').val('del');
                $('#submitBtn').trigger('click');
            });

            $('.sendMailBtns').click(function () {
                var id = $(this).attr('rel')
                art.dialog.open('Dashboard/CustomerService/Message/edit' , {
                    id: "sendMsg",
                    title: "回复信息",
                    width: 500,
                    height: 250,
                    lock: true
                });
                return false;
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