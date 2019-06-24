package schooloa.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import schooloa.bean.ToolsList;
import schooloa.bean.ToolsListExample;

public interface ToolsListMapper {
    long countByExample(ToolsListExample example);

    int deleteByExample(ToolsListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToolsList record);

    int insertSelective(ToolsList record);

    List<ToolsList> selectByExample(ToolsListExample example);

    ToolsList selectByPrimaryKey(Integer id);
    
    ToolsList selectByTimeAndSemeterAndProfessional(@Param("time")String time,@Param("semester")String semester,@Param("professional")String professional);

    int updateByExampleSelective(@Param("record") ToolsList record, @Param("example") ToolsListExample example);

    int updateByExample(@Param("record") ToolsList record, @Param("example") ToolsListExample example);

    int updateByPrimaryKeySelective(ToolsList record);

    int updateByPrimaryKey(ToolsList record);
}