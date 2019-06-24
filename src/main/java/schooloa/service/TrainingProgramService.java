package schooloa.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schooloa.bean.TrainingProgram;
import schooloa.bean.TrainingProgramExample;
import schooloa.bean.TrainingProgramExample.Criteria;
import schooloa.dao.TrainingProgramMapper;
import schooloa.util.JsonData;

@Service
public class TrainingProgramService {

	@Autowired
	TrainingProgramMapper trainingProgramMapper;

	public List<TrainingProgram> getTrainingProgram() {
		return trainingProgramMapper.selectByExample(null);
	}
	
	public int insertListbyOne(TrainingProgram trainingProgram)
	{
		return trainingProgramMapper.insertBybatch(trainingProgram);
	}
	
	public List<TrainingProgram> getAllExcel()
	{
		return trainingProgramMapper.selectByexcel();
	}
	
	
	public int getAllExcelCount()
	{
		return trainingProgramMapper.selectReturnCount();
	}
	
	public int UpdateTrinPro(TrainingProgram trainingProgram,TrainingProgramExample trainingProgramExample)
	{
		Criteria s= trainingProgramExample.createCriteria();
		s.andIdEqualTo(trainingProgram.getId());//表示条件，id=trainingProgram.getId()
		return trainingProgramMapper.updateByExampleSelective(trainingProgram,trainingProgramExample);
	}
	
	public int deleteByid(Integer id)
	{
		return trainingProgramMapper.deleteByPrimaryKey(id);
	}
	
	//开始
	public JsonData selectQing(TrainingProgram trainingProgram){
		TrainingProgramExample example=new TrainingProgramExample();
		example.createCriteria().andCoursenoEqualTo(trainingProgram.getCourseno());
		List<TrainingProgram> train=trainingProgramMapper.selectByExample(example);
		if(!train.isEmpty()){
			return JsonData.success(train);
		}else{
			return JsonData.fail("没有此部门编号！");
		}
		
	}
	
	public int Uploadsyllabus(TrainingProgram trainingProgram){
		return trainingProgramMapper.updateByPrimaryKeySelective(trainingProgram);
	}
	public int uploadTeachingPath(TrainingProgram trainingProgram){
		return trainingProgramMapper.updateByPrimaryKeySelective(trainingProgram);
	}
}
