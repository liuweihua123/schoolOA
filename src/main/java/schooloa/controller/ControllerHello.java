package schooloa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import schooloa.service.UserPermissionsService;

@Controller
public class ControllerHello {
	
	@Autowired 
	UserPermissionsService userPS;
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";
	}
	

}
