package com.mr.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mr.model.Student;
import com.mr.service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	/** queryAll(查询学生)   
	 * 创建人：吴明轩 weimengerpin@126.com    
	 * 创建时间：2017年12月28日 下午7:20:20    
	 * 修改人：吴明轩 weimengerpin@126.com     
	 * 修改时间：2017年12月28日 下午7:20:20    
	 * 修改备注： 
	 * @param map
	 * @param page
	 * @return  
	 */
	@RequestMapping("queryAll")
	public String queryAll(ModelMap map,@RequestParam(name="page",defaultValue="1") Integer page) {
		PageHelper.startPage(page,5);
		List<Student> list = studentService.queryAll();
		PageInfo<Student> info=new PageInfo<>(list,5);
		map.put("info", info);
		return "student/studentList";
	}
	/** insertStu(增加学生)   
	 * 创建人：吴明轩 weimengerpin@126.com    
	 * 创建时间：2017年12月28日 下午7:25:06    
	 * 修改人：吴明轩 weimengerpin@126.com     
	 * 修改时间：2017年12月28日 下午7:25:06    
	 * 修改备注： 
	 * @param student  
	 */
	@ResponseBody
	@RequestMapping("insertStu")
	public void insertStu(Student student) {
		studentService.insertStu(student);
	}
	//上传
	@ResponseBody
	@RequestMapping("upload")
	public String upload(@RequestParam("img") MultipartFile img) {
		String url=UUID.randomUUID()+img.getOriginalFilename();
		try {
			img.transferTo(new File("G:\\img\\"+url));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return url;
	}
	/** delteStu(删除学生)   
	 * 创建人：吴明轩 weimengerpin@126.com    
	 * 创建时间：2017年12月29日 上午8:57:47    
	 * 修改人：吴明轩 weimengerpin@126.com     
	 * 修改时间：2017年12月29日 上午8:57:47    
	 * 修改备注： 
	 * @param id  
	 */
	@ResponseBody
	@RequestMapping("delteStu")
	public void delteStu(Integer id) {
		studentService.deleteStu(id);;
	}
	/** getStuById(根据ID查询单条数据用来回显)   
	 * 创建人：吴明轩 weimengerpin@126.com    
	 * 创建时间：2017年12月29日 上午9:36:29    
	 * 修改人：吴明轩 weimengerpin@126.com     
	 * 修改时间：2017年12月29日 上午9:36:29    
	 * 修改备注： 
	 * @param id
	 * @return  
	 */
	@ResponseBody
	@RequestMapping("getStuById")
	public Student getStuById(Integer id) {
		return studentService.getStuById(id);
	}
	/** updateStu(修改学生信息)   
	 * 创建人：吴明轩 weimengerpin@126.com    
	 * 创建时间：2017年12月29日 上午9:37:46    
	 * 修改人：吴明轩 weimengerpin@126.com     
	 * 修改时间：2017年12月29日 上午9:37:46    
	 * 修改备注： 
	 * @param student  
	 */
	@ResponseBody
	@RequestMapping("updateStu")
	public void updateStu(Student student) {
		studentService.updateStu(student);
	}
	
	
	
}
