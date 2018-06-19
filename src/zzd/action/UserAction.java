package zzd.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import zzd.service.UserService;

@Scope("prototype")
@Controller(value="userAction")
public class UserAction extends ActionSupport {
	@Resource(name="userService")
	private UserService userService;
	
	@Override
	public String execute() throws Exception {
		System.out.println("userAction..add");
		userService.add();
		return NONE;
	}
}
