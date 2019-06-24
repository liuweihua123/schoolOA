package schooloa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import schooloa.bean.UserInfo;
import schooloa.bean.UserInfoExample;
import schooloa.bean.UserInfoExample.Criteria;
import schooloa.dao.UserInfoMapper;

@Service
public class UserInfoService {

	@Autowired
	UserInfoMapper userInfoMapper;
	
	public List<UserInfo> getUserInfo()
	{
		return userInfoMapper.selectByExample(null);
	}
	
	
	public int updateUserinfo(UserInfo userInfo,UserInfoExample userInfoExample)
	{
		Criteria criteria=userInfoExample.createCriteria();
		criteria.andIdEqualTo(userInfo.getId());
		return userInfoMapper.updateByExampleSelective(userInfo, userInfoExample);
	}
	
	public int insertUserinfo(UserInfo userInfo)
	{
		return userInfoMapper.insertSelective(userInfo);
	}
	
	public List<UserInfo> getowninfo(String jobnumber)
	{
		return userInfoMapper.selectByown(jobnumber);
	}

}
