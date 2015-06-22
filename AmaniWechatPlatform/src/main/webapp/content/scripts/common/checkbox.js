var CheckBox = {};
//全选
CheckBox.CheckAll = function (checkBox, containerId) {
    if (containerId == undefined)
        $("input[type=checkbox]").each(function () { this.checked = checkBox.checked; });
    else {
        $("#" + containerId + " input[type=checkbox]").each(function () { this.checked = checkBox.checked; });
    }
};

//获取已选择的多个id
CheckBox.GetCheckedIds = function (containerId) {
	if (containerId == undefined)
		return $("input.check-box:checked").map(function (){
					return $(this).attr("rel"); 
				}).get();
	else
		return $("#" + containerId + " input.check-box:checked").map(function () { 
					return $(this).attr("rel"); 
				}).get();
};
