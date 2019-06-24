package schooloa.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import schooloa.bean.TrainingProgram;
import schooloa.service.TrainingProgramservice2;
import schooloa.util.JsonData;
import schooloa.util.PageResult;

@Controller
public class TrainingProgramController2 {
	@Autowired
	TrainingProgramservice2 servie;
	
	/**
	 * 查询期末考试管理
	 * @param professional,className,courseNo
	 * @return 
	 */
	@RequestMapping("/selecttraining")
	@ResponseBody
	public JsonData selecttraining(String professional,String grade,String courseno,String coursename,int page){
		List<Map<String,Object>> list=servie.selecttraining(professional, grade, courseno,coursename,page);
		Integer count=servie.selecttrainingpage(professional, grade, courseno, coursename);
		PageResult<Map<String ,Object>> pagedata = new PageResult<>(list, count);
		return JsonData.success(pagedata);
		
	}
	/**
	 * 插入期末考试管理
	 * @param trainingProgram（全字段）
	 * @return true or false 课程编号重复
	 */
	@RequestMapping("/inserttraining")
	@ResponseBody
	public JsonData inserttraining(TrainingProgram trainingProgram){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.format(date);
		trainingProgram.setCreatetime(date);
		return servie.inserttraining(trainingProgram);
		
	}
	/**
	 * 修改期末考试管理
	 * @param trainingProgram（全字段）
	 * @return true or false 课程编号重复
	 */
	@RequestMapping("/updatetraining")
	@ResponseBody
	public JsonData updatetraining(TrainingProgram trainingProgram){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.format(date);
		trainingProgram.setCreatetime(date);
		return servie.updatetraining(trainingProgram);
		
	}
	
	
	
	/**
	 * 删除期末考试管理
	 * @param id
	 * @return 
	 */
	@RequestMapping("/deletetraining")
	@ResponseBody
	public JsonData deletetraining(TrainingProgram trainingProgram){
		return servie.deletetraining(trainingProgram);
		
	}
}
