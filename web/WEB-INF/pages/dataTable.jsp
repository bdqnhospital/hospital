<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/28 0028
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>table模块快速使用</title>
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
</head>
<body>

<table id="demo" lay-filter="test"></table>

<script src="/layui/layui.all.js"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: '/patientController/todayInfo' //数据接口\n' +
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'patientId', title: '病人编号', width:80}
                ,{field: 'patientName', title: '姓名', width:80, sort: true}
                ,{field: 'patientSex', title: '性别', width:80}
                ,{field: 'patientIdentity', title: '身份证号', width: 177}
                ,{field: 'patientAddress', title: '地址', width: 80, sort: true}
                ,{field: 'patientMobile', title: '电话', width: 80, sort: true}
                ,{field: 'createDate', title: '创建日期', width: 80}
                ,{field: 'modifyDate', title: '修改日期', width: 80}
                ,{field: 'sectionId', title: '创建日期', width: 80}
                ,{field: 'doctorId', title: '创建日期', width: 80}
            ]]
        });

    });
</script>
</body>
</html>
