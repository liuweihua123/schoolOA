package schooloa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import schooloa.bean.TestManage;
import schooloa.bean.TestManageExample;

public interface TestManageMapper {
    long countByExample(TestManageExample example);

    int deleteByExample(TestManageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestManage record);

    int insertSelective(TestManage record);

    List<TestManage> selectByExample(TestManageExample example);
    
    List<Map<String, Object>> selectTestManngerhavep(@Param("professional")String professional,
    		@Param("classname")String classname,@Param("courseno")String courseno,@Param("page1")Integer page1);
    
    Integer selectTestManngerhavep2(@Param("professional")String professional,
    		@Param("classname")String classname,@Param("courseno")String courseno);
    
    TestManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestManage record, @Param("example") TestManageExample example);

    int updateByExample(@Param("record") TestManage record, @Param("example") TestManageExample example);

    int updateByPrimaryKeySelective(TestManage record);

    int updateByPrimaryKey(TestManage record);
}