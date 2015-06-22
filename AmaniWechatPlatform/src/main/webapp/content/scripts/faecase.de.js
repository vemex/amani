// JavaScript Document
$(function(){
	//按输入机构名称查找机构并选择
	$("#inst_name").bind('change',function(){
		var inst_name = $(this).val();
		$.ajax({
			type:'get',
			url: "/ajax/institution/",
			data:{ act:"getListByKeys", keys:inst_name },
			timeout:90000,
			beforeSend:function(){},
			dataType : 'json',
			success:function(o){
				if(o.returnStr){
					$("#findList").html(o.returnStr).show();	
				}
			},
			complete:function(){},
			error:function(){}
		});	
	});
	$("#inst_name").bind('blur',function(){
		var inst_name = $(this).val();
		$.ajax({
			type:'get',
			url: "/ajax/institution/",
			data:{ act:"getListByKeys", keys:inst_name },
			timeout:90000,
			beforeSend:function(){},
			dataType : 'json',
			success:function(o){
				if(o.returnStr){
					$("#findList").html(o.returnStr).show();	
				}
			},
			complete:function(){},
			error:function(){}
		});	
	});
	$("#inst_name").keyup(function(){
		var inst_name = $(this).val();
		$.ajax({
			type:'get',
			url: "/ajax/institution/",
			data:{ act:"getListByKeys", keys:inst_name },
			timeout:90000,
			beforeSend:function(){},
			dataType : 'json',
			success:function(o){
				if(o.returnStr){
					$("#findList").html(o.returnStr).show();	
				}
			},
			complete:function(){},
			error:function(){}
		});	
	});

	//按输入产品名称查找机构并选择
	$("#et_name").bind('change',function(){
		var et_name = $(this).val();
		$.ajax({
			type:'get',
			url: "/ajax/etshop/",
			data:{ act:"getListByKeys", keys:et_name },
			timeout:90000,
			beforeSend:function(){},
			dataType : 'json',
			success:function(o){
				if(o.returnStr){
					$("#findEtList").html(o.returnStr).show();	
				}
			},
			complete:function(){},
			error:function(){}
		});	
	});
	$("#et_name").bind('blur',function(){
		var et_name = $(this).val();
		$.ajax({
			type:'get',
			url: "/ajax/etshop/",
			data:{ act:"getListByKeys", keys:et_name },
			timeout:90000,
			beforeSend:function(){},
			dataType : 'json',
			success:function(o){
				if(o.returnStr){
					$("#findEtList").html(o.returnStr).show();	
				}
			},
			complete:function(){},
			error:function(){}
		});	
	});
	$("#et_name").keyup(function(){
		var et_name = $(this).val();
		$.ajax({
			type:'get',
			url: "/ajax/etshop/",
			data:{ act:"getListByKeys", keys:et_name },
			timeout:90000,
			beforeSend:function(){},
			dataType : 'json',
			success:function(o){
				if(o.returnStr){
					$("#findEtList").html(o.returnStr).show();	
				}
			},
			complete:function(){},
			error:function(){}
		});	
	});

	
})

//选择产品赋值
function getCaseEtInfo(o){
	var etInfo = $(o).attr('rel');
	etInfo = etInfo.split("_");
	var et_id = etInfo[0];
	var et_cid = etInfo[1];
	var et_name = $(o).html();
	$("#findEtList").html('').hide();
	$("#et_id").val(et_id);
	$("#et_cid").val(et_cid);
	$("#et_name").val(et_name);
}

//选择机构赋值
function getInstitutionInfo(o){
	var inst_id = $(o).attr('rel');
	var inst_name = $(o).html();
	$("#findList").html('').hide();
	$("#institution_id").val(inst_id);
	$("#inst_name").val(inst_name);
}
