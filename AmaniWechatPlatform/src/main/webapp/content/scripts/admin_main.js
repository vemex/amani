/*
*
* 后台公用函数
*/
function getObj(id) {
	return document.getElementById(id);
}

function CheckAll(form,type){
	for (var i=0;i<form.elements.length;i++){
		var e = form.elements[i];
		if(e.type=="checkbox"){
			if(typeof(type) != 'undefined'){
				e.checked == true ? e.checked = false : e.checked = true;
			}else{
				e.checked = true;
			}
		}
	}
}

//删除确认
function delnav(txt){
	var msg = txt?txt:"确实要删除此记录吗？";
	return confirm(msg);
}

//隐藏子菜单
function cateopen(id) {
	try{
		var o = $('#cate_' + id);
		if (o == null) return;
		if (o.css('display') == 'none') {
			o.css('display','');
			$('#bt_' + id).attr('class', 'expand expand_a');
		} else {
			o.css('display','none');
			$('#bt_' + id).attr('class','expand expand_b');
		}
	} catch(e){}
}

function suggestKey(field, len)
{
	var key = 'abcdefhijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWYXZ~!@$^*()+-,.;[]{}|/';
	var i = 0;
	var suggestKey = '';
	if (!len) len = 16;
	while (i ++ < len)
	{
		suggestKey += key.charAt(Math.random() * key.length);
	}
	$("#"+field).val(suggestKey);
}

/**
* 含文字的模块
*/
function radioWithWords(self)
{
var ele = self.getElementsByTagName('input')[0];
var nm = ele.name;
ele.click();
//ele.checked=true;
//取消其它单选框的选择
var otherInputs = document.getElementsByName(nm);
var l = otherInputs.length;
for(var i=0;i<l;i++)
if(otherInputs[i].parentNode.className=='current')
otherInputs[i].parentNode.className='';
self.className = 'current';
}
//弹出窗口
function openDialog(url,width,height)
{
    var w = 1024;
    var h = 768;
    if (document.all || document.layers)
    {
        w = screen.availWidth;
        h = screen.availHeight;
    }
    var leftPos = (w/2-width/2);
    var topPos = (h/2.3-height/2.3);
    window.open(url,'',"width="+width+",height="+height+",top="+topPos+",left="+leftPos+",scrollbars=no,resizable=no,status=no");
}

function setTab(tab,container,cursel,n){
	for(i=1;i<=n;i++){
		var menu=$("#"+tab+"_"+i);
		var con=$("#"+container+"_"+i);
		var className= i==cursel ? "current":"";
		menu.attr('class',className);
		var display= i== cursel ? "block":"none";
		con.css('display',display);		
	}	
}

function addressInfo(val){
	if(val > -1){
		var provinceId = $("#province_areas").val();	
		var province = $("#province_areas").find("option:selected").text();
		var city = $("#city_areas").find("option:selected").text();
		var area = $("#area_areas").find("option:selected").text();
		$("#address").val(province+city+area);		
	}
}

function getUpload(o){
	var key = $(o).attr("rel");
	var obj = $(o).parent();
	editor.loadPlugin('image', function() {
		editor.plugin.imageDialog({
			showRemote : false,
			clickFn : function(url, title, width, height, border, align) {
				obj.find("#"+key).val(url);
				editor.hideDialog();
			}
		});
	});		
}

function showChooseType(val,obj){
	if(val==0){
		$("#"+obj).show();	
	}else{
		$("#"+obj).hide();		
	}
}
