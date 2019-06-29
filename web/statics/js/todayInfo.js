$(function () {
    var $todayInfo = $("a[class=todayRegister]").click(function () {
        //window.location.href="/patientController/todayInfo";
        var results = "";
        $.ajax({
            "url":"patientController/todayInfo",
            "dataType":"json",
            "success":function (result) {
//在首页显示页面套用layui的ajax模块存在错误！！！！！！！！！！
                $(result).each(function(i) {
                    results += "<td>"+result[i].id+"</td>"
                    results += "<td>"+result[i].patientId+"</td>"
                    results += "<td>"+result[i].patientName+"</td>"
                    results += "<td>"+result[i].patientSex+"</td>"
                    results += "<td>"+result[i].patientMobile+"</td>"
                    results += "<td>"+result[i].patientAddress+"</td>"
                    results += "<td>"+result[i].createDate+"</td>"
                })
                $("tr[class=patientList]").html(results);
            },
            "error":function () {
                alert("ajax error!");
            }
        });
    });
})