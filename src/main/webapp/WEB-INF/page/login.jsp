<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" href="/resources/css/style.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%@ page%>
<body>

	<div class="center">
		<div class="main">
			<div class="title">汽车销售管理系统</div>
			<form action="/login" method="post">
				<table class="main_login">
					<tr>
						<td>账户：</td>
						<td><input id="ID" type="text" name="User_Id"></td>
					</tr> 
					<tr>
						<td>密码：</td>
						<td><input id="passWord" type="password" name="Password"></td>
					</tr>
					<tr>
						<td height="35" colspan="2" align="center"><input
							name="Submits" type="submit" class="login" value="登录" />
							&nbsp;&nbsp; <input name="reset" type="reset" class="Reset"
							value="取消" /></td>
					</tr>
					<tr>
						<td height="30" align="center" colspan="2"
							style="color: #000000; font-size: 25px;">${outputMessage }</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	
</body>
</html>