/*药品下拉列表ajax*/
$(function () {
    alert("sssssssssssss");
    $("div[class=layui-col-md2]").click(function () {
        var items = "";
        $.ajax({
            "url":"/drugsController/selectDrugsList",
            "dataType":"json",
            "success":function (result) {
                $(result).each(function (i) {
                    items += "<option>"+result[i].drugsName+"</option>";
                    $("select[name=drugsName]").html(items);
                })
            },
            "error":function () {
                alert("ajax error!");
            }
        });
    })
});
