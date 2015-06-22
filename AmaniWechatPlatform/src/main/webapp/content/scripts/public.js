// 检查 email 格式
function IsEmail(strg) {
    //var patrn = new RegExp('^[0-9a-zA-Z_\-\.]+@[0-9a-zA-Z_\-]+(\.[0-9a-zA-Z_\-]+)*$'); 
    var patrn = new RegExp('^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$');
    if (!patrn.test(strg))
        return false;
    return true;
}

// 验证电话
function IsTel(strg) {
    var patrn = new RegExp('^(([0\+]\d{2,3}-)?(0\d{2,3})-)(\d{7,8})(-(\d{3,}))?$');
    if (!patrn.test(strg))
        return false;
    return true;
}

// 验证手机
function IsMobile(strg) {
    var patrn = new RegExp("^0?(13[0-9]|15[012356789]|18[0236789]|14[57])[0-9]{8}$");
    //var patrn = new RegExp('^(13|15|18)[0-9]{9}$');
    if (!patrn.test(strg))
        return false;
    return true;
}

// 验证邮编
function IsZip(strg) {
    var patrn = new RegExp('^\\d{6}$');
    if (!patrn.test(strg))
        return false;
    return true;
}

function DrawImage(ImgD, iwidth, iheight) {
    //参数(图片,允许的宽度,允许的高度)
    var image = new Image();
    image.src = ImgD.src;
    if (image.width > 0 && image.height > 0) {
        if (image.width / image.height >= iwidth / iheight) {
            if (image.width > iwidth) {
                ImgD.width = iwidth;
                ImgD.height = (image.height * iwidth) / image.width;
            } else {
                ImgD.width = image.width;
                ImgD.height = image.height;
            }
            //ImgD.alt=image.width+"×"+image.height;
        } else {
            if (image.height > iheight) {
                ImgD.height = iheight;
                ImgD.width = (image.width * iheight) / image.height;
            } else {
                ImgD.width = image.width;
                ImgD.height = image.height;
            }
            //ImgD.alt=image.width+"×"+image.height;
        }
    }
}

//提示窗口
function showMsg(msg, time) {
    art.dialog({
        content: msg,
        lock: true,
        fixed: 'false',
        drag: false,
        resize: false,
        id: 'msg1',
        background: '#000',
        opacity: 0.3
    }).title('提示窗口').time(time ? time : 10);
}

//提示窗口
function showContent(msg, title, width) {
    art.dialog({
        content: msg,
        lock: true,
        fixed: 'false',
        drag: false,
        resize: false,
        id: 'msg1',
        width: width ? width : 500,
        background: '#000',
        opacity: 0.01,
        title: title
    });
}

//刷新页面
function refreshs(msg, url) {
    showMsg(msg ? msg : '恭喜您，操作成功！');
    //window.location.href = url ? url: window.location.href;
    top.location.href = url ? url : window.location.href;
}

function searchkeyclick(e, txts) {
    if ($(e).val() == txts) {
        $(e).val('');
    } else {
        $(e).focus();
    }
}

function searchkeydblclick(e, txts) {
    if ($(e).val() == txts) {
        $(e).val('');
    } else {
        $(e).select();
    }
}

function blursearchkey(e, txts) {
    var value = $(e).val();
    var txt = new RegExp("[,\\`,\\~,\\!,\\@,\#,\\$,\\%,\\^,\\+,\\*,\\&,\\\\,\\/,\\?,\\|,\\:,\\<,\\>,\\{,\\},\\(,\\),\\',\\;,\\=,\"]");
    if (txt.test(value)) {
        alert("关键字中请不要输入特殊字符！");
        $(e).val(txts);
    }
    if ($(e).val() == "" || $(e).val() == undefined) {
        $(e).val(txts);
    }
}

//区域联动选项
function areaSelect(parentId, _target) {
    $.ajax({
        type: 'get',
        url: "/ajax/area/",
        data: {act: "getAreaList", parentId: parentId},
        timeout: 90000,
        beforeSend: function () {
        },
        dataType: 'json',
        success: function (o) {
            if (o.isok) {
                $("#" + _target).html(o.data);
            }
        },
        complete: function () {
        },
        error: function () {
        }
    });
}

function CheckAll(form, type) {
    for (var i = 0; i < form.elements.length; i++) {
        var e = form.elements[i];
        if (e.type == "checkbox") {
            if (typeof (type) != 'undefined') {
                e.checked == true ? e.checked = false : e.checked = true;
            } else {
                e.checked = true;
            }
        }
    }
}

//提示窗口
function showContent(msg, title, width) {
    art.dialog({
        content: msg,
        lock: true,
        fixed: 'false',
        drag: false,
        resize: false,
        id: 'msg1',
        width: width ? width : 500,
        background: '#000',
        opacity: 0.01,
        title: title
    });
}
//消息提示
function altTip(txt, icon, ok, no, time) {
    art.dialog.through({
        content: txt,
        icon: icon,
        time: time,
        lock: true,
        yesFn: ok,
        noFn: no
    });
}