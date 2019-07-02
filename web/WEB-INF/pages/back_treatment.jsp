<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>急诊医生登录后台</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="/layui/css/datepicker.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/jquery-1.8.2.min.js"></script>
    <script src="/layui/lay/moment.min.js"></script>
    <script src="/layui/lay/datepicker.js"></script>
    <script src="/layui/lay/datepicker.all.js"></script>
    <script src="/layui/lay/dateschoose.js"></script>
    <script src="${pageContext.request.contextPath}/statics/js/sectionList.js"></script>
    <script src="${pageContext.request.contextPath}/statics/js/drugsList.js"></script>
    <style>
        #layuibody div{margin-top: 10px}
        #layuibody #btns{margin-top: 40px}
        #layuibody{border:2px solid red}
    </style>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">急诊医生登录后台</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
                    欢迎您，${sessionScope.doctor.doctorName}
                </a>
            </li>
            <li class="layui-nav-item"><a href="">注销</a></li>
        </ul>
    </div>
    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="test">
                <li class="layui-nav-item">
                    <a href="javascript:;">诊断记录</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">今日诊断</a></dd>
                        <dd><a href="javascript:;">本周诊断</a></dd>
                        <dd><a href="javascript:;">医院新闻</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a href="javascript:;">本周排班</a></li>
            </ul>
        </div>
    </div>

    <div class="layui-body" id="layuibody">
        <!-- 内容主体区域 -->
        <!--急诊医生诊断表单页面-->
        <form class="layui-form" lay-filter="test2" action="/medicalController/addMedical" method="post">
            <div class="layui-row layui-col-space10">

                <div class="layui-form-item">
                    <div class="layui-col-md4">
                        <label class="layui-form-label">病人编号</label>
                        <div class="layui-input-block">
                            <input type="text" name="patientId" required lay-verify="required"
                                   placeholder="这个值是按照病人的挂号编号填写" autocomplete="off" class="layui-input">
                        </div>
                    </div>
                </div>

                <div class="layui-form-item">
                    <div class="layui-col-md4">
                        <label class="layui-form-label">处方号</label>
                        <div class="layui-input-block">
                            <input type="text" name="medicalId" required lay-verify="required" placeholder="这个处方号是随机生成的"
                                   autocomplete="off" class="layui-input">
                        </div>
                    </div>
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-col-md6">
                    <label class="layui-form-label">姓名</label>
                    <div class="layui-input-inline">
                        <input type="text" name="patientName" required lay-verify="required" placeholder="请输入姓名"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
                <div class="layui-col-md12">
                    <label class="layui-form-label">性别</label>
                    <div class="layui-input-block">
                        <input type="radio" name="patientSex" value="男" title="男">
                        <input type="radio" name="patientSex" value="女" title="女" checked>
                    </div>
                </div>
                <div class="layui-col-md4">
                    <label class="layui-form-label">年龄</label>
                    <div class="layui-input-inline">
                        <input type="text" name="patientAge" required lay-verify="required" placeholder="请输入年龄"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-col-md12">
                    <label class="layui-form-label">单位</label>
                    <div class="layui-input-inline">
                        <input type="text" name="type" required lay-verify="" value="岁" autocomplete="off"
                               class="layui-input">
                    </div>
                </div>
                <div class="layui-col-md6 ">
                    <label class="layui-form-label">出生日期</label>
                    <div class="layui-input-inline c-datepicker-date-editor c-datepicker-single-editor J-datepickerTime-single mt10">
                        <input type="text" name="birthday" required lay-verify="required" placeholder="选择日期"
                               autocomplete="off" class="layui-input c-datepicker-data-input">
                    </div>
                </div>
            </div>

            <div class="layui-inline">
                <label class="layui-form-label">搜索选择框</label>
                <div class="layui-input-inline">
                    <select id="selectItemId" name="modules" lay-verify="required" lay-search="">
                        <option value="">直接选择或搜索选择</option>




                    </select>
                </div>
            </div>

            <div class="layui-form-item">
                <div class="layui-col-md4">
                    <label class="layui-form-label">科室</label>
                    <div class="layui-input-block">
                        <select name="sectionName" lay-verify="required">
                            <%--这里面的值是从数据库中传过来的值进行显示--%>
                        </select>
                    </div>
                </div>
                <div class="layui-col-md12">
                    <label class="layui-form-label">就诊医生</label>
                    <div class="layui-input-inline">
                        <input type="text" name="doctorName" required lay-verify="required" value="就诊医生是session中传过来的值"
                               autocomplete="off" class="layui-input">
                    </div>
                </div>
            </div>
            <div class="layui-form-item layui-form-text">
                <div class="layui-col-md6">
                    <label class="layui-form-label">基本情况</label>
                    <div class="layui-input-block">
                        <textarea name="basicInfo" placeholder="请输入内容" class="layui-textarea"></textarea>
                    </div>
                </div>
            </div>
            <div class="layui-form-item layui-form-text">
                <div class="layui-col-md6">
                    <label class="layui-form-label">诊断情况</label>
                    <div class="layui-input-block">
                        <textarea name="medicalRecord" placeholder="请输入内容" class="layui-textarea"></textarea>
                    </div>
                </div>
            </div>


       <div class="layui-form-item" id="btns">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
       </div>
            <div class="medicine" style="width: 60%;height: 530px;border: 3px solid blue;float: right;margin-top: -880px;margin-right: 30px">
                <div class="layui-input-block" id="selests">
                    <div class="layui-col-md2">
                        <select name="drugsName" lay-verify="">

                            <%--这儿是药品信息的下拉列表--%>

                        </select>
                    </div>
                    <div class="layui-col-md2">
                        <select name="drugsType" lay-verify="">
                            <%--这里面的值是从数据库中传过来的值进行显示--%>
                            <option value=""></option>
                            <option value="0">支</option>
                            <option value="1">盒</option>
                            <option value="2">粒</option>
                            <option value="3">板</option>
                            <option value="4">瓶</option>
                        </select>
                    </div>
                    <div class="layui-col-md2">
                        <select name="drugsNum" lay-verify="">
                            <%--这里面的值是从数据库中传过来的值进行显示--%>
                            <option value=""></option>
                            <option value="0">1</option>
                            <option value="1">2</option>
                            <option value="2">3</option>
                            <option value="3">4</option>
                            <option value="4">5</option>
                            <option value="4">6</option>
                            <option value="4">7</option>
                            <option value="4">8</option>
                            <option value="4">9</option>
                            <option value="4">10</option>
                        </select>
                    </div>
                </div>
                <%--这是右侧表格栏--%>
                <div class="content mar_20" style="height: 400px">

                    <%--<table lay-even lay-skin="line" lay-size="lg">
                        <colgroup>
                            <col width="150">
                            <col width="200">
                            <col>
                        </colgroup>
                        <thead>
                        <tr>
                            <th>药品名称</th>
                            <th>药品规格</th>
                            <th>药品数量</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td align="center">
                                <input type="text" name="drugsName" value="这里是查询的值--药品名称">
                            </td>
                            <td align="center">
                                <input type="text" name="durgsType" value="这里是查询的值--药品规格" class="car_ipt" >
                            </td>
                            <td align="center">

                                <button type="minus" class="layui-btn layui-btn-normal layui-btn-sm" name="minus" onclick="FN">
                                    <i class="layui-icon"></i>
                                </button>
                                <input type="text" id="valShow" name="num" style="width: 30px; height: 30px" value="1"></input>
                                <button type="plus" class="layui-btn layui-btn-normal layui-btn-sm" name="plus" onclick="FN">
                                    <i class="layui-icon"></i>
                                </button>

                            </td>
                        </tr>
                        </tbody>
                    </table>--%>

                        <table id="demo" lay-filter="test"></table>

                </div>
            </div>
    </form>
    <script src="/layui/layui.all.js"></script>
    <script>
        //Demo
        layui.use('form', function () {
            var form = layui.form;

            //监听提交
            form.on('submit(formDemo)', function (data) {
                layer.msg(JSON.stringify(data.field));
                return false;
            });
        });

        function FN(btnType) {
            if (btnType == 'plus') {
                $('#valShow').html(parseInt($('#valShow').html()) + 1)
            } else if (btnType == 'minus') {
                var minNum = parseInt($('#valShow').html()) - 1;
                if (minNum<1) {
                    minNum = 1;
                }
                $('#valShow').html(minNum)
            }
        }

        /*layui使用表格显示药品信息列表*/

        layui.use('table', function(){
            alert("ceshi");
            var table = layui.table;
            table.render({
                elem: '#demo'
                ,height: 312
                ,url: '/medicalController/showDrugs' //数据接口
                ,page: true //开启分页
                ,cols: [[ //表头
                    {field: 'drugsName', title: '药品名称', width:350, sort: true}
                    ,{field: 'drugsType', title: '药品规格', width:320}
                    ,{field: 'drugsNum', title: '药品数量', width:150, sort: true}
                ]]
            });
        });

        //JavaScript代码区域
        layui.use('element', function () {
            var element = layui.element;
        });
    </script>
    <!--急诊医生诊断表单页面 end -->

</div>
</div>
</body>
</html>
