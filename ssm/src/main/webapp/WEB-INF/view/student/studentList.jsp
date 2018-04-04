<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort(
)+path+"/";
String imgPath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/img/";
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
</head>
<body>
			<div class="container-fluid">
					<div class="row">
						<div class="col-md-12">
							<table class="table table-striped">
								<tr class="active">
									<td class="active">学生姓名</td>
									<td class="success">学生性别</td>
									<td class="warning">学生爱好</td>
									<td class="danger">学生头像</td>
									<td class="info">学生生日</td>
									<td class="warning">学生班级</td>
									<td class="danger">学生家乡</td>
									<td class="success">操作</td>
								</tr>
								<c:forEach items="${info.list}" var="stu">
									<tr>
										<td class="active">${stu.stuName }</td>
										<td class="success"><c:if test="${stu.stuSex==1 }">男</c:if>
											<c:if test="${stu.stuSex==2 }">女</c:if></td>
										<td class="warning"><c:if
												test="${stu.stuHobby.contains('1') }">看书</c:if> <c:if
												test="${stu.stuHobby.contains('2') }">运动</c:if> <c:if
												test="${stu.stuHobby.contains('3') }">旅游</c:if></td>
										<td class="danger"><img alt="无法显示" src="<%=imgPath %>${stu.stuImg }" width="150px"></td>
											
										<td class="info">${stu.stuBirStr }</td>
										<td class="warning">${stu.cls.clsName }</td>
										<td class="danger">
										<c:if test="${stu.stuHome==1 }">北京</c:if>
										<c:if test="${stu.stuHome==2 }">上海</c:if> 
										<c:if
												test="${stu.stuHome==3 }">深圳</c:if></td>
										<td class="success">
											<button type="button" class="btn btn-danger" onclick="deleteStu(${stu.stuId})">删除</button>
											<button type="button" class="btn btn-warning" onclick="getStuById(${stu.stuId})">修改</button>
										</td>
									</tr>
								</c:forEach>
							</table>
						</div>
					</div>

					<div class="row">
							  <div class="col-md-6">
							  	<h3>总共${info.pageSize }页 当前页${info.pageNum}页 总共${info.total }条</h3>
							  </div>
							  <div class="col-md-6">
							  		<nav aria-label="Page navigation">
									  <ul class="pagination">
									     <c:if test="${!info.hasPreviousPage}">
										     <li class="disabled"><a href="Javascript:getPage(1)">首页</a></li>
										    <li class="disabled">
										      <a href="Javascript:getPage(${info.prePage} )" aria-label="Previous">
										        <span aria-hidden="true">&laquo;</span>
										      </a>
										    </li>
									    </c:if>
									     <c:if test="${info.hasPreviousPage}">
										     <li><a href="Javascript:getPage(1)">首页</a></li>
										    <li>
										      <a href="Javascript:getPage(${info.prePage} )" aria-label="Previous">
										        <span aria-hidden="true">&laquo;</span>
										      </a>
										    </li>
									    </c:if>
									    <c:forEach items="${info.navigatepageNums }" var="nav">
									    <c:if test="${info.pageNum==nav }">
									    <li class="active"><a href="Javascript:getPage(${nav})">${nav }</a></li>
									    </c:if>
									    <c:if test="${info.pageNum!=nav }">
									    <li ><a href="Javascript:getPage(${nav})">${nav }</a></li>
									    </c:if>
									    </c:forEach>
									    <c:if test="${!info.hasNextPage }">
									    <li class="disabled">
									      <a href="Javascript:getPage(${info.nextPage})" aria-label="Next">
									        <span aria-hidden="true">&raquo;</span>
									      </a>
									    </li>
									     <li class="disabled"><a href="Javascript:getPage(${info.pageSize})">尾页</a></li>
									    </c:if>
									    <c:if test="${info.hasNextPage }">
									    <li >
									      <a href="Javascript:getPage(${info.nextPage})" aria-label="Next">
									        <span aria-hidden="true">&raquo;</span>
									      </a>
									    </li>
									     <li ><a href="Javascript:getPage(${info.pageSize})">尾页</a></li>
									    </c:if>
									  </ul>
									</nav>
							  </div>
					</div>
			</div>
</body>
</html>
