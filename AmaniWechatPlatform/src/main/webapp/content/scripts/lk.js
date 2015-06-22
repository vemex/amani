$(function () {
    if (typeof ($.fn.fancybox) == 'function') {
        $(".contFancybox").fancybox({
            padding: 0
        });
        $(".imgsFancybox").fancybox({
            padding: 15,
            openEffect: "elastic",
            openSpeed: 150,
            closeEffect: "elastic",
            closeSpeed: 150,
            closeClick: true
        });
    }
    $(".lk_input input").on("focus", function () {
        $(this).addClass("lk_input_cur");
    })
    $(".lk_input input").on("blur", function () {
        $(this).removeClass("lk_input_cur");
    })
    $(".tMenu .icon").click(function () {
        $(".tMenu .tMenu_tc").toggle();
    })
    clicks(".ppjsd", "");
    clicks(".wztc a", "");
})
function clicks(element, links) {
    $(element).on({
        'touchstart mousedown': function () {
            if (links == '') {
                $(this).addClass('active');
            } else {
                $(this).children(links).addClass('active');
            }
        },
        'touchend touchcancel mouseup': function () {
            if (links == '') {
                $(this).removeClass('active');
            } else {
                $(this).children(links).removeClass('active');
            }
        }
    });
}