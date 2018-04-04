<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
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
<script type="text/javascript" src="<%=path %>/js/jquery/jquery-1.11.3.min.js"></script>
<link href="<%=path %>/js/bootstrap/css/bootstrap.min.css" rel="stylesheet">
 <script src="<%=path %>/js/bootstrap/js/bootstrap.min.js"></script>
 <script type="text/javascript" src="<%=path %>/My97/My97DatePicker/WdatePicker.js"></script>
 <link rel="stylesheet" href="<%=request.getContextPath()%>/js/artDialog-master/css/ui-dialog.css"> 
<script src="<%=request.getContextPath()%>/js/artDialog-master/dist/dialog-plus-min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/uploadify/jquery.uploadify.min.js"></script>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/js/uploadify/uploadify.css" />
 <script type="text/javascript">
 	/*增加动态拼接  */
 		$(function(){
 			$.ajax({ 
 				url: "cls/queryCls.do", 
 				type:"post", 
 				//data:$("#listForm").serialize(),//表单序列化提交
 				dataType:"json",//规定返回值格式 
 				//async : false,//同步上传
 				success:function (data){//成功回调函数 alert(data);
 					$(data).each(function(){
 						$("#class_name_id").append($("<option></option>").append(this.clsName).val(this.clsId));
 					})	
 				},
 				error :function(){//错误回调函数 
 					alert("拼接系统异常！") 
 				}
 				});
 		})
 	/*增加动态拼接  */
 	/* 修改动态拼接 */
 		$(function(){
 			$.ajax({ 
 				url: "cls/queryCls.do", 
 				type:"post", 
 				//data:$("#listForm").serialize(),//表单序列化提交
 				dataType:"json",//规定返回值格式 
 				//async : false,//同步上传
 				success:function (data){//成功回调函数 alert(data);
 					$(data).each(function(){
 						$("#update_class_name_id").append($("<option></option>").append(this.clsName).val(this.clsId));
 					})	
 				},
 				error :function(){//错误回调函数 
 					alert("拼接系统异常！") 
 				}
 				});
 		})
 	/* 修改动态拼接 */
 	function getPage(pn){
 		$.ajax({ 
			url: "student/queryAll.do", 
			type:"post", 
			data:{
				"page":pn
			},
			//data:$("#listForm").serialize(),//表单序列化提交
			dataType:"text",//规定返回值格式 
			//async : false,//同步上传
			success:function (data){//成功回调函数 alert(data);
				$("#main_div_id").html(data);
			},
			error :function(){//错误回调函数 
				alert("查询系统异常！") 
			}
			});
 	}
 	getPage(1);
 	/*增加模态框建立  */
 		function buildModel(){
 		$("#insert_form_id")[0].reset();
 		 $("#img_id").prop("src","");
 		$('#insert_model_id').modal();
 	}
 	/*增加模态框建立  */
 	/*增加方法  */
		function insertStu(){
			$.ajax({ 
				url: "student/insertStu.do", 
				type:"post", 
				data:$("#insert_form_id").serialize(),//表单序列化提交
				dataType:"text",//规定返回值格式 
				success:function (data){//成功回调函数 alert(data);
					$('#insert_model_id').modal('hide');	
						getPage(1);
				},
				error :function(){//错误回调函数 
					alert("增加系统异常！") 
				}
				});
 	}
 	
 	/*增加方法  */
 	/*删除方法  */
 		function deleteStu(id){
 			$.ajax({ 
 				url: "student/delteStu.do", 
 				type:"post", 
 				data:{
 					"id":id
 					},
 				//data:$("#listForm").serialize(),//表单序列化提交
 				dataType:"text",//规定返回值格式 
 				//async : false,//同步上传
 				success:function (data){//成功回调函数 alert(data);
 					getPage(1);
 				},
 				error :function(){//错误回调函数 
 					alert("删除系统异常！") 
 				}
 				});
 	}
 	
 	/*删除方法  */
 	
 	/*回显  */
 		function getStuById(id){
 			$.ajax({ 
 				url: "student/getStuById.do", 
 				type:"post", 
 				data:{
 					"id":id
 					},
 				//data:$("#listForm").serialize(),//表单序列化提交
 				dataType:"json",//规定返回值格式 
 				//async : false,//同步上传
 				success:function (data){//成功回调函数 alert(data);
 					$('#update_model_id').modal();
 					$("#stuName_id").val(data.stuName);
 					$("#update_stuId_id").val(data.stuId);
 					$("#update_form_id :radio").val([data.stuSex]);
 					var hobby=data.stuHobby.split(",");
 					$("#update_form_id :checkbox").val(hobby);
 					$("#update_img_id").prop("src","<%=imgPath%>"+data.stuImg);
 				   $("#update_hiddden_id").val(data.stuImg);
 				   $("#stuBir_id").val(data.stuBirStr);
 					$("#update_form_id [name='stuHome']").val(data.stuHome);
 					$("#update_class_name_id").val(data.clsId);
 				},
 				error :function(){//错误回调函数 
 					alert("查询系统异常！") 
 				}
 				});
 	}
 	/*回显  */

 	
 	/*修改  */
 		function updateStu(){
 			$.ajax({ 
				url: "student/updateStu.do", 
				type:"post", 
				data:$("#update_form_id").serialize(),//表单序列化提交
				dataType:"text",//规定返回值格式 
				success:function (data){//成功回调函数 alert(data);
					$('#update_model_id').modal('hide');		
					getPage(1);
				},
				error :function(){//错误回调函数 
					alert("修改系统异常！") 
				}
				});
 	}
 	
 	/*修改  */
 </script>
</head>
<body>
		<!--增加模态框  -->
			<div class="modal fade" id="insert_model_id" tabindex="-1" role="dialog">
				  <div class="modal-dialog" role="document">
				    <div class="modal-content">
				      <div class="modal-header">
				        <h4 class="modal-title">增加学生</h4>
				      </div>
				      <div class="modal-body">
				       		<form class="form-horizontal" id="insert_form_id">
							  	<div class="form-group">
							    <label for="inputEmail3" class="col-sm-3 control-label">学生姓名</label>
							    <div class="col-sm-9">
							      <input type="text" class="form-control" name="stuName" placeholder="Email">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生性别</label>
							    <div class="col-sm-9">
										<input type="radio" name="stuSex" value="1">男
										<input type="radio" name="stuSex" value="2">女
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生头像</label>
							    <div class="col-sm-9">
							    	<input type="file" id="uploadify">
							    	<img alt="请上传头像" id="img_id" width="150px">
							    	<input type="hidden" id="hiddden_id" name="stuImg">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生生日</label>
							    <div class="col-sm-9">
									<input  class="Wdate"  type="text"  onClick="WdatePicker()" name="stuBir" >
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生家乡</label>
							    <div class="col-sm-9">
										<select  class="form-control" name="stuHome">
													  <option value="1">北京</option>
													  <option value="2">上海</option>
													  <option value="3">深圳</option>
											</select>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生爱好</label>
							    <div class="col-sm-9">
										<input type="checkbox" name="stuHobby" value="1">读书
										<input type="checkbox" name="stuHobby" value="2">运动
										<input type="checkbox" name="stuHobby" value="3">旅游
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生班级</label>
							    <div class="col-sm-9">
										<select  class="form-control" name="clsId" id="class_name_id">
											</select>	
							    </div>
							  </div>
							</form>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				        <button type="button" class="btn btn-primary" onclick="insertStu()">Save</button>
				      </div>
				    </div><!-- /.modal-content -->
				  </div><!-- /.modal-dialog -->
			</div><!-- /.modal -->
		
		<!--增加模态框  -->
				
				
				
				<!--修改模态框  -->
				<div class="modal fade" id="update_model_id" tabindex="-1" role="dialog">
				  <div class="modal-dialog" role="document">
				    <div class="modal-content">
				      <div class="modal-header">
				        <h4 class="modal-title">修改学生</h4>
				      </div>
				      <div class="modal-body">
				       		<form class="form-horizontal" id="update_form_id">
							  	<input type="hidden" name="stuId" id="update_stuId_id">
							  	<div class="form-group">
							    <label for="inputEmail3" class="col-sm-3 control-label">学生姓名</label>
							    <div class="col-sm-9">
							      <input type="text" class="form-control" name="stuName" id="stuName_id">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生性别</label>
							    <div class="col-sm-9">
										<input type="radio" name="stuSex" value="1">男
										<input type="radio" name="stuSex" value="2">女
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生头像</label>
							    <div class="col-sm-9">
							    	<input type="file" id="update_uploadify">
							    	<img alt="请上传头像" id="update_img_id" width="150px">
							    	<input type="hidden" id="update_hiddden_id" name="stuImg">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生生日</label>
							    <div class="col-sm-9">
									<input  class="Wdate"  id="stuBir_id"  onClick="WdatePicker()" name="stuBir" >
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生家乡</label>
							    <div class="col-sm-9">
										<select  class="form-control" name="stuHome" >
													  <option value="1">北京</option>
													  <option value="2">上海</option>
													  <option value="3">深圳</option>
											</select>
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生爱好</label>
							    <div class="col-sm-9">
										<input type="checkbox" name="stuHobby" value="1">读书
										<input type="checkbox" name="stuHobby" value="2">运动
										<input type="checkbox" name="stuHobby" value="3">旅游
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputPassword3" class="col-sm-3 control-label">学生班级</label>
							    <div class="col-sm-9">
										<select  class="form-control" name="clsId" id="update_class_name_id">
											</select>	
							    </div>
							  </div>
							</form>
				      </div>
				      <div class="modal-footer">
				        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				        <button type="button" class="btn btn-primary" onclick="updateStu()">Update</button>
				      </div>
				    </div><!-- /.modal-content -->
				  </div><!-- /.modal-dialog -->
			</div>
		<!--修改模态框  -->

		<!--查询开始  -->
		<div class="container-fluid">
  			<div class="row">
   				 <div class="col-md-4 col-md-offset-10">
   				 <button type="button" class="btn btn-info" onclick="buildModel()">增加</button>	
   				 </div>
  			</div>
		</div>
		<div id="main_div_id"></div>
		<!--查询结束  -->
</body>
<script type="text/javascript">
	/* 增加上传 */
	$("#uploadify").uploadify({
		//  插件自带 不可忽略的参数
		'swf': '<%=request.getContextPath()%>/js/uploadify/uploadify.swf',
		//  前台请求后台的 url 不可忽略的参数
		'uploader': '<%=request.getContextPath()%>/student/upload.do',
		//  给 div  的进度条加背景 不可忽略
		'queueID': 'fileQueue',
		//  上传文件文件名
		'fileObjName' : 'img',
		//  给上传按钮设置文字
		'buttonText': '  上传文件 ',
		//  设置文件是否自动上传
		'auto': true,
		//  可以同时选择多个文件 默认为 true  不可忽略
		'multi': true,
		//  上传后队列是否消失
		'removeCompleted': true,
		//  队列消失时间
		'removeTimeout' : 1,
		//  上传文件的个数，项目中一共可以上传文件的个数
		'uploadLimit': -1,
		'fileExt': '*.*;',
		//  成功回调函数 file  ：文件对象。 data  后台输出数据
		'onUploadSuccess':function(file,data,response){
		   //alert(data)
		    $("#img_id").prop("src","<%=imgPath%>"+data);
		   $("#hiddden_id").val(data);
		}
	});
	/* 增加上传 */
	
	
	/*修改上传  */
		$("#update_uploadify").uploadify({
		//  插件自带 不可忽略的参数
		'swf': '<%=request.getContextPath()%>/js/uploadify/uploadify.swf',
		//  前台请求后台的 url 不可忽略的参数
		'uploader': '<%=request.getContextPath()%>/student/upload.do',
		//  给 div  的进度条加背景 不可忽略
		'queueID': 'fileQueue',
		//  上传文件文件名
		'fileObjName' : 'img',
		//  给上传按钮设置文字
		'buttonText': '  上传文件 ',
		//  设置文件是否自动上传
		'auto': true,
		//  可以同时选择多个文件 默认为 true  不可忽略
		'multi': true,
		//  上传后队列是否消失
		'removeCompleted': true,
		//  队列消失时间
		'removeTimeout' : 1,
		//  上传文件的个数，项目中一共可以上传文件的个数
		'uploadLimit': -1,
		'fileExt': '*.*;',
		//  成功回调函数 file  ：文件对象。 data  后台输出数据
		'onUploadSuccess':function(file,data,response){
		   //alert(data)
		    $("#update_img_id").prop("src","<%=imgPath%>"+data);
		   $("#update_hiddden_id").val(data);
		}
	});
	
	/*修改上传  */
	
	</script>
</html>
