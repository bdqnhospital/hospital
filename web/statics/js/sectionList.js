/*科室下拉列表ajax*/
$(function () {
    //检查项目添加到下拉框中
    $.ajax({
        url:'/sectionController/selectSectionList',
        dataType:'json',
        success:function(data){
            $("#selectItemId").html("<option value=\"3\">layim</option>");





            layui.form.render('select', 'test2');

        }
    });

});
