package schooloa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import schooloa.bean.UserInfo;
import schooloa.bean.UserInfoExample;
import schooloa.service.UserInfoService;
import schooloa.util.JsonData;

@Controller
public class UserInfoController {

	
	@Autowired
	UserInfoService userInfoService;
	
	
	@RequestMapping("/getUserInfo")
	@ResponseBody
	public JsonData getUserInfo(@RequestParam(value="page",defaultValue="1")Integer page)
	{
		PageHelper.startPage(page, 20);
		PageInfo pageInfo=new PageInfo(userInfoService.getUserInfo(),20);
		return JsonData.success(pageInfo, "success");
	}
	
	//���ڽ�ʦ��ѯ���Լ�����Ϣ
	//Ҫ�ڵ�¼ʱ�ͽ����jobnumber���ú�
	//��ʦ��һ�ε�½���Լ�����Ϣ�ǿյģ�����upid��id���еģ�Ȼ��ͨ��/updateUserInfo����������ľ�����
	@RequestMapping("/getowninfo")
	@ResponseBody
	public JsonData getowninfo(String jobnumber)
	{
		List<UserInfo> list=userInfoService.getowninfo(jobnumber);
		return JsonData.success(list, "success");
	}
	
	//���ڽ�ʦ�޸ı༭�Լ�����Ϣ
	//idΪ����
	@RequestMapping("/updateUserInfo")
	@ResponseBody
	public JsonData updateUserInfos(UserInfo userInfo)
	{
		UserInfoExample userInfoExample=new UserInfoExample();
		int i=userInfoService.updateUserinfo(userInfo, userInfoExample);
		if (i>0) {
			return JsonData.success(null, "success");
		} else {
			return JsonData.fail("ʧ��");
		}	
		
	}
	
	
	
	
	
}
