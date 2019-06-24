package schooloa.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import schooloa.bean.UserPermissions;
import schooloa.service.LoginService;
import schooloa.util.JsonData;

@Controller
public class LoginController {

	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/login")
	@ResponseBody
	public JsonData login(HttpServletRequest request,HttpServletResponse response)
	{
		String jobnumber=request.getParameter("jobnumber");
		String password=request.getParameter("password");
		//String role=request.getParameter("role");

		
		UserPermissions userPermissions2= loginService.Login(jobnumber);
		
		if (userPermissions2!=null) {
			if (userPermissions2.getPassword().equals(password)) {
				
					//在返回成功的基础上将该用户所有信息返回
					return JsonData.success(loginService.Login(jobnumber), "login success");
					//将session存入
			}else {
				return JsonData.fail("password is wrong");
			}
		}else {
			return JsonData.fail("not exists this user");
		}		
		
	}
}
