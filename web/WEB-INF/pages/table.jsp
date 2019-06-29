<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/28 0028
  Time: 11:32
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

<script src="/layui/layui.js"></script>
<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: '/demo/table/user/' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'username', title: '用户名', width:80}
                ,{field: 'sex', title: '性别', width:80, sort: true}
                ,{field: 'city', title: '城市', width:80}
                ,{field: 'sign', title: '签名', width: 177}
                ,{field: 'experience', title: '积分', width: 80, sort: true}
                ,{field: 'score', title: '评分', width: 80, sort: true}
                ,{field: 'classify', title: '职业', width: 80}
                ,{field: 'wealth', title: '财富', width: 135, sort: true}
            ]]
        });

    });
</script>
</body>
</html>



<!-- 自动渲染实例
    1) 带有 class="layui-table" 的 <table> 标签。
    2) 对标签设置属性 lay-data="" 用于配置一些基础参数
    3) 在 <th> 标签中设置属性lay-data=""用于配置表头信息
-->
<table class="layui-table" lay-data="{height:315, url:'/demo/table/user/', page:true, id:'test'}" lay-filter="test">
    <thead>
    <tr>
        <th lay-data="{field:'id', width:80, sort: true}">ID</th>
        <th lay-data="{field:'username', width:80}">用户名</th>
        <th lay-data="{field:'sex', width:80, sort: true}">性别</th>
        <th lay-data="{field:'city'}">城市</th>
        <th lay-data="{field:'sign'}">签名</th>
        <th lay-data="{field:'experience', sort: true}">积分</th>
        <th lay-data="{field:'score', sort: true}">评分</th>
        <th lay-data="{field:'classify'}">职业</th>
        <th lay-data="{field:'wealth', sort: true}">财富</th>
    </tr>
    </thead>
</table>