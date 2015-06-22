// JavaScript Document
var company = {

	//查看公司下属员工记录--------------------------------------------------------
	showStaff : function(id){
		var myDialog = art.dialog.open('',{
			id : 'showStaff',
			title:'查看员工列表',
			lock:true,
			background:'#000',
			width: '600px',
			opacity:0.27
		});
		$.ajax({
			type:'get',
			url: "/ajax/company/",
			data:{ act:"showStaff", id:id },
			timeout:90000,
			beforeSend:function(){},
			dataType : 'json',
			success:function(o){
				myDialog.content(o.data);
				return false;
			},
			complete:function(){},
			error:function(){}
		});
	},
	
	//用户申请开通企业账户
	openCompanyAccount : function(){
		art.dialog.open('/ucenter/index/opencompany/',{
			id: "opencompany",
			title: "完善公司资料",
			lock: true,
			width : 850,
			height : 600
		});
		return false;
	},
	
	//添加提交企业基本信息
	addCompanyAccount : function(){
		art.dialog.open('/ucenter/index/addcompany/',{
			id: "addcompany",
			title: "提交公司资料",
			lock: true,
			width : 850,
			height : 550
		});
		return false;
	},
	
	//编辑企业基本信息
	editCompanyAccount : function(){
		art.dialog.open('/ucenter/index/editcompanys/',{
			id: "editcompany",
			title: "编辑公司资料",
			lock: true,
			width : 850,
			height : 550
		});
		return false;
	}

}
