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
	 * ��ѯ��ĩ���Թ���
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
	 * ������ĩ���Թ���
	 * @param trainingProgram��ȫ�ֶΣ�
	 * @return true or false �γ̱���ظ�
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
	 * �޸���ĩ���Թ���
	 * @param trainingProgram��ȫ�ֶΣ�
	 * @return true or false �γ̱���ظ�
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
	 * ɾ����ĩ���Թ���
	 * @param id
	 * @return 
	 */
	@RequestMapping("/deletetraining")
	@ResponseBody
	public JsonData deletetraining(TrainingProgram trainingProgram){
		return servie.deletetraining(trainingProgram);
		
	}
}
