<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort(
)+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title> 标题 </title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="<%=path %>/js/jquery/jquery-1.11.3.min.js"></script>
<link href="<%=path %>/js/bootstrap/css/bootstrap.min.css" rel="stylesheet">
 <script src="<%=path %>/js/bootstrap/js/bootstrap.min.js"></script>
 <script type="text/javascript">
 	function login(){
 		$.ajax({ 
			url: "login/login1.do", 
			type:"post", 
			data:$("#login_form_id").serialize(),//表单序列化提交
			dataType:"json",//规定返回值格式 
			//async : false,//同步上传
			success:function (data){//成功回调函数 alert(data);
				if(data.success){
					alert(data.msg);
					location.href="<%=path%>/student/toMainPage.do"
				}else if(data.state==1){
					alert(data.msg);
				}else if (data.state==2) {
					alert(data.msg);
				}else if(data.state==3){
					alert(data.msg);
				}
			},
				
			error :function(){//错误回调函数 
				alert("登陆系统异常！") 
			}
			});
 	}
 	function go(){
 		location.href="<%=path%>/student/toMainPage.do"
 	}
 
 </script>
</head>
<body>
		<a href="<%=path %>/student/toMainPage.do">去主页面</a>	
			
			<div class="container-fluid">
  				<%-- <div class="row">
    					<div class="col-md-6">
    						<a href="<%=path %>/student/queryAll.do">去list页面</a>
    					</div>
  						<div class="col-md-6">
							<a href="<%=path %>/student/toMainPage.do">去主页面</a>
						</div>
  				</div> --%>
  				<div class="row">
 					 <div class="col-md-12">
 					 	<form class="form-horizontal" id="login_form_id">
 					 		<table class="table table-bordered">
 								<tr class="info">
 									<td>
 										<div class="form-group">
										    <label for="inputEmail3" class="col-sm-2 control-label">name:</label>
										    <div class="col-sm-10">
										      <input type="text" class="form-control" name="loginName" >
										    </div>
  										</div>
 									</td>
 								</tr>
 								
 								<tr class="success">
 									<td>
 										<div class="form-group">
										    <label for="inputPassword3" class="col-sm-2 control-label">Password</label>
										    <div class="col-sm-10">
										      <input type="password" class="form-control" name="loginPsw" >
										    </div>
  										</div>
 									</td>
 								</tr>	
 								
 								
							</table>
						</form>
 					 </div>
 				</div>
 				<div class="row">
					 <div class="col-md-4 col-md-offset-5">
					 	<button type="button" class="btn btn-success" onclick="login()">登陆</button>
					 </div>
				</div>	 
			</div>
</body>
</html>
