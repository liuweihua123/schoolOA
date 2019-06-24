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
import schooloa.bean.UserPermissions;
import schooloa.service.UserInfoService;
import schooloa.service.UserPermissionsService;
import schooloa.util.JsonData;

@Controller
public class UserPermissionsController {
	
	@Autowired 
	UserPermissionsService userps;
	
	@Autowired
	UserInfoService ussivce;

	
	@RequestMapping("/getUserPermissions")
	@ResponseBody
	public JsonData getUP(String jobnumber,@RequestParam(value="page",defaultValue="1")Integer page)
	{
		PageHelper.startPage(page, 20);//一页20条数据
		if (jobnumber==null) {
			PageInfo pageInfo=new PageInfo(userps.getUserPermission(),20);
			return JsonData.success(pageInfo, "success");
		}
		else if (userps.getUserPermissionByJobNumber(jobnumber)!=null) {
			return JsonData.success(userps.getUserPermissionByJobNumber(jobnumber), "success");
		}
		else {
			return JsonData.fail("failed not exist this user");
		}	
	}
	
	@RequestMapping("/insertUserPermissions")
	@ResponseBody
	public JsonData insertUP(HttpServletRequest request,HttpServletResponse response)
	{
		String role=request.getParameter("role");
		String jobnumber=request.getParameter("jobnumber");
		String password=request.getParameter("password");
		String professional=request.getParameter("professional");
		//查重
		if (userps.getUserPermissionByJobNumber(jobnumber)!=null) {
			return JsonData.fail("jobnumber have alerdy exist");
		}else {
			
			UserPermissions userPermissions=new UserPermissions();
			userPermissions.setRole(role);
			userPermissions.setJobnumber(jobnumber);
			userPermissions.setPassword(password);
			userPermissions.setProfessional(professional);
			int i=userps.insertUserPermission(userPermissions);
			
			if (i>0) {
				//管理员插入一个用户后，紧接着插入userinfo里面的upid
				UserPermissions userPermissions2=userps.getUserPermissionByJobNumber(jobnumber);
				
				UserInfo userInfo=new UserInfo();
				userInfo.setUpid(userPermissions2.getId());
				int j=ussivce.insertUserinfo(userInfo);
				if (j>0) {
					return JsonData.success(null, "success");
				} else {
					return JsonData.fail("操作失败");
				}
				
			}else {
				return JsonData.fail("failed");
			}
		}
	}
	
	@RequestMapping("/editUserPermission")
	@ResponseBody
	public JsonData editUP(HttpServletRequest request,HttpServletResponse response)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String role=request.getParameter("role");
		String jobnumber=request.getParameter("jobnumber");
		String password=request.getParameter("password");
		String professional=request.getParameter("professional");
		UserPermissions userPermissions=new UserPermissions();
		userPermissions.setId(id);
		userPermissions.setRole(role);
		userPermissions.setJobnumber(jobnumber);
		userPermissions.setPassword(password);
		userPermissions.setProfessional(professional);
		int i=userps.editUserPermission(userPermissions);
		
		if (i>0) {
			return JsonData.success(null, "success");
		}else {
			return JsonData.fail("failed");
		}
	}
	
	@RequestMapping("/deleteUserPermission")
	@ResponseBody
	public JsonData delete(@RequestParam(value="id") int id)
	{
		
		int i=userps.deleteByPrimaryKey(id);
		if (i>0) {
			return JsonData.success(null, "success");
		}else {
			return JsonData.fail("failed");
		}
	}
	
	//获取userpermission和UserInfo里面的所有的数据
	//用于管理员
	@RequestMapping("/getUserPermissionAndUserinfo")
	@ResponseBody
	public JsonData getUserPermissionAndUserinfo(@RequestParam(value="page",defaultValue="1")Integer page)
	{
		PageHelper.startPage(page, 20);
		List<UserPermissions> list=userps.getUPANDUI();
		PageInfo pageInfo=new PageInfo(list,20);
		return JsonData.success(pageInfo, "success");
	}
	
	//根据role和professional获取userpermission和UserInfo里面的所有数据
	//用于专业负责人查询出所有他所在专业下的教师信息
	
	@RequestMapping("/getUpAndUiByRoleAndProfe")
	@ResponseBody
	public JsonData getUpAndUiByRoleAndProfe(HttpServletRequest request,HttpServletResponse response,@RequestParam(value="page",defaultValue="1")Integer page)
	{
		PageHelper.startPage(page, 20);
		String role=request.getParameter("role");//必须
		String professional=request.getParameter("professional");//必须
		String jobnumber=request.getParameter("jobnumber");
		if (jobnumber==null) {
			List<UserPermissions> list=userps.getUPAndUiByRoleAndProfessional(role, professional);
			PageInfo pageInfo=new PageInfo(list,20);
			return JsonData.success(pageInfo, "success");
		} else if (userps.getUserPermissionByJobNumber(jobnumber)!=null) {
			return JsonData.success(userps.getUPAndUiByRoleAndProfessionalAndJobnumber(role, professional, jobnumber),"success");
		} else {
			return JsonData.fail("工号填写错误");
		}
		
	}
	//根据工号获取UserInfo和userpermission里面的值
	//用于教师
	@RequestMapping("/getUpAndUiByJobnumber")
	@ResponseBody
	public JsonData getUpAndUiByJobnumebr(@RequestParam(value="jobnumber") String jobnumber)
	{
			
		if (userps.getUserPermissionByJobNumber(jobnumber)!=null) {
			List<UserPermissions> list=userps.getUPAndUIByJobnumber(jobnumber);
			return JsonData.success(list, "success");
		}else {
			return JsonData.fail("please input correct jobnumber");
		}
		
		
	}
	
	

	
	
}
