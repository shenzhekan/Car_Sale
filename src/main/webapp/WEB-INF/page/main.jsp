<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ page import="java.text.*"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/resources/js/script.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>汽车销售管理系统</title>
<link type="text/css" href="/resources/css/style1.css" rel="stylesheet">
</head>
<body class="body_search">
	<div class="container">
		<p class="time_top" id="time">时间</p>
		<p class="logo_right">
			<span class="welcome"><a href="" title="">欢迎你:<%=session.getAttribute("User_Id")%></a></span> <span
				class="lock"><a href="login.jsp" title="" class="lock" >安全退出</a></span>
		</p>
		<div class="clear"></div>
		<div class="main">
			<div class="main_left" id="main_left">
				<ul class="button_bg">
					<li class=" select" >入库管理</li>
					<li >销售管理</li>
					<li >查询管理</li>
					<li >车辆汇总</li>
					<li >系统设置</li>
				</ul>
			</div>
			<div class="mian_center" id="main_center">
				<div id="f1">
					<iframe id="iframe_f1" src="Storage_search_Servlet "></iframe>
				</div>
				<div id="f2" >
				    <iframe id="iframe_f2" src="Sale_Servlet"></iframe>
				</div>
				<div id="f3" >
				    <iframe id="iframe_f3" src="Search_all.jsp"></iframe>
				</div>
				<div id="f4" >
				    <iframe id="iframe_f4" src="Car_collect_Servlet"></iframe>
				</div>
				<div id="f5" >
				    <iframe id="iframe_f5" src="ChangePwd_Servlet"></iframe>
				</div>
			</div>
			<div class="footer">制作人:沈哲侃,&copy;版权所有</div>
		</div>
	</div>
</body>
</html>