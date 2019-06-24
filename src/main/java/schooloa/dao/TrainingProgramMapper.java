package schooloa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import schooloa.bean.TrainingProgram;
import schooloa.bean.TrainingProgramExample;

public interface TrainingProgramMapper {
    long countByExample(TrainingProgramExample example);

    int deleteByExample(TrainingProgramExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainingProgram record);

    int insertSelective(TrainingProgram record);

    List<TrainingProgram> selectByExample(TrainingProgramExample example);

    TrainingProgram selectByPrimaryKey(Integer id);
    
    //添加集合
    int batchInsert(List<TrainingProgram> list);
    
    int insertBybatch(TrainingProgram trainingProgram);
    
    List<TrainingProgram> selectByexcel();
    
    int selectReturnCount();
    

    int updateByExampleSelective(@Param("record") TrainingProgram record, @Param("example") TrainingProgramExample example);

    int updateByExample(@Param("record") TrainingProgram record, @Param("example") TrainingProgramExample example);

    int updateByPrimaryKeySelective(TrainingProgram record);

    int updateByPrimaryKey(TrainingProgram record);
    
    //开始
    List<Map<String, Object>> selecttrain(@Param("professional")String professional,
    		@Param("grade")String grade,@Param("courseno")String courseno,@Param("coursename")String coursename,@Param("page1")Integer page1);
    
    Integer selecttraincount(@Param("professional")String professional,
    		@Param("grade")String grade,@Param("courseno")String courseno,@Param("coursename")String coursename);
}