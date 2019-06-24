package schooloa.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schooloa.bean.TrainingProgram;
import schooloa.bean.TrainingProgramExample;
import schooloa.dao.TrainingProgramMapper;
import schooloa.util.JsonData;

@Service
public class TrainingProgramservice2 {
	
	@Autowired
	TrainingProgramMapper mapper;
	
	public List<Map<String, Object>> selecttraining(String professional,String grade,String courseno,String coursename,Integer page){
		if ( page==null || page <= 0) {
			int page1 = 1;
			return mapper.selecttrain(professional, grade, courseno, coursename, page1);
		}else{
			int page1=(page-1)*15;
			return mapper.selecttrain(professional, grade, courseno, coursename, page1);
		}
	}
	
	public int  selecttrainingpage(String professional,String grade,String courseno,String coursename){
		return mapper.selecttraincount(professional, grade, courseno, coursename);
		
	}
	
	public JsonData inserttraining(TrainingProgram trainingProgram){
		TrainingProgramExample example=new TrainingProgramExample();
		example.createCriteria().andCoursenoEqualTo(trainingProgram.getCourseno());
		List<TrainingProgram> count1=mapper.selectByExample(example);
		if(count1.isEmpty()){
			int count = mapper.insert(trainingProgram);
			return count > 0 ? JsonData.success() : JsonData.fail("插入失败!");
		}else{
			return JsonData.fail("课程号已存在！");
		}
		
	}
	
	
	public JsonData updatetraining(TrainingProgram trainingProgram){
		TrainingProgramExample example=new TrainingProgramExample();
		example.createCriteria().andCoursenoEqualTo(trainingProgram.getCourseno());
		List<TrainingProgram> count1=mapper.selectByExample(example);
		if(count1.isEmpty()){
			int count = mapper.updateByPrimaryKey(trainingProgram);
			return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
		}else{
			return JsonData.fail("课程号已存在！");
		}
		
	}
	
	
	public JsonData deletetraining(TrainingProgram trainingProgram){
		int id=trainingProgram.getId();
		int count=mapper.deleteByPrimaryKey(id);
		return count > 0 ? JsonData.success() : JsonData.fail("修改失败!");
	}

}
