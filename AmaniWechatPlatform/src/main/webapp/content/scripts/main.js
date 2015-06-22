/*******************************
 * Author:Mr.Think
 * Description:微信分享通用代码
 * 使用方法：_WXShare('分享显示的LOGO','LOGO宽度','LOGO高度','分享标题','分享描述','分享链接','微信APPID(一般不用填)');
 *******************************/
function _WXShare(img, width, height, title, desc, url, appid) {
    //初始化参数
    img = img || 'http://a.zhixun.in/plug/img/ico-share.png';
    width = width || 100;
    height = height || 100;
    title = title || document.title;
    desc = desc || document.title;
    url = url || document.location.href;
    appid = appid || '';
    //微信内置方法
    function _ShareFriend() {
        WeixinJSBridge.invoke('sendAppMessage', {
            'appid': appid,
            'img_url': img,
            'img_width': width,
            'img_height': height,
            'link': url,
            'desc': desc,
            'title': title
        }, function (res) {
            _report('send_msg', res.err_msg);
        })
    }
    function _ShareTL() {
        WeixinJSBridge.invoke('shareTimeline', {
            'img_url': img,
            'img_width': width,
            'img_height': height,
            'link': url,
            'desc': desc,
            'title': title
        }, function (res) {
            _report('timeline', res.err_msg);
        });
    }
    function _ShareWB() {
        WeixinJSBridge.invoke('shareWeibo', {
            'content': desc,
            'url': url,
        }, function (res) {
            _report('weibo', res.err_msg);
        });
    }
    // 当微信内置浏览器初始化后会触发WeixinJSBridgeReady事件。
    document.addEventListener('WeixinJSBridgeReady', function onBridgeReady() {
        // 发送给好友
        WeixinJSBridge.on('menu:share:appmessage', function (argv) {
            _ShareFriend();
        });

        // 分享到朋友圈
        WeixinJSBridge.on('menu:share:timeline', function (argv) {
            _ShareTL();
        });

        // 分享到微博
        WeixinJSBridge.on('menu:share:weibo', function (argv) {
            _ShareWB();
        });
    }, false);
}

var Msize = $(".m-page").size(), page_n = 1, initP = null, moveP = null, firstP = null, newM = null, p_b = null, indexP = null, move = null, start = true, startM = null, position = null, DNmove = false, mapS = null, canmove = false, textNode = [], textInt = 1;
audio_switch_btn = true, audio_btn = true, audio_loop = false, audioTime = null, audioTimeT = null, audio_interval = null, audio_start = null, audio_stop = null, mousedown = null, plugin_type = {"info_pic2": {num: 0, id: 0}, "info_nomore": {num: 0, id: 0}, "info_more": {num: 0, id: 0}, "multi_contact": {num: 0, id: 0}, "video": {num: 0, id: 0}, "input": {num: 0, id: 0}, "dpic": {num: 0, id: 0}};
var v_h = null;
function init_pageH() {
    var fn_h = function () {
        if (document.compatMode == "BackCompat") {
            var Node = document.body
        } else {
            var Node = document.documentElement
        }
        return Math.max(Node.scrollHeight, Node.clientHeight)
    };
    var page_h = fn_h();
    var m_h = $(".m-page").height();
    page_h >= m_h ? v_h = page_h : v_h = m_h;
    $(".m-page").height(v_h);
    $(".p-index").height(v_h)
}
init_pageH();
var lazyNode = $(".lazy-bk");
lazyNode.each(function () {
    var self = $(this);
    if (self.is("img")) {
        self.attr("src", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsQAAA7EAZUrDhsAAAANSURBVBhXYzh8+PB/AAffA0nNPuCLAAAAAElFTkSuQmCC")
    } else {
        self.css({"background-image": "url(/img/loading.gif)", "background-size": "120px 120px"})
    }
});
setTimeout(function () {
    for (var i = 0; i < 3; i++) {
        var node = $(".m-page").eq(i);
        if (node.length == 0) {
            break
        }
        if (node.find(".lazy-bk").length != 0) {
            lazy_change(node)
        } else {
            continue
        }
    }
}, 200);
function lazy_bigP() {
    for (var i = 3; i <= 5; i++) {
        var node = $(".m-page").eq(page_n + i - 1);
        if (node.length == 0) {
            break
        }
        if (node.find(".lazy-bk").length != 0) {
            lazy_change(node)
        } else {
            continue
        }
    }
}
function lazy_change(node) {
    if (node.attr("data-yuyue") == "true") {
        $(".weixin-share").find(".lazy-bk").attr("src", $(".weixin-share").find(".lazy-bk").attr("data-bk"))
    }
    var lazy = node.find(".lazy-bk");
    lazy.each(function () {
        var self = $(this), srcImg = self.attr("data-bk");
        $("<img />").on("load", function () {
            if (self.is("img")) {
                self.attr("src", srcImg)
            } else {
                self.css({"background-image": "url(" + srcImg + ")", "background-size": "cover"})
            }
            for (var i = 0; i < $(".m-page").size(); i++) {
                var page = $(".m-page").eq(i);
                if ($(".m-page").find(".lazy-bk").length == 0) {
                    continue
                } else {
                    lazy_change(page)
                }
            }
        }).attr("src", srcImg);
        self.removeClass("lazy-bk")
    })
}
function changeOpen(e) {
    $(".m-page").on("mousedown touchstart", page_touchstart);
    $(".m-page").on("mousemove touchmove", page_touchmove);
    $(".m-page").on("mouseup touchend mouseout", page_touchend);
    $(".wct .tableWrap").on("mousedown touchstart", page_touchstart);
    $(".wct .tableWrap").on("mousemove touchmove", page_touchmove);
    $(".wct .tableWrap").on("mouseup touchend mouseout", page_touchend)
}
function changeClose(e) {
    $(".m-page").off("mousedown touchstart");
    $(".m-page").off("mousemove touchmove");
    $(".m-page").off("mouseup touchend mouseout");
    $(".wct .tableWrap").off("mousedown touchstart");
    $(".wct .tableWrap").off("mousemove touchmove");
    $(".wct .tableWrap").off("mouseup touchend mouseout")
}
changeOpen();
function page_touchstart(e) {
    if (e.type == "touchstart") {
        initP = window.event.touches[0].pageY
    } else {
        initP = e.y || e.pageY;
        mousedown = true
    }
    firstP = initP
}
function V_start(val) {
    initP = val;
    mousedown = true;
    firstP = initP
}
function page_touchmove(e) {
    e.preventDefault();
    e.stopPropagation();
    $(".player-tip").hide();
    if (start || startM) {
        startM = true;
        if (e.type == "touchmove") {
            moveP = window.event.touches[0].pageY
        } else {
            if (mousedown) {
                moveP = e.y || e.pageY
            }
        }
        page_n == 1 ? indexP = false : indexP = true
    }
    if (moveP && startM) {
        if (!p_b) {
            p_b = true;
            position = moveP - initP > 0 ? true : false;
            if (position) {
                if (indexP) {
                    newM = page_n - 1;
                    var v_path = $(this).find("#videoFrame").attr("data-rel");
                    var next_path = $(".m-page").eq(newM - 1).find("#videoFrame").attr("data-rel");
                    $(this).find("#videoFrame").attr("src", '');
                    $(".m-page").eq(newM - 1).find("#videoFrame").attr("src", next_path);
                    $(".m-page").eq(newM - 1).addClass("active").css("top", -v_h);
                    move = true
                } else {
                    if (canmove) {
                        move = true;
                        newM = Msize;
                        var v_path = $(this).find("#videoFrame").attr("data-rel");
                        var next_path = $(".m-page").eq(newM - 1).find("#videoFrame").attr("data-rel");
                        $(this).find("#videoFrame").attr("src", '');
                        $(".m-page").eq(newM - 1).find("#videoFrame").attr("src", next_path);
                        $(".m-page").eq(newM - 1).addClass("active").css("top", -v_h)
                    } else {
                        move = false
                    }
                }
            } else {
                if (page_n != Msize) {
                    if (status_bool) {
                        var _audio = document.getElementById("audioPlay");
                        _audio.play()
                    }
                    if (!indexP) {
                        $(".audio_txt").addClass("close")
                    }
                    newM = page_n + 1;
                    var v_path = $(this).find("#videoFrame").attr("data-rel");
                    var next_path = $(".m-page").eq(newM - 1).find("#videoFrame").attr("data-rel");
                    $(this).find("#videoFrame").attr("src", '');
                    $(".m-page").eq(newM - 1).find("#videoFrame").attr("src", next_path);
                    $(".m-page").eq(newM - 1).addClass("active").css("top", v_h);
                    move = true
                } else {
                }
            }
        }
        if (!DNmove) {
            if (move) {
                if ($("#car_audio").length > 0 && audio_switch_btn && Math.abs(moveP - firstP) > 100) {
                    $("#car_audio")[0].play();
                    audio_loop = true
                }
                start = false;
                var topV = parseInt($(".m-page").eq(newM - 1).css("top"));
                $(".m-page").eq(newM - 1).css({"top": topV + moveP - initP});
                initP = moveP
            } else {
                moveP = null
            }
        } else {
            moveP = null
        }
    }
}
function page_touchend(e) {
    startM = null;
    p_b = false;
    audio_close();
    var move_p;
    position ? move_p = moveP - firstP > 100 : move_p = firstP - moveP > 100;
    if (move) {
        if (move_p && Math.abs(moveP) > 5) {
            $(".m-page").eq(newM - 1).animate({"top": 0}, 300, "easeOutSine", function () {
                success()
            })
        } else {
            if (Math.abs(moveP) >= 5) {
                position ? $(".m-page").eq(newM - 1).animate({"top": -v_h}, 100, "easeOutSine") : $(".m-page").eq(newM - 1).animate({"top": v_h}, 100, "easeOutSine");
                $(".m-page").eq(newM - 1).removeClass("active");
                start = true
            }
        }
    }
    initP = null, moveP = null, firstP = null, mousedown = null
}
var J_fTxt = $(".J_fTxt");
setTimeout(function () {
    J_fTxt.eq(0).show()
}, 500);
function success() {
    $(".m-page").eq(page_n - 1).removeClass("show active").addClass("hide");
    $(".m-page").eq(newM - 1).removeClass("active hide").addClass("show");
    lazy_bigP();
    page_n = newM;
    start = true;
    J_fTxt.eq(page_n - 1).show();
    J_fTxt.each(function (k, v) {
        if (k !== page_n - 1) {
            $(this).hide()
        }
    });
    if (page_n == Msize) {
        if ($(".popup-txt").attr("data-show") != "show") {
            $(".popup-txt").attr("data-show", "show");
            $(".popup-txt").addClass("txtHide")
        }
        canmove = true
    } else {
        $(".popup-txt").removeClass("txtHide")
    }
    if ($(".m-page").eq(page_n - 1).find(".ylMap").length > 0 && !mapS) {
        if (!mapS) {
            mapS = new ylmap.init
        }
    }
    if ($(".m-page").eq(page_n - 1).find(".m-txt").length > 0) {
        txtExtand()
    }
    if ($(".m-video").find("video")[0] != undefined) {
        $(".m-video").find("video")[0].pause();
        $(".video-warp").show()
    }
    $(".m-txt").removeClass("open");
    $(".m-txt").each(function () {
        if ($(this).attr("data-self") != "") {
            $(this).css("height", $(this).attr("data-self"))
        }
    })
}
function audio_close() {
    if (audio_btn && audio_loop) {
        audio_btn = false;
        audioTime = Number($("#car_audio")[0].duration - $("#car_audio")[0].currentTime) * 1000;
        if (audioTime < 0) {
            audioTime = 0
        }
        if (audio_start) {
            if (isNaN(audioTime)) {
                audioTime = audioTimeT
            } else {
                audioTime > audioTimeT ? audioTime = audioTime : audioTime = audioTimeT
            }
        }
        if (!isNaN(audioTime) && audioTime != 0) {
            audio_btn = false;
            setTimeout(function () {
                $("#car_audio")[0].pause();
                $("#car_audio")[0].currentTime = 0;
                audio_btn = true;
                audio_start = true;
                if (!isNaN(audioTime) && audioTime > audioTimeT) {
                    audioTimeT = audioTime
                }
            }, audioTime)
        } else {
            audio_interval = setInterval(function () {
                if (!isNaN($("#car_audio")[0].duration)) {
                    if ($("#car_audio")[0].currentTime != 0 && $("#car_audio")[0].duration != 0 && $("#car_audio")[0].duration == $("#car_audio")[0].currentTime) {
                        $("#car_audio")[0].currentTime = 0;
                        $("#car_audio")[0].pause();
                        clearInterval(audio_interval);
                        audio_btn = true;
                        audio_start = true;
                        if (!isNaN(audioTime) && audioTime > audioTimeT) {
                            audioTimeT = audioTime
                        }
                    }
                }
            }, 20)
        }
    }
}
function txtExtand() {
    $(".m-page").eq(page_n - 1).find(".m-txt").not(".txt-noclick").each(function () {
        var txt = $(this).attr("data-txt"), txtnum;
        if (!txt) {
            $(this).attr("data-txt", textInt);
            txtnum = textInt;
            textInt++
        } else {
            txtnum = txt
        }
        if (txtnum in textNode) {
        } else {
            var maxHeight = "500";
            if ($(".m-page").eq(page_n - 1).find(".m-txt02").size() > 0) {
                maxHeight = "300"
            }
            textNode[txtnum] = new txtInit(this, {maxHeight: maxHeight, maxWidth: "500", node: "p,h2"})
        }
    })
}
if ($(".m-page").eq(page_n - 1).find(".m-txt").length > 0) {
    txtExtand()
}
$(function () {
    var bd = $(document.body);
    window.addEventListener("onorientationchange" in window ? "orientationchange" : "resize", _orientationchange, false);
    function _orientationchange() {
        scrollTo(0, 1);
        switch (window.orientation) {
            case 0:
                bd.addClass("landscape").removeClass("portrait");
                init_pageH();
                break;
            case 180:
                bd.addClass("landscape").removeClass("portrait");
                init_pageH();
                break;
            case -90:
                init_pageH();
                if ($(".m-video video")[0] != undefined && $(".m-video video")[0].paused) {
                    alert("请竖屏查看页面，效果更佳")
                } else {
                    alert("请竖屏查看页面，效果更佳")
                }
                break;
            case 90:
                init_pageH();
                bd.addClass("portrait").removeClass("landscape");
                if ($(".m-video video")[0].paused) {
                    alert("请竖屏查看页面，效果更佳")
                }
                break
        }
    }
    $(window).on("load", _orientationchange)
});
function loadingPageShow() {
    $(".pageLoading").show()
}
function loadingPageHide() {
    $(".pageLoading").hide()
}
var input_focus = false;
function initPage() {
    $(".m-page").addClass("hide").eq(page_n - 1).addClass("show").removeClass("hide");
    if ($(".m-page").eq(page_n - 1).find(".ylMap").length > 0 && !mapS) {
        mapS = new ylmap.init
    }
    $(document.body).find("img").on("mousedown", function (e) {
        e.preventDefault()
    });
    $(".btn-boder-color").click(function () {
        if (!$(this).hasClass("open")) {
            $(this).addClass("open")
        }
        setTimeout(function () {
            $(".btn-boder-color").removeClass("open")
        }, 600)
    });
    $(".wct_form input").on("focus", function () {
        if ($(this).attr("type") != "submit") {
            changeClose()
        }
        setTimeout(function () {
            input_focus = true
        }, 500)
    });
    $(".wct_form input").on("blur", inputBlur);
    function inputBlur() {
        changeOpen();
        input_focus = false
    }
    window.addEventListener("resize", input_focus_out, false);
    function input_focus_out() {
        if ($('.wct_form input[type!="radio"]:focus').length >= 1 && input_focus) {
            changeOpen();
            input_focus = false;
            $(".wct_form input").off("blur");
            $(".wct_form input").blur();
            $(".wct_form input").on("blur", inputBlur)
        } else {
            return
        }
    }
    $(".video-warp").on("click", function () {
        $(".m-video").find("video")[0].play();
        $(this).hide();
        $("#car_audio")[0].pause()
    });
    var video = $(".m-video").find("video");
    video.on("play", function () {
        $(".video-warp").hide();
        $("#car_audio")[0].pause()
    });
    video.on("pause", function () {
        $(".video-warp").show()
    });
    video.on("ended", function () {
        $(".video-warp").show()
    });
    if (RegExp("iPhone").test(navigator.userAgent) || RegExp("iPod").test(navigator.userAgent) || RegExp("iPad").test(navigator.userAgent)) {
        $(".m-page").css("height", "101%")
    }
}
(initPage());
function loading(type) {
    if ("loading" == type) {
        $(".loading").css({display: "block"})
    } else {
        if ("end" == type) {
            $(".loading").css({display: "none"})
        }
    }
}
$(function () {
    $(".sex").bind("click", function () {
        var sex = $(this).attr("data-sex");
        $(this.parentNode).find("input").val(sex);
        $(this.parentNode).find("strong").removeClass("on");
        $(this).find("strong").addClass("on")
    })
});
function showMessage(msg, error) {
    if (error) {
        $(".popup_error").html(msg);
        $(".popup_error").addClass("on");
        $(".popup_sucess").removeClass("on");
        setTimeout(function () {
            $(".popup").removeClass("on")
        }, 2000)
    } else {
        $(".popup_sucess").addClass("on");
        $(".popup_error").removeClass("on");
        setTimeout(function () {
            $(".popup").removeClass("on")
        }, 2000)
    }
}
$("#takealook").click(function () {
    $(".run-dialog").addClass("run-dialog-show");
    return false
});
$(".run-dialog a").click(function () {
    $(".run-dialog").removeClass("run-dialog-show");
    return false
});