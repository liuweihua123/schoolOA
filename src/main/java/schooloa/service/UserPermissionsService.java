package schooloa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schooloa.bean.UserPermissions;
import schooloa.dao.UserPermissionsMapper;

@Service
public class UserPermissionsService {
	
	@Autowired 
	UserPermissionsMapper userPermissionsMapper;
	
	public List<UserPermissions> getUserPermission()
	{
		return userPermissionsMapper.selectByExample(null);
	}
	
	public UserPermissions getUserPermissionByJobNumber(String jobnumber)
	{
		return userPermissionsMapper.selectByJobNumber(jobnumber);
	}
	
	public int insertUserPermission(UserPermissions userPermissions)
	{
		return userPermissionsMapper.insert(userPermissions);
	}
	
	public int editUserPermission(UserPermissions userPermissions)
	{
		return userPermissionsMapper.updateByPrimaryKey(userPermissions);
	}
	
	public int deleteByPrimaryKey(int id)
	{
		return userPermissionsMapper.deleteByPrimaryKey(id);
	}
	//��ȡUserInfo��userpermission������������ݣ�����Աר����
	public List<UserPermissions> getUPANDUI()
	{
		return userPermissionsMapper.query();
	}
	
	//����role��professionalȷ����ʾ�����ݣ�רҵ�����ˣ�
	
	public List<UserPermissions> getUPAndUiByRoleAndProfessional(String role,String professional)
	{
		return userPermissionsMapper.queryByRoleAndProfessional(role, professional);
	}
	
	public List<UserPermissions> getUPAndUiByRoleAndProfessionalAndJobnumber(String role,String professional,String jobnumber)
	{
		return userPermissionsMapper.queryByRoleAndProfessionalAndJobnumber(role, professional, jobnumber);
	}
	
	//���ݹ��Ų�ѯ�Ǹ��˵���Ϣ
	//�ڵ�¼��ʱ�򣬾ͽ�ֵ���룬�������ڽ�ʦ����ʾ���е���Ϣ
	public List<UserPermissions> getUPAndUIByJobnumber(String jobnumber)
	{
		return userPermissionsMapper.queryByJobNumber(jobnumber);
	}
	

}
