package schooloa.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import schooloa.bean.UserPermissions;
import schooloa.bean.UserPermissionsExample;

public interface UserPermissionsMapper {
    long countByExample(UserPermissionsExample example);

    int deleteByExample(UserPermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPermissions record);

    int insertSelective(UserPermissions record);

    List<UserPermissions> selectByExample(UserPermissionsExample example);

    UserPermissions selectByJobNumber(String jobnumber);
    
    List<UserPermissions> query();//获取UserInfo和Userpermission里面所有的数据
    
    //这里必须使用@Param
    List<UserPermissions> queryByRoleAndProfessional(@Param("role")String role,@Param("professional")String professional);//根据role和professional查询数据
    
    List<UserPermissions> queryByRoleAndProfessionalAndJobnumber(@Param("role")String role,@Param("professional")String professional,@Param("jobnumber")String jobnumber);
    //根据工号查询所有的信息
    List<UserPermissions> queryByJobNumber(@Param("jobnumber")String jobnumber);

    int updateByExampleSelective(@Param("record") UserPermissions record, @Param("example") UserPermissionsExample example);

    int updateByExample(@Param("record") UserPermissions record, @Param("example") UserPermissionsExample example);

    int updateByPrimaryKeySelective(UserPermissions record);

    int updateByPrimaryKey(UserPermissions record);
}