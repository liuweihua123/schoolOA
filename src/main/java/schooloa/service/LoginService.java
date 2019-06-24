package schooloa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schooloa.bean.UserPermissions;
import schooloa.dao.UserPermissionsMapper;

@Service
public class LoginService {
	
	@Autowired 
	UserPermissionsMapper userPermissionsMapper;
	
	public UserPermissions Login(String jobnumber)
	{
		return userPermissionsMapper.selectByJobNumber(jobnumber);
	}

}
