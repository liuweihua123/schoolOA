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
	//获取UserInfo和userpermission里面的所有数据（管理员专属）
	public List<UserPermissions> getUPANDUI()
	{
		return userPermissionsMapper.query();
	}
	
	//根据role和professional确定显示的内容（专业负责人）
	
	public List<UserPermissions> getUPAndUiByRoleAndProfessional(String role,String professional)
	{
		return userPermissionsMapper.queryByRoleAndProfessional(role, professional);
	}
	
	public List<UserPermissions> getUPAndUiByRoleAndProfessionalAndJobnumber(String role,String professional,String jobnumber)
	{
		return userPermissionsMapper.queryByRoleAndProfessionalAndJobnumber(role, professional, jobnumber);
	}
	
	//根据工号查询那个人的信息
	//在登录的时候，就将值传入，可以用于教师的显示所有的信息
	public List<UserPermissions> getUPAndUIByJobnumber(String jobnumber)
	{
		return userPermissionsMapper.queryByJobNumber(jobnumber);
	}
	

}
