<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>医院挂号系统后台</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css"  media="all">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">医生登录后台</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item"><a href="">挂号管理</a></li>
            <li class="layui-nav-item">
                <a href="javascript:;">其他功能</a>
                <dl class="layui-nav-child">
                    <dd><a href="">邮件管理</a></dd>
                    <dd><a href="">消息管理</a></dd>
                    <dd><a href="">授权管理</a></dd>
                </dl>
            </li>
        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    欢迎您，${sessionScope.doctor.doctorName}
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;">基本资料</a></dd>
                    <dd><a href="">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="">注销</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">挂号管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">今日挂号</a></dd>
                        <dd><a href="javascript:;">本周挂号</a></dd>
                        <dd><a href="">医院新闻</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">诊断记录</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">今日诊断</a></dd>
                        <dd><a href="javascript:;">本周诊断</a></dd>
                        <dd><a href="">医院新闻</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="">本周排班</a></li>
            </ul>
        </div>
    </div>

    <script type="text/javascript">
        $(".layui-nav-child:first-child").on("click",function () {
            alert("ssssssssssssssssss");
            var today = $(this);
            $.ajax({
                "url":"todayInfo",
                "type":"get",
                "dataType":"json",
                "success":function (result) {
                    if("data"==result) {
                        $(result).each(function (i) {
                            result[i].patientIdentity;
                        })
                    }else if (result=='') {
                        alert("操作超时");
                    }
                },
                "error":function () {

                }
            });
        });
    </script>
    <div class="layui-body">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;">
            <table class="layui-hide" id="test"></table>
            <script src="../js/layui.all.js" charset="utf-8"></script>
            <!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
            <script>
                layui.use('table', function(){
                    var table = layui.table;
                    table.render({
                        elem: '#test'
                        ,url:'/demo/table/user/'
                        ,cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
                        ,cols: [[
                            {field:'id', width:80, title: 'ID', sort: true}
                            ,{field:'username', width:80, title: '用户名'}
                            ,{field:'sex', width:80, title: '性别', sort: true}
                            ,{field:'city', width:80, title: '城市'}
                            ,{field:'sign', title: '签名', width: '30%', minWidth: 100} //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
                            ,{field:'experience', title: '积分', sort: true}
                            ,{field:'score', title: '评分', sort: true}
                            ,{field:'classify', title: '职业'}
                            ,{field:'wealth', width:137, title: '财富', sort: true}
                        ]]
                    });
                });
            </script>
        </div>
    </div>
    <div class="layui-footer">
        <!-- 底部固定区域 -->
    </div>
</div>
<script src="/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;
    });
</script>
</body>
</html>
