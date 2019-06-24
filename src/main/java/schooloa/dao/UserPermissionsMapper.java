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
    
    List<UserPermissions> query();//��ȡUserInfo��Userpermission�������е�����
    
    //�������ʹ��@Param
    List<UserPermissions> queryByRoleAndProfessional(@Param("role")String role,@Param("professional")String professional);//����role��professional��ѯ����
    
    List<UserPermissions> queryByRoleAndProfessionalAndJobnumber(@Param("role")String role,@Param("professional")String professional,@Param("jobnumber")String jobnumber);
    //���ݹ��Ų�ѯ���е���Ϣ
    List<UserPermissions> queryByJobNumber(@Param("jobnumber")String jobnumber);

    int updateByExampleSelective(@Param("record") UserPermissions record, @Param("example") UserPermissionsExample example);

    int updateByExample(@Param("record") UserPermissions record, @Param("example") UserPermissionsExample example);

    int updateByPrimaryKeySelective(UserPermissions record);

    int updateByPrimaryKey(UserPermissions record);
}