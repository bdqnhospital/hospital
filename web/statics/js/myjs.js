// 定义一个全局变量
var dataList = {};
$(document).ready(function () {
    init();
    $("#one tbody").on("click", "tr", function () {
        $("#one").hide();
        $("#two").show();
        var td = $(this).find("td").eq(1);
        var id = td.attr("id");
        var num = id.substring(4);
        // 1.清空表格
        $("#patientInfo").empty();
        // 2.封装表格数据
        var html = "<tr class='patientList'><td>" + dataList[num].id
            + "</td><td>" + dataList[num].patientId + "</td><td>" + dataList[num].patientName
            + "</td><td>" + dataList[num].patientSex + "</td><td>" + dataList[num].patientMobile
            + "</td><td>" + dataList[num].patientAddress + "</td><td>" + dataList[num].patientIdentity
            + "</td><td>" + dataList[num].createDate + "</td></tr>";
        $("#patientInfo").html(html);
    });
})

function init() {
    $("#one").show();
    $("#two").hide();
    $("#three").hide();
    $("#patient").empty();

    $.ajax({
        async: false,    //表示请求是否异步处理
        type: "GET",    //请求类型
        url: "/patientController/todayInfo",//请求的 URL地址
        contentType: "application/json;charset=UTF-8",
        //dataType: "json",//返回的数据类型
        success: function (data) {
            //$("#two").hide();
            dataList = data;
            // 2.封装表格数据
            var html = "";
            for (var i = 0; i < data.length; i++) {
                html += "<tr class='patientList'><td>" + data[i].patientId + "</td>" +
                    "<td id='name" + i + "'>" + data[i].patientName + "</td></tr>";
            }
            $("#patient").html(html);  //将数据显示在html页面
        },
        error: function (data) {
            alert(data);
        }
    });

    //当日挂号清单
    $(".todayRegister").click(function () {
        init();
    });
}



